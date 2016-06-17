package de.act.common.types.ruleobject;

/**
 * @author Henry
 */
public class RAr implements java.io.Serializable {

	private static final long serialVersionUID = -2664266150283601005L;
	private long RId;
	private RBase RBase;
	private Integer arBool;
	private String arCode;
	private String arSect;

	public RAr() {
		
	}

	public RAr(RBase RBase) {
		this.RBase = RBase;
	}

	public RAr(RBase RBase, Integer arBool, String arCode, String arSect) {
		this.RBase = RBase;
		this.arBool = arBool;
		this.arCode = arCode;
		this.arSect = arSect;
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

	public Integer getArBool() {
		return this.arBool;
	}

	public void setArBool(Integer arBool) {
		this.arBool = arBool;
	}

	public String getArCode() {
		return this.arCode;
	}

	public void setArCode(String arCode) {
		this.arCode = arCode;
	}

	public String getArSect() {
		return this.arSect;
	}

	public void setArSect(String arSect) {
		this.arSect = arSect;
	}
}
