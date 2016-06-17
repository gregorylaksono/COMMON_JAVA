/**
 * 
 */
package de.act.common.types.views;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Henry
 *
 */
public class LoadingListView implements Serializable{

	private static final long serialVersionUID = -537653287645030021L;
	private Long bkg_flt_id;
	private String ca_3dg;
	private Integer awb_stock;
	private Integer awb_no;
	private String non_standard;
	private String f_id;
	private String dept;
	private String dest;
	private String req_to;
	private Date bkg_flt_date;
	private Long bkg_item_id;
	private Double total_wgt;
	private Integer bkg_pcs;
	private Double total_vol;
	private String scc_3lc;
	private Long com_id;
	private String com_name;
	private Long ann_id;
	private String ann_name;
	private Integer shp_add_id;
	private Integer con_add_id;
	private String bkg_status;
	private Long acc_id;
	private Long acc_item_id_shipment;
	private Integer awb_acc_shipment;
	//private String stat_id_shipment;
	private Long acc_item_id_awb;
	private Integer awb_acc_awb;
	//private String stat_id_awb;
	private Long a_flt_id;
	private Long bkg_id_id;
	private Long mani_item_id;
	private Long ll_uld_id;
	private Long ll_uld_type;
	private Integer ll_uld_no;
	private Long uld_id;
	private Long flt_id;
	private String stat_id;
	
	public Long getBkg_flt_id() {
		return bkg_flt_id;
	}
	
	public void setBkg_flt_id(Long bkg_flt_id) {
		this.bkg_flt_id = bkg_flt_id;
	}
	
	public String getCa_3dg() {
		return ca_3dg;
	}
	
	public void setCa_3dg(String ca_3dg) {
		this.ca_3dg = ca_3dg;
	}
	
	public Integer getAwb_stock() {
		return awb_stock;
	}
	
	public void setAwb_stock(Integer awb_stock) {
		this.awb_stock = awb_stock;
	}
	
	public Integer getAwb_no() {
		return awb_no;
	}
	
	public void setAwb_no(Integer awb_no) {
		this.awb_no = awb_no;
	}
	
	public String getNon_standard() {
		return non_standard;
	}

	public void setNon_standard(String non_standard) {
		this.non_standard = non_standard;
	}

	public String getF_id() {
		return f_id;
	}
	
	public void setF_id(String f_id) {
		this.f_id = f_id;
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
	
	public String getReq_to() {
		return req_to;
	}
	
	public void setReq_to(String req_to) {
		this.req_to = req_to;
	}
	
	public Date getBkg_flt_date() {
		return bkg_flt_date;
	}
	
	public void setBkg_flt_date(Date bkg_flt_date) {
		this.bkg_flt_date = bkg_flt_date;
	}
	
	public Long getBkg_item_id() {
		return bkg_item_id;
	}
	
	public void setBkg_item_id(Long bkg_item_id) {
		this.bkg_item_id = bkg_item_id;
	}
	
	public Double getTotal_wgt() {
		return total_wgt;
	}
	
	public void setTotal_wgt(Double total_wgt) {
		this.total_wgt = total_wgt;
	}
	
	public Integer getBkg_pcs() {
		return bkg_pcs;
	}
	
	public void setBkg_pcs(Integer bkg_pcs) {
		this.bkg_pcs = bkg_pcs;
	}
	
	public Double getTotal_vol() {
		return total_vol;
	}
	
	public void setTotal_vol(Double total_vol) {
		this.total_vol = total_vol;
	}
	
	public String getScc_3lc() {
		return scc_3lc;
	}
	
	public void setScc_3lc(String scc_3lc) {
		this.scc_3lc = scc_3lc;
	}
	
	public Long getCom_id() {
		return com_id;
	}
	
	public void setCom_id(Long com_id) {
		this.com_id = com_id;
	}
	
	public String getCom_name() {
		return com_name;
	}
	
	public void setCom_name(String com_name) {
		this.com_name = com_name;
	}
	
	public Long getAnn_id() {
		return ann_id;
	}
	
	public void setAnn_id(Long ann_id) {
		this.ann_id = ann_id;
	}
	
	public String getAnn_name() {
		return ann_name;
	}
	
	public void setAnn_name(String ann_name) {
		this.ann_name = ann_name;
	}
	
	public Integer getShp_add_id() {
		return shp_add_id;
	}
	
	public void setShp_add_id(Integer shp_add_id) {
		this.shp_add_id = shp_add_id;
	}
	
	public Integer getCon_add_id() {
		return con_add_id;
	}
	
	public void setCon_add_id(Integer con_add_id) {
		this.con_add_id = con_add_id;
	}
	
	public String getBkg_status() {
		return bkg_status;
	}
	
	public void setBkg_status(String bkg_status) {
		this.bkg_status = bkg_status;
	}
	
	public Long getAcc_id() {
		return acc_id;
	}
	
	public void setAcc_id(Long acc_id) {
		this.acc_id = acc_id;
	}
	
	public Long getAcc_item_id_shipment() {
		return acc_item_id_shipment;
	}
	
	public void setAcc_item_id_shipment(Long acc_item_id_shipment) {
		this.acc_item_id_shipment = acc_item_id_shipment;
	}
	
	public Integer getAwb_acc_shipment() {
		return awb_acc_shipment;
	}
	
	public void setAwb_acc_shipment(Integer awb_acc_shipment) {
		this.awb_acc_shipment = awb_acc_shipment;
	}
	
	/*public String getStat_id_shipment() {
		return stat_id_shipment;
	}
	
	public void setStat_id_shipment(String stat_id_shipment) {
		this.stat_id_shipment = stat_id_shipment;
	}*/
	
	public Long getAcc_item_id_awb() {
		return acc_item_id_awb;
	}
	
	public void setAcc_item_id_awb(Long acc_item_id_awb) {
		this.acc_item_id_awb = acc_item_id_awb;
	}
	
	public Integer getAwb_acc_awb() {
		return awb_acc_awb;
	}
	
	public void setAwb_acc_awb(Integer awb_acc_awb) {
		this.awb_acc_awb = awb_acc_awb;
	}
	
	/*public String getStat_id_awb() {
		return stat_id_awb;
	}
	
	public void setStat_id_awb(String stat_id_awb) {
		this.stat_id_awb = stat_id_awb;
	}*/

	public Long getA_flt_id() {
		return a_flt_id;
	}

	public void setA_flt_id(Long a_flt_id) {
		this.a_flt_id = a_flt_id;
	}

	public Long getBkg_id_id() {
		return bkg_id_id;
	}

	public void setBkg_id_id(Long bkg_id_id) {
		this.bkg_id_id = bkg_id_id;
	}

	public Long getMani_item_id() {
		return mani_item_id;
	}

	public void setMani_item_id(Long mani_item_id) {
		this.mani_item_id = mani_item_id;
	}

	public Long getLl_uld_id() {
		return ll_uld_id;
	}

	public void setLl_uld_id(Long ll_uld_id) {
		this.ll_uld_id = ll_uld_id;
	}

	public Long getLl_uld_type() {
		return ll_uld_type;
	}

	public void setLl_uld_type(Long ll_uld_type) {
		this.ll_uld_type = ll_uld_type;
	}

	public Integer getLl_uld_no() {
		return ll_uld_no;
	}

	public void setLl_uld_no(Integer ll_uld_no) {
		this.ll_uld_no = ll_uld_no;
	}

	public Long getUld_id() {
		return uld_id;
	}

	public void setUld_id(Long uld_id) {
		this.uld_id = uld_id;
	}

	public Long getFlt_id() {
		return flt_id;
	}

	public void setFlt_id(Long flt_id) {
		this.flt_id = flt_id;
	}

	public String getStat_id() {
		return stat_id;
	}

	public void setStat_id(String stat_id) {
		this.stat_id = stat_id;
	}
}
