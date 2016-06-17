package de.act.common.types.staticobjects;

import java.io.Serializable;

/**
 * @author Rofi
 *
 */
public class BookingItemParentWrapper implements Serializable{
	
	private String f_id;
	private Integer add_id;
	private String ca_3dg;
	private Integer awb_stock;
	private Integer awb_no;
	private String req_ca_id;
	private String non_standard;
	private Long bkg_item_id;
	private Integer total_pcs;
	private Double total_wgt;
	private Double total_vol;
	private Long parent_com;
	private String parent_com_name;
	private Long parent_ann;
	private String parent_ann_name;
	private String parent_scc_3lc;
	private String parent_scc_name;
	private String req_from;
	private String req_to;
	private Long pkg_id;
	private Integer pcs;
	private Long com_id;
	private String awb_name;
	private Long ann_id;
	private String ann_name;
	private String scc_3lc;
	private String scc_name;
	private Double wgt;
	private Double vol;
	private Double l;
	private Double w;
	private Double h;
	private Integer shp_add_id;
	private String shp_ap_3lc;
	private String shp_add_name;
	private Integer con_add_id;
	private String con_ap_3lc;
	private String con_add_name;
	private Integer ffw_add_id;
	private String ffw_ap_3lc;
	private String ffw_add_name;
	private Long mani_item_id;
	private Long mani_id;
	private Integer istotal;
	private Boolean discrCom;
	private Boolean discrPcs;
	private Boolean discrWeight;
	private Boolean discrLength;
	private Boolean discrWidth;
	private Boolean discrHeight;
	private Boolean discrVol;
	private String mark;
	private Integer pkgs_col;
	private Integer pkgs_mat;
	private Integer pkgs_shp;
	private String co_orig;
	private String coo_rem;
	private Integer preadviseStatus;
	private String customCode;
	private String mrnNo;
	private String ann_dsp;
	
	private Double itemValue;
	
	public String getAnn_dsp() {
		return ann_dsp;
	}
	public void setAnn_dsp(String ann_dsp) {
		this.ann_dsp = ann_dsp;
	}
	private String type;
	
	public String getF_id() {
		return f_id;
	}
	public void setF_id(String f_id) {
		this.f_id = f_id;
	}
	public Integer getAdd_id() {
		return add_id;
	}
	public void setAdd_id(Integer add_id) {
		this.add_id = add_id;
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
	public String getReq_ca_id() {
		return req_ca_id;
	}
	public void setReq_ca_id(String req_ca_id) {
		this.req_ca_id = req_ca_id;
	}
	public String getNon_standard() {
		return non_standard;
	}
	public void setNon_standard(String non_standard) {
		this.non_standard = non_standard;
	}
	public Long getBkg_item_id() {
		return bkg_item_id;
	}
	public void setBkg_item_id(Long bkg_item_id) {
		this.bkg_item_id = bkg_item_id;
	}
	public Integer getTotal_pcs() {
		return total_pcs;
	}
	public void setTotal_pcs(Integer total_pcs) {
		this.total_pcs = total_pcs;
	}
	public Double getTotal_wgt() {
		return total_wgt;
	}
	public void setTotal_wgt(Double total_wgt) {
		this.total_wgt = total_wgt;
	}
	public Double getTotal_vol() {
		return total_vol;
	}
	public void setTotal_vol(Double total_vol) {
		this.total_vol = total_vol;
	}
	public Long getParent_com() {
		return parent_com;
	}
	public void setParent_com(Long parent_com) {
		this.parent_com = parent_com;
	}
	public String getParent_com_name() {
		return parent_com_name;
	}
	public void setParent_com_name(String parent_com_name) {
		this.parent_com_name = parent_com_name;
	}
	public Long getParent_ann() {
		return parent_ann;
	}
	public void setParent_ann(Long parent_ann) {
		this.parent_ann = parent_ann;
	}
	public String getParent_ann_name() {
		return parent_ann_name;
	}
	public void setParent_ann_name(String parent_ann_name) {
		this.parent_ann_name = parent_ann_name;
	}
	public String getParent_scc_3lc() {
		return parent_scc_3lc;
	}
	public void setParent_scc_3lc(String parent_scc_3lc) {
		this.parent_scc_3lc = parent_scc_3lc;
	}
	public String getParent_scc_name() {
		return parent_scc_name;
	}
	public void setParent_scc_name(String parent_scc_name) {
		this.parent_scc_name = parent_scc_name;
	}
	public String getReq_from() {
		return req_from;
	}
	public void setReq_from(String req_from) {
		this.req_from = req_from;
	}
	public String getReq_to() {
		return req_to;
	}
	public void setReq_to(String req_to) {
		this.req_to = req_to;
	}
	public Long getPkg_id() {
		return pkg_id;
	}
	public void setPkg_id(Long pkg_id) {
		this.pkg_id = pkg_id;
	}
	public Integer getPcs() {
		return pcs;
	}
	public void setPcs(Integer pcs) {
		this.pcs = pcs;
	}
	public Long getCom_id() {
		return com_id;
	}
	public void setCom_id(Long com_id) {
		this.com_id = com_id;
	}
	public String getAwb_name() {
		return awb_name;
	}
	public void setAwb_name(String awb_name) {
		this.awb_name = awb_name;
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
	public String getScc_3lc() {
		return scc_3lc;
	}
	public void setScc_3lc(String scc_3lc) {
		this.scc_3lc = scc_3lc;
	}
	public String getScc_name() {
		return scc_name;
	}
	public void setScc_name(String scc_name) {
		this.scc_name = scc_name;
	}
	public Double getWgt() {
		return wgt;
	}
	public void setWgt(Double wgt) {
		this.wgt = wgt;
	}
	public Double getVol() {
		return vol;
	}
	public void setVol(Double vol) {
		this.vol = vol;
	}
	public Double getL() {
		return l;
	}
	public void setL(Double l) {
		this.l = l;
	}
	public Double getW() {
		return w;
	}
	public void setW(Double w) {
		this.w = w;
	}
	public Double getH() {
		return h;
	}
	public void setH(Double h) {
		this.h = h;
	}
	public Integer getShp_add_id() {
		return shp_add_id;
	}
	public void setShp_add_id(Integer shp_add_id) {
		this.shp_add_id = shp_add_id;
	}
	public String getShp_ap_3lc() {
		return shp_ap_3lc;
	}
	public void setShp_ap_3lc(String shp_ap_3lc) {
		this.shp_ap_3lc = shp_ap_3lc;
	}
	public String getShp_add_name() {
		return shp_add_name;
	}
	public void setShp_add_name(String shp_add_name) {
		this.shp_add_name = shp_add_name;
	}
	public Integer getCon_add_id() {
		return con_add_id;
	}
	public void setCon_add_id(Integer con_add_id) {
		this.con_add_id = con_add_id;
	}
	public String getCon_ap_3lc() {
		return con_ap_3lc;
	}
	public void setCon_ap_3lc(String con_ap_3lc) {
		this.con_ap_3lc = con_ap_3lc;
	}
	public String getCon_add_name() {
		return con_add_name;
	}
	public void setCon_add_name(String con_add_name) {
		this.con_add_name = con_add_name;
	}
	public Integer getFfw_add_id() {
		return ffw_add_id;
	}
	public void setFfw_add_id(Integer ffw_add_id) {
		this.ffw_add_id = ffw_add_id;
	}
	public String getFfw_ap_3lc() {
		return ffw_ap_3lc;
	}
	public void setFfw_ap_3lc(String ffw_ap_3lc) {
		this.ffw_ap_3lc = ffw_ap_3lc;
	}
	public String getFfw_add_name() {
		return ffw_add_name;
	}
	public void setFfw_add_name(String ffw_add_name) {
		this.ffw_add_name = ffw_add_name;
	}

	public Integer getIstotal() {
		return istotal;
	}
	public void setIstotal(Integer istotal) {
		this.istotal = istotal;
	}
	public Integer getPreadviseStatus()
	{
		return preadviseStatus;
	}
	public void setPreadviseStatus(Integer preadviseStatus)
	{
		this.preadviseStatus = preadviseStatus;
	}
	public String getType()
	{
		return type;
	}
	public void setType(String type)
	{
		this.type = type;
	}
	public Boolean getDiscrCom() {
		return discrCom;
	}
	public void setDiscrCom(Boolean discrCom) {
		this.discrCom = discrCom;
	}
	public Boolean getDiscrPcs() {
		return discrPcs;
	}
	public void setDiscrPcs(Boolean discrepancyPcs) {
		this.discrPcs = discrepancyPcs;
	}
	public Boolean getDiscrWeight() {
		return discrWeight;
	}
	public void setDiscrWeight(Boolean discrepancyWeight) {
		this.discrWeight = discrepancyWeight;
	}
	public Boolean getDiscrLength() {
		return discrLength;
	}
	public void setDiscrLength(Boolean discrepancyLength) {
		this.discrLength = discrepancyLength;
	}
	public Boolean getDiscrWidth() {
		return discrWidth;
	}
	public void setDiscrWidth(Boolean discrepancyWidth) {
		this.discrWidth = discrepancyWidth;
	}
	public Boolean getDiscrHeight() {
		return discrHeight;
	}
	public void setDiscrHeight(Boolean discrepancyHeight) {
		this.discrHeight = discrepancyHeight;
	}
	public Boolean getDiscrVol() {
		return discrVol;
	}
	public void setDiscrVol(Boolean discrepancyVolume) {
		this.discrVol = discrepancyVolume;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	public Integer getPkgs_col() {
		return pkgs_col;
	}
	public void setPkgs_col(Integer pkgs_col) {
		this.pkgs_col = pkgs_col;
	}
	public Integer getPkgs_mat() {
		return pkgs_mat;
	}
	public void setPkgs_mat(Integer pkgs_mat) {
		this.pkgs_mat = pkgs_mat;
	}
	public Integer getPkgs_shp() {
		return pkgs_shp;
	}
	public void setPkgs_shp(Integer pkgs_shp) {
		this.pkgs_shp = pkgs_shp;
	}
	public String getCo_orig() {
		return co_orig;
	}
	public void setCo_orig(String co_orig) {
		this.co_orig = co_orig;
	}
	public String getCoo_rem() {
		return coo_rem;
	}
	public void setCoo_rem(String coo_rem) {
		this.coo_rem = coo_rem;
	}
	public String getCustomCode()
	{
		return customCode;
	}
	public void setCustomCode(String customCode)
	{
		this.customCode = customCode;
	}
	public String getMrnNo()
	{
		return mrnNo;
	}
	public void setMrnNo(String mrnNo)
	{
		this.mrnNo = mrnNo;
	}
	public Double getItemValue() {
		return itemValue;
	}
	public void setItemValue(Double itemValue) {
		this.itemValue = itemValue;
	}
	
	
}
