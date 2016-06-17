package de.act.common.types.staticobjects;

public class RSPostalCode implements java.io.Serializable {

	private Long pc_id;
	private String co_2lc;
	private String postal_code;
	private String pc_lng;
	private String pc_lat;
	private Integer creator_add_id;
	private RSVad vad;
	
	public Long getPc_id() {
		return pc_id;
	}
	public void setPc_id(Long pc_id) {
		this.pc_id = pc_id;
	}
	public String getCo_2lc() {
		return co_2lc;
	}
	public void setCo_2lc(String co_2lc) {
		this.co_2lc = co_2lc;
	}
	public String getPostal_code() {
		return postal_code;
	}
	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}
	public String getPc_lng() {
		return pc_lng;
	}
	public void setPc_lng(String pc_lng) {
		this.pc_lng = pc_lng;
	}
	public String getPc_lat() {
		return pc_lat;
	}
	public void setPc_lat(String pc_lat) {
		this.pc_lat = pc_lat;
	}
	public Integer getCreator_add_id() {
		return creator_add_id;
	}
	public void setCreator_add_id(Integer creator_add_id) {
		this.creator_add_id = creator_add_id;
	}
	public RSVad getVad() {
		return vad;
	}
	public void setVad(RSVad vad) {
		this.vad = vad;
	}
}
