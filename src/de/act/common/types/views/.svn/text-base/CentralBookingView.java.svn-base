/**
 * 
 */
package de.act.common.types.views;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import de.act.common.types.nonstaticobjects.RFForm;
import de.act.common.types.staticobjects.ICommodityTree;
import de.act.common.types.staticobjects.RSAc;
import de.act.common.types.staticobjects.RSAdd;
import de.act.common.types.staticobjects.RSAp;
import de.act.common.types.staticobjects.RSConx;
import de.act.common.types.staticobjects.RSFlt;

/**
 * @author User
 * @version 1.0 03.04.2007
 */
public class CentralBookingView implements Serializable {

	private static final long serialVersionUID = 8078130926333915970L;
	private Long bkgID;
	private Long cbkgID;
	private Long bookingID;
	private String addID;
	private String awbNo;
	private Integer part;
	private Date corr;
	private String bkgStatus;
	private Long comID;
	private Long annID;
	private String scc3lc;
	private Integer pcs;
	private Double wgt;
	private Double vol;
	private String acComp;
	private String uld3lc;
	private Date depDate;
	private Date arrDate;
	private Double autoWgt;
	private Double autoVol;
	private Double manualWgt;
	private Double manualVol;
	private Double maxWgt;
	private Double maxVol;
	private String fltID;
	private String fid;
	private String acReg;
	private ICommodityTree commodity;
	private RSAdd address;
	private Integer add_id;
	private String sfltID;
	private RSFlt flight;
	private RSAc  aircraft;
	private Integer ac_id;
	private RFForm formularInformation;
	private Integer prio;
	private Date fltDate;
	private String fltNo;
	private Integer fltStops;
	private String conxID;
	private String caID;
	private String dept;
	private String dest;
	RSConx connection;
	RSAp destAp;
	RSAp deptAp;


	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj==this) {
			return true;
		}
		if (obj instanceof CentralBookingView) {
			CentralBookingView b = (CentralBookingView) obj;
			return new EqualsBuilder().append(b.bkgID, bkgID).isEquals();
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(this.bkgID).toHashCode();
	}

	public String getAcComp() {
		return this.acComp;
	}

	public void setAcComp(String acComp) {
		this.acComp = acComp;
	}

	public String getAcReg() {
		return this.acReg;
	}

	public void setAcReg(String acReg) {
		this.acReg = acReg;
	}

	public String getAddID() {
		return this.addID;
	}

	public void setAddID(String addID) {
		this.addID = addID;
	}

	public RSAdd getAddress() {
		return this.address;
	}

	public void setAddress(RSAdd address) {
		this.address = address;
	}

	public RSAc getAircraft() {
		return this.aircraft;
	}

	public void setAircraft(RSAc aircraft) {
		this.aircraft = aircraft;
	}

	public Long getAnnID() {
		return this.annID;
	}

	public void setAnnID(Long annID) {
		this.annID = annID;
	}

	public Date getArrDate() {
		return this.arrDate;
	}

	public void setArrDate(Date arrDate) {
		this.arrDate = arrDate;
	}

	public Double getAutoVol() {
		return this.autoVol;
	}

	public void setAutoVol(Double autoVol) {
		this.autoVol = autoVol;
	}

	public Double getAutoWgt() {
		return this.autoWgt;
	}

	public void setAutoWgt(Double autoWgt) {
		this.autoWgt = autoWgt;
	}

	public String getAwbNo() {
		return this.awbNo;
	}

	public void setAwbNo(String awbNo) {
		this.awbNo = awbNo;
	}

	public Long getBkgID() {
		return this.bkgID;
	}

	public void setBkgID(Long bkgID) {
		this.bkgID = bkgID;
	}

	public String getBkgStatus() {
		return this.bkgStatus;
	}

	public void setBkgStatus(String bkgStatus) {
		this.bkgStatus = bkgStatus;
	}

	public Long getBookingID() {
		return this.bookingID;
	}

	public void setBookingID(Long bookingID) {
		this.bookingID = bookingID;
	}

	public Long getCbkgID() {
		return this.cbkgID;
	}

	public void setCbkgID(Long cbkgID) {
		this.cbkgID = cbkgID;
	}

	public Long getComID() {
		return this.comID;
	}

	public void setComID(Long comID) {
		this.comID = comID;
	}

	public ICommodityTree getCommodity() {
		return this.commodity;
	}

	public void setCommodity(ICommodityTree commodity) {
		this.commodity = commodity;
	}

	public Date getCorr() {
		return this.corr;
	}

	public void setCorr(Date corr) {
		this.corr = corr;
	}

	public Date getDepDate() {
		return this.depDate;
	}

	public void setDepDate(Date depDate) {
		this.depDate = depDate;
	}

	public String getFid() {
		return this.fid;
	}

	public void setFid(String fid) {
		this.fid = fid;
	}

	public RSFlt getFlight() {
		return this.flight;
	}

	public void setFlight(RSFlt flight) {
		this.flight = flight;
	}

	public String getFltID() {
		return this.fltID;
	}

	public void setFltID(String fltID) {
		this.fltID = fltID;
	}

	public RFForm getFormularInformation() {
		return this.formularInformation;
	}

	public void setFormularInformation(RFForm formularInformation) {
		this.formularInformation = formularInformation;
	}

	public Double getManualVol() {
		return this.manualVol;
	}

	public void setManualVol(Double manualVol) {
		this.manualVol = manualVol;
	}

	public Double getManualWgt() {
		return this.manualWgt;
	}

	public void setManualWgt(Double manualWgt) {
		this.manualWgt = manualWgt;
	}

	public Double getMaxVol() {
		return this.maxVol;
	}

	public void setMaxVol(Double maxVol) {
		this.maxVol = maxVol;
	}

	public Double getMaxWgt() {
		return this.maxWgt;
	}

	public void setMaxWgt(Double maxWgt) {
		this.maxWgt = maxWgt;
	}

	public Integer getPart() {
		return this.part;
	}

	public void setPart(Integer part) {
		this.part = part;
	}

	public Integer getPcs() {
		return this.pcs;
	}

	public void setPcs(Integer pcs) {
		this.pcs = pcs;
	}

	public String getScc3lc() {
		return this.scc3lc;
	}

	public void setScc3lc(String scc3lc) {
		this.scc3lc = scc3lc;
	}
	
	public String getSfltID() {
		return this.sfltID;
	}

	public void setSfltID(String sfltID) {
		this.sfltID = sfltID;
	}

	public String getUld3lc() {
		return this.uld3lc;
	}
	
	public void setUld3lc(String uld3lc) {
		this.uld3lc = uld3lc;
	}

	public Double getVol() {
		return this.vol;
	}

	public void setVol(Double vol) {
		this.vol = vol;
	}

	public Double getWgt() {
		return this.wgt;
	}

	public void setWgt(Double wgt) {
		this.wgt = wgt;
	}

	public String getCaID() {
		return this.caID;
	}

	public void setCaID(String caID) {
		this.caID = caID;
	}

	public RSConx getConnection() {
		return this.connection;
	}

	public void setConnection(RSConx connection) {
		this.connection = connection;
	}

	public String getConxID() {
		return this.conxID;
	}

	public void setConxID(String conxID) {
		this.conxID = conxID;
	}

	public String getDept() {
		return this.dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public RSAp getDeptAp() {
		return this.deptAp;
	}

	public void setDeptAp(RSAp deptAp) {
		this.deptAp = deptAp;
	}

	public String getDest() {
		return this.dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public RSAp getDestAp() {
		return this.destAp;
	}

	public void setDestAp(RSAp destAp) {
		this.destAp = destAp;
	}

	public Date getFltDate() {
		return this.fltDate;
	}

	public void setFltDate(Date fltDate) {
		this.fltDate = fltDate;
	}

	public String getFltNo() {
		return this.fltNo;
	}

	public void setFltNo(String fltNo) {
		this.fltNo = fltNo;
	}

	public Integer getFltStops() {
		return this.fltStops;
	}

	public void setFltStops(Integer fltStops) {
		this.fltStops = fltStops;
	}

	public Integer getPrio() {
		return this.prio;
	}

	public void setPrio(Integer prio) {
		this.prio = prio;
	}

	public Integer getAdd_id() {
		return add_id;
	}

	public void setAdd_id(Integer add_id) {
		this.add_id = add_id;
	}

	public Integer getAc_id() {
		return ac_id;
	}

	public void setAc_id(Integer ac_id) {
		this.ac_id = ac_id;
	} 
}
