package de.act.common.types.ruleobject;

/**
 * @author Henry
 */
public class RCur implements java.io.Serializable {

	private static final long serialVersionUID = 607638506145547339L;
	private long RId;
	private RBase RBase;
	private Integer curBool;
	private String cur3lc;

	public RCur() {
		
	}

	public RCur(RBase RBase) {
		this.RBase = RBase;
	}

	public RCur(RBase RBase, Integer curBool, String cur3lc) {
		this.RBase = RBase;
		this.curBool = curBool;
		this.cur3lc = cur3lc;
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

	public Integer getCurBool() {
		return this.curBool;
	}

	public void setCurBool(Integer curBool) {
		this.curBool = curBool;
	}

	public String getCur3lc() {
		return this.cur3lc;
	}

	public void setCur3lc(String cur3lc) {
		this.cur3lc = cur3lc;
	}
}
