package de.act.common.types.nonstaticobjects;

import java.io.Serializable;
import java.util.Date;

public class RCFlt implements Serializable {

	private static final long serialVersionUID = -3458464453471077391L;

	private Long		id			= null;
	private Long		fltGroup	= null;
	private Long		sFltId		= null;
	private Date		dep			= null;
	private Date		arr			= null;
	private String		acReg		= null;
	private double		autoWgt		= 0.0;
	private double		autoVol		= 0.0;
	private double		manualWgt	= 0.0;
	private double		manualVol	= 0.0;
	private double		maxWgt		= 0.0;
	private double		maxVol		= 0.0;

	public String getAcReg() {
		return acReg;
	}

	public void setAcReg(String acReg) {
		this.acReg = acReg;
	}

	public double getAutoVol() {
		return autoVol;
	}

	public void setAutoVol(double autoVol) {
		this.autoVol = autoVol;
	}

	public double getAutoWgt() {
		return autoWgt;
	}

	public void setAutoWgt(double autoWgt) {
		this.autoWgt = autoWgt;
	}

	public Date getDep() {
		return dep;
	}

	public void setDep(Date dep) {
		this.dep = dep;
	}

	public Date getArr() {
		return arr;
	}

	public void setArr(Date arr) {
		this.arr = arr;
	}

	public Long getFltGroup() {
		return fltGroup;
	}

	public void setFltGroup(Long fltGroup) {
		this.fltGroup = fltGroup;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getManualVol() {
		return manualVol;
	}

	public void setManualVol(double manualVol) {
		this.manualVol = manualVol;
	}

	public double getManualWgt() {
		return manualWgt;
	}

	public void setManualWgt(double manualWgt) {
		this.manualWgt = manualWgt;
	}

	public double getMaxVol() {
		return maxVol;
	}

	public void setMaxVol(double maxVol) {
		this.maxVol = maxVol;
	}

	public double getMaxWgt() {
		return maxWgt;
	}

	public void setMaxWgt(double maxWgt) {
		this.maxWgt = maxWgt;
	}

	public Long getsFltId() {
		return sFltId;
	}

	public void setsFltId(Long fltId) {
		sFltId = fltId;
	}
}