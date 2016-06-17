package de.act.common.types.staticobjects;
@org.jboss.cache.aop.annotation.PojoCacheable
public final class RSCur implements java.io.Serializable, Comparable<RSCur> {

	private static final long serialVersionUID = 8027793201410448351L;
	public String CUR_3LC = null;
	public String CUR_NAME = null;
	public String CUR_UNIT = null;
	public Integer CUR_UNIT_AMNT = null;
	public Double CUR_RD_MIN = null;
	public Double CUR_RD_EXPT = null;
	public String vad_id = null;

	public RSCur() {

	}

	public RSCur(String string) {
		this.CUR_3LC = string;
	}

	public String toString() {
		return this.CUR_3LC == null ? "" : this.CUR_3LC;
	}

	public int compareTo(final RSCur o) {
		return this.toString().compareToIgnoreCase(o.toString());
	}
}
