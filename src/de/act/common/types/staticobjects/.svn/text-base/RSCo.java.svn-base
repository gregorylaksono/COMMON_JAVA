package de.act.common.types.staticobjects;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class RSCo implements java.io.Serializable,Comparable<RSCo> {

	private static final long serialVersionUID = -1870029571687577651L;
	private String ca_name = "";
	private String co_2lc;
	private String co_3lc;
	private String co_name;
	private Double co_gmt;
	private String co_tcom;
	private RSCur cur_3lc;
	private RSCc cc;
	private RSVad vad;
	private String co_lat;
	private String co_lng;

	public RSCo() {

	}

	public RSCo(String country) {
		this.co_2lc = country;
	}

	@Override
	public String toString() {
		if (this.ca_name!=null)
			return this.ca_name;
		else {
			return this.co_2lc;
		}
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) { return true; }
		if (obj instanceof RSCo) {
			if (this.co_2lc!=null && ((RSCo) obj).co_2lc!=null) {
				return this.co_2lc.equals(((RSCo) obj).co_2lc); 
			}
			return super.equals(obj);
		}
		return false;
	}

	@Override
	public int hashCode() {
		if (this.co_2lc!=null)
			return this.co_2lc.hashCode();
		return super.hashCode();
	}

	public String getCa_name() {
		return this.ca_name;
	}

	public void setCa_name(final String ca_name) {
		this.ca_name = ca_name;
	}

	public String getCo_2lc() {
		return this.co_2lc;
	}

	public void setCo_2lc(final String co_2lc) {
		this.co_2lc = co_2lc;
	}

	public String getCo_3lc() {
		return this.co_3lc;
	}

	public void setCo_3lc(final String co_3lc) {
		this.co_3lc = co_3lc;
	}

	public Double getCo_gmt() {
		return this.co_gmt;
	}

	public void setCo_gmt(final Double co_gmt) {
		this.co_gmt = co_gmt;
	}

	public String getCo_name() {
		return this.co_name;
	}

	public void setCo_name(final String co_name) {
		this.co_name = co_name;
	}

	public String getCo_tcom() {
		return this.co_tcom;
	}

	public void setCo_tcom(final String co_tcom) {
		this.co_tcom = co_tcom;
	}

	public RSCur getCur_3lc() {
		return this.cur_3lc;
	}

	public void setCur_3lc(final RSCur cur_3lc) {
		this.cur_3lc = cur_3lc;
	}

	public RSCc getCc() {
		return this.cc;
	}

	public void setCc(final RSCc cc) {
		this.cc = cc;
	}

	public int compareTo(RSCo o) {
		return o.co_2lc.compareToIgnoreCase(co_2lc);
	}

	public void setVad( RSVad vad ) {
		this.vad = vad;
	}

	public RSVad getVad() {
		return vad;
	}

	public String getCo_lat() {
		return co_lat;
	}

	public void setCo_lat(String co_lat) {
		this.co_lat = co_lat;
	}

	public String getCo_lng() {
		return co_lng;
	}

	public void setCo_lng(String co_lng) {
		this.co_lng = co_lng;
	}
}
