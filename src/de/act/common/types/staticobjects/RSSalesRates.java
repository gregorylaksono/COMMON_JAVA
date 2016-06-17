package de.act.common.types.staticobjects;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class RSSalesRates implements java.io.Serializable {
	
	private static final long serialVersionUID = 9018606823761294067L;
	private Long salesRateId;
	private String rateId;
	private Double rate;
	private Double overRate;
	private Long rId;
	private RSVad vad;
	private String conxId;
	
	public Long getSalesRateId() {
		return salesRateId;
	}
	public void setSalesRateId(Long salesRateId) {
		this.salesRateId = salesRateId;
	}
	public String getRateId() {
		return rateId;
	}
	public void setRateId(String rateId) {
		this.rateId = rateId;
	}
	public Double getRate() {
		return rate;
	}
	public void setRate(Double rate) {
		this.rate = rate;
	}
	public Double getOverRate() {
		return overRate;
	}
	public void setOverRate(Double overRate) {
		this.overRate = overRate;
	}
	public Long getrId() {
		return rId;
	}
	public void setrId(Long rId) {
		this.rId = rId;
	}
	public RSVad getVad() {
		return vad;
	}
	public void setVad(RSVad vad) {
		this.vad = vad;
	}
	public String getConxId() {
		return conxId;
	}
	public void setConxId(String conxId) {
		this.conxId = conxId;
	}
	
}
