package de.act.common.types.staticobjects;

public class RSDistr implements java.io.Serializable {

	private Long distr_id;
	private Long city_id;
	private String distr_name;
	private String distr_lng;
	private String distr_lat;
	private Integer creator_add_id;
	private RSVad vad;
	
	public Long getDistr_id() {
		return distr_id;
	}
	public void setDistr_id(Long distr_id) {
		this.distr_id = distr_id;
	}
	public Long getCity_id() {
		return city_id;
	}
	public void setCity_id(Long city_id) {
		this.city_id = city_id;
	}
	public String getDistr_name() {
		return distr_name;
	}
	public void setDistr_name(String distr_name) {
		this.distr_name = distr_name;
	}
	public String getDistr_lng() {
		return distr_lng;
	}
	public void setDistr_lng(String distr_lng) {
		this.distr_lng = distr_lng;
	}
	public String getDistr_lat() {
		return distr_lat;
	}
	public void setDistr_lat(String distr_lat) {
		this.distr_lat = distr_lat;
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
