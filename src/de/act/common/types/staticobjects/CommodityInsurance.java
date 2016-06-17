package de.act.common.types.staticobjects;

import java.io.Serializable;

import de.act.common.types.ruleobject.RBase;

public class CommodityInsurance implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5681756076298109927L;
	
	private Long comm_insurance;
	private CCommodityTree commodity;
	private RSAnn rsAnn;
	private RSAddID addId;
	private Double min;
	private RSCur cur3lc;
	private Double rate;
	private RSVad vad;
	private String unit;
	private RBase rBase;
	private String rateMark;
	
	public static final String PERCENTAGE = "p";
	public static final String FIX = "f";
	
	public static final String RATE_UNIT_TOTAL_VALUE = "x";
	public static final String RATE_UNIT_TRANSPORT_VALUE = "t";
	public static final String RATE_UNIT_ITEMS_VALUE = "v";
	public static final String RATE_UNIT_WEIGHT_VALUE = "k";
	
	//x -> totals value, t -> transports value, v -> items value, k -> Kg(weight)
	
	public Long getComm_insurance() {
		return comm_insurance;
	}
	public void setComm_insurance(Long comm_insurance) {
		this.comm_insurance = comm_insurance;
	}
	public CCommodityTree getCommodity() {
		return commodity;
	}
	public void setCommodity(CCommodityTree commodity) {
		this.commodity = commodity;
	}
	public RSAnn getRsAnn() {
		return rsAnn;
	}
	public void setRsAnn(RSAnn rsAnn) {
		this.rsAnn = rsAnn;
	}
	public RSAddID getAddId() {
		return addId;
	}
	public void setAddId(RSAddID addId) {
		this.addId = addId;
	}

	public Double getMin() {
		return min;
	}
	public void setMin(Double min) {
		this.min = min;
	}

	public RSCur getCur3lc() {
		return cur3lc;
	}
	public void setCur3lc(RSCur cur3lc) {
		this.cur3lc = cur3lc;
	}
	public Double getRate() {
		return rate;
	}
	public void setRate(Double rate) {
		this.rate = rate;
	}
	public RSVad getVad() {
		return vad;
	}
	public void setVad(RSVad vad) {
		this.vad = vad;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public RBase getrBase() {
		return rBase;
	}
	public void setrBase(RBase rBase) {
		this.rBase = rBase;
	}
	public String getRateMark() {
		return rateMark;
	}
	public void setRateMark(String rateMark) {
		this.rateMark = rateMark;
	}
	
}