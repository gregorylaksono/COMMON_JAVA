package de.act.common.types.views;

public class AWBCom implements java.io.Serializable{
	
	private Integer pcs;
	private Double wgt;
	private Double chargeableWgt;
	private Double rate;
	private String rateClass;
	private Double total;
	private String comName;
	private Double L;
	private Double W;
	private Double H;
	
	public AWBCom(){
		
	}
	public Integer getPcs() {
		return pcs;
	}
	public void setPcs(Integer pcs) {
		this.pcs = pcs;
	}
	public Double getWgt() {
		return wgt;
	}
	public void setWgt(Double wgt) {
		this.wgt = wgt;
	}
	public Double getChargeableWgt() {
		return chargeableWgt;
	}
	public void setChargeableWgt(Double chargeableWgt) {
		this.chargeableWgt = chargeableWgt;
	}
	public Double getRate() {
		return rate;
	}
	public void setRate(Double rate) {
		this.rate = rate;
	}
	public String getRateClass() {
		return rateClass;
	}
	public void setRateClass(String rateClass) {
		this.rateClass = rateClass;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public String getComName() {
		return comName;
	}
	public void setComName(String comName) {
		this.comName = comName;
	}
	public Double getL() {
		return L;
	}
	public void setL(Double l) {
		L = l;
	}
	public Double getW() {
		return W;
	}
	public void setW(Double w) {
		W = w;
	}
	public Double getH() {
		return H;
	}
	public void setH(Double h) {
		H = h;
	}
	
}
