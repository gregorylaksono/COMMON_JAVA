package de.act.common.system;

import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

/**
 * A lock set gives locks for keys.
 * Only threads requesting the same (according to hashCode/equals) key
 * compete for the same lock.
 *
 * @author OB
 *
 * @param <KeyType> the type of the keys to use.
 */
@SuppressWarnings("unchecked")
public class LockSet<KeyType> {

	private final HashMap<KeyType, SetLock> locks;
	private final boolean                   fair;

	/**
	 * Create a new lock set.
	 *
	 * @param size initial size of the set.
	 * @param fair use fair or fast locks?
	 */
	public LockSet(int size, boolean fair) {
		this.locks = new HashMap<KeyType, SetLock>(size);
		this.fair  = fair;
	}

	/**
	 * Acquire a lock for the given key.
	 * Only wait for threads that hold a lock for the same key
	 * (according to hashCode/equals).
	 *
	 * @param key the key for the lock.
	 *
	 * @return a lock after successfully acquiring it.
	 *
	 * @throws InterruptedException if another thread interrupts this thread
	 *                              while we are waiting for the lock.
	 */
	public Lock lock(KeyType key) throws InterruptedException {
		SetLock ret;
		synchronized (this.locks) {
			ret = this.locks.get(key);
			if (ret == null) {
				ret = new SetLock<KeyType>(this.fair, key, this.locks);
			}
			ret.notMe();
		} // synchronized (locks)

		ret.lock();
		return ret;
	}
	
	private static class SetLock<KeyType> implements Lock {
		private final    ReentrantLock             lock;
		private final    KeyType                   key;
		private final    HashMap<KeyType, SetLock> locks;
		/** Saves the lock from beeing removed from the set. */
		private volatile int                       notMe = 0;

		SetLock(boolean fair, KeyType key, HashMap<KeyType, SetLock> locks) {
			this.lock  = new ReentrantLock(fair);
			this.key   = key;
			this.locks = locks;
		}

		void notMe() {
			this.notMe++;
		}

		void lock() throws InterruptedException {
			try {
				this.lock.lockInterruptibly();
			} finally {
				this.notMe--;
			}
		}

		public void unlock() {
			this.lock.unlock();
			if (!this.lock.hasQueuedThreads()) {
				synchronized (this.locks) {
					if (this.lock.tryLock()) {
						if (this.notMe > 0) {
							this.lock.unlock();
						} else {
							this.locks.remove(this.key);
						}
					}
				} // synchronized (locks)
			}
		}
	} // class SetLock
} // class LockSet
