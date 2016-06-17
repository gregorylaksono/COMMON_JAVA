package de.act.common.types.staticobjects;

import java.io.Serializable;

public class InsuranceChargeCommodity  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -9026174822734782670L;
	private Long id;
	private CommodityInsurance insurance;
	private CCommodityTree commodity;
	private RSAnn annotation;
	private String currencyFrom;
	private String currencyTo;
	private Double sum;
	private InsuranceCharge insuranceCharge;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public CommodityInsurance getInsurance() {
		return insurance;
	}
	public void setInsurance(CommodityInsurance insurance) {
		this.insurance = insurance;
	}
	public CCommodityTree getCommodity() {
		return commodity;
	}
	public void setCommodity(CCommodityTree commodity) {
		this.commodity = commodity;
	}
	public RSAnn getAnnotation() {
		return annotation;
	}
	public void setAnnotation(RSAnn annotation) {
		this.annotation = annotation;
	}
	public InsuranceCharge getInsuranceCharge() {
		return insuranceCharge;
	}
	public void setInsuranceCharge(InsuranceCharge insuranceCharge) {
		this.insuranceCharge = insuranceCharge;
	}
	public Double getSum() {
		return sum;
	}
	public void setSum(Double sum) {
		this.sum = sum;
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
	
}