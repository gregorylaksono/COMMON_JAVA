package de.act.common.types.staticobjects;
import java.io.Serializable;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class RSCostConx implements Serializable, Cloneable {

	private static final long serialVersionUID = -5996931319021852864L;
	private Long conxCostId;
	public RSConx connection;
	private String acType;
	private String conxCostType;
	private String conxCostUnit;
	private String routingType;
	private Integer vatRequired;
	private Double minimum;
	private Double rate;
	private String unit;
	private Integer rId;
	private RSVad vad;
	private String conxId;
	private String caId;
	private String dept;
	private String dest;
	private Integer isDelete;
	
	public Long getConxCostId() {
		return conxCostId;
	}
	public void setConxCostId(Long conxCostId) {
		this.conxCostId = conxCostId;
	}
	public RSConx getConnection() {
		return connection;
	}
	public void setConnection(RSConx connection) {
		this.connection = connection;
	}
	public String getAcType() {
		return acType;
	}
	public void setAcType(String acType) {
		this.acType = acType;
	}
	public String getConxCostType() {
		return conxCostType;
	}
	public void setConxCostType(String conxCostType) {
		this.conxCostType = conxCostType;
	}
	public String getConxCostUnit() {
		return conxCostUnit;
	}
	public void setConxCostUnit(String conxCostUnit) {
		this.conxCostUnit = conxCostUnit;
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
	public Double getMinimum() {
		return minimum;
	}
	public void setMinimum(Double minimum) {
		this.minimum = minimum;
	}
	public Double getRate() {
		return rate;
	}
	public void setRate(Double rate) {
		this.rate = rate;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
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
	public String getConxId() {
		return conxId;
	}
	public void setConxId(String conxId) {
		this.conxId = conxId;
	}
	public String getCaId() {
		return caId;
	}
	public void setCaId(String caId) {
		this.caId = caId;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public Integer getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}
	
}
