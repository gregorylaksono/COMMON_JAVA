package de.act.common.types.staticobjects;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class Carrier implements java.io.Serializable, Comparable<RSCa> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3505015446256865428L;
	public String ca_id = "";
	public String ca_name = "";
	public String ca_3dg = "";
	public String ca_2lc = "";
	public String ca_3lc = "";
	public Integer alliance_id;
	public String iata_stat;
	public RSVad vad;
	// for Table data model
	public String DEPT = "";
	public String DEST = "";
	private String displayString = this.ca_2lc;

	public String getCa3lc() {
		return this.ca_3dg;
	}

	@Override
	public String toString() {
		if (this.displayString == null || "".equals(this.displayString)) { return this.ca_2lc; }
		return this.displayString;
	}

	public void setDisplayString(final String ca_2lc2) {
		this.displayString = ca_2lc2;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Comparable#compareTo(T)
	 */
	public int compareTo(final RSCa o) {
		return this.ca_id.compareToIgnoreCase(o.ca_id);
	}

	/*
	 * 10.01.2006
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object obj) {
		if (obj instanceof RSCa) {
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
		return this.ca_id.hashCode();
	}
	
	/*
	 * 14.12.2005
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	// @Override
	// public boolean equals(Object obj) {
	// return hashCode() == obj.hashCode();
	// }
	/**
	 * 14.12.2005
	 *
	 * @see java.lang.Object#hashCode()
	 */
	// @Override
	// public int hashCode() {
	// return ca_id.hashCode();
	// }
}
