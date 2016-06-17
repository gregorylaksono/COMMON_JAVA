package de.act.common.types.staticobjects;

import java.sql.Clob;
import java.util.Date;

public class DataPaymentTemp implements java.io.Serializable {

	private Long data_payment_temp_id = -1L;
	private Integer shipper_id;
	private String consignee;
	private Integer ffw_id;
	private Date dep_date;
	private String flights;
	private String commodities;
	private String token_id;
	private String payment_id;
	private Double amount;
	private String currency;
	private String insurance;
	
	public Long getData_payment_temp_id() {
		return data_payment_temp_id;
	}
	public void setData_payment_temp_id(Long data_payment_temp_id) {
		this.data_payment_temp_id = data_payment_temp_id;
	}
	public Integer getShipper_id() {
		return shipper_id;
	}
	public void setShipper_id(Integer shipper_id) {
		this.shipper_id = shipper_id;
	}
	public String getConsignee() {
		return consignee;
	}
	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}
	public Integer getFfw_id() {
		return ffw_id;
	}
	public void setFfw_id(Integer ffw_id) {
		this.ffw_id = ffw_id;
	}
	public Date getDep_date() {
		return dep_date;
	}
	public void setDep_date(Date dep_date) {
		this.dep_date = dep_date;
	}
	public String getFlights() {
		return flights;
	}
	public void setFlights(String flights) {
		this.flights = flights;
	}
	public String getCommodities() {
		return commodities;
	}
	public void setCommodities(String commodities) {
		this.commodities = commodities;
	}
	public String getToken_id() {
		return token_id;
	}
	public void setToken_id(String token_id) {
		this.token_id = token_id;
	}
	public String getPayment_id() {
		return payment_id;
	}
	public void setPayment_id(String payment_id) {
		this.payment_id = payment_id;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getInsurance() {
		return insurance;
	}
	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}
}
