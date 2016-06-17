package de.act.common.types.staticobjects;

public class RSCourierRate {
	
	private Long courier_rate_id;
	private Integer add_id;
	private String rate_type;
	private Long route_id;
	private Double min;
	private String min_flat;
	private Double rate;
	private Double rate_per;
	private String rate_unit;
	private Integer role_id;
	private Integer forerun_time_id;
	private Integer courier_vec_id;
	private String vad_id;
	private Integer etd_from;
	private Integer etd_thru;
	private String service_name;
	
	public Long getCourier_rate_id() {
		return courier_rate_id;
	}
	public void setCourier_rate_id(Long seq) {
		this.courier_rate_id = seq;
	}
	public Integer getAdd_id() {
		return add_id;
	}
	public void setAdd_id(Integer add_id) {
		this.add_id = add_id;
	}
	public String getRate_type() {
		return rate_type;
	}
	public void setRate_type(String rate_type) {
		this.rate_type = rate_type;
	}
	public Long getRoute_id() {
		return route_id;
	}
	public void setRoute_id(Long route_id) {
		this.route_id = route_id;
	}
	public Double getMin() {
		return min;
	}
	public void setMin(Double min) {
		this.min = min;
	}
	public String getMin_flat() {
		return min_flat;
	}
	public void setMin_flat(String min_flat) {
		this.min_flat = min_flat;
	}
	public Double getRate() {
		return rate;
	}
	public void setRate(Double rate) {
		this.rate = rate;
	}
	public Double getRate_per() {
		return rate_per;
	}
	public void setRate_per(Double rate_per) {
		this.rate_per = rate_per;
	}
	public String getRate_unit() {
		return rate_unit;
	}
	public void setRate_unit(String rate_unit) {
		this.rate_unit = rate_unit;
	}
	public Integer getRole_id() {
		return role_id;
	}
	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}
	public Integer getForerun_time_id() {
		return forerun_time_id;
	}
	public void setForerun_time_id(Integer forerun_time_id) {
		this.forerun_time_id = forerun_time_id;
	}
	public Integer getCourier_vec_id() {
		return courier_vec_id;
	}
	public void setCourier_vec_id(Integer courier_vec_id) {
		this.courier_vec_id = courier_vec_id;
	}
	public String getVad_id() {
		return vad_id;
	}
	public void setVad_id(String vad_id) {
		this.vad_id = vad_id;
	}
	public Integer getEtd_from() {
		return etd_from;
	}
	public void setEtd_from(Integer etd_from) {
		this.etd_from = etd_from;
	}
	public Integer getEtd_thru() {
		return etd_thru;
	}
	public void setEtd_thru(Integer etd_thru) {
		this.etd_thru = etd_thru;
	}
	public String getService_name() {
		return service_name;
	}
	public void setService_name(String service_name) {
		this.service_name = service_name;
	}
	
}
