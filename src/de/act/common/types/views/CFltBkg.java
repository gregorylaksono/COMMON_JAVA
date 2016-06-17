package de.act.common.types.views;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import org.apache.commons.lang.builder.HashCodeBuilder;

public class CFltBkg implements Serializable {

	private static final long serialVersionUID = 5025520181621579133L;
	private Long fltId;
	private Long fltGroup;
	private Long sFltId;
	private int fltStops;
	private String deptAp;
	private String destAp;
	private Date fltDate; // day of departure
	private Date depDate; // departure date
	private Date arrDate; // arrival date
	private Timestamp depTimestamp;
	private Timestamp arrTimestamp;
	private double sumWgt;
	private double sumVol;
	private double autoWgt;
	private double autoVol;
	private double manualWgt;
	private double manualVol;
	private double maxWgt;
	private double maxVol;
	private double available_wgt;
	private double available_vol;
	private Integer open_for_cargo;
	
	private Long fltDateTime;
	private Long depDateTime;
	private Long arrDateTime;
	private Long depTime;
	private Long arrTime;
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this==obj) {
			return true;
		}
		if (obj instanceof CFltBkg) {
			CFltBkg c = (CFltBkg) obj;
			if (c.fltId.equals(this.fltId)) {
				return true;
			}
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(this.fltId).toHashCode();
	}

	public String getDeptAp() {
		return deptAp;
	}

	public void setDeptAp(String deptAp) {
		this.deptAp = deptAp;
	}

	public String getDestAp() {
		return destAp;
	}

	public void setDestAp(String destAp) {
		this.destAp = destAp;
	}

	public Long getSFltId() {
		return this.sFltId;
	}

	public void setSFltId(Long fltId) {
		this.sFltId = fltId;
	}

	public Date getFltDate() {
		return fltDate;
	}

	public void setFltDate(Date fltDate) {
		this.fltDate = fltDate;
		fltDateTime = null;
		if(fltDate != null)
			fltDateTime = new Long(fltDate.getTime());
	}

	public Long getsFltId() {
		return sFltId;
	}

	public void setsFltId(Long fltId) {
		sFltId = fltId;
	}

	public Long getFltId() {
		return fltId;
	}

	public void setFltId(Long fltId) {
		this.fltId = fltId;
	}

	public Long getFltGroup() {
		return fltGroup;
	}

	public void setFltGroup(Long fltGroup) {
		this.fltGroup = fltGroup;
	}

	public int getFltStops() {
		return fltStops;
	}

	public void setFltStops(int fltStops) {
		this.fltStops = fltStops;
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

	public double getSumVol() {
		return sumVol;
	}

	public void setSumVol(double sumVol) {
		this.sumVol = sumVol;
	}

	public double getSumWgt() {
		return sumWgt;
	}

	public void setSumWgt(double sumWgt) {
		this.sumWgt = sumWgt;
	}

	public double getAvailableVol() {
		return this.maxVol - this.sumVol;
	}

	public double getAvailableWgt() {
		return this.maxWgt -  this.sumWgt;
	}

	public double getAvailableManualVol() {
		return this.manualVol - this.sumVol;
	}

	public double getAvailableManualWgt() {
		return this.manualWgt -  this.sumWgt;
	}

	public double getAvailableAutoVol() {
		return this.autoVol - this.sumVol;
	}

	public double getAvailableAutoWgt() {
		return this.autoWgt -  this.sumWgt;
	}

	public Date getDepDate() {
		return depDate;
	}

	public void setDepDate(Date depDate) {
		this.depDate = depDate;
		depDateTime = null;
		if(depDate != null)
			depDateTime = new Long(depDate.getTime());
	}

	public Date getArrDate() {
		return this.arrDate;
	}

	public void setArrDate(Date arrDate) {
		this.arrDate = arrDate;
		arrDateTime = null;
		if(arrDate != null)
			arrDateTime = new Long(arrDate.getTime());
	}

	public double getAvailable_wgt() {
		return available_wgt;
	}

	public void setAvailable_wgt(double available_wgt) {
		this.available_wgt = available_wgt;
	}

	public double getAvailable_vol() {
		return available_vol;
	}

	public void setAvailable_vol(double available_vol) {
		this.available_vol = available_vol;
	}

	public Timestamp getDepTimestamp() {
		return depTimestamp;
	}

	public void setDepTimestamp(Timestamp depTimestamp) {
		this.depTimestamp = depTimestamp;
		this.depTime = null;
		if(depTimestamp != null)
			this.depTime = new Long(depTimestamp.getTime());
	}

	public Timestamp getArrTimestamp() {
		return arrTimestamp;
	}

	public void setArrTimestamp(Timestamp arrTimestamp) {
		this.arrTimestamp = arrTimestamp;
		this.arrTime = null;
		if(arrTimestamp != null)
			this.arrTime = new Long(arrTimestamp.getTime());
	}

	public Integer getOpen_for_cargo() {
		return open_for_cargo;
	}

	public void setOpen_for_cargo(Integer open_for_cargo) {
		this.open_for_cargo = open_for_cargo;
	}

	public Long getFltDateTime()
	{
		return fltDateTime;
	}

	public Long getDepDateTime()
	{
		return depDateTime;
	}

	public Long getArrDateTime()
	{
		return arrDateTime;
	}

	public Long getDepTime()
	{
		return depTime;
	}

	public Long getArrTime()
	{
		return arrTime;
	}
	
} // class CFltBkg
