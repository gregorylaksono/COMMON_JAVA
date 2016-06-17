package de.act.common.types.handling;

import java.io.Serializable;
import java.util.Date;

public class AwbEPayment implements Serializable {
	private static final long serialVersionUID = -446718826580063465L;
	private String		awbEPaymentId	= null;
	private Long		attId				= null;
	private String		typeEPayment		= null;
	private String		statusEPayment	= null;
	private String		transactionId		= null;
	private String		tokenId				= null;
	private String		paymentId			= null;
	private String		payerId				= null;
	private Double		amount				= null;  /*Rony - 20140502*/
	private String		cur3lc				= null;
	private Date		corr				= null;
		
	
	public String getAwbEPaymentId() {
		return this.awbEPaymentId;
	}
	
	public void setAwbEPaymentId(String awbEPaymentId) {
		this.awbEPaymentId = awbEPaymentId;
	}
	
	public Long getAttId() {
		return this.attId;
	}
	
	public void setAttId (Long attId) {
		this.attId = attId;
	}
	
	public String getTypeEPayment() {
		return this.typeEPayment;
	}
	
	public void setTypeEPayment(String typeEPayment) {
		this.typeEPayment = typeEPayment;
	}
	
	public String getStatusEPayment() {
		return this.statusEPayment;
	}
	
	public void setStatusEPayment(String statusEPayment){
		this.statusEPayment = statusEPayment;
	}
	
	public String getTransactionId() {
		return this.transactionId;
	}
	
	public void setTransactionId(String transactionId){
		this.transactionId = transactionId;
	}
	
	public Date getCorr() {
		return this.corr;
	}

	public void setCorr(Date corr) {
		this.corr = corr;
	}
	
	public String getTokenId() {
		return this.tokenId;
	}
	
	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}	

	/*Rony - 20140429*/
	public String getPaymentId() {
		return this.paymentId;
	}
	
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}	
	
	public String getPayerId() {
		return this.payerId;
	}
	
	public void setPayerId(String payerId) {
		this.payerId = payerId;
	}
	
	public Double getAmount() {
		return this.amount;
	}
	
	public void setAmount (Double amount) {
		this.amount = amount;
	}	
	
	public String getCur3lc() {
		return this.cur3lc;
	}
	
	public void setCur3lc (String cur3lc) {
		this.cur3lc = cur3lc;
	}		
}
