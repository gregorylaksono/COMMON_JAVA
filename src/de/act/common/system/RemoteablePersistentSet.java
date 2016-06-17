package de.act.common.system;
import java.rmi.RemoteException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

import org.acegisecurity.context.SecurityContextHolder;
import org.apache.log4j.Logger;

/**
 * Remoteable Wrapperclass 
 * @author Martin Sachs
 * @since 1.0 - 23.06.2006
 */
@SuppressWarnings({"unchecked","unused"})
public class RemoteablePersistentSet<T> implements Set<T> {
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.internalPersistenSet.toString();
	}

	/**
	 * Logger for this class
	 */
	private static final Logger log = Logger.getLogger(RemoteablePersistentSet.class);
	private static final long serialVersionUID = 9533946820735272L;
	private Set<T> internalPersistenSet;

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 23.06.2006
	 * @param ret
	 * @throws RemoteException 
	 */
	public RemoteablePersistentSet(Set<T> ret)  {
		super();
		this.internalPersistenSet = ret;
	}

	/* (non-Javadoc)
	 * @see java.util.List#add(java.lang.Object)
	 */
	public boolean add(T e) {
		return internalPersistenSet.add(e);
	}

	/* (non-Javadoc)
	 * @see java.util.List#addAll(java.util.Collection)
	 */
	public boolean addAll(Collection<? extends T> c) {
		return internalPersistenSet.addAll(c);
	}

	/* (non-Javadoc)
	 * @see java.util.List#clear()
	 */
	public void clear() {
		internalPersistenSet.clear();
	}

	/* (non-Javadoc)
	 * @see java.util.List#contains(java.lang.Object)
	 */
	public boolean contains(Object o) {
		return internalPersistenSet.contains(o);
	}

	/* (non-Javadoc)
	 * @see java.util.List#containsAll(java.util.Collection)
	 */
	public boolean containsAll(Collection<?> c) {
		return internalPersistenSet.containsAll(c);
	}
	
	/* (non-Javadoc)
	 * @see java.util.List#isEmpty()
	 */
	public boolean isEmpty() {
		return internalPersistenSet.isEmpty();
	}

	/* (non-Javadoc)
	 * @see java.util.List#iterator()
	 */
	public Iterator<T> iterator() {
		Iterator<T> iterator = internalPersistenSet.iterator();
		RemoteIterator iter=null;
		iter = new RemoteIterator(iterator);
		Object obj = RmiRemoteMaker.makeRemote(iter, java.util.Iterator.class, SecurityContextHolder.getContext());
		return (Iterator<T>) obj;
	}
	
	/* (non-Javadoc)
	 * @see java.util.List#remove(java.lang.Object)
	 */
	public boolean remove(Object o) {
		return internalPersistenSet.remove(o);
	}

	/* (non-Javadoc)
	 * @see java.util.List#removeAll(java.util.Collection)
	 */
	public boolean removeAll(Collection<?> c) {
		return internalPersistenSet.removeAll(c);
	}

	/* (non-Javadoc)
	 * @see java.util.List#retainAll(java.util.Collection)
	 */
	public boolean retainAll(Collection<?> c) {
		return internalPersistenSet.retainAll(c);
	}

	/* (non-Javadoc)
	 * @see java.util.List#size()
	 */
	public int size() {
		return internalPersistenSet.size();
	}

	/* (non-Javadoc)
	 * @see java.util.List#toArray()
	 */
	public Object[] toArray() {
		return this.internalPersistenSet.toArray();
	}

	/* (non-Javadoc)
	 * @see java.util.List#toArray(T[])
	 */
	public Object[] toArray(Object[] a) {
		return this.internalPersistenSet.toArray(a);
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 23.06.2006
	 * @return Returns the internalPersistenSet.
	 */
	public Set<T> getInternalPersistenSet() {
		return internalPersistenSet;
	}
}
