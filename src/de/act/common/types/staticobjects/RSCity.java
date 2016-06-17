package de.act.common.types.staticobjects;

public class RSCity implements java.io.Serializable {

	private Long city_id;
	private String co_2lc;
	private String city_name;
	private String city_lng;
	private String city_lat;
	private Integer creator_add_id;
	private RSVad vad;
	
	public Long getCity_id() {
		return city_id;
	}
	public void setCity_id(Long seq) {
		this.city_id = seq;
	}
	public String getCo_2lc() {
		return co_2lc;
	}
	public void setCo_2lc(String co_2lc) {
		this.co_2lc = co_2lc;
	}
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	public String getCity_lng() {
		return city_lng;
	}
	public void setCity_lng(String city_lng) {
		this.city_lng = city_lng;
	}
	public String getCity_lat() {
		return city_lat;
	}
	public void setCity_lat(String city_lat) {
		this.city_lat = city_lat;
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
