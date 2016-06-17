/*
 * Created on 26.08.2005 To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package de.act.common.types.staticobjects;
@SuppressWarnings("unchecked")
@org.jboss.cache.aop.annotation.PojoCacheable
public final class RSPkgCol implements java.io.Serializable, Comparable {
    /**
     * @author Martin Sachs
     * @since 09.03.2006
     */
    private static final long serialVersionUID = 8130734872775845579L;
    // for combo tree
    public boolean SELECTED = false;
    public String PKG_COL = null;
    public String PKG_COL_NAME = null;

    @Override
    public String toString() {
        return this.PKG_COL_NAME;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(final Object obj) {
        if (obj == this) { return true; }
        if (obj instanceof RSPkgCol) { return ((RSPkgCol) obj).PKG_COL.equals(this.PKG_COL); }
        return false;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        return this.PKG_COL.hashCode();
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
