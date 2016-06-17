package de.act.common.types.staticobjects;
@org.jboss.cache.aop.annotation.PojoCacheable
public final class RSOt1lc implements java.io.Serializable {
	/**
	 * @author Admin
	 * @since 11.04.2006
	 */
	private static final long serialVersionUID = -5659099712204651826L;
	private String ot_1lc = null;
	private String ot_1lc_name = null;
	private String vad_id = null;

	public RSOt1lc(String ot1lc) {
		this.ot_1lc = ot1lc;
	}

	public RSOt1lc() {
		
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object obj) {
		if (obj == this) { return true; }
		if (obj instanceof RSOt1lc) { return ((RSOt1lc) obj).ot_1lc.equals(this.ot_1lc); }
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return this.ot_1lc.hashCode();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.ot_1lc.toString();
	}

	public String getOt_1lc() {
		return this.ot_1lc;
	}

	public void setOt_1lc(final String ot_1lc) {
		this.ot_1lc = ot_1lc;
	}

	public String getOt_1lc_name() {
		return this.ot_1lc_name;
	}

	public void setOt_1lc_name(final String ot_1lc_name) {
		this.ot_1lc_name = ot_1lc_name;
	}

	public String getVad_id() {
		return this.vad_id;
	}

	public void setVad_id(final String vad_id) {
		this.vad_id = vad_id;
	}
}
