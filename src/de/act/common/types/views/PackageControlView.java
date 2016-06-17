/**
 * 
 */
package de.act.common.types.views;

import java.io.Serializable;

import de.act.common.types.formulars.FormularCOOItem;

/**
 * @author Henry
 *
 */
public class PackageControlView implements Serializable{

	private static final long serialVersionUID = -4690305059705693742L;
	private String ca_3dg;
	private Integer awb_stock;
	private Integer awb_no;
	private String f_id;
	private Integer att_id;
	private Integer bkg_item_id;
	private Integer pkg_id;
	private Integer row_no;
	private Integer pkg_pcs;
	private Integer pkg_wgt;
	private Integer l;
	private Integer w;
	private Integer h;
	private String scc_3lc;
	private Integer com_id;
	private String com_name;
	private Integer ann_id;
	private String ann_name;
	private String req_to;
	
	private Long coo_item_id;
	private FormularCOOItem cooItem;
	
	/*Rony - 20140502*/
	private Integer is_total;
	private Double vol;
	
	
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

	public String getF_id() {
		return f_id;
	}
	
	public void setF_id(String f_id) {
		this.f_id = f_id;
	}
	
	public Integer getAtt_id() {
		return att_id;
	}

	public void setAtt_id(Integer att_id) {
		this.att_id = att_id;
	}

	public Integer getBkg_item_id() {
		return bkg_item_id;
	}
	
	public void setBkg_item_id(Integer bkg_item_id) {
		this.bkg_item_id = bkg_item_id;
	}
	
	public Integer getPkg_id() {
		return pkg_id;
	}
	
	public void setPkg_id(Integer pkg_id) {
		this.pkg_id = pkg_id;
	}
	
	public Integer getRow_no() {
		return row_no;
	}
	
	public void setRow_no(Integer row_no) {
		this.row_no = row_no;
	}
	
	public Integer getPkg_pcs() {
		return pkg_pcs;
	}
	
	public void setPkg_pcs(Integer pkg_pcs) {
		this.pkg_pcs = pkg_pcs;
	}
	
	public Integer getPkg_wgt() {
		return pkg_wgt;
	}

	public void setPkg_wgt(Integer pkg_wgt) {
		this.pkg_wgt = pkg_wgt;
	}

	public Integer getL() {
		return l;
	}
	
	public void setL(Integer l) {
		this.l = l;
	}
	
	public Integer getW() {
		return w;
	}
	
	public void setW(Integer w) {
		this.w = w;
	}
	
	public Integer getH() {
		return h;
	}
	
	public void setH(Integer h) {
		this.h = h;
	}
	
	public String getScc_3lc() {
		return scc_3lc;
	}
	
	public void setScc_3lc(String scc_3lc) {
		this.scc_3lc = scc_3lc;
	}
	
	public Integer getCom_id() {
		return com_id;
	}
	
	public void setCom_id(Integer com_id) {
		this.com_id = com_id;
	}
	
	public String getCom_name() {
		return com_name;
	}
	
	public void setCom_name(String com_name) {
		this.com_name = com_name;
	}
	
	public Integer getAnn_id() {
		return ann_id;
	}
	
	public void setAnn_id(Integer ann_id) {
		this.ann_id = ann_id;
	}
	
	public String getAnn_name() {
		return ann_name;
	}
	
	public void setAnn_name(String ann_name) {
		this.ann_name = ann_name;
	}
	
	public String getReq_to() {
		return req_to;
	}
	
	public void setReq_to(String req_to) {
		this.req_to = req_to;
	}

	public Long getCoo_item_id()
	{
		return coo_item_id;
	}

	public void setCoo_item_id(Long coo_item_id)
	{
		this.coo_item_id = coo_item_id;
	}

	public FormularCOOItem getCooItem()
	{
		return cooItem;
	}

	public void setCooItem(FormularCOOItem cooItem)
	{
		this.cooItem = cooItem;
	}

	public Integer getIs_total() {
		return is_total;
	}
	
	public void setIs_total(Integer is_total) {
		this.is_total = is_total;
	}
	
	public Double getVol() {
		return vol;
	}
	
	public void setVol(Double vol){
		this.vol = vol;
	}
	
	
}
