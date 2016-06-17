package de.act.common.types.staticobjects;
@org.jboss.cache.aop.annotation.PojoCacheable
public final class RSUnit implements java.io.Serializable, Comparable<RSUnit> {
	/**
	 * @author Martin Sachs
	 * @since 19.01.2006
	 */
	private static final long serialVersionUID = -7739825920556717648L;
	public String UNIT_ID;
	public String UNIT_ABRV;
	public String UNIT_NAME;
	public String UNIT_TYPE;
	public String UNIT_CODE;
	public double UNIT_FAC;
	public double UNIT_SUM;

	@Override
	public String toString() {
		return this.UNIT_ABRV == null ? "" : this.UNIT_ABRV;
	}

	/*
	 * 10.01.2006
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object obj) {
		if (obj instanceof RSUnit) {
			return this.hashCode() == obj.hashCode();
		} 
		else {
			return false;
		}
	}

	/*
	 * 10.01.2006
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		if (this.UNIT_ID != null) {
			return this.UNIT_ID.hashCode();
		} 
		else {
			return super.hashCode();
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Comparable#compareTo(T)
	 */
	public int compareTo(final RSUnit o) {
		return this.toString().compareToIgnoreCase(o.toString());
	}
}
