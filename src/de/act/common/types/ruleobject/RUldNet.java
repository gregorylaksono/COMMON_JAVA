package de.act.common.types.ruleobject;

public class RUldNet implements java.io.Serializable {
	private static final long serialVersionUID = -8960190793973804595L;
	private long RId;
	private RBase RBase;
	private Integer uldBool;
	private String uldType;
	private Double uldMinWgt;
	private Double uldMinPercent;
	
	public long getRId() {
		return RId;
	}

	public void setRId(long id) {
		RId = id;
	}

	public RBase getRBase() {
		return RBase;
	}

	public void setRBase(RBase base) {
		RBase = base;
	}

	public Integer getUldBool() {
		return uldBool;
	}

	public void setUldBool(Integer uldBool) {
		this.uldBool = uldBool;
	}

	public String getUldType() {
		return uldType;
	}

	public void setUldType(String uldType) {
		this.uldType = uldType;
	}

	public Double getUldMinWgt() {
		return uldMinWgt;
	}

	public void setUldMinWgt(Double uldMinWgt) {
		this.uldMinWgt = uldMinWgt;
	}

	public Double getUldMinPercent() {
		return uldMinPercent;
	}

	public void setUldMinPercent(Double uldMinPercent) {
		this.uldMinPercent = uldMinPercent;
	}
	
	

}
