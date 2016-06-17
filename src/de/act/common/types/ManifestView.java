package de.act.common.types;

import java.util.Date;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import de.act.common.types.nonstaticobjects.RFAwbNo;
import de.act.common.types.nonstaticobjects.ULDObject;
import de.act.common.types.staticobjects.CCommodityTree;
import de.act.common.types.staticobjects.RSAp;
import de.act.common.types.staticobjects.RSFltConxCA;
import de.act.common.types.staticobjects.RSScc;
import de.act.common.types.staticobjects.RSState;
import de.act.common.types.staticobjects.RSUld;

/**
 * @author Martin Sachs
 * @since 1.0 - 13.07.2006
 */
@SuppressWarnings("unused")
public class ManifestView {
	private String f_id;
	private String f_parent;
	private String ca_3dg; // in case of MasterAWB
	private String ffw_3lc; // in case of houseAWB
	private Integer awb_stock;
	private Integer awb_no;
	private Long att_id;        // of package 
	private Integer att_no;     // of package
	private Date corr;
	private Integer pcs;
	private Double wgt;
	private Double vol;
	private String com_id; //HENRY it should Long
	private String flt_id;
	private String scc_3lc;
	private String bkg_flt_date;
	private String bkg_status;
	private String awb_stat_id;     // changeable
	private String awb_stat_descr;  // changeable
	private String ap_dest;
	private String shp_stat_id;     // changeable
	private String shp_stat_descr;  // changeable
	private RFAwbNo awbNo;
	private CCommodityTree commodity;
	private RSScc scc;
	private RSFltConxCA flight;     
	private RSAp dest;              
	private RSAp apDest;
	private RSState awbState;       // changeable
	private RSState shipperState;   // changeable
	private Long uld_id ;
	private RSUld uldType;  // assignable
	private ULDObject uld;          // assignable
	private Long ll_item_id;
	private Long bkg_item_id;
	private Long acc_item_id;
	private Long mani_item_id;
	private Long mani_id;
	private String ll_advice;

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this==obj){
			return true;
		}
		if (obj instanceof ManifestView) {
			ManifestView m = (ManifestView) obj;
			return new EqualsBuilder().append(this.f_id, m.f_id).isEquals();
		}
		return false;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(this.f_id).toHashCode();
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuffer b = new StringBuffer();
		if (this.awbNo!=null) {
			b.append(this.awbNo.toString());
			b.append("/");
		}
		if (this.pcs!=null) {
			b.append(this.pcs);
			b.append("/");
		}
		if (this.wgt!=null) {
			b.append(this.wgt);
			b.append("/");
		}
		if (this.commodity!=null) {
			b.append(this.commodity);
			b.append("/");
		}
		if (this.scc!=null) {
			b.append(this.scc);
			b.append("/");
		}
		if (this.flight!=null) {
			b.append(this.flight);
		}
		return b.toString();
	}

	public String getAp_dest() {
		return this.ap_dest;
	}

	public void setAp_dest(String ap_dest) {
		this.ap_dest = ap_dest;
	}

	public RSAp getApDest() {
		return this.apDest;
	}

	public void setApDest(RSAp apDest) {
		this.apDest = apDest;
	}

	public Long getAtt_id() {
		return this.att_id;
	}

	public void setAtt_id(Long att_id) {
		this.att_id = att_id;
	}

	public Integer getAtt_no() {
		return this.att_no;
	}

	public void setAtt_no(Integer att_no) {
		this.att_no = att_no;
	}

	public Integer getAwb_no() {
		return this.awb_no;
	}

	public void setAwb_no(Integer awb_no) {
		this.awb_no = awb_no;
	}

	public String getAwb_stat_descr() {
		return this.awb_stat_descr;
	}

	public void setAwb_stat_descr(String awb_stat_descr) {
		this.awb_stat_descr = awb_stat_descr;
	}

	public String getAwb_stat_id() {
		return this.awb_stat_id;
	}

	public void setAwb_stat_id(String awb_stat_id) {
		this.awb_stat_id = awb_stat_id;
	}

	public Integer getAwb_stock() {
		return this.awb_stock;
	}

	public void setAwb_stock(Integer awb_stock) {
		this.awb_stock = awb_stock;
	}

	public RFAwbNo getAwbNo() {
		return this.awbNo;
	}

	public void setAwbNo(RFAwbNo awbNo) {
		this.awbNo = awbNo;
	}

	public RSState getAwbState() {
		return this.awbState;
	}

	public void setAwbState(RSState awbState) {
		this.awbState = awbState;
	}

	public String getBkg_flt_date() {
		return this.bkg_flt_date;
	}

	public void setBkg_flt_date(String bkg_flt_date) {
		this.bkg_flt_date = bkg_flt_date;
	}

	public String getBkg_status() {
		return this.bkg_status;
	}

	public void setBkg_status(String bkg_status) {
		this.bkg_status = bkg_status;
	}

	public String getCa_3dg() {
		return this.ca_3dg;
	}

	public void setCa_3dg(String ca_3dg) {
		this.ca_3dg = ca_3dg;
	}

	public String getCom_id() {
		return this.com_id;
	}

	public void setCom_id(String com_id) {
		this.com_id = com_id;
	}

	public CCommodityTree getCommodity() {
		return this.commodity;
	}

	public void setCommodity(CCommodityTree commodity) {
		this.commodity = commodity;
	}

	public Date getCorr() {
		return this.corr;
	}

	public void setCorr(Date corr) {
		this.corr = corr;
	}

	public RSAp getDest() {
		return this.dest;
	}

	public void setDest(RSAp dest) {
		this.dest = dest;
	}

	public String getF_id() {
		return this.f_id;
	}

	public void setF_id(String f_id) {
		this.f_id = f_id;
	}

	public String getF_parent() {
		return this.f_parent;
	}

	public void setF_parent(String f_parent) {
		this.f_parent = f_parent;
	}

	public String getFfw_3lc() {
		return this.ffw_3lc;
	}

	public void setFfw_3lc(String ffw_3lc) {
		this.ffw_3lc = ffw_3lc;
	}

	public RSFltConxCA getFlight() {
		return this.flight;
	}

	public void setFlight(RSFltConxCA flight) {
		this.flight = flight;
	}

	public String getFlt_id() {
		return this.flt_id;
	}

	public void setFlt_id(String flt_id) {
		this.flt_id = flt_id;
	}

	public Integer getPcs() {
		return this.pcs;
	}

	public void setPcs(Integer pcs) {
		this.pcs = pcs;
	}

	public RSScc getScc() {
		return this.scc;
	}

	public void setScc(RSScc scc) {
		this.scc = scc;
	}

	public String getScc_3lc() {
		return this.scc_3lc;
	}

	public void setScc_3lc(String scc_3lc) {
		this.scc_3lc = scc_3lc;
	}

	public RSState getShipperState() {
		return this.shipperState;
	}

	public void setShipperState(RSState shipperState) {
		this.shipperState = shipperState;
	}

	public String getShp_stat_descr() {
		return this.shp_stat_descr;
	}

	public void setShp_stat_descr(String shp_stat_descr) {
		this.shp_stat_descr = shp_stat_descr;
	}

	public String getShp_stat_id() {
		return this.shp_stat_id;
	}

	public void setShp_stat_id(String shp_stat_id) {
		this.shp_stat_id = shp_stat_id;
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
}
