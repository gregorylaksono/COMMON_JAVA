package de.act.common.types.ruleobject;

/**
 * @author Henry
 */
public class RDi implements java.io.Serializable {
	
	private static final long serialVersionUID = -5221002875272088875L;
	private long RId;
	private RBase RBase;
	private Integer diBool;
	private String diCo2lc;
	private String di2lc;
	private String diSect;

	public RDi() {
		
	}

	public RDi(RBase RBase) {
		this.RBase = RBase;
	}

	public RDi(RBase RBase, Integer diBool, String diCo2lc, String di2lc, String diSect) {
		this.RBase = RBase;
		this.diBool = diBool;
		this.diCo2lc = diCo2lc;
		this.di2lc = di2lc;
		this.diSect = diSect;
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

	public Integer getDiBool() {
		return this.diBool;
	}

	public void setDiBool(Integer diBool) {
		this.diBool = diBool;
	}

	public String getDiCo2lc() {
		return this.diCo2lc;
	}

	public void setDiCo2lc(String diCo2lc) {
		this.diCo2lc = diCo2lc;
	}

	public String getDi2lc() {
		return this.di2lc;
	}

	public void setDi2lc(String di2lc) {
		this.di2lc = di2lc;
	}

	public String getDiSect() {
		return this.diSect;
	}

	public void setDiSect(String diSect) {
		this.diSect = diSect;
	}
}
