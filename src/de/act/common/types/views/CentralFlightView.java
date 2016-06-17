/**
 * 
 */
package de.act.common.types.views;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang.builder.HashCodeBuilder;

import de.act.common.types.staticobjects.RSAc;
import de.act.common.types.staticobjects.RSFlt;

/**
 * @author User
 * @version 1.0 03.04.2007
 */
public class CentralFlightView implements Serializable {

	private static final long serialVersionUID = 8078130926333915970L;
	private String fltId;
	private Long sfltID;
	private Date fltDate;
	private Date arrDate;
	private double sumWgt;
	private double sumVol;
	private double autoWgt;
	private double autoVol;
	private double manualWgt;
	private double manualVol;
	private double maxWgt;
	private double maxVol;
	private double availableWgt;
	private double availableVol;
	private RSAc  aircraft;
	private String acReg;
	private RSFlt flight;

	public boolean equals(Object obj) {
		if (this==obj) {
			return true;
		}
		if (obj instanceof CentralFlightView) {
			CentralFlightView c = (CentralFlightView) obj;
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

	public String getAcReg() {
		return this.acReg;
	}

	public void setAcReg(String acReg) {
		this.acReg = acReg;
	}

	public RSAc getAircraft() {
		return this.aircraft;
	}

	public void setAircraft(RSAc aircraft) {
		this.aircraft = aircraft;
	}

	public RSFlt getFlight() {
		return this.flight;
	}

	public void setFlight(RSFlt flight) {
		this.flight = flight;
	}

	public Date getArrDate() {
		return this.arrDate;
	}

	public void setArrDate(Date arrDate) {
		this.arrDate = arrDate;
	}

	public double getAutoVol() {
		return this.autoVol;
	}

	public void setAutoVol(double autoVol) {
		this.autoVol = autoVol;
	}

	public double getAutoWgt() {
		return this.autoWgt;
	}

	public void setAutoWgt(double autoWgt) {
		this.autoWgt = autoWgt;
	}

	public double getAvailableVol() {
		return this.availableVol;
	}

	public void setAvailableVol(double availableVol) {
		this.availableVol = availableVol;
	}

	public double getAvailableWgt() {
		return this.availableWgt;
	}

	public void setAvailableWgt(double availableWgt) {
		this.availableWgt = availableWgt;
	}

	public Date getFltDate() {
		return this.fltDate;
	}

	public void setFltDate(Date fltDate) {
		this.fltDate = fltDate;
	}

	public String getFltId() {
		return this.fltId;
	}

	public void setFltId(String fltId) {
		this.fltId = fltId;
	}

	public double getManualVol() {
		return this.manualVol;
	}

	public void setManualVol(double manualVol) {
		this.manualVol = manualVol;
	}

	public double getManualWgt() {
		return this.manualWgt;
	}

	public void setManualWgt(double manualWgt) {
		this.manualWgt = manualWgt;
	}

	public double getMaxVol() {
		return this.maxVol;
	}

	public void setMaxVol(double maxVol) {
		this.maxVol = maxVol;
	}

	public double getMaxWgt() {
		return this.maxWgt;
	}

	public void setMaxWgt(double maxWgt) {
		this.maxWgt = maxWgt;
	}

	public Long getSfltID() {
		return this.sfltID;
	}

	public void setSfltID(Long sfltID) {
		this.sfltID = sfltID;
	}

	public double getSumVol() {
		return this.sumVol;
	}

	public void setSumVol(double sumVol) {
		this.sumVol = sumVol;
	}

	public double getSumWgt() {
		return this.sumWgt;
	}

	public void setSumWgt(double sumWgt) {
		this.sumWgt = sumWgt;
	}
}
