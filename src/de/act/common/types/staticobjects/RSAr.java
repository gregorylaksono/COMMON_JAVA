package de.act.common.types.staticobjects;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class RSAr implements java.io.Serializable,Comparable<RSAr> {

	private static final long serialVersionUID = -1870029571687577651L;
	private String ar_code;
	private String ar_name;	
	private RSVad vad;
	private Integer is_standard;
	private Integer is_custom;

	public RSAr() {

	}

	public RSAr(String ar_code) {
		this.ar_code = ar_code;
	}

	public String toString() {
		if (this.ar_name!=null)
			return this.ar_name;
		else {
			return this.ar_code;
		}
	}

	public boolean equals(final Object obj) {
		if (this == obj) { return true; }
		if (obj instanceof RSAr) {
			if (this.ar_code!=null && ((RSAr) obj).ar_code!=null) {
				return this.ar_code.equals(((RSAr) obj).ar_code); 
			}
			return super.equals(obj);
		}
		return false;
	}

	public int hashCode() {
		if (this.ar_code!=null)
			return this.ar_code.hashCode();
		return super.hashCode();
	}

	public String getAr_name() {
		return this.ar_name;
	}

	public void setAr_name(final String ar_name) {
		this.ar_name = ar_name;
	}

	public String getAr_code() {
		return this.ar_code;
	}

	public void setAr_code(final String ar_code) {
		this.ar_code = ar_code;
	}

	public int compareTo(RSAr o) {
		return o.ar_code.compareToIgnoreCase(ar_code);
	}

	public void setVad( RSVad vad ) {
		this.vad = vad;
	}

	public RSVad getVad() {
		return vad;
	}

	public Integer getIs_standard() {
		return is_standard;
	}

	public void setIs_standard(Integer is_standard) {
		this.is_standard = is_standard;
	}

	public Integer getIs_custom() {
		return is_custom;
	}

	public void setIs_custom(Integer is_custom) {
		this.is_custom = is_custom;
	}
}
