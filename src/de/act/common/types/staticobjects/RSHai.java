package de.act.common.types.staticobjects;
/**
 * @author Admin
 * @since 23.03.2006
 */
@org.jboss.cache.aop.annotation.PojoCacheable
public final class RSHai extends RSInformations implements java.io.Serializable, Comparable<RSHai> {

	private static final long serialVersionUID = -7401597966061984018L;
	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Comparable#compareTo(T)
	 */
	public int compareTo(final RSHai o) {
		return this.toString().compareToIgnoreCase(o.toString());
	}
}
