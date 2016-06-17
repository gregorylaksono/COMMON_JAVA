package de.act.common.types.ruleobject;

/**
 * @author Henry
 */
public class RWgt implements java.io.Serializable {

	private static final long serialVersionUID = 8245787743255659979L;
	private long RId;
	private RBase RBase;
	private Integer wgtMax;
	private Double wgt;

	public RWgt() {
		
	}

	public RWgt(RBase RBase) {
		this.RBase = RBase;
	}

	public RWgt(RBase RBase, Integer wgtMax, Double wgt) {
		this.RBase = RBase;
		this.wgtMax = wgtMax;
		this.wgt = wgt;
	}

	public long getRId() {
		return this.RId;
	}

	public void setRId(long RId) {
		this.RId = RId;
	}

	public RBase getRBase() {
		return this.RBase;
	}

	public void setRBase(RBase RBase) {
		this.RBase = RBase;
	}

	public Integer getWgtMax() {
		return this.wgtMax;
	}

	public void setWgtMax(Integer wgtMax) {
		this.wgtMax = wgtMax;
	}

	public Double getWgt() {
		return this.wgt;
	}

	public void setWgt(Double wgt) {
		this.wgt = wgt;
	}
}