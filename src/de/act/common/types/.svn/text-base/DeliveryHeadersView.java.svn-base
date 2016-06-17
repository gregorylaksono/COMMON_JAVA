package de.act.common.types;

import java.util.Date;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import de.act.common.types.nonstaticobjects.RFAwbNo;
import de.act.common.types.staticobjects.RSAdd;

/**
 * @author Martin Sachs
 * @since 1.0 - 16.01.2007
 */
public class DeliveryHeadersView implements java.io.Serializable{

	private static final long serialVersionUID = -8945199715620489L;
	private Long acc_id;
	private String ap_3lc;
	private Integer awb_acc;
	private String con_add_id; //HENRY it should either Long or Integer
	private Long con_subt_id;
	private Date add_corr;
	private String f_id;
	private String ca_3dg;
	private String ffw_3lc;
	private String awb_stock;
	private String awb_no;
	private RSAdd consignee ;
	private RFAwbNo awbNo;
	private Integer acc_sum_pcs;
	private Double 	acc_sum_wgt;
	private Double awb_sum_charge;

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this==obj) {
			return true;
		}
		if (obj instanceof DeliveryHeadersView) {
			DeliveryHeadersView o = (DeliveryHeadersView) obj;
			return new EqualsBuilder().append(o.f_id, this.f_id).isEquals();
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
		return this.f_id;
	}

	public Long getAcc_id() {
		return acc_id;
	}

	public void setAcc_id(Long acc_id) {
		this.acc_id = acc_id;
	}

	public Date getAdd_corr() {
		return add_corr;
	}

	public void setAdd_corr(Date add_corr) {
		this.add_corr = add_corr;
	}

	public String getAp_3lc() {
		return ap_3lc;
	}

	public void setAp_3lc(String ap_3lc) {
		this.ap_3lc = ap_3lc;
	}

	public Integer getAwb_acc() {
		return awb_acc;
	}

	public void setAwb_acc(Integer awb_acc) {
		this.awb_acc = awb_acc;
	}

	public String getAwb_no() {
		return awb_no;
	}

	public void setAwb_no(String awb_no) {
		this.awb_no = awb_no;
	}

	public String getAwb_stock() {
		return awb_stock;
	}

	public void setAwb_stock(String awb_stock) {
		this.awb_stock = awb_stock;
	}

	public String getCa_3dg() {
		return ca_3dg;
	}

	public void setCa_3dg(String ca_3dg) {
		this.ca_3dg = ca_3dg;
	}

	public String getCon_add_id() {
		return con_add_id;
	}

	public void setCon_add_id(String con_add_id) {
		this.con_add_id = con_add_id;
	}

	public Long getCon_subt_id() {
		return con_subt_id;
	}

	public void setCon_subt_id(Long con_subt_id) {
		this.con_subt_id = con_subt_id;
	}

	public String getF_id() {
		return f_id;
	}

	public void setF_id(String f_id) {
		this.f_id = f_id;
	}

	public String getFfw_3lc() {
		return ffw_3lc;
	}

	public void setFfw_3lc(String ffw_3lc) {
		this.ffw_3lc = ffw_3lc;
	}

	public Integer getAcc_sum_pcs() {
		return acc_sum_pcs;
	}

	public void setAcc_sum_pcs(Integer acc_sum_pcs) {
		this.acc_sum_pcs = acc_sum_pcs;
	}

	public Double getAcc_sum_wgt() {
		return acc_sum_wgt;
	}

	public void setAcc_sum_wgt(Double acc_sum_wgt) {
		this.acc_sum_wgt = acc_sum_wgt;
	}

	public Double getAwb_sum_charge() {
		return awb_sum_charge;
	}

	public void setAwb_sum_charge(Double awb_sum_charge) {
		this.awb_sum_charge = awb_sum_charge;
	}

	public RFAwbNo getAwbNo() {
		return awbNo;
	}

	public void setAwbNo(RFAwbNo awbNo) {
		this.awbNo = awbNo;
	}

	public RSAdd getConsignee() {
		return consignee;
	}

	public void setConsignee(RSAdd consignee) {
		this.consignee = consignee;
	}
}
