package de.act.common.types.staticobjects;

import java.io.Serializable;

public class RSEmailOps implements Serializable {

	private static final long serialVersionUID = 2049428768482049199L;
	private String email_address;
	private String ap_3lc;
	private String ca_id;
	
	public String getEmail_address() {
		return email_address;
	}
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	public String getAp_3lc() {
		return ap_3lc;
	}
	public void setAp_3lc(String ap_3lc) {
		this.ap_3lc = ap_3lc;
	}
	public String getCa_id() {
		return ca_id;
	}
	public void setCa_id(String ca_id) {
		this.ca_id = ca_id;
	}	
}
