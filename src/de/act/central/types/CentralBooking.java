package de.act.central.types;

import java.util.Date;

/**
 * CentralBooking generated by MyEclipse - Hibernate Tools
 */

public class CentralBooking extends Central implements java.io.Serializable {

	// Fields

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 20.11.2006
	 */
	private static final long serialVersionUID = 2190835366722743827L;
	private Long bkgIdId;
	private CentralFlights CFlt;
	private Long bkgId;
	private Integer addId; //HENRY this should either Long or Integer
	private String awbNo;
	private Integer part;
	private Integer prio;
	private Date corr;
	private String bkgStatus;
	private Long comId;
	private Long annId;
	private String dept;
	private String dest;
	private String scc3lc;
	private Integer pcs;
	private Double wgt;
	private Double vol;
	private String acComp;
	private String uld3lc;
	private String f_id;
	private Integer isActive; // 1 Active , 0 non Active

	// Constructors

	/** default constructor */
	public CentralBooking() {
		
	}

	/** minimal constructor */
	public CentralBooking(Long bkgId, Date corr) {
		this.bkgId = bkgId;
		this.corr = corr;
	}

	/** full constructor */
	public CentralBooking(CentralFlights CFlt, Long bkgId, Integer addId, String awbNo, Integer part, Integer prio, Date corr, String bkgStatus, Long comId, Long annId, String scc3lc, Integer pcs, Double wgt, Double vol, String acComp, String uld3lc) {
		this.CFlt = CFlt;
		this.bkgId = bkgId;
		this.addId = addId;
		this.awbNo = awbNo;
		this.part = part;
		this.prio = prio;
		this.corr = corr;
		this.bkgStatus = bkgStatus;
		this.comId = comId;
		this.annId = annId;
		this.scc3lc = scc3lc;
		this.pcs = pcs;
		this.wgt = wgt;
		this.vol = vol;
		this.acComp = acComp;
		this.uld3lc = uld3lc;
	}

	// Property accessors

	public Long getBkgIdId() {
		return this.bkgIdId;
	}

	public void setBkgIdId(Long bkgIdId) {
		this.bkgIdId = bkgIdId;
	}

	public CentralFlights getCFlt() {
		return this.CFlt;
	}

	public void setCFlt(CentralFlights CFlt) {
		this.CFlt = CFlt;
	}

	public Long getBkgId() {
		return this.bkgId;
	}

	public void setBkgId(Long bkgId) {
		this.bkgId = bkgId;
	}

	public Integer getAddId() {
		return this.addId;
	}

	public void setAddId(Integer addId) {
		this.addId = addId;
	}

	public String getAwbNo() {
		return this.awbNo;
	}

	public void setAwbNo(String awbNo) {
		this.awbNo = awbNo;
	}

	public Integer getPart() {
		return this.part;
	}

	public void setPart(Integer part) {
		this.part = part;
	}

	public Integer getPrio() {
		return this.prio;
	}

	public void setPrio(Integer prio) {
		this.prio = prio;
	}

	public Date getCorr() {
		return this.corr;
	}

	public void setCorr(Date corr) {
		this.corr = corr;
	}

	public String getBkgStatus() {
		return this.bkgStatus;
	}

	public void setBkgStatus(String bkgStatus) {
		this.bkgStatus = bkgStatus;
	}

	public Long getComId() {
		return this.comId;
	}

	public void setComId(Long comId) {
		this.comId = comId;
	}

	public Long getAnnId() {
		return this.annId;
	}

	public void setAnnId(Long annId) {
		this.annId = annId;
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

	public String getScc3lc() {
		return this.scc3lc;
	}

	public void setScc3lc(String scc3lc) {
		this.scc3lc = scc3lc;
	}

	public Integer getPcs() {
		return this.pcs;
	}

	public void setPcs(Integer pcs) {
		this.pcs = pcs;
	}

	public Double getWgt() {
		return this.wgt;
	}

	public void setWgt(Double wgt) {
		this.wgt = wgt;
	}

	public Double getVol() {
		return this.vol;
	}

	public void setVol(Double vol) {
		this.vol = vol;
	}

	public String getAcComp() {
		return this.acComp;
	}

	public void setAcComp(String acComp) {
		this.acComp = acComp;
	}

	public String getUld3lc() {
		return this.uld3lc;
	}

	public void setUld3lc(String uld3lc) {
		this.uld3lc = uld3lc;
	}

	public String getF_id() {
		return f_id;
	}

	public void setF_id(String f_id) {
		this.f_id = f_id;
	}

	public Integer getIsActive() {
		return isActive;
	}

	public void setIsActive(Integer isActive) {
		this.isActive = isActive;
	}
}