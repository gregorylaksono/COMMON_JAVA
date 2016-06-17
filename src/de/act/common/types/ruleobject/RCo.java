package de.act.common.types.ruleobject;

/**
 * @author Henry
 */
public class RCo implements java.io.Serializable {

	private static final long serialVersionUID = 8481118660143915138L;
	private long RId;
	private RBase RBase;
	private Integer coBool;
	private String co2lc;
	private String coSect;

	public RCo() {
		
	}

	public RCo(RBase RBase) {
		this.RBase = RBase;
	}

	public RCo(RBase RBase, Integer coBool, String co2lc, String coSect) {
		this.RBase = RBase;
		this.coBool = coBool;
		this.co2lc = co2lc;
		this.coSect = coSect;
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

	public Integer getCoBool() {
		return this.coBool;
	}

	public void setCoBool(Integer coBool) {
		this.coBool = coBool;
	}

	public String getCo2lc() {
		return this.co2lc;
	}

	public void setCo2lc(String co2lc) {
		this.co2lc = co2lc;
	}

	public String getCoSect() {
		return this.coSect;
	}

	public void setCoSect(String coSect) {
		this.coSect = coSect;
	}
}
