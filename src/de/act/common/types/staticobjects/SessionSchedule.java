package de.act.common.types.staticobjects;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

public class SessionSchedule implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -83974854448918473L;
	
	 private Long rateId;
	 private String sessionKey;
	 private Long courier_shipper_add_id;
	 private Long courier_consignee_add_id;
	 
	 private Long consignee_add_id;
	 private Long shipper_add_id;
	 
	 private Double shipper_distance;
	 private Double consignee_distance;
	 private Double shipper_duration;
	 private Double consignee_duration;
	 private Double consignee_rate_from;
	 private Double shipper_rate_from;
	 private Double shipper_rate_to;
	 private Double consignee_rate_to;
	
	 private Double rate_airlane_per_kg_from;
	 private Double rate_airlane_per_kg_to;
	 private Double total_airlane_from;
	 private Double total_airlane_to;
	 private Double fuel_charges_airlane_from;
	 private Double fuel_charges_airlane_to;
	 private Double security_charges_airlane_from;
	 private Double security_charges_airlane_to;			            		
	 private Double total_fee_to;

	 private Double total_insurance_from;
	 private Double total_insurance_to;
	 private Double total_fee_from;
	 private String commodities;
	 
	 private String ca3dg;
	 private String caId;
	 private Boolean isStandalone;
	 
	 private Date dept;
	 private Date maxArr;
	 
	 private String currencyFrom;
	 private String currencyTo;
	 
	 private String flight;
	 
	 private String type;
	 
	 public static final String TYPE_COURIER_PICKUP_OK = "1a";
	 public static final String TYPE_COURIER_DELIVER_OK = "1b";
	 public static final String TYPE_COURIER_BOTH_OK = "1c";
	 public static final String TYPE_READY = "2";
	 
	 
	 public SessionSchedule(){
		 
	 }
	 public SessionSchedule(Map m){

		 if(m.get("sessionKey")!=null)setSessionKey((String)m.get("sessionKey"));
		 if(m.get("shipper_add_id")!=null)setCourier_shipper_add_id(Long.parseLong((String) m.get("shipper_add_id")));
		 if(m.get("shipper_distance")!=null) setShipper_distance(Double.parseDouble((String) m.get("shipper_distance")));
		 if(m.get("shipper_duration")!=null) setShipper_duration(Double.parseDouble((String) m.get("shipper_duration")));
		 if(m.get("shipper_rate_from")!=null) setShipper_rate_from(Double.parseDouble((String) m.get("shipper_rate_from")));
		 if(m.get("shipper_rate_to")!=null) setShipper_rate_to(Double.parseDouble((String) m.get("shipper_rate_to")));
		 if(m.get("consignee_add_id")!=null) setCourier_consignee_add_id(Long.parseLong((String) m.get("consignee_add_id")));	
		 if(m.get("consignee_distance")!=null) setConsignee_distance(Double.parseDouble((String) m.get("consignee_distance")));
		 if(m.get("consignee_duration")!=null) setConsignee_duration(Double.parseDouble((String) m.get("consignee_duration")));
		 if(m.get("cust_shipper_add_id")!=null) setShipper_add_id(Long.parseLong((String) m.get("cust_shipper_add_id")));
		 if(m.get("cust_cons_add_id")!=null) setConsignee_add_id(Long.parseLong((String) m.get("cust_cons_add_id")));
		 if(m.get("currFrom")!=null) setCurrencyFrom((String) m.get("currFrom"));
		 if(m.get("currTo")!=null) setCurrencyTo((String) m.get("currTo"));
		 if(m.get("consignee_rate_from")!=null){
			 String[] rate = ((String) m.get("consignee_rate_from")).trim().split(" ");
			 setConsignee_rate_from(Double.parseDouble(rate[0]));
		 }
		 if(m.get("consignee_rate_to")!=null) {
			 String[] rate = ((String) m.get("consignee_rate_to")).trim().split(" ");
			 setConsignee_rate_to(Double.parseDouble(rate[0]));
		 }
		 if(m.get("rate_airlane_per_kg_from")!=null){
			 String[] rate = ((String) m.get("rate_airlane_per_kg_from")).trim().split(" ");
			 setRate_airlane_per_kg_from(Double.parseDouble(rate[0]));
		 }
		 if(m.get("rate_airlane_per_kg_to")!=null){
			 String[] rate = ((String) m.get("rate_airlane_per_kg_to")).trim().split(" ");
			 setRate_airlane_per_kg_to(Double.parseDouble(rate[0]));
		 }
		 if(m.get("total_airlane_from")!=null){
			 String[] rate = ((String) m.get("total_airlane_from")).trim().split(" ");
			 setTotal_airlane_from(Double.parseDouble(rate[0]));
		 }
		 if(m.get("total_airlane_to")!=null) {
			 String[] rate = ((String) m.get("total_airlane_to")).trim().split(" ");
			 setTotal_airlane_to(Double.parseDouble(rate[0]));
		 }
		 if(m.get("fuel_charges_airlane_from")!=null){
			 String[] rate = ((String) m.get("fuel_charges_airlane_from")).trim().split(" ");
			 setFuel_charges_airlane_from(Double.parseDouble(rate[0]));
		 }
		 if(m.get("fuel_charges_airlane_to")!=null) {
			 String[] rate = ((String) m.get("fuel_charges_airlane_to")).trim().split(" ");
			 setFuel_charges_airlane_to(Double.parseDouble(rate[0]));
		 }
		 if(m.get("security_charges_airlane_from")!=null){
			 String[] rate = ((String) m.get("security_charges_airlane_from")).trim().split(" ");
			 setSecurity_charges_airlane_from(Double.parseDouble(rate[0]));
		 }
		 if(m.get("security_charges_airlane_to")!=null) {
			 String[] rate = ((String) m.get("security_charges_airlane_to")).trim().split(" ");
			 setSecurity_charges_airlane_to(Double.parseDouble(rate[0]));           		
		 }
		 if(m.get("total_fee_to")!=null) {
			 String[] rate = ((String) m.get("total_fee_to")).trim().split(" ");
			 setTotal_fee_to(Double.parseDouble(rate[0]));
		 }
		 if(m.get("total_insurance_from")!=null){
			 String[] rate = ((String) m.get("total_insurance_from")).trim().split(" ");
			 setTotal_insurance_from(Double.parseDouble(rate[0]));
		 }
		 if(m.get("total_insurance_to")!=null) {
			 String[] rate = ((String) m.get("total_insurance_to")).trim().split(" ");
			 setTotal_insurance_to(Double.parseDouble(rate[0]));
		 }
		 if(m.get("total_fee_from")!=null){
			 String[] rate = ((String) m.get("total_fee_from")).trim().split(" ");
			 setTotal_fee_from(Double.parseDouble(rate[0]));
		 }
		 if(m.get("commodities")!=null) setCommodities((String) m.get("commodities"));
		 if(m.get("standalone")!=null) setIsStandalone(Boolean.parseBoolean((String)m.get("standalone")));
		 else setIsStandalone(false);
		 if(m.get("ca3dg")!=null) setCa3dg((String) m.get("ca3dg"));
		 if(m.get("caId")!=null) setCaId((String) m.get("caId"));
		 if(m.get("flight")!=null) setFlight((String) m.get("flight"));
		 if(m.get("dept")!=null) setDept( (Date) m.get("dept"));
		 if(m.get("maxarr")!=null) setMaxArr((Date) m.get("maxarr"));
	 }
	 


	public Long getCourier_shipper_add_id() {
		return courier_shipper_add_id;
	}
	public void setCourier_shipper_add_id(Long courier_shipper_add_id) {
		this.courier_shipper_add_id = courier_shipper_add_id;
	}
	public Long getCourier_consignee_add_id() {
		return courier_consignee_add_id;
	}
	public void setCourier_consignee_add_id(Long courier_consignee_add_id) {
		this.courier_consignee_add_id = courier_consignee_add_id;
	}
	public Long getConsignee_add_id() {
		return consignee_add_id;
	}
	public void setConsignee_add_id(Long consignee_add_id) {
		this.consignee_add_id = consignee_add_id;
	}
	public Long getShipper_add_id() {
		return shipper_add_id;
	}
	public void setShipper_add_id(Long shipper_add_id) {
		this.shipper_add_id = shipper_add_id;
	}
	public String getSessionKey() {
		return sessionKey;
	}
	public void setSessionKey(String sessionKey) {
		this.sessionKey = sessionKey;
	}
	public Long getRateId() {
		return rateId;
	}
	public void setRateId(Long rateId) {
		this.rateId = rateId;
	}
	public String getCommodities() {
		return commodities;
	}
	public void setCommodities(String commodities) {
		this.commodities = commodities;
	}

	public String getCa3dg() {
		return ca3dg;
	}

	public void setCa3dg(String ca3dg) {
		this.ca3dg = ca3dg;
	}

	public String getCaId() {
		return caId;
	}

	public void setCaId(String caId) {
		this.caId = caId;
	}

	public String getFlight() {
		return flight;
	}

	public void setFlight(String flight) {
		this.flight = flight;
	}
	public Double getShipper_distance() {
		return shipper_distance;
	}

	public void setShipper_distance(Double shipper_distance) {
		this.shipper_distance = shipper_distance;
	}

	public Double getShipper_duration() {
		return shipper_duration;
	}

	public void setShipper_duration(Double shipper_duration) {
		this.shipper_duration = shipper_duration;
	}

	public Double getShipper_rate_from() {
		return shipper_rate_from;
	}

	public void setShipper_rate_from(Double shipper_rate_from) {
		this.shipper_rate_from = shipper_rate_from;
	}

	public Double getShipper_rate_to() {
		return shipper_rate_to;
	}

	public void setShipper_rate_to(Double shipper_rate_to) {
		this.shipper_rate_to = shipper_rate_to;
	}

	public Double getConsignee_distance() {
		return consignee_distance;
	}

	public void setConsignee_distance(Double consignee_distance) {
		this.consignee_distance = consignee_distance;
	}

	public Double getConsignee_duration() {
		return consignee_duration;
	}

	public void setConsignee_duration(Double consignee_duration) {
		this.consignee_duration = consignee_duration;
	}

	public Double getConsignee_rate_from() {
		return consignee_rate_from;
	}

	public void setConsignee_rate_from(Double consignee_rate_from) {
		this.consignee_rate_from = consignee_rate_from;
	}

	public Double getConsignee_rate_to() {
		return consignee_rate_to;
	}

	public void setConsignee_rate_to(Double consignee_rate_to) {
		this.consignee_rate_to = consignee_rate_to;
	}

	public Double getRate_airlane_per_kg_from() {
		return rate_airlane_per_kg_from;
	}

	public void setRate_airlane_per_kg_from(Double rate_airlane_per_kg_from) {
		this.rate_airlane_per_kg_from = rate_airlane_per_kg_from;
	}

	public Double getRate_airlane_per_kg_to() {
		return rate_airlane_per_kg_to;
	}

	public void setRate_airlane_per_kg_to(Double rate_airlane_per_kg_to) {
		this.rate_airlane_per_kg_to = rate_airlane_per_kg_to;
	}

	public Double getTotal_airlane_from() {
		return total_airlane_from;
	}

	public void setTotal_airlane_from(Double total_airlane_from) {
		this.total_airlane_from = total_airlane_from;
	}

	public Double getTotal_airlane_to() {
		return total_airlane_to;
	}

	public void setTotal_airlane_to(Double total_airlane_to) {
		this.total_airlane_to = total_airlane_to;
	}

	public Double getFuel_charges_airlane_from() {
		return fuel_charges_airlane_from;
	}

	public void setFuel_charges_airlane_from(Double fuel_charges_airlane_from) {
		this.fuel_charges_airlane_from = fuel_charges_airlane_from;
	}

	public Double getFuel_charges_airlane_to() {
		return fuel_charges_airlane_to;
	}

	public void setFuel_charges_airlane_to(Double fuel_charges_airlane_to) {
		this.fuel_charges_airlane_to = fuel_charges_airlane_to;
	}

	public Double getSecurity_charges_airlane_from() {
		return security_charges_airlane_from;
	}

	public void setSecurity_charges_airlane_from(Double security_charges_airlane_from) {
		this.security_charges_airlane_from = security_charges_airlane_from;
	}

	public Double getSecurity_charges_airlane_to() {
		return security_charges_airlane_to;
	}

	public void setSecurity_charges_airlane_to(Double security_charges_airlane_to) {
		this.security_charges_airlane_to = security_charges_airlane_to;
	}

	public Double getTotal_fee_to() {
		return total_fee_to;
	}

	public void setTotal_fee_to(Double total_fee_to) {
		this.total_fee_to = total_fee_to;
	}

	public Double getTotal_insurance_from() {
		return total_insurance_from;
	}

	public void setTotal_insurance_from(Double total_insurance_from) {
		this.total_insurance_from = total_insurance_from;
	}

	public Double getTotal_insurance_to() {
		return total_insurance_to;
	}

	public void setTotal_insurance_to(Double total_insurance_to) {
		this.total_insurance_to = total_insurance_to;
	}

	public Double getTotal_fee_from() {
		return total_fee_from;
	}

	public void setTotal_fee_from(Double total_fee_from) {
		this.total_fee_from = total_fee_from;
	}

	public Date getDept() {
		return dept;
	}

	public void setDept(Date dept) {
		this.dept = dept;
	}

	public Date getMaxArr() {
		return maxArr;
	}

	public void setMaxArr(Date maxArr) {
		this.maxArr = maxArr;
	}

	public Boolean getIsStandalone() {
		return isStandalone;
	}

	public void setIsStandalone(Boolean isStandalone) {
		this.isStandalone = isStandalone;
	}
	public String getCurrencyFrom() {
		return currencyFrom;
	}
	public void setCurrencyFrom(String currencyFrom) {
		this.currencyFrom = currencyFrom;
	}
	public String getCurrencyTo() {
		return currencyTo;
	}
	public void setCurrencyTo(String currencyTo) {
		this.currencyTo = currencyTo;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	 
	 
}
