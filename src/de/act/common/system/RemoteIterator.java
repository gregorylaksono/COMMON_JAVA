package de.act.common.system;

import java.rmi.RemoteException;
import java.util.Iterator;

/**
 * Remoteiterator
 * @author Martin Sachs
 * @since 1.0 - 23.06.2006
 */
public class RemoteIterator<T>  implements Iterator<T>{

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 23.06.2006
	 */
	private static final long serialVersionUID = 855531858184058080L;
	private Iterator<T> internalIterator;

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 23.06.2006
	 * @param iterator
	 * @throws RemoteException 
	 */
	public RemoteIterator(Iterator<T> iterator) {
		super();
		this.internalIterator = iterator;
	}

	/* (non-Javadoc)
	 * @see java.util.Iterator#hasNext()
	 */
	public boolean hasNext() {
		return internalIterator.hasNext();
	}

	/* (non-Javadoc)
	 * @see java.util.Iterator#next()
	 */
	public T next() {
		return internalIterator.next();
	}

	/* (non-Javadoc)
	 * @see java.util.Iterator#remove()
	 */
	public void remove() {
		internalIterator.remove();
	}
}
