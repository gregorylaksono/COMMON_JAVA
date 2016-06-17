package de.act.common.types.nonstaticobjects;

import java.io.Serializable;
@org.jboss.cache.aop.annotation.PojoCacheable
public class CourierInformation implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6344365570515611015L;
	//Shipper Information
	private Integer shpAddId;
	private String shpAddName;
	private String shpLatitude;
	private String shpLangitude;
	//Courier Information
	private Integer courierAddId;
	private String courierAddName;
	private String courierLatitude;
	private String courierLangitude;
	//Airport Information
	private String ap3Lc;
	private String apName;
	private String apLatitude;
	private String apLangitude;
	//Courier Rate Information
	private Double rate;
	private Long acId;
	private Integer courierRateaddId;
	private Double min;
	private String minFlat;
	private String rateType;
	private Double ratePer;
	private String rateUnit;
	private Integer roleId;
	private String mode;
	private String ap3lcShipper;
	private String ap3lcConsignee;
	//Consignee Information
	private Integer conAddId;
	private String conAddName;
	private String conLatitude;
	private String conLangitude;
	private boolean isStandalone;
	
	public Integer getShpAddId() {
		return shpAddId;
	}
	public void setShpAddId(Integer shpAddId) {
		this.shpAddId = shpAddId;
	}
	public String getShpAddName() {
		return shpAddName;
	}
	public void setShpAddName(String shpAddName) {
		this.shpAddName = shpAddName;
	}
	public String getShpLatitude() {
		return shpLatitude;
	}
	public void setShpLatitude(String shpLatitude) {
		this.shpLatitude = shpLatitude;
	}
	public String getShpLangitude() {
		return shpLangitude;
	}
	public void setShpLangitude(String shpLangitude) {
		this.shpLangitude = shpLangitude;
	}
	public Integer getCourierAddId() {
		return courierAddId;
	}
	public void setCourierAddId(Integer courierAddId) {
		this.courierAddId = courierAddId;
	}
	public String getCourierAddName() {
		return courierAddName;
	}
	public void setCourierAddName(String courierAddName) {
		this.courierAddName = courierAddName;
	}
	public String getCourierLatitude() {
		return courierLatitude;
	}
	public void setCourierLatitude(String courierLatitude) {
		this.courierLatitude = courierLatitude;
	}
	public String getCourierLangitude() {
		return courierLangitude;
	}
	public void setCourierLangitude(String courierLangitude) {
		this.courierLangitude = courierLangitude;
	}
	public String getAp3Lc() {
		return ap3Lc;
	}
	public void setAp3Lc(String ap3Lc) {
		this.ap3Lc = ap3Lc;
	}
	public String getApName() {
		return apName;
	}
	public void setApName(String apName) {
		this.apName = apName;
	}
	public String getApLatitude() {
		return apLatitude;
	}
	public void setApLatitude(String apLatitude) {
		this.apLatitude = apLatitude;
	}
	public String getApLangitude() {
		return apLangitude;
	}
	public void setApLangitude(String apLangitude) {
		this.apLangitude = apLangitude;
	}
	public Double getRate() {
		return rate;
	}
	public void setRate(Double rate) {
		this.rate = rate;
	}
	public Long getAcId() {
		return acId;
	}
	public void setAcId(Long acId) {
		this.acId = acId;
	}
	public Integer getCourierRateaddId() {
		return courierRateaddId;
	}
	public void setCourierRateaddId(Integer courierRateaddId) {
		this.courierRateaddId = courierRateaddId;
	}
	public Double getMin() {
		return min;
	}
	public void setMin(Double min) {
		this.min = min;
	}
	public String getMinFlat() {
		return minFlat;
	}
	public void setMinFlat(String minFlat) {
		this.minFlat = minFlat;
	}
	public String getRateType() {
		return rateType;
	}
	public void setRateType(String rateType) {
		this.rateType = rateType;
	}
	public Double getRatePer() {
		return ratePer;
	}
	public void setRatePer(Double ratePer) {
		this.ratePer = ratePer;
	}
	public String getRateUnit() {
		return rateUnit;
	}
	public void setRateUnit(String rateUnit) {
		this.rateUnit = rateUnit;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getAp3lcShipper() {
		return ap3lcShipper;
	}
	public void setAp3lcShipper(String ap3lcShipper) {
		this.ap3lcShipper = ap3lcShipper;
	}
	public String getAp3lcConsignee() {
		return ap3lcConsignee;
	}
	public void setAp3lcConsignee(String ap3lcConsignee) {
		this.ap3lcConsignee = ap3lcConsignee;
	}
	public Integer getConAddId() {
		return conAddId;
	}
	public void setConAddId(Integer conAddId) {
		this.conAddId = conAddId;
	}
	public String getConAddName() {
		return conAddName;
	}
	public void setConAddName(String conAddName) {
		this.conAddName = conAddName;
	}
	public String getConLatitude() {
		return conLatitude;
	}
	public void setConLatitude(String conLatitude) {
		this.conLatitude = conLatitude;
	}
	public String getConLangitude() {
		return conLangitude;
	}
	public void setConLangitude(String conLangitude) {
		this.conLangitude = conLangitude;
	}
	public boolean isStandalone() {
		return isStandalone;
	}
	public void setStandalone(boolean isStandalone) {
		this.isStandalone = isStandalone;
	}
	
}
