package de.act.common.types.staticobjects;
import java.io.Serializable;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class RSCostCons implements Serializable, Cloneable {

	private static final long serialVersionUID = -5996931319021852864L;
	private Long consCostId;
	private String caId;
	private String consCostType;
	private String unit;
	private String consCostUnit;
	private String routingType;
	private Integer vatRequired;
	private Double rate;
	private Double minimum;
	private String cur3lc;
	private Integer rId;
	private RSVad vad;
	private Integer isDelete;
	
	public Long getConsCostId() {
		return consCostId;
	}
	public void setConsCostId(Long consCostId) {
		this.consCostId = consCostId;
	}
	public String getCaId() {
		return caId;
	}
	public void setCaId(String caId) {
		this.caId = caId;
	}
	public String getConsCostType() {
		return consCostType;
	}
	public void setConsCostType(String consCostType) {
		this.consCostType = consCostType;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getConsCostUnit() {
		return consCostUnit;
	}
	public void setConsCostUnit(String consCostUnit) {
		this.consCostUnit = consCostUnit;
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
