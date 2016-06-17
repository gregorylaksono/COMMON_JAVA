/**
 *
 */
package de.act.common.types.nonstaticobjects;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @author Martin Sachs
 * @since 1.0 - 12.06.2006
 */

public final class RFAvi  implements java.io.Serializable{

	private static final long serialVersionUID = 2749421061386247756L;
	public String F_ID = null;
	public Boolean CONS_OK = false;
	public Boolean ACCLIM = false;
	public Boolean CITES = false;
	public Boolean OT_LEG = false;
	public Boolean REPTILES = false;
	public Date AVI_DATE = null;
	public String SIGNATURE = null;
	// packages
	public RFPkgsAvi AVIPKGS = new RFPkgsAvi();
	public Timestamp CORR;

	public boolean isACCLIM() {
		return ACCLIM;
	}

	public void setACCLIM(boolean acclim) {
		ACCLIM = acclim;
	}

	public Date getAVI_DATE() {
		return AVI_DATE;
	}

	public void setAVI_DATE(Date avi_date) {
		AVI_DATE = avi_date;
	}

	public RFPkgsAvi getAVIPKGS() {
		return AVIPKGS;
	}

	public void setAVIPKGS(RFPkgsAvi avipkgs) {
		AVIPKGS = avipkgs;
	}

	public boolean isCITES() {
		return CITES;
	}

	public void setCITES(boolean cites) {
		CITES = cites;
	}

	public boolean isCONS_OK() {
		return CONS_OK;
	}

	public void setCONS_OK(boolean cons_ok) {
		CONS_OK = cons_ok;
	}

	public Timestamp getCORR() {
		return CORR;
	}

	public void setCORR(Timestamp corr) {
		CORR = corr;
	}

	public String getF_ID() {
		return F_ID;
	}

	public void setF_ID(String f_id) {
		F_ID = f_id;
	}

	public boolean isOT_LEG() {
		return OT_LEG;
	}

	public void setOT_LEG(boolean ot_leg) {
		OT_LEG = ot_leg;
	}

	public boolean isREPTILES() {
		return REPTILES;
	}

	public void setREPTILES(boolean reptiles) {
		REPTILES = reptiles;
	}

	public String getSIGNATURE() {
		return SIGNATURE;
	}

	public void setSIGNATURE(String signature) {
		SIGNATURE = signature;
	}
}
