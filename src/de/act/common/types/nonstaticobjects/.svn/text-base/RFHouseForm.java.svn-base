package de.act.common.types.nonstaticobjects;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import de.act.common.types.staticobjects.ICommodity;
import de.act.common.types.staticobjects.ICommodityTree;
import de.act.common.types.staticobjects.RSAdd;
import de.act.common.types.staticobjects.RSAp;
import de.act.common.types.staticobjects.RSScc;

/**
 * @author Martin Sachs
 * @since 1.0 - 27.06.2006
 */
public final class RFHouseForm implements Serializable {

	private static final long serialVersionUID = -4788892353050764879L;
	private String			remarks;
	private String			f_id;
	private String			f_parent;
	private String			ca_3dg;
	private String			ffw_3lc;
	private Integer			awb_stock;
	private Integer			awb_no;
	private Integer			att_id;
	private Integer			att_no;
	private Date			corr;
	private Integer			pcs;
	private Double			wgt;
	private Double			vol;
	private RSAdd			shp_add_id;
	private String			shp_subt_id;
	private String			stick_id;
	private ICommodity		commodity;
	private RSScc			scc;
	private RSAp			dep;
	private RSAp			des;
	// date of departure
	private Date			flightDate;
	private Date			flightTime;
	// fltNo of first flight
	private String			flightNo;
	// first carrier
	private String			ca2lc;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj instanceof RFHouseForm) {
			return new EqualsBuilder().append(this.f_id, ((RFHouseForm) obj).f_id).isEquals();
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(this.f_id).toHashCode();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuffer b = new StringBuffer();
		if (this.ca_3dg != null) {
			b.append(this.ca_3dg);
			b.append("-");
		}
		if (this.awb_stock != null) {
			b.append(this.awb_stock);
			b.append("-");
		}
		if (this.awb_no != null) {
			b.append(this.awb_no);
			b.append(" : ");
		}
		if (this.pcs != null) {
			b.append(this.pcs);
			b.append(", ");
		}
		if (this.wgt != null) {
			b.append(this.wgt);
			b.append("kg, ");
		}
		if (this.commodity != null) {
			b.append(this.commodity);
			b.append(", ");
		}
		if (this.scc != null) {
			b.append(this.scc);
			b.append(", ");
		}
		if (this.shp_add_id != null) {
			b.append(this.shp_add_id);
			b.append(", ");
		}
		if (this.remarks != null) {
			b.append(this.remarks);
			b.append(")");
		}
		return b.toString();
	}

	public RFHouseForm() {

	}

	public void setCommodity(ICommodityTree commodity) {
		this.commodity = commodity;
	}

	public RSAp getDep() {
		return dep;
	}

	public void setDep(RSAp dep) {
		this.dep = dep;
	}

	public RSAp getDes() {
		return des;
	}

	public void setDes(RSAp des) {
		this.des = des;
	}

	public String getF_id() {
		return f_id;
	}

	public void setF_id(String f_id) {
		this.f_id = f_id;
	}

	public Integer getPcs() {
		return pcs;
	}

	public void setPcs(Integer pcs) {
		this.pcs = pcs;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public RSScc getScc() {
		return scc;
	}

	public void setScc(RSScc scc) {
		this.scc = scc;
	}

	public Double getVol() {
		return vol;
	}

	public void setVol(Double vol) {
		this.vol = vol;
	}

	public Double getWgt() {
		return wgt;
	}

	public void setWgt(Double wgt) {
		this.wgt = wgt;
	}

	public Integer getAtt_id() {
		return att_id;
	}

	public void setAtt_id(Integer att_id) {
		this.att_id = att_id;
	}

	public Integer getAtt_no() {
		return att_no;
	}

	public void setAtt_no(Integer att_no) {
		this.att_no = att_no;
	}

	public Integer getAwb_no() {
		return awb_no;
	}

	public void setAwb_no(Integer awb_no) {
		this.awb_no = awb_no;
	}

	public Integer getAwb_stock() {
		return awb_stock;
	}

	public void setAwb_stock(Integer awb_stock) {
		this.awb_stock = awb_stock;
	}

	public String getCa_3dg() {
		return ca_3dg;
	}

	public void setCa_3dg(String ca_3dg) {
		this.ca_3dg = ca_3dg;
	}

	public ICommodity getCommodity() {
		return commodity;
	}

	public void setCommodity(ICommodity commodity) {
		this.commodity = commodity;
	}

	public Date getCorr() {
		return corr;
	}

	public void setCorr(Date corr) {
		this.corr = corr;
	}

	public String getF_parent() {
		return f_parent;
	}

	public void setF_parent(String f_parent) {
		this.f_parent = f_parent;
	}

	public String getFfw_3lc() {
		return ffw_3lc;
	}

	public void setFfw_3lc(String ffw_3lc) {
		this.ffw_3lc = ffw_3lc;
	}

	public RSAdd getShp_add_id() {
		return shp_add_id;
	}

	public void setShp_add_id(RSAdd shp_add_id) {
		this.shp_add_id = shp_add_id;
	}

	public String getShp_subt_id() {
		return shp_subt_id;
	}

	public void setShp_subt_id(String shp_subt_id) {
		this.shp_subt_id = shp_subt_id;
	}

	public String getStick_id() {
		return stick_id;
	}

	public void setStick_id(String stick_id) {
		this.stick_id = stick_id;
	}

	public String getCa2lc() {
		return this.ca2lc;
	}

	public void setCa2lc(String ca2lc) {
		this.ca2lc = ca2lc;
	}

	public Date getFlightDate() {
		return this.flightDate;
	}

	public void setFlightDate(Date flightDate) {
		this.flightDate = flightDate;
	}

	public String getFlightNo() {
		return this.flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public Date getFlightTime() {
		return this.flightTime;
	}

	public void setFlightTime(Date flightTime) {
		this.flightTime = flightTime;
	}
}
