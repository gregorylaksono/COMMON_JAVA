/**
 * 
 */
package de.act.common.types.views;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import de.act.common.types.staticobjects.CCommodityTree;
import de.act.common.types.staticobjects.Cons;
import de.act.common.types.staticobjects.RSAnn;

public class NewExportAcceptanceViewShipment implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3372356897214821850L;
	private Long bkg_flt_id;
	private String ca_3dg;
	private Integer awb_stock;
	private Integer awb_no;
	private String non_standard;
	private String f_id;
	private String ca_id;
	private String dept;
	private String dest;
	private String req_from;
	private String req_to;
	private Date bkg_flt_date;
	private Long bkg_item_id;
	private Double total_wgt;
	private Double total_vol;
	private Integer total_pcs;
	private Long com_parent;
	private Long pkg_id;
	private Integer pcs;
	private Long com_id;
	private String com_name;
	private Long ann_id;
	private String ann_name;
	private Double wgt;
	private Double l;
	private Double w;
	private Double h;
	private Double vol;
	private String scc_3lc;
	private Integer shp_add_id;
	private Integer con_add_id;
	private Integer ffw_add_id;
	private Integer deliver_add_id;
	private Integer anotify_add_id;
	private String bkg_status;
	private Long acc_header_id;
	private Integer awb_acc_header;
	private String first_dept;
	private String final_dest;
	private Long acc_awb_item_id;
	private Integer awb_pcs;
	private Double awb_wgt;
	private Double awb_vol;
	private String ap_3lc;
	private Integer awb_acc_per_airport;
	private Long acc_shipment_item_id;
	private Integer shipment_pcs;
	private Double shipment_wgt;
	private Double shipment_vol;
	private Long shipment_com_id;
	private Long a_flt_id;
	private Timestamp a_dep;
	private Integer open_for_cargo;
	private Long bkg_id_id;
	private Long flt_id;
	private String flt_no;
	private Long mani_item_id;
	private Long ll_uld_id;
	private String uld_trans_mode;
	private Integer holder_add_id;
	private Long ll_uld_type;
	private Integer ll_uld_no;
	private Long uld_id;
	private String stat_id;
	private Integer part;
	private Long shipment_acc_discr_id;
	private Long shipment_discr_id;
	private String shipment_discr_name;
	private String shipment_discr_4lc;
	private Integer shipment_discr_condition_flag;
	private Integer shipment_discr_opposite_discr_id;
	private Long awb_acc_discr_id;
	private Long awb_discr_id;
	private String awb_discr_name;
	private String awb_discr_4lc;
	private Integer awb_discr_condition_flag;
	private Integer awb_discr_opposite_discr_id;
	private Long stor_id;
	private String stor_name;
	private Integer is_loaded;
	private Long print_id;
	private String awb_stat_id;
	private String stat_descr;
	private Long acc_awb_pkg_id;
	private Long acc_shipment_pkg_id;
	private Integer pkg_row_no;
	private String com_parent_name;
	private String mani_rem;
	private Long awb_com_id;
	private Integer shipment_pkg_pcs;
	private Long shipment_pkg_com_id;
	private Long shipment_pkg_ann_id;
	private Double shipment_pkg_wgt;
	private Double shipment_pkg_w;
	private Double shipment_pkg_l;
	private Double shipment_pkg_h;
	private String shipment_pkg_scc_3lc;
	private String shipment_pkg_pkg_id;
	private Integer awb_pkg_pcs;
	private Long awb_pkg_com_id;
	private Long awb_pkg_ann_id;
	private Double awb_pkg_wgt;
	private Double awb_pkg_w;
	private Double awb_pkg_l;
	private Double awb_pkg_h;
	private String awb_pkg_scc_3lc;
	private String awb_pkg_pkg_id;	
	private Integer preadviseStatus;	
	private Long parent_ann;
	private String parent_ann_name;
	private String parent_scc_3lc;
	private String parent_scc_name;
	private Long creator_add_id;
	private Long mani_id;
	private AddressView shpAddress;
	private AddressView conAddress;
	private AddressView ffwAddress;
	private AddressView delAddress;
	private AddressView anoAddress;
	private RSAnn shpAnn;
	private CCommodityTree shpCom;
	private String ca_2lc;
	private String marks;
	private Integer pkgs_col;
	private Integer pkgs_mat;
	private Integer pkgs_shp;
	private String cuc_3lc;
	private Integer prio;
	private Integer istotal;
	
	private String bkg_flt_date_string;
	private Timestamp arr;
	private Timestamp vo;
	
	public ImportAcceptanceView convertToImportAcceptanceView()
	{
		ImportAcceptanceView bean = new ImportAcceptanceView();
		bean.setBkg_flt_id(getBkg_flt_id());
		bean.setCa_3dg(getCa_3dg());
		bean.setAwb_stock(getAwb_stock());
		bean.setAwb_no(getAwb_no());
		bean.setNon_standard(getNon_standard());
		bean.setF_id(getF_id());
		bean.setCa_id(getCa_id());
		bean.setDept(getDept());
		bean.setDest(getDest());
		bean.setReq_to(getReq_to());
		bean.setBkg_flt_date(getBkg_flt_date());
		bean.setBkg_item_id(getBkg_item_id());
		bean.setTotal_wgt(getTotal_wgt());
		bean.setTotal_vol(getTotal_vol());
		bean.setTotal_pcs(getTotal_pcs());
		bean.setCom_parent(getCom_parent());
		bean.setCom_parent_name(getCom_parent_name());
		bean.setPkg_id(getPkg_id());
		bean.setPcs(getPcs());
		bean.setCom_id(getCom_id());
		bean.setCom_name(getCom_name());
		bean.setAnn_id(getAnn_id());
		bean.setAnn_name(getAnn_name());
		bean.setWgt(getWgt());
		bean.setL(getL());
		bean.setW(getW());
		bean.setH(getH());
		bean.setScc_3lc(getScc_3lc());
		bean.setShp_add_id(getShp_add_id());
		bean.setCon_add_id(getCon_add_id());
		bean.setBkg_status(getBkg_status());
		bean.setAcc_header_id(getAcc_header_id());
		bean.setAwb_acc_header(getAwb_acc_header());
		bean.setFirst_dept(getFirst_dept());
		bean.setFinal_dest(getFinal_dest());
		bean.setAcc_awb_item_id(getAcc_awb_item_id());
		bean.setAwb_pcs(getAwb_pcs());
		bean.setAwb_wgt(getAwb_wgt());
		bean.setAp_3lc(getAp_3lc());
		bean.setAwb_acc_per_airport(getAwb_acc_per_airport());
		bean.setAcc_shipment_item_id(getAcc_shipment_item_id());
		bean.setShipment_pcs(getShipment_pcs());
		bean.setShipment_wgt(getShipment_wgt());
		bean.setShipment_com_id(getShipment_com_id());
		bean.setA_flt_id(getA_flt_id());
		bean.setBkg_id_id(getBkg_id_id());
		bean.setFlt_id(getFlt_id());
		bean.setMani_item_id(getMani_item_id());
		bean.setLl_uld_id(getLl_uld_id());
		bean.setHolder_add_id(getHolder_add_id());
		bean.setLl_uld_type(getLl_uld_type());
		bean.setLl_uld_no(getLl_uld_no());
		bean.setUld_id(getUld_id());
		bean.setStat_id(getStat_id());
		bean.setPart(getPart());
		bean.setShipment_acc_discr_id(getShipment_acc_discr_id());
		bean.setShipment_discr_id(getShipment_discr_id());
		bean.setShipment_discr_name(getShipment_discr_name());
		bean.setAwb_acc_discr_id(getAwb_acc_discr_id());
		bean.setAwb_discr_id(getAwb_discr_id());
		bean.setAwb_discr_name(getAwb_discr_name());
		bean.setStor_id(getStor_id());
		bean.setPkg_row_no(getPkg_row_no());
		bean.setShipment_discr_4lc(getShipment_discr_4lc());
		bean.setShipment_discr_condition_flag(getShipment_discr_condition_flag());
		bean.setShipment_discr_opposite_discr_id(getShipment_discr_opposite_discr_id());
		bean.setAwb_discr_4lc(getAwb_discr_4lc());
		bean.setAwb_discr_condition_flag(getAwb_discr_condition_flag());
		bean.setAwb_discr_opposite_discr_id(getAwb_discr_opposite_discr_id());
		return bean;
	}

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

	public String getCa_id() {
		return ca_id;
	}

	public void setCa_id(String ca_id) {
		this.ca_id = ca_id;
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
	
	public String getReq_from() {
		return req_from;
	}

	public void setReq_from(String req_from) {
		this.req_from = req_from;
	}

	public Date getBkg_flt_date() {
		return bkg_flt_date;
	}

	public void setBkg_flt_date(Date bkg_flt_date) {
		this.bkg_flt_date = bkg_flt_date;
		if(bkg_flt_date != null)
			this.bkg_flt_date_string = Cons.dateToString(bkg_flt_date);
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

	public Double getTotal_vol() {
		return total_vol;
	}

	public void setTotal_vol(Double total_vol) {
		this.total_vol = total_vol;
	}

	public Integer getTotal_pcs() {
		return total_pcs;
	}

	public void setTotal_pcs(Integer total_pcs) {
		this.total_pcs = total_pcs;
	}

	public Long getCom_parent() {
		return com_parent;
	}

	public void setCom_parent(Long com_parent) {
		this.com_parent = com_parent;
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

	public Double getWgt() {
		return wgt;
	}

	public void setWgt(Double wgt) {
		this.wgt = wgt;
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

	public String getScc_3lc() {
		return scc_3lc;
	}

	public void setScc_3lc(String scc_3lc) {
		this.scc_3lc = scc_3lc;
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

	public Long getAcc_header_id() {
		return acc_header_id;
	}

	public void setAcc_header_id(Long acc_header_id) {
		this.acc_header_id = acc_header_id;
	}

	public Integer getAwb_acc_header() {
		return awb_acc_header;
	}

	public void setAwb_acc_header(Integer awb_acc_header) {
		this.awb_acc_header = awb_acc_header;
	}

	public String getFirst_dept() {
		return first_dept;
	}

	public void setFirst_dept(String first_dept) {
		this.first_dept = first_dept;
	}

	public String getFinal_dest() {
		return final_dest;
	}

	public void setFinal_dest(String final_dest) {
		this.final_dest = final_dest;
	}

	public Long getAcc_awb_item_id() {
		return acc_awb_item_id;
	}

	public void setAcc_awb_item_id(Long acc_awb_item_id) {
		this.acc_awb_item_id = acc_awb_item_id;
	}

	public Integer getAwb_pcs() {
		return awb_pcs;
	}

	public void setAwb_pcs(Integer awb_pcs) {
		this.awb_pcs = awb_pcs;
	}

	public Double getAwb_wgt() {
		return awb_wgt;
	}

	public void setAwb_wgt(Double awb_wgt) {
		this.awb_wgt = awb_wgt;
	}

	public String getAp_3lc() {
		return ap_3lc;
	}

	public void setAp_3lc(String ap_3lc) {
		this.ap_3lc = ap_3lc;
	}

	public Integer getAwb_acc_per_airport() {
		return awb_acc_per_airport;
	}

	public void setAwb_acc_per_airport(Integer awb_acc_per_airport) {
		this.awb_acc_per_airport = awb_acc_per_airport;
	}

	public Long getAcc_shipment_item_id() {
		return acc_shipment_item_id;
	}

	public void setAcc_shipment_item_id(Long acc_shipment_item_id) {
		this.acc_shipment_item_id = acc_shipment_item_id;
	}

	public Integer getShipment_pcs() {
		return shipment_pcs;
	}

	public void setShipment_pcs(Integer shipment_pcs) {
		this.shipment_pcs = shipment_pcs;
	}

	public Double getShipment_wgt() {
		return shipment_wgt;
	}

	public void setShipment_wgt(Double shipment_wgt) {
		this.shipment_wgt = shipment_wgt;
	}

	public Long getShipment_com_id() {
		return shipment_com_id;
	}

	public void setShipment_com_id(Long shipment_com_id) {
		this.shipment_com_id = shipment_com_id;
	}

	public Long getA_flt_id() {
		return a_flt_id;
	}

	public void setA_flt_id(Long a_flt_id) {
		this.a_flt_id = a_flt_id;
	}

	public Timestamp getA_dep() {
		return a_dep;
	}

	public void setA_dep(Timestamp a_dep) {
		this.a_dep = a_dep;
	}

	public Integer getOpen_for_cargo() {
		return open_for_cargo;
	}

	public void setOpen_for_cargo(Integer open_for_cargo) {
		this.open_for_cargo = open_for_cargo;
	}

	public Long getBkg_id_id() {
		return bkg_id_id;
	}

	public void setBkg_id_id(Long bkg_id_id) {
		this.bkg_id_id = bkg_id_id;
	}

	public Long getFlt_id() {
		return flt_id;
	}

	public void setFlt_id(Long flt_id) {
		this.flt_id = flt_id;
	}

	public String getFlt_no() {
		return flt_no;
	}

	public void setFlt_no(String flt_no) {
		this.flt_no = flt_no;
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

	public String getUld_trans_mode() {
		return uld_trans_mode;
	}

	public void setUld_trans_mode(String uld_trans_mode) {
		this.uld_trans_mode = uld_trans_mode;
	}

	public Integer getHolder_add_id() {
		return holder_add_id;
	}

	public void setHolder_add_id(Integer holder_add_id) {
		this.holder_add_id = holder_add_id;
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

	public String getStat_id() {
		return stat_id;
	}

	public void setStat_id(String stat_id) {
		this.stat_id = stat_id;
	}

	public Integer getPart() {
		return part;
	}

	public void setPart(Integer part) {
		this.part = part;
	}

	public Long getShipment_acc_discr_id() {
		return shipment_acc_discr_id;
	}

	public void setShipment_acc_discr_id(Long shipment_acc_discr_id) {
		this.shipment_acc_discr_id = shipment_acc_discr_id;
	}

	public Long getShipment_discr_id() {
		return shipment_discr_id;
	}

	public void setShipment_discr_id(Long shipment_discr_id) {
		this.shipment_discr_id = shipment_discr_id;
	}

	public String getShipment_discr_name() {
		return shipment_discr_name;
	}

	public void setShipment_discr_name(String shipment_discr_name) {
		this.shipment_discr_name = shipment_discr_name;
	}

	public Long getAwb_acc_discr_id() {
		return awb_acc_discr_id;
	}

	public void setAwb_acc_discr_id(Long awb_acc_discr_id) {
		this.awb_acc_discr_id = awb_acc_discr_id;
	}

	public Long getAwb_discr_id() {
		return awb_discr_id;
	}

	public void setAwb_discr_id(Long awb_discr_id) {
		this.awb_discr_id = awb_discr_id;
	}

	public String getAwb_discr_name() {
		return awb_discr_name;
	}

	public void setAwb_discr_name(String awb_discr_name) {
		this.awb_discr_name = awb_discr_name;
	}

	public Long getStor_id()
	{
		return stor_id;
	}

	public void setStor_id(Long stor_id)
	{
		this.stor_id = stor_id;
	}

	public Double getVol()
	{
		return vol;
	}

	public void setVol(Double vol)
	{
		this.vol = vol;
	}

	public Integer getIs_loaded()
	{
		return is_loaded;
	}

	public void setIs_loaded(Integer is_loaded)
	{
		this.is_loaded = is_loaded;
	}

	public Integer getFfw_add_id()
	{
		return ffw_add_id;
	}

	public void setFfw_add_id(Integer ffw_add_id)
	{
		this.ffw_add_id = ffw_add_id;
	}

	public Integer getDeliver_add_id()
	{
		return deliver_add_id;
	}

	public void setDeliver_add_id(Integer deliver_add_id)
	{
		this.deliver_add_id = deliver_add_id;
	}

	public Integer getAnotify_add_id()
	{
		return anotify_add_id;
	}

	public void setAnotify_add_id(Integer anotify_add_id)
	{
		this.anotify_add_id = anotify_add_id;
	}

	public Long getPrint_id()
	{
		return print_id;
	}

	public void setPrint_id(Long print_id)
	{
		this.print_id = print_id;
	}

	public String getAwb_stat_id()
	{
		return awb_stat_id;
	}

	public void setAwb_stat_id(String awb_stat_id)
	{
		this.awb_stat_id = awb_stat_id;
	}

	public String getStat_descr()
	{
		return stat_descr;
	}

	public void setStat_descr(String stat_descr)
	{
		this.stat_descr = stat_descr;
	}

	public Long getAcc_awb_pkg_id()
	{
		return acc_awb_pkg_id;
	}

	public void setAcc_awb_pkg_id(Long acc_awb_pkg_id)
	{
		this.acc_awb_pkg_id = acc_awb_pkg_id;
	}

	public Long getAcc_shipment_pkg_id()
	{
		return acc_shipment_pkg_id;
	}

	public void setAcc_shipment_pkg_id(Long acc_shipment_pkg_id)
	{
		this.acc_shipment_pkg_id = acc_shipment_pkg_id;
	}

	public Integer getPreadviseStatus()
	{
		return preadviseStatus;
	}

	public void setPreadviseStatus(Integer preadviseStatus)
	{
		this.preadviseStatus = preadviseStatus;
	}

	public Integer getPkg_row_no()
	{
		return pkg_row_no;
	}

	public void setPkg_row_no(Integer pkg_row_no)
	{
		this.pkg_row_no = pkg_row_no;
	}

	public String getCom_parent_name()
	{
		return com_parent_name;
	}

	public void setCom_parent_name(String com_parent_name)
	{
		this.com_parent_name = com_parent_name;
	}

	public String getMani_rem()
	{
		return mani_rem;
	}

	public void setMani_rem(String mani_rem)
	{
		this.mani_rem = mani_rem;
	}

	public String getStor_name()
	{
		return stor_name;
	}

	public void setStor_name(String stor_name)
	{
		this.stor_name = stor_name;
	}

	public String getShipment_discr_4lc()
	{
		return shipment_discr_4lc;
	}

	public void setShipment_discr_4lc(String shipment_discr_4lc)
	{
		this.shipment_discr_4lc = shipment_discr_4lc;
	}

	public String getAwb_discr_4lc()
	{
		return awb_discr_4lc;
	}

	public void setAwb_discr_4lc(String awb_discr_4lc)
	{
		this.awb_discr_4lc = awb_discr_4lc;
	}

	public Long getAwb_com_id()
	{
		return awb_com_id;
	}

	public void setAwb_com_id(Long awb_com_id)
	{
		this.awb_com_id = awb_com_id;
	}

	public Integer getShipment_pkg_pcs()
	{
		return shipment_pkg_pcs;
	}

	public void setShipment_pkg_pcs(Integer shipment_pkg_pcs)
	{
		this.shipment_pkg_pcs = shipment_pkg_pcs;
	}

	public Long getShipment_pkg_com_id()
	{
		return shipment_pkg_com_id;
	}

	public void setShipment_pkg_com_id(Long shipment_pkg_com_id)
	{
		this.shipment_pkg_com_id = shipment_pkg_com_id;
	}

	public Long getShipment_pkg_ann_id()
	{
		return shipment_pkg_ann_id;
	}

	public void setShipment_pkg_ann_id(Long shipment_pkg_ann_id)
	{
		this.shipment_pkg_ann_id = shipment_pkg_ann_id;
	}

	public Double getShipment_pkg_wgt()
	{
		return shipment_pkg_wgt;
	}

	public void setShipment_pkg_wgt(Double shipment_pkg_wgt)
	{
		this.shipment_pkg_wgt = shipment_pkg_wgt;
	}

	public Double getShipment_pkg_w()
	{
		return shipment_pkg_w;
	}

	public void setShipment_pkg_w(Double shipment_pkg_w)
	{
		this.shipment_pkg_w = shipment_pkg_w;
	}

	public Double getShipment_pkg_l()
	{
		return shipment_pkg_l;
	}

	public void setShipment_pkg_l(Double shipment_pkg_l)
	{
		this.shipment_pkg_l = shipment_pkg_l;
	}

	public Double getShipment_pkg_h()
	{
		return shipment_pkg_h;
	}

	public void setShipment_pkg_h(Double shipment_pkg_h)
	{
		this.shipment_pkg_h = shipment_pkg_h;
	}

	public String getShipment_pkg_scc_3lc()
	{
		return shipment_pkg_scc_3lc;
	}

	public void setShipment_pkg_scc_3lc(String shipment_pkg_scc_3lc)
	{
		this.shipment_pkg_scc_3lc = shipment_pkg_scc_3lc;
	}

	public Integer getAwb_pkg_pcs()
	{
		return awb_pkg_pcs;
	}

	public void setAwb_pkg_pcs(Integer awb_pkg_pcs)
	{
		this.awb_pkg_pcs = awb_pkg_pcs;
	}

	public Long getAwb_pkg_com_id()
	{
		return awb_pkg_com_id;
	}

	public void setAwb_pkg_com_id(Long awb_pkg_com_id)
	{
		this.awb_pkg_com_id = awb_pkg_com_id;
	}

	public Long getAwb_pkg_ann_id()
	{
		return awb_pkg_ann_id;
	}

	public void setAwb_pkg_ann_id(Long awb_pkg_ann_id)
	{
		this.awb_pkg_ann_id = awb_pkg_ann_id;
	}

	public Double getAwb_pkg_wgt()
	{
		return awb_pkg_wgt;
	}

	public void setAwb_pkg_wgt(Double awb_pkg_wgt)
	{
		this.awb_pkg_wgt = awb_pkg_wgt;
	}

	public Double getAwb_pkg_w()
	{
		return awb_pkg_w;
	}

	public void setAwb_pkg_w(Double awb_pkg_w)
	{
		this.awb_pkg_w = awb_pkg_w;
	}

	public Double getAwb_pkg_l()
	{
		return awb_pkg_l;
	}

	public void setAwb_pkg_l(Double awb_pkg_l)
	{
		this.awb_pkg_l = awb_pkg_l;
	}

	public Double getAwb_pkg_h()
	{
		return awb_pkg_h;
	}

	public void setAwb_pkg_h(Double awb_pkg_h)
	{
		this.awb_pkg_h = awb_pkg_h;
	}

	public String getAwb_pkg_scc_3lc()
	{
		return awb_pkg_scc_3lc;
	}

	public void setAwb_pkg_scc_3lc(String awb_pkg_scc_3lc)
	{
		this.awb_pkg_scc_3lc = awb_pkg_scc_3lc;
	}

	public String getShipment_pkg_pkg_id()
	{
		return shipment_pkg_pkg_id;
	}

	public void setShipment_pkg_pkg_id(String shipment_pkg_pkg_id)
	{
		this.shipment_pkg_pkg_id = shipment_pkg_pkg_id;
	}

	public String getAwb_pkg_pkg_id()
	{
		return awb_pkg_pkg_id;
	}

	public void setAwb_pkg_pkg_id(String awb_pkg_pkg_id)
	{
		this.awb_pkg_pkg_id = awb_pkg_pkg_id;
	}

	public Double getAwb_vol()
	{
		return awb_vol;
	}

	public void setAwb_vol(Double awb_vol)
	{
		this.awb_vol = awb_vol;
	}

	public Double getShipment_vol()
	{
		return shipment_vol;
	}

	public void setShipment_vol(Double shipment_vol)
	{
		this.shipment_vol = shipment_vol;
	}

	public Integer getShipment_discr_condition_flag()
	{
		return shipment_discr_condition_flag;
	}

	public void setShipment_discr_condition_flag(Integer shipment_discr_condition_flag)
	{
		this.shipment_discr_condition_flag = shipment_discr_condition_flag;
	}

	public Integer getShipment_discr_opposite_discr_id()
	{
		return shipment_discr_opposite_discr_id;
	}

	public void setShipment_discr_opposite_discr_id(Integer shipment_discr_opposite_discr_id)
	{
		this.shipment_discr_opposite_discr_id = shipment_discr_opposite_discr_id;
	}

	public Integer getAwb_discr_condition_flag()
	{
		return awb_discr_condition_flag;
	}

	public void setAwb_discr_condition_flag(Integer awb_discr_condition_flag)
	{
		this.awb_discr_condition_flag = awb_discr_condition_flag;
	}

	public Integer getAwb_discr_opposite_discr_id()
	{
		return awb_discr_opposite_discr_id;
	}

	public void setAwb_discr_opposite_discr_id(Integer awb_discr_opposite_discr_id)
	{
		this.awb_discr_opposite_discr_id = awb_discr_opposite_discr_id;
	}

	public Long getParent_ann()
	{
		return parent_ann;
	}

	public void setParent_ann(Long parent_ann)
	{
		this.parent_ann = parent_ann;
	}

	public String getParent_ann_name()
	{
		return parent_ann_name;
	}

	public void setParent_ann_name(String parent_ann_name)
	{
		this.parent_ann_name = parent_ann_name;
	}

	public String getParent_scc_3lc()
	{
		return parent_scc_3lc;
	}

	public void setParent_scc_3lc(String parent_scc_3lc)
	{
		this.parent_scc_3lc = parent_scc_3lc;
	}

	public String getParent_scc_name()
	{
		return parent_scc_name;
	}

	public void setParent_scc_name(String parent_scc_name)
	{
		this.parent_scc_name = parent_scc_name;
	}

	public Long getCreator_add_id()
	{
		return creator_add_id;
	}

	public void setCreator_add_id(Long creator_add_id)
	{
		this.creator_add_id = creator_add_id;
	}

	public Long getMani_id()
	{
		return mani_id;
	}

	public void setMani_id(Long mani_id)
	{
		this.mani_id = mani_id;
	}

	public AddressView getShpAddress()
	{
		return shpAddress;
	}

	public void setShpAddress(AddressView shpAddress)
	{
		this.shpAddress = shpAddress;
	}

	public AddressView getConAddress()
	{
		return conAddress;
	}

	public void setConAddress(AddressView conAddress)
	{
		this.conAddress = conAddress;
	}

	public AddressView getFfwAddress()
	{
		return ffwAddress;
	}

	public void setFfwAddress(AddressView ffwAddress)
	{
		this.ffwAddress = ffwAddress;
	}

	public AddressView getDelAddress()
	{
		return delAddress;
	}

	public void setDelAddress(AddressView delAddress)
	{
		this.delAddress = delAddress;
	}

	public AddressView getAnoAddress()
	{
		return anoAddress;
	}

	public void setAnoAddress(AddressView anoAddress)
	{
		this.anoAddress = anoAddress;
	}

	public RSAnn getShpAnn()
	{
		return shpAnn;
	}

	public void setShpAnn(RSAnn shpAnn)
	{
		this.shpAnn = shpAnn;
	}

	public CCommodityTree getShpCom()
	{
		return shpCom;
	}

	public void setShpCom(CCommodityTree shpCom)
	{
		this.shpCom = shpCom;
	}

	public String getCa_2lc() {
		return ca_2lc;
	}

	public void setCa_2lc(String ca_2lc) {
		this.ca_2lc = ca_2lc;
	}

	public String getBkg_flt_date_string()
	{
		return bkg_flt_date_string;
	}

	public void setBkg_flt_date_string(String bkg_flt_date_string)
	{
		this.bkg_flt_date_string = bkg_flt_date_string;
	}

	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
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

	public String getCuc_3lc() {
		return cuc_3lc;
	}

	public void setCuc_3lc(String cuc_3lc) {
		this.cuc_3lc = cuc_3lc;
	}

	public Integer getPrio()
	{
		return prio;
	}

	public void setPrio(Integer prio)
	{
		this.prio = prio;
	}

	public Integer getIstotal() {
		return istotal;
	}

	public void setIstotal(Integer istotal) {
		this.istotal = istotal;
	}

	public Timestamp getArr() {
		return arr;
	}

	public void setArr(Timestamp arr) {
		this.arr = arr;
	}

	public Timestamp getVo() {
		return vo;
	}

	public void setVo(Timestamp vo) {
		this.vo = vo;
	}
	
}
