package de.act.common.types;
import java.util.Date;

import de.act.common.types.localobjects.Storage;
import de.act.common.types.nonstaticobjects.RFAwbNo;
import de.act.common.types.nonstaticobjects.ULDObject;
import de.act.common.types.staticobjects.ICommodityTree;
import de.act.common.types.staticobjects.RSAdd;
import de.act.common.types.staticobjects.RSAp;
import de.act.common.types.staticobjects.RSFlt;
import de.act.common.types.staticobjects.RSScc;
import de.act.common.types.staticobjects.RSState;
import de.act.common.types.staticobjects.RSUldType;

/**
 * @author Martin Sachs
 * @since 1.0 - 13.07.2006
 */
public abstract class AbstractManifestView implements java.io.Serializable {

	private static final long serialVersionUID = 387756356649444460L;
	private Long              shp_acc_item_id;
	private Long              awb_acc_item_id;
	private Long              mani_item_id;
	private Long              mani_id;
	private String            ll_awb_acc_stat_id;
	private String            bkg_status;
	private Integer           mani_row;
	private Integer           mani_sort;
	private Long              att_id;
	private Long              shp_acc_id;
	private Long              awb_acc_id;
	private Long              acc_item_uld_id;
	private Long              uld_id;
	private Long              bkg_item_id;
	private Date              bkg_flt_date;
	private Long              loc_id;
	private Long              acc_att_id;
	private String            ap_3lc;
	private String            ap_dest;
	private String            ap_dept;
	private String            flt_id;
	private String            bkg_flt_id;
	private Date              mani_item_corr;
	private String            f_id;
	private String            f_parent;
	private String            ca_3dg;
	private String            ffw_3lc;
	private Integer           awb_stock;
	private Integer           awb_no;
	private Integer           att_no;
	private Date              corr;
	private Integer           pcs;
	private Double            wgt;
	private Double            vol;
	private String            com_id;
	private String            scc_3lc;
	private String            acc_ap_dept;
	private String            acc_ap_3lc;
	private String            acc_ap_dest;
	private String            ha_add_id;
	private String            shp_stat_id;
	private String            shp_stat_descr;
	private String            awb_stat_id;
	private String            awb_stat_descr;
	private Integer           acc_item_row;
	private Integer           acc_item_pcs;
	private String            acc_item_com_id;
	private String            acc_item_ann_id;
	private Double            acc_item_wgt;
	private Integer           acc_item_l;
	private Integer           acc_item_w;
	private Integer           acc_item_h;
	private String            acc_item_scc_3lc;
	private String            acc_f_id;
	private Integer           acc_att_no;
	private Date              acc_att_corr;
	private Long              ll_bkg_item_id;
	private String            ll_ha_add_id;
	private Integer           ll_pcs;
	private Long              ll_uld_type;
	private Integer           ll_uld_no;
	private String            ll_advice;
	private RSUldType     uldType;
	private RSAdd             add;
	private String            add_id;
	private RFAwbNo           awbNo;
	private ICommodityTree    commodity;
	private RSScc             scc;
	private RSFlt             flight;
	private String            dest;
	private String            dept;
	private RSAp              apDest;
	private RSAp              apDept;
	private RSState           awbState;		// changeable
	private RSState           shipperState;
	private ULDObject         shpUld;		// assignable
	private ULDObject         uld;			// assignable
	private Storage           storage;
	private Double            acc_sum_wgt;
	private Integer           acc_sum_pcs;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "manifestRow: "+ this.pcs + " "+this.commodity + " "+this.uld + " "+ this.uldType ;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 07.08.2006
	 * @return Returns the acc_sum_pcs.
	 */
	public final Integer getAcc_sum_pcs() {
		return this.acc_sum_pcs;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 07.08.2006
	 * @param acc_sum_pcs
	 *             The acc_sum_pcs to set.
	 */
	public final void setAcc_sum_pcs(Integer acc_sum_pcs) {
		this.acc_sum_pcs = acc_sum_pcs;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 07.08.2006
	 * @return Returns the acc_sum_wgt.
	 */
	public final Double getAcc_sum_wgt() {
		return this.acc_sum_wgt;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 07.08.2006
	 * @param acc_sum_wgt
	 *             The acc_sum_wgt to set.
	 */
	public final void setAcc_sum_wgt(Double acc_sum_wgt) {
		this.acc_sum_wgt = acc_sum_wgt;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 07.08.2006
	 * @param mani_id2
	 * @param long1
	 * @param first
	 */
	public AbstractManifestView(Long mani_id2, Long long1, ULDObject first) {
		this.mani_id = mani_id2;
		this.mani_item_id = long1;
		this.shpUld = first;
		this.uld = first;
		this.acc_item_uld_id = this.shpUld.getUld_id();
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 07.08.2006
	 */
	public AbstractManifestView() {
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 07.08.2006
	 * @param mani_id2
	 * @param long1
	 * @param first
	 * @param ll_uld_no2
	 */
	public AbstractManifestView(Long mani_id2, Long long1, RSUldType first, Integer ll_uld_no2) {
		this.mani_id = mani_id2;
		this.mani_item_id = long1;
		this.uldType = first;
		this.ll_uld_type = Long.parseLong(first.uld_type_id.toString());
		this.ll_uld_no = ll_uld_no2;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the acc_ap_3lc.
	 */
	public final String getAcc_ap_3lc() {
		return this.acc_ap_3lc;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param acc_ap_3lc
	 *             The acc_ap_3lc to set.
	 */
	public final void setAcc_ap_3lc(String acc_ap_3lc) {
		this.acc_ap_3lc = acc_ap_3lc;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the acc_ap_dept.
	 */
	public final String getAcc_ap_dept() {
		return this.acc_ap_dept;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param acc_ap_dept
	 *             The acc_ap_dept to set.
	 */
	public final void setAcc_ap_dept(String acc_ap_dept) {
		this.acc_ap_dept = acc_ap_dept;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the acc_ap_dest.
	 */
	public final String getAcc_ap_dest() {
		return this.acc_ap_dest;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param acc_ap_dest
	 *             The acc_ap_dest to set.
	 */
	public final void setAcc_ap_dest(String acc_ap_dest) {
		this.acc_ap_dest = acc_ap_dest;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the acc_att_corr.
	 */
	public final Date getAcc_att_corr() {
		return this.acc_att_corr;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param acc_att_corr
	 *             The acc_att_corr to set.
	 */
	public final void setAcc_att_corr(Date acc_att_corr) {
		this.acc_att_corr = acc_att_corr;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the acc_att_id.
	 */
	public final Long getAcc_att_id() {
		return this.acc_att_id;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param acc_att_id
	 *             The acc_att_id to set.
	 */
	public final void setAcc_att_id(Long acc_att_id) {
		this.acc_att_id = acc_att_id;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the acc_att_no.
	 */
	public final Integer getAcc_att_no() {
		return this.acc_att_no;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param acc_att_no
	 *             The acc_att_no to set.
	 */
	public final void setAcc_att_no(Integer acc_att_no) {
		this.acc_att_no = acc_att_no;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the acc_f_id.
	 */
	public final String getAcc_f_id() {
		return this.acc_f_id;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param acc_f_id
	 *             The acc_f_id to set.
	 */
	public final void setAcc_f_id(String acc_f_id) {
		this.acc_f_id = acc_f_id;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the acc_item_ann_id.
	 */
	public final String getAcc_item_ann_id() {
		return this.acc_item_ann_id;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param acc_item_ann_id
	 *             The acc_item_ann_id to set.
	 */
	public final void setAcc_item_ann_id(String acc_item_ann_id) {
		this.acc_item_ann_id = acc_item_ann_id;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the acc_item_com_id.
	 */
	public final String getAcc_item_com_id() {
		return this.acc_item_com_id;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param acc_item_com_id
	 *             The acc_item_com_id to set.
	 */
	public final void setAcc_item_com_id(String acc_item_com_id) {
		this.acc_item_com_id = acc_item_com_id;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the acc_item_h.
	 */
	public final Integer getAcc_item_h() {
		return this.acc_item_h;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param acc_item_h
	 *             The acc_item_h to set.
	 */
	public final void setAcc_item_h(Integer acc_item_h) {
		this.acc_item_h = acc_item_h;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the acc_item_id.
	 */
	public final Long getShp_acc_item_id() {
		return this.shp_acc_item_id;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param acc_item_id
	 *             The acc_item_id to set.
	 */
	public final void setShp_acc_item_id(Long acc_item_id) {
		this.shp_acc_item_id = acc_item_id;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the acc_item_l.
	 */
	public final Integer getAcc_item_l() {
		return this.acc_item_l;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param acc_item_l
	 *             The acc_item_l to set.
	 */
	public final void setAcc_item_l(Integer acc_item_l) {
		this.acc_item_l = acc_item_l;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the acc_item_pcs.
	 */
	public final Integer getAcc_item_pcs() {
		return this.acc_item_pcs;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param acc_item_pcs
	 *             The acc_item_pcs to set.
	 */
	public final void setAcc_item_pcs(Integer acc_item_pcs) {
		this.acc_item_pcs = acc_item_pcs;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the acc_item_row.
	 */
	public final Integer getAcc_item_row() {
		return this.acc_item_row;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param acc_item_row
	 *             The acc_item_row to set.
	 */
	public final void setAcc_item_row(Integer acc_item_row) {
		this.acc_item_row = acc_item_row;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the acc_item_scc_3lc.
	 */
	public final String getAcc_item_scc_3lc() {
		return this.acc_item_scc_3lc;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param acc_item_scc_3lc
	 *             The acc_item_scc_3lc to set.
	 */
	public final void setAcc_item_scc_3lc(String acc_item_scc_3lc) {
		this.acc_item_scc_3lc = acc_item_scc_3lc;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the acc_item_uld_id.
	 */
	public final Long getAcc_item_uld_id() {
		return this.acc_item_uld_id;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param acc_item_uld_id
	 *             The acc_item_uld_id to set.
	 */
	public final void setAcc_item_uld_id(Long acc_item_uld_id) {
		this.acc_item_uld_id = acc_item_uld_id;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the acc_item_w.
	 */
	public final Integer getAcc_item_w() {
		return this.acc_item_w;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param acc_item_w
	 *             The acc_item_w to set.
	 */
	public final void setAcc_item_w(Integer acc_item_w) {
		this.acc_item_w = acc_item_w;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the acc_item_wgt.
	 */
	public final Double getAcc_item_wgt() {
		return this.acc_item_wgt;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param acc_item_wgt
	 *             The acc_item_wgt to set.
	 */
	public final void setAcc_item_wgt(Double acc_item_wgt) {
		this.acc_item_wgt = acc_item_wgt;
	}


	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the add.
	 */
	public final RSAdd getAdd() {
		return this.add;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param add
	 *             The add to set.
	 */
	public final void setAdd(RSAdd add) {
		this.add = add;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the add_id.
	 */
	public final String getAdd_id() {
		return this.add_id;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param add_id
	 *             The add_id to set.
	 */
	public final void setAdd_id(String add_id) {
		this.add_id = add_id;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the ap_3lc.
	 */
	public final String getAp_3lc() {
		return this.ap_3lc;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param ap_3lc
	 *             The ap_3lc to set.
	 */
	public final void setAp_3lc(String ap_3lc) {
		this.ap_3lc = ap_3lc;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the ap_dest.
	 */
	public final String getAp_dest() {
		return this.ap_dest;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param ap_dest
	 *             The ap_dest to set.
	 */
	public final void setAp_dest(String ap_dest) {
		this.ap_dest = ap_dest;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the apDept.
	 */
	public final RSAp getApDept() {
		return this.apDept;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param apDept
	 *             The apDept to set.
	 */
	public final void setApDept(RSAp apDept) {
		this.apDept = apDept;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the apDest.
	 */
	public final RSAp getApDest() {
		return this.apDest;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param apDest
	 *             The apDest to set.
	 */
	public final void setApDest(RSAp apDest) {
		this.apDest = apDest;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the att_id.
	 */
	public final Long getAtt_id() {
		return this.att_id;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param att_id
	 *             The att_id to set.
	 */
	public final void setAtt_id(Long att_id) {
		this.att_id = att_id;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the att_no.
	 */
	public final Integer getAtt_no() {
		return this.att_no;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param att_no
	 *             The att_no to set.
	 */
	public final void setAtt_no(Integer att_no) {
		this.att_no = att_no;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the awb_acc_id.
	 */
	public final Long getAwb_acc_id() {
		return this.awb_acc_id;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param awb_acc_id
	 *             The awb_acc_id to set.
	 */
	public final void setAwb_acc_id(Long awb_acc_id) {
		this.awb_acc_id = awb_acc_id;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the awb_no.
	 */
	public final Integer getAwb_no() {
		return this.awb_no;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param awb_no
	 *             The awb_no to set.
	 */
	public final void setAwb_no(Integer awb_no) {
		this.awb_no = awb_no;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the awb_stat_descr.
	 */
	public final String getAwb_stat_descr() {
		return this.awb_stat_descr;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param awb_stat_descr
	 *             The awb_stat_descr to set.
	 */
	public final void setAwb_stat_descr(String awb_stat_descr) {
		this.awb_stat_descr = awb_stat_descr;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the awb_stat_id.
	 */
	public final String getAwb_stat_id() {
		return this.awb_stat_id;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param awb_stat_id
	 *             The awb_stat_id to set.
	 */
	public final void setAwb_stat_id(String awb_stat_id) {
		this.awb_stat_id = awb_stat_id;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the awb_stock.
	 */
	public final Integer getAwb_stock() {
		return this.awb_stock;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param awb_stock
	 *             The awb_stock to set.
	 */
	public final void setAwb_stock(Integer awb_stock) {
		this.awb_stock = awb_stock;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the awbNo.
	 */
	public final RFAwbNo getAwbNo() {
		return this.awbNo;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param awbNo
	 *             The awbNo to set.
	 */
	public final void setAwbNo(RFAwbNo awbNo) {
		this.awbNo = awbNo;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the awbState.
	 */
	public final RSState getAwbState() {
		return this.awbState;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param awbState
	 *             The awbState to set.
	 */
	public final void setAwbState(RSState awbState) {
		this.awbState = awbState;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the bkg_item_id.
	 */
	public final Long getBkg_item_id() {
		return this.bkg_item_id;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param bkg_item_id
	 *             The bkg_item_id to set.
	 */
	public final void setBkg_item_id(Long bkg_item_id) {
		this.bkg_item_id = bkg_item_id;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param bkg_pcs
	 *             The bkg_pcs to set.
	 */
	public final void setPcs(Integer bkg_pcs) {
		this.pcs = bkg_pcs;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the ca_3dg.
	 */
	public final String getCa_3dg() {
		return this.ca_3dg;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param ca_3dg
	 *             The ca_3dg to set.
	 */
	public final void setCa_3dg(String ca_3dg) {
		this.ca_3dg = ca_3dg;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the com_id.
	 */
	public final String getCom_id() {
		return this.com_id;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param com_id
	 *             The com_id to set.
	 */
	public final void setCom_id(String com_id) {
		this.com_id = com_id;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the commodity.
	 */
	public final ICommodityTree getCommodity() {
		return this.commodity;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param commodity
	 *             The commodity to set.
	 */
	public final void setCommodity(ICommodityTree commodity) {
		this.commodity = commodity;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the corr.
	 */
	public final Date getCorr() {
		return this.corr;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param corr
	 *             The corr to set.
	 */
	public final void setCorr(Date corr) {
		this.corr = corr;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the dept.
	 */
	public final String getDept() {
		return this.dept;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param dept
	 *             The dept to set.
	 */
	public final void setDept(String dept) {
		this.dept = dept;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the dest.
	 */
	public final String getDest() {
		return this.dest;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param dest
	 *             The dest to set.
	 */
	public final void setDest(String dest) {
		this.dest = dest;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the emptyUld.
	 */
	public final ULDObject getUld() {
		return this.uld;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param emptyUld
	 *             The emptyUld to set.
	 */
	public final void setUld(ULDObject emptyUld) {
		this.uld = emptyUld;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the f_id.
	 */
	public final String getF_id() {
		return this.f_id;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param f_id
	 *             The f_id to set.
	 */
	public final void setF_id(String f_id) {
		this.f_id = f_id;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the f_parent.
	 */
	public final String getF_parent() {
		return this.f_parent;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param f_parent
	 *             The f_parent to set.
	 */
	public final void setF_parent(String f_parent) {
		this.f_parent = f_parent;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the ffw_3lc.
	 */
	public final String getFfw_3lc() {
		return this.ffw_3lc;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param ffw_3lc
	 *             The ffw_3lc to set.
	 */
	public final void setFfw_3lc(String ffw_3lc) {
		this.ffw_3lc = ffw_3lc;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the flight.
	 */
	public final RSFlt getFlight() {
		return this.flight;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param flight
	 *             The flight to set.
	 */
	public final void setFlight(RSFlt flight) {
		this.flight = flight;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the flt_id.
	 */
	public final String getFlt_id() {
		return this.flt_id;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param flt_id
	 *             The flt_id to set.
	 */
	public final void setFlt_id(String flt_id) {
		this.flt_id = flt_id;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the ha_add_id.
	 */
	public final String getHa_add_id() {
		return this.ha_add_id;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param ha_add_id
	 *             The ha_add_id to set.
	 */
	public final void setHa_add_id(String ha_add_id) {
		this.ha_add_id = ha_add_id;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the ll_advice.
	 */
	public final String getLl_advice() {
		return this.ll_advice;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param ll_advice
	 *             The ll_advice to set.
	 */
	public final void setLl_advice(String ll_advice) {
		this.ll_advice = ll_advice;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the ll_bkg_item_id.
	 */
	public final Long getLl_bkg_item_id() {
		return this.ll_bkg_item_id;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param ll_bkg_item_id
	 *             The ll_bkg_item_id to set.
	 */
	public final void setLl_bkg_item_id(Long ll_bkg_item_id) {
		this.ll_bkg_item_id = ll_bkg_item_id;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the ll_ha_add_id.
	 */
	public final String getLl_ha_add_id() {
		return this.ll_ha_add_id;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param ll_ha_add_id
	 *             The ll_ha_add_id to set.
	 */
	public final void setLl_ha_add_id(String ll_ha_add_id) {
		this.ll_ha_add_id = ll_ha_add_id;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the ll_pcs.
	 */
	public final Integer getLl_pcs() {
		return this.ll_pcs;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param ll_pcs
	 *             The ll_pcs to set.
	 */
	public final void setLl_pcs(Integer ll_pcs) {
		this.ll_pcs = ll_pcs;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the ll_uld_no.
	 */
	public final Integer getLl_uld_no() {
		return this.ll_uld_no;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param ll_uld_no
	 *             The ll_uld_no to set.
	 */
	public final void setLl_uld_no(Integer ll_uld_no) {
		this.ll_uld_no = ll_uld_no;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the ll_uld_type.
	 */
	public final Long getLl_uld_type() {
		return this.ll_uld_type;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param ll_uld_type
	 *             The ll_uld_type to set.
	 */
	public final void setLl_uld_type(Long ll_uld_type) {
		this.ll_uld_type = ll_uld_type;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the loc_id.
	 */
	public final Long getLoc_id() {
		return this.loc_id;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param loc_id
	 *             The loc_id to set.
	 */
	public final void setLoc_id(Long loc_id) {
		this.loc_id = loc_id;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the mani_id.
	 */
	public final Long getMani_id() {
		return this.mani_id;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param mani_id
	 *             The mani_id to set.
	 */
	public final void setMani_id(Long mani_id) {
		this.mani_id = mani_id;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the mani_item_corr.
	 */
	public final Date getMani_item_corr() {
		return this.mani_item_corr;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param mani_item_corr
	 *             The mani_item_corr to set.
	 */
	public final void setMani_item_corr(Date mani_item_corr) {
		this.mani_item_corr = mani_item_corr;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the mani_item_id.
	 */
	public final Long getMani_item_id() {
		return this.mani_item_id;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param mani_item_id
	 *             The mani_item_id to set.
	 */
	public final void setMani_item_id(Long mani_item_id) {
		this.mani_item_id = mani_item_id;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the mani_row.
	 */
	public final Integer getMani_row() {
		return this.mani_row;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param mani_row
	 *             The mani_row to set.
	 */
	public final void setMani_row(Integer mani_row) {
		this.mani_row = mani_row;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the scc.
	 */
	public final RSScc getScc() {
		return this.scc;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param scc
	 *             The scc to set.
	 */
	public final void setScc(RSScc scc) {
		this.scc = scc;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the scc_3lc.
	 */
	public final String getScc_3lc() {
		return this.scc_3lc;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param scc_3lc
	 *             The scc_3lc to set.
	 */
	public final void setScc_3lc(String scc_3lc) {
		this.scc_3lc = scc_3lc;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the shipperState.
	 */
	public final RSState getShipperState() {
		return this.shipperState;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param shipperState
	 *             The shipperState to set.
	 */
	public final void setShipperState(RSState shipperState) {
		this.shipperState = shipperState;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the shp_acc_id.
	 */
	public final Long getShp_acc_id() {
		return this.shp_acc_id;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param shp_acc_id
	 *             The shp_acc_id to set.
	 */
	public final void setShp_acc_id(Long shp_acc_id) {
		this.shp_acc_id = shp_acc_id;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the shp_stat_descr.
	 */
	public final String getShp_stat_descr() {
		return this.shp_stat_descr;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param shp_stat_descr
	 *             The shp_stat_descr to set.
	 */
	public final void setShp_stat_descr(String shp_stat_descr) {
		this.shp_stat_descr = shp_stat_descr;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the shp_stat_id.
	 */
	public final String getShp_stat_id() {
		return this.shp_stat_id;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param shp_stat_id
	 *             The shp_stat_id to set.
	 */
	public final void setShp_stat_id(String shp_stat_id) {
		this.shp_stat_id = shp_stat_id;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the storage.
	 */
	public final Storage getStorage() {
		return this.storage;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param storage
	 *             The storage to set.
	 */
	public final void setStorage(Storage storage) {
		this.storage = storage;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the uld.
	 */
	public final ULDObject getShpUld() {
		return this.shpUld;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param uld
	 *             The uld to set.
	 */
	public final void setShpUld(ULDObject uld) {
		this.shpUld = uld;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the uldType.
	 */
	public final RSUldType getUldType() {
		return this.uldType;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param uldType
	 *             The uldType to set.
	 */
	public final void setUldType(RSUldType uldType) {
		this.uldType = uldType;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the vol.
	 */
	public final Double getVol() {
		return this.vol;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param vol
	 *             The vol to set.
	 */
	public final void setVol(Double vol) {
		this.vol = vol;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the wgt.
	 */
	public final Double getWgt() {
		return this.wgt;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param wgt
	 *             The wgt to set.
	 */
	public final void setWgt(Double wgt) {
		this.wgt = wgt;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.shp_acc_item_id == null) ? 0 : this.shp_acc_item_id.hashCode());
		result = PRIME * result + ((this.att_id == null) ? 0 : this.att_id.hashCode());
		result = PRIME * result + ((this.awb_acc_id == null) ? 0 : this.awb_acc_id.hashCode());
		result = PRIME * result + ((this.bkg_item_id == null) ? 0 : this.bkg_item_id.hashCode());
		result = PRIME * result + ((this.f_id == null) ? 0 : this.f_id.hashCode());
		result = PRIME * result + ((this.ll_bkg_item_id == null) ? 0 : this.ll_bkg_item_id.hashCode());
		result = PRIME * result + ((this.mani_item_id == null) ? 0 : this.mani_item_id.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if (this.getClass() != obj.getClass()){
			return false;
		}
		final AbstractManifestView other = (AbstractManifestView) obj;
		if (this.shp_acc_item_id == null){
			if (other.shp_acc_item_id != null){
				return false;
			}
		}
		else if (!this.shp_acc_item_id.equals(other.shp_acc_item_id)){
			return false;
		}
		if (this.att_id == null){
			if (other.att_id != null){
				return false;
			}
		}
		else if (!this.att_id.equals(other.att_id)){
			return false;
		}
		if (this.awb_acc_id == null){
			if (other.awb_acc_id != null){
				return false;
			}
		}
		else if (!this.awb_acc_id.equals(other.awb_acc_id)){
			return false;
		}
		if (this.bkg_item_id == null){
			if (other.bkg_item_id != null){
				return false;
			}
		}
		else if (!this.bkg_item_id.equals(other.bkg_item_id)){
			return false;
		}
		if (this.f_id == null){
			if (other.f_id != null){
				return false;
			}
		}
		else if (!this.f_id.equals(other.f_id)){
			return false;
		}
		if (this.ll_bkg_item_id == null){
			if (other.ll_bkg_item_id != null){
				return false;
			}
		}
		else if (!this.ll_bkg_item_id.equals(other.ll_bkg_item_id)){
			return false;
		}
		if (this.mani_item_id == null){
			if (other.mani_item_id != null){
				return false;
			}
		}
		else if (!this.mani_item_id.equals(other.mani_item_id)){
			return false;
		}
		return true;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return
	 * @return int
	 */
	public Integer getPcs() {
		return this.pcs;
	}

	public Integer getPcsIfExist() {
		if (this.getAcc_item_pcs() != null){
			return this.getAcc_item_pcs();
		}
		return this.pcs;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the bkg_flt_date.
	 */
	public final Date getBkg_flt_date() {
		return this.bkg_flt_date;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param bkg_flt_date
	 *             The bkg_flt_date to set.
	 */
	public final void setBkg_flt_date(Date bkg_flt_date) {
		this.bkg_flt_date = bkg_flt_date;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the ap_dept.
	 */
	public final String getAp_dept() {
		return this.ap_dept;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param ap_dept
	 *             The ap_dept to set.
	 */
	public final void setAp_dept(String ap_dept) {
		this.ap_dept = ap_dept;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the bkg_flt_id.
	 */
	public final String getBkg_flt_id() {
		return this.bkg_flt_id;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param bkg_flt_id
	 *             The bkg_flt_id to set.
	 */
	public final void setBkg_flt_id(String bkg_flt_id) {
		this.bkg_flt_id = bkg_flt_id;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the bkg_status.
	 */
	public final String getBkg_status() {
		return this.bkg_status;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param bkg_status
	 *             The bkg_status to set.
	 */
	public final void setBkg_status(String bkg_status) {
		this.bkg_status = bkg_status;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @return Returns the uld_id.
	 */
	public final Long getUld_id() {
		return this.uld_id;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 04.08.2006
	 * @param uld_id
	 *             The uld_id to set.
	 */
	public final void setUld_id(Long uld_id) {
		this.uld_id = uld_id;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 08.08.2006
	 * @return Returns the awb_acc_item_id.
	 */
	public synchronized final Long getAwb_acc_item_id() {
		return this.awb_acc_item_id;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 08.08.2006
	 * @param awb_acc_item_id
	 *             The awb_acc_item_id to set.
	 */
	public synchronized final void setAwb_acc_item_id(Long awb_acc_item_id) {
		this.awb_acc_item_id = awb_acc_item_id;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 09.08.2006
	 * @return Returns the mani_sort.
	 */
	public final Integer getMani_sort() {
		return this.mani_sort;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 09.08.2006
	 * @param mani_sort
	 *             The mani_sort to set.
	 */
	public final void setMani_sort(Integer mani_sort) {
		this.mani_sort = mani_sort;
	}

	/**
	 * @autor Martin Sachs
	 * @since 1.0 - 11.08.2006
	 * @return Returns the ll_awb_acc_stat_id.
	 */
	public synchronized final String getLl_awb_acc_stat_id() {
		return this.ll_awb_acc_stat_id;
	}

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 11.08.2006
	 * @param ll_awb_acc_stat_id
	 *             The ll_awb_acc_stat_id to set.
	 */
	public synchronized final void setLl_awb_acc_stat_id(String ll_awb_acc_stat_id) {
		this.ll_awb_acc_stat_id = ll_awb_acc_stat_id;
	}
}
