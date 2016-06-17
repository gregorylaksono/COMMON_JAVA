/*
 * Created on 26.08.2005 To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package de.act.common.types.staticobjects;
import java.io.Serializable;

@SuppressWarnings("unchecked")
@org.jboss.cache.aop.annotation.PojoCacheable
public final class RSPkgMat implements Serializable, Comparable {
	/**
	 * @author Martin Sachs
	 * @since 09.03.2006
	 */
	private static final long serialVersionUID = 5045054892176292759L;
	//
	public boolean SELECTED = false;
	public String PKG_MAT = null;
	public String PKG_MAT_NAME = null;

	@Override
	public String toString() {
		return this.PKG_MAT_NAME;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object obj) {
		if (obj == this) { return true; }
		if (obj instanceof RSPkgMat) { return ((RSPkgMat) obj).PKG_MAT.equals(this.PKG_MAT); }
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return this.PKG_MAT.hashCode();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Comparable#compareTo(T)
	 */
	public int compareTo(final Object o) {
		return this.toString().compareToIgnoreCase(o.toString());
	}
}
