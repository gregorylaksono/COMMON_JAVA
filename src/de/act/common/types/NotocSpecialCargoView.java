package de.act.common.types;
import de.act.common.types.nonstaticobjects.RFAwbNo;
import de.act.common.types.nonstaticobjects.ULDObject;
import de.act.common.types.staticobjects.CCommodityTree;
import de.act.common.types.staticobjects.RSAdd;
import de.act.common.types.staticobjects.RSScc;

/**
 * @author Martin Sachs
 * @since 1.0 - 19.12.2006
 */
public class NotocSpecialCargoView implements java.io.Serializable{

	private static final long serialVersionUID = -9082421763693789603L;
	private Long			mani_item_id;
	private Long			mani_id;
	private Long			bkg_item_id;
	private Long			pkg_id;
	private String			scc_3lc;
	private String			com_id; //HENRY it should be Long
	private String			ann_id; //HENRY it should be Long
	private String			uld_id;
	private String			marks;
	private String			pcs;
	private String			corr;
	private Long			dgr_item_id;
	private Long			dgr_id;
	private String			dgr_pkg_type;
	private String			dgr_pkg_inst;
	private String			dgr_qty_unit;
	private Long			avi_item_id;
	private Long			avi_id;
	private String			avi_pks_no;
	private String			qty_anm;
	private Long			att_id;
	private String			att_type;
	private Integer			att_no;
	private String			add_id;
	private String			att_corr;
	private String			f_id;
	private String			ca_3dg;
	private String			awb_stock;
	private String			awb_no;
	private RSAdd			add;
	private RFAwbNo			awbNo;
	private CCommodityTree 	commodity;
	private RSScc			scc;
	private ULDObject		uld;
	private String 			ap_to;
	private Integer 		dgr_radio;
	private Integer 		dgr_ca_only;
	private String 			dgr_un_no;
	private String 			dgr_prop_name;
	private String 			dgr_class;
	private String 			dgr_sub_risk;
	private String 			dgr_lbl;
	private String 			dgr_pkg_grp;
	private String 			avi_scf_name;
	private String 			avi_container;
	private String 			avi_cites;

	public RSAdd getAdd() {
		return add;
	}

	public void setAdd(RSAdd add) {
		this.add = add;
	}

	public String getAdd_id() {
		return add_id;
	}

	public void setAdd_id(String add_id) {
		this.add_id = add_id;
	}

	public String getAnn_id() {
		return ann_id;
	}

	public void setAnn_id(String ann_id) {
		this.ann_id = ann_id;
	}

	public String getAtt_corr() {
		return att_corr;
	}

	public void setAtt_corr(String att_corr) {
		this.att_corr = att_corr;
	}

	public Long getAtt_id() {
		return att_id;
	}

	public void setAtt_id(Long att_id) {
		this.att_id = att_id;
	}

	public Integer getAtt_no() {
		return att_no;
	}

	public void setAtt_no(Integer att_no) {
		this.att_no = att_no;
	}

	public String getAtt_type() {
		return att_type;
	}

	public void setAtt_type(String att_type) {
		this.att_type = att_type;
	}

	public Long getAvi_id() {
		return avi_id;
	}

	public void setAvi_id(Long avi_id) {
		this.avi_id = avi_id;
	}

	public Long getAvi_item_id() {
		return avi_item_id;
	}

	public void setAvi_item_id(Long avi_item_id) {
		this.avi_item_id = avi_item_id;
	}

	public String getAvi_pks_no() {
		return avi_pks_no;
	}

	public void setAvi_pks_no(String avi_pks_no) {
		this.avi_pks_no = avi_pks_no;
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

	public RFAwbNo getAwbNo() {
		return awbNo;
	}

	public void setAwbNo(RFAwbNo awbNo) {
		this.awbNo = awbNo;
	}

	public Long getBkg_item_id() {
		return bkg_item_id;
	}

	public void setBkg_item_id(Long bkg_item_id) {
		this.bkg_item_id = bkg_item_id;
	}

	public String getCa_3dg() {
		return ca_3dg;
	}

	public void setCa_3dg(String ca_3dg) {
		this.ca_3dg = ca_3dg;
	}

	public String getCom_id() {
		return com_id;
	}

	public void setCom_id(String com_id) {
		this.com_id = com_id;
	}

	public CCommodityTree getCommodity() {
		return commodity;
	}

	public void setCommodity(CCommodityTree commodity) {
		this.commodity = commodity;
	}

	public String getCorr() {
		return corr;
	}

	public void setCorr(String corr) {
		this.corr = corr;
	}

	public Long getDgr_id() {
		return dgr_id;
	}

	public void setDgr_id(Long dgr_id) {
		this.dgr_id = dgr_id;
	}

	public Long getDgr_item_id() {
		return dgr_item_id;
	}

	public void setDgr_item_id(Long dgr_item_id) {
		this.dgr_item_id = dgr_item_id;
	}

	public String getDgr_pkg_inst() {
		return dgr_pkg_inst;
	}

	public void setDgr_pkg_inst(String dgr_pkg_inst) {
		this.dgr_pkg_inst = dgr_pkg_inst;
	}

	public String getDgr_pkg_type() {
		return dgr_pkg_type;
	}

	public void setDgr_pkg_type(String dgr_pkg_type) {
		this.dgr_pkg_type = dgr_pkg_type;
	}

	public String getDgr_qty_unit() {
		return dgr_qty_unit;
	}

	public void setDgr_qty_unit(String dgr_qty_unit) {
		this.dgr_qty_unit = dgr_qty_unit;
	}

	public String getF_id() {
		return f_id;
	}

	public void setF_id(String f_id) {
		this.f_id = f_id;
	}

	public Long getMani_id() {
		return mani_id;
	}

	public void setMani_id(Long mani_id) {
		this.mani_id = mani_id;
	}

	public Long getMani_item_id() {
		return mani_item_id;
	}

	public void setMani_item_id(Long mani_item_id) {
		this.mani_item_id = mani_item_id;
	}

	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}
	
	public String getPcs() {
		return pcs;
	}

	public void setPcs(String pcs) {
		this.pcs = pcs;
	}

	public Long getPkg_id() {
		return pkg_id;
	}

	public void setPkg_id(Long pkg_id) {
		this.pkg_id = pkg_id;
	}

	public String getQty_anm() {
		return qty_anm;
	}

	public void setQty_anm(String qty_anm) {
		this.qty_anm = qty_anm;
	}

	public RSScc getScc() {
		return scc;
	}

	public void setScc(RSScc scc) {
		this.scc = scc;
	}

	public String getScc_3lc() {
		return scc_3lc;
	}

	public void setScc_3lc(String scc_3lc) {
		this.scc_3lc = scc_3lc;
	}

	public ULDObject getUld() {
		return uld;
	}

	public void setUld(ULDObject uld) {
		this.uld = uld;
	}

	public String getUld_id() {
		return uld_id;
	}

	public void setUld_id(String uld_id) {
		this.uld_id = uld_id;
	}

	public String getAp_to() {
		return ap_to;
	}

	public void setAp_to(String ap_to) {
		this.ap_to = ap_to;
	}

	public String getAvi_cites() {
		return avi_cites;
	}

	public void setAvi_cites(String avi_cites) {
		this.avi_cites = avi_cites;
	}

	public String getAvi_container() {
		return avi_container;
	}

	public void setAvi_container(String avi_container) {
		this.avi_container = avi_container;
	}

	public String getAvi_scf_name() {
		return avi_scf_name;
	}

	public void setAvi_scf_name(String avi_scf_name) {
		this.avi_scf_name = avi_scf_name;
	}

	public String getDgr_class() {
		return dgr_class;
	}

	public void setDgr_class(String dgr_class) {
		this.dgr_class = dgr_class;
	}

	public String getDgr_lbl() {
		return dgr_lbl;
	}

	public void setDgr_lbl(String dgr_lbl) {
		this.dgr_lbl = dgr_lbl;
	}

	public String getDgr_pkg_grp() {
		return dgr_pkg_grp;
	}

	public void setDgr_pkg_grp(String dgr_pkg_grp) {
		this.dgr_pkg_grp = dgr_pkg_grp;
	}

	public String getDgr_prop_name() {
		return dgr_prop_name;
	}

	public void setDgr_prop_name(String dgr_prop_name) {
		this.dgr_prop_name = dgr_prop_name;
	}

	public Integer getDgr_ca_only() {
		return dgr_ca_only;
	}

	public void setDgr_ca_only(Integer dgr_ca_only) {
		this.dgr_ca_only = dgr_ca_only;
	}

	public Integer getDgr_radio() {
		return dgr_radio;
	}

	public void setDgr_radio(Integer dgr_radio) {
		this.dgr_radio = dgr_radio;
	}

	public String getDgr_sub_risk() {
		return dgr_sub_risk;
	}

	public void setDgr_sub_risk(String dgr_sub_risk) {
		this.dgr_sub_risk = dgr_sub_risk;
	}

	public String getDgr_un_no() {
		return dgr_un_no;
	}

	public void setDgr_un_no(String dgr_un_no) {
		this.dgr_un_no = dgr_un_no;
	}
}