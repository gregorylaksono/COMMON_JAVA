package de.act.common.types.nonstaticobjects;

import java.io.Serializable;
import java.util.Date;

public class CentralBookingData implements Serializable {

	private static final long serialVersionUID = -446718826580063465L;
	private Long	id			= null;
	private Long	bkgId		= null;
	private String	fltId		= null;
	private String	addId		= null;
	private String	awbNo		= null;
	private int		part		= 0;
	private int		prio		= 0;
	private Date	corr		= null;
	private String	bkgStatus	= null;
	private Long	comId		= null;
	private Long	annId		= null;
	private String	scc3lc		= null;
	private int		pcs			= 0;
	private double	wgt			= 0.0;
	private double	vol			= 0.0;
	private String	acComp		= null;
	private String	uld3lc		= null;

	public String getAcComp() {
		return acComp;
	}

	public void setAcComp(String acComp) {
		this.acComp = acComp;
	}

	public Long getAnnId() {
		return annId;
	}

	public void setAnnId(Long annId) {
		this.annId = annId;
	}

	public Long getBkgId() {
		return bkgId;
	}

	public void setBkgId(Long bkgId) {
		this.bkgId = bkgId;
	}

	public String getBkgStatus() {
		return bkgStatus;
	}

	public void setBkgStatus(String bkgStatus) {
		this.bkgStatus = bkgStatus;
	}

	public Long getComId() {
		return comId;
	}

	public void setComId(Long comId) {
		this.comId = comId;
	}

	public Date getCorr() {
		return corr;
	}

	public void setCorr(Date corr) {
		this.corr = corr;
	}

	public String getAddId() {
		return this.addId;
	}

	public void setAddId(String id) {
		this.addId = id;
	}

	public String getAwbNo() {
		return this.awbNo;
	}

	public void setAwbNo(String awbNo) {
		this.awbNo = awbNo;
	}

	public String getFltId() {
		return fltId;
	}

	public void setFltId(String fltId) {
		this.fltId = fltId;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getPart() {
		return part;
	}

	public void setPart(int part) {
		this.part = part;
	}

	public int getPcs() {
		return pcs;
	}

	public void setPcs(int pcs) {
		this.pcs = pcs;
	}

	public int getPrio() {
		return prio;
	}

	public void setPrio(int prio) {
		this.prio = prio;
	}

	public String getScc3lc() {
		return scc3lc;
	}

	public void setScc3lc(String scc3lc) {
		this.scc3lc = scc3lc;
	}

	public String getUld3lc() {
		return uld3lc;
	}

	public void setUld3lc(String uld3lc) {
		this.uld3lc = uld3lc;
	}

	public double getVol() {
		return vol;
	}

	public void setVol(double vol) {
		this.vol = vol;
	}

	public double getWgt() {
		return wgt;
	}

	public void setWgt(double wgt) {
		this.wgt = wgt;
	}
}
