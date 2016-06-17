/*
 * Created on 25.08.2005 To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package de.act.common.types.staticobjects;
@SuppressWarnings("unchecked")
@org.jboss.cache.aop.annotation.PojoCacheable
public final class RSPkgShp implements java.io.Serializable, Comparable {
	/**
	 * @author Martin Sachs
	 * @since 09.03.2006
	 */
	private static final long serialVersionUID = 3976195211637530528L;
	// used by kind combo tree
	transient public boolean SELECTED = false;
	//
	public String PKG_SHP = null;
	public String PKG_SHP_NAME = null;

	@Override
	public String toString() {
		return this.PKG_SHP_NAME;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object obj) {
		if (obj == this) { return true; }
		if (obj instanceof RSPkgShp) { return ((RSPkgShp) obj).PKG_SHP.equals(this.PKG_SHP); }
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return this.PKG_SHP.hashCode();
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
