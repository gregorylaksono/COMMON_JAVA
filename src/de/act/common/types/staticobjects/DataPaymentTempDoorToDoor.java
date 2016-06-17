package de.act.common.types.staticobjects;

import java.util.Date;

public class DataPaymentTempDoorToDoor {

	private Long data_payment_temp_dtd_id = -1L;

	private String sessionKey;
	private Long rateId;
	private String token_id;
	private String payment_id;
	
	public Long getData_payment_temp_dtd_id() {
		return data_payment_temp_dtd_id;
	}
	public void setData_payment_temp_dtd_id(Long data_payment_temp_dtd_id) {
		this.data_payment_temp_dtd_id = data_payment_temp_dtd_id;
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
	
}
