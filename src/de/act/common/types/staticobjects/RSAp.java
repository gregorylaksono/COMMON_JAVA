package de.act.common.types.staticobjects;
import java.io.Serializable;

import de.act.common.types.RObject;

/*
 * Airport Object reprensentation of DB.
 */
@org.jboss.cache.aop.annotation.PojoCacheable
public final class RSAp implements RObject, Serializable {
	
	/**
	 * @author Martin Sachs
	 * @since 19.01.2006
	 */
	private static final long serialVersionUID = -4590794477667331342L;
	public String ap_name;
	public String ap_3lc;
	public String co_2lc;
	public String ap_cust;
	public RSCc cc;
	public RSCo co;
	private String displayString = null;
	public String city_name = null;
	public String ap_city = null;
	public String cc_id = null;
	public String ca_id = null;
	public String co_2lc_1 = null;
	public Integer cc_acc = null;
	public Double cc_fee = null;
	public Integer cc_min = null;
	public String cur_3lc = null;
	public Integer r_id = null;
	public String vad_id = null;
	public RSCaConx carrier;
	public RSCo country;
	public RSCur currency;
	public RSRate rate;
	private RSVad vad;
	private Long timeZone;
	private String langitude;
	private String latitude;

	public String getLangitude() {
		return langitude;
	}

	public void setLangitude(String langitude) {
		this.langitude = langitude;
	}
	
	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getAp_name() {
		return ap_name;
	}

	public void setAp_name(String ap_name) {
		this.ap_name = ap_name;
	}

	public RSAp() {
		displayString    = this.ap_3lc;
	}

	public RSAp(final RSAp ap) {
		if (ap.ap_name != null) {
			this.ap_name = new String(ap.ap_name);
		}
		if (ap.ap_city != null) {
			this.ap_city = new String(ap.ap_city);
		}
		if (ap.ap_3lc != null) {
			this.ap_3lc = new String(ap.ap_3lc);
		}
		if (ap.co_2lc != null) {
			this.co_2lc = new String(ap.co_2lc);
		}
		if (ap.ap_cust != null) {
			this.ap_cust = new String(ap.ap_cust);
		}
		if (ap.city_name != null) {
			this.city_name = new String(ap.city_name);
		}
		if (ap.ap_city != null) {
			this.ap_city = new String(ap.ap_city);
		}
		if (ap.cc != null) {
			this.cc = ap.cc;
		}
		if (ap.co != null) {
			this.co = ap.co;
		}
		if (ap.cc_acc != null) {
			this.cc_acc = ap.cc_acc;
		}
		if (ap.cc_fee != null) {
			this.cc_fee = ap.cc_fee;
		}
		if (ap.cc_id != null) {
			this.cc_id = ap.cc_id;
		}
		if (ap.cc_min != null) {
			this.cc_min = ap.cc_min;
		}
		displayString    = this.ap_3lc;
	}

	public RSAp(String string) {
		this.ap_3lc = string;
		this.displayString = this.ap_3lc;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#clone()
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new RSAp(this);
	}
	
	@Override
	public String toString() {
		if (this.displayString == null) {
			this.displayString = this.ap_3lc;
			if (this.displayString == null) {
				this.displayString = "";
			}
		}
		return this.displayString;
	}

	public int compareTo(final Object o) {
		if (o == null || this.displayString == null) { return 44; }
		return this.displayString.compareToIgnoreCase(((RSAp) o).displayString);
	}

	public int compareToName(final Object o) {
		return this.displayString.compareToIgnoreCase(((RSAp) o).displayString);
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) { return true; }
		if (this.displayString == null) {
			this.displayString = this.ap_3lc;
		}
		if (obj instanceof RSAp) {
			return this.displayString.equals(((RSAp) obj).displayString);
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		if (this.displayString == null) {
			this.displayString = this.ap_3lc;
		}
		return this.displayString.hashCode();
	}

	public String getDisplayString() {
		if (this.displayString == null) {
			this.displayString = this.ap_3lc + ", " + this.ap_name;
		}
		return this.displayString;
	}

	public void setDisplayString(final String displayString) {
		this.displayString = displayString;
	}

	public RSVad getVad() {
		return vad;
	}

	public void setVad(RSVad vad) {
		this.vad = vad;
	}
	
	public Long getTimeZone() {
		return timeZone;
	}
	public void setTimeZone(Long timeZone) {
		this.timeZone = timeZone;
	}
	
}
