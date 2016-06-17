package de.act.common.types.staticobjects;
import java.io.Serializable;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class RSCostAp implements Serializable, Cloneable {

	private static final long serialVersionUID = -5996931319021852864L;
	private Long apCostId;
	private String ap3lc;
	private String caId;
	private String apCostType;
	private String apRtSegment;
	private String unit;
	private String apCostUnit;
	private String routingType;
	private Integer vatRequired;
	private Double rate;
	private Double minimum;
	private String cur3lc;
	private Integer rId;
	private RSVad vad;
	private Integer isDelete;
	
	public Long getApCostId() {
		return apCostId;
	}
	public void setApCostId(Long apCostId) {
		this.apCostId = apCostId;
	}
	public String getAp3lc() {
		return ap3lc;
	}
	public void setAp3lc(String ap3lc) {
		this.ap3lc = ap3lc;
	}
	public String getCaId() {
		return caId;
	}
	public void setCaId(String caId) {
		this.caId = caId;
	}
	public String getApCostType() {
		return apCostType;
	}
	public void setApCostType(String apCostType) {
		this.apCostType = apCostType;
	}
	public String getApRtSegment() {
		return apRtSegment;
	}
	public void setApRtSegment(String apRtSegment) {
		this.apRtSegment = apRtSegment;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getApCostUnit() {
		return apCostUnit;
	}
	public void setApCostUnit(String apCostUnit) {
		this.apCostUnit = apCostUnit;
	}
	public String getRoutingType() {
		return routingType;
	}
	public void setRoutingType(String routingType) {
		this.routingType = routingType;
	}
	public Integer getVatRequired() {
		return vatRequired;
	}
	public void setVatRequired(Integer vatRequired) {
		this.vatRequired = vatRequired;
	}
	public boolean isEnabled()
	{
		return (vatRequired == 1);
	}
	public void setEnabled(boolean enabled)
	{
		vatRequired = enabled ? 1 : 0;
	}
	public Double getRate() {
		return rate;
	}
	public void setRate(Double rate) {
		this.rate = rate;
	}
	public Double getMinimum() {
		return minimum;
	}
	public void setMinimum(Double minimum) {
		this.minimum = minimum;
	}
	public String getCur3lc() {
		return cur3lc;
	}
	public void setCur3lc(String cur3lc) {
		this.cur3lc = cur3lc;
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
	public Integer getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}
	
}
