package de.act.common.types.staticobjects;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class RSCoTax implements java.io.Serializable {

	private static final long serialVersionUID = -1870029571687577651L;
	private Long coTaxId;
	private String co_2lc;
	private String di_2lc;
	private String taxType;
	private Integer taxValue;
	private Integer taxPercentage;
	private String taxArea;
	private Integer rId;
	private RSVad vad;
	
	public Long getCoTaxId() {
		return coTaxId;
	}
	public void setCoTaxId(Long coTaxId) {
		this.coTaxId = coTaxId;
	}
	public String getTaxType() {
		return taxType;
	}
	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}
	public Integer getTaxValue() {
		return taxValue;
	}
	public void setTaxValue(Integer taxValue) {
		this.taxValue = taxValue;
	}
	public Integer getTaxPercentage() {
		return taxPercentage;
	}
	public void setTaxPercentage(Integer taxPercentage) {
		this.taxPercentage = taxPercentage;
	}
	public String getTaxArea() {
		return taxArea;
	}
	public void setTaxArea(String taxArea) {
		this.taxArea = taxArea;
	}
	public Integer getrId() {
		return rId;
	}
	public void setrId(Integer rId) {
		this.rId = rId;
	}
	public RSVad getVad() {
		return vad;
	}
	public void setVad(RSVad vad) {
		this.vad = vad;
	}
	public String getCo_2lc() {
		return co_2lc;
	}
	public void setCo_2lc(String co_2lc) {
		this.co_2lc = co_2lc;
	}
	public String getDi_2lc() {
		return di_2lc;
	}
	public void setDi_2lc(String di_2lc) {
		this.di_2lc = di_2lc;
	}
	
}
