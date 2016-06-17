/**
 * 
 */
package de.act.common.types.views;

import java.io.Serializable;
import java.util.Date;

import de.act.common.types.staticobjects.Carrier;
import de.act.common.types.staticobjects.Cons;
import de.act.common.types.staticobjects.RSState;

public class DailyBookingListView implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1761937963367745850L;
	private String f_id;
	private Integer add_id;
	private Long creator_id;
	private String awb_no;
	private String non_standard;
	private Integer part;
	private String pcs;
	private String wgt;
	private String vol;
	private String com_name;
	private String scc_3lc;
	private String scc_name;
	private String ca_id;
	private String ca_2lc;
	private String flt_no;
	private Long flt_id;
	private Date bkg_flt_date;
	private String dept;
	private String dest_hops;
	private String dest;
	private String bkg_status;
	//private String flt_id;
	private String ca_3dg;
	private String awb_stock;
	private Long bkg_flt_id;
	private Long bkg_item_id;
	private Long a_flt_id;
	private Long bkg_id_id;
	private Integer shp_add_id;
	private Integer con_add_id;
	private Integer ffw_add_id;
	private String shp_add_name;
	private String con_add_name;
	private String ffw_add_name;
	private Long mani_item_id;
	private Integer flt_row;
	private String stat_id;
	private String remark;
	private String mani_stat_id;
	private String cuc_3lc;
	private String req_from;
	private String req_ca_id;
	private StatusInformationView statInfoView;
	private RSState stat;
	private Long shipment_discr_id;
	private String shipment_discr_name;
	private String shipment_discr_4lc;
	private Integer shipment_discr_condition_flag;
	private Integer shipment_discr_opposite_discr_id;
	private Long awb_discr_id;
	private String awb_discr_name;
	private String awb_discr_4lc;
	private Integer awb_discr_condition_flag;
	private Integer awb_discr_opposite_discr_id;
	private String bkg_flt_date_str;
	private Integer parent;
	private Carrier transfer_ca;
	private Date created_date;
	private Date loaded_date;
	private Integer priority;
	private Long com_id;
	private Long ann_id;
	private String fpart;
	private Date dep;
	
	public String getF_id() {
		return f_id;
	}

	public void setF_id(String f_id) {
		this.f_id = f_id;
	}

//	public Integer getCreator_id() {
//		return creator_id;
//	}
//
//	public void setCreator_id(Integer creator_id) {
//		this.creator_id = creator_id;
//	}

	public Integer getAdd_id() {
		return add_id;
	}

	public void setAdd_id(Integer add_id) {
		this.add_id = add_id;
	}

	public String getAwb_no() {
		return awb_no;
	}

	public void setAwb_no(String awb_no) {
		this.awb_no = awb_no;
	}

	public String getNon_standard() {
		return non_standard;
	}

	public void setNon_standard(String non_standard) {
		this.non_standard = non_standard;
	}

	public Integer getPart() {
		return part;
	}

	public void setPart(Integer part) {
		this.part = part;
	}

	public String getPcs() {
		return pcs;
	}

	public void setPcs(String pcs) {
		this.pcs = pcs;
	}

	public String getWgt() {
		return wgt;
	}

	public void setWgt(String wgt) {
		this.wgt = wgt;
	}

	public String getVol() {
		return vol;
	}

	public void setVol(String vol) {
		this.vol = vol;
	}

	public String getCom_name() {
		return com_name;
	}

	public void setCom_name(String com_name) {
		this.com_name = com_name;
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

	public String getCa_id() {
		return ca_id;
	}

	public void setCa_id(String ca_id) {
		this.ca_id = ca_id;
	}

	public String getCa_2lc() {
		return ca_2lc;
	}

	public void setCa_2lc(String ca_2lc) {
		this.ca_2lc = ca_2lc;
	}

	public String getFlt_no() {
		return flt_no;
	}

	public void setFlt_no(String flt_no) {
		this.flt_no = flt_no;
	}

	public Date getBkg_flt_date() {
		return bkg_flt_date;
	}

	public void setBkg_flt_date(Date bkg_flt_date) {
		this.bkg_flt_date = bkg_flt_date;
		if(bkg_flt_date != null)
			this.bkg_flt_date_str = Cons.dateToString(bkg_flt_date);
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDest_hops() {
		return dest_hops;
	}

	public void setDest_hops(String dest_hops) {
		this.dest_hops = dest_hops;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public String getBkg_status() {
		return bkg_status;
	}

	public void setBkg_status(String bkg_status) {
		this.bkg_status = bkg_status;
	}

	/*public String getFlt_id() {
		return flt_id;
	}

	public void setFlt_id(String flt_id) {
		this.flt_id = flt_id;
	}*/

	public String getCa_3dg() {
		return ca_3dg;
	}

	public void setCa_3dg(String ca_3dg) {
		this.ca_3dg = ca_3dg;
	}

	public String getAwb_stock() {
		return awb_stock;
	}

	public void setAwb_stock(String awb_stock) {
		this.awb_stock = awb_stock;
	}

	public Long getBkg_flt_id() {
		return bkg_flt_id;
	}

	public void setBkg_flt_id(Long bkg_flt_id) {
		this.bkg_flt_id = bkg_flt_id;
	}

	public Long getBkg_item_id() {
		return bkg_item_id;
	}

	public void setBkg_item_id(Long bkg_item_id) {
		this.bkg_item_id = bkg_item_id;
	}

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

	public Long getMani_item_id() {
		return mani_item_id;
	}

	public void setMani_item_id(Long mani_item_id) {
		this.mani_item_id = mani_item_id;
	}

	public StatusInformationView getStatInfoView() {
		return statInfoView;
	}

	public void setStatInfoView(StatusInformationView statInfoView) {
		this.statInfoView = statInfoView;
	}

	public Integer getFfw_add_id()
	{
		return ffw_add_id;
	}

	public void setFfw_add_id(Integer ffw_add_id)
	{
		this.ffw_add_id = ffw_add_id;
	}

	public Integer getFlt_row()
	{
		return flt_row;
	}

	public void setFlt_row(Integer flt_row)
	{
		this.flt_row = flt_row;
	}

	public String getStat_id()
	{
		return stat_id;
	}

	public void setStat_id(String stat_id)
	{
		this.stat_id = stat_id;
	}

	public String getRemark()
	{
		return remark;
	}

	public void setRemark(String remark)
	{
		this.remark = remark;
	}

	public RSState getStat()
	{
		return stat;
	}

	public void setStat(RSState stat)
	{
		this.stat = stat;
	}

	public String getMani_stat_id()
	{
		return mani_stat_id;
	}

	public void setMani_stat_id(String mani_stat_id)
	{
		this.mani_stat_id = mani_stat_id;
	}

	public String getShp_add_name()
	{
		return shp_add_name;
	}

	public void setShp_add_name(String shp_add_name)
	{
		this.shp_add_name = shp_add_name;
	}

	public String getCon_add_name()
	{
		return con_add_name;
	}

	public void setCon_add_name(String con_add_name)
	{
		this.con_add_name = con_add_name;
	}

	public String getFfw_add_name()
	{
		return ffw_add_name;
	}

	public void setFfw_add_name(String ffw_add_name)
	{
		this.ffw_add_name = ffw_add_name;
	}

	public Long getShipment_discr_id()
	{
		return shipment_discr_id;
	}

	public void setShipment_discr_id(Long shipment_discr_id)
	{
		this.shipment_discr_id = shipment_discr_id;
	}

	public String getShipment_discr_name()
	{
		return shipment_discr_name;
	}

	public void setShipment_discr_name(String shipment_discr_name)
	{
		this.shipment_discr_name = shipment_discr_name;
	}

	public String getShipment_discr_4lc()
	{
		return shipment_discr_4lc;
	}

	public void setShipment_discr_4lc(String shipment_discr_4lc)
	{
		this.shipment_discr_4lc = shipment_discr_4lc;
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

	public Long getAwb_discr_id()
	{
		return awb_discr_id;
	}

	public void setAwb_discr_id(Long awb_discr_id)
	{
		this.awb_discr_id = awb_discr_id;
	}

	public String getAwb_discr_name()
	{
		return awb_discr_name;
	}

	public void setAwb_discr_name(String awb_discr_name)
	{
		this.awb_discr_name = awb_discr_name;
	}

	public String getAwb_discr_4lc()
	{
		return awb_discr_4lc;
	}

	public void setAwb_discr_4lc(String awb_discr_4lc)
	{
		this.awb_discr_4lc = awb_discr_4lc;
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

	public Long getFlt_id()
	{
		return flt_id;
	}

	public void setFlt_id(Long flt_id)
	{
		this.flt_id = flt_id;
	}

	public String getBkg_flt_date_str()
	{
		return bkg_flt_date_str;
	}

	public void setBkg_flt_date_str(String bkg_flt_date_str)
	{
		this.bkg_flt_date_str = bkg_flt_date_str;
	}

	public Integer getParent()
	{
		return parent;
	}

	public void setParent(Integer parent)
	{
		this.parent = parent;
	}

	public Carrier getTransfer_ca()
	{
		return transfer_ca;
	}

	public void setTransfer_ca(Carrier transfer_ca)
	{
		this.transfer_ca = transfer_ca;
		if(transfer_ca != null)
		{
			this.ca_2lc = transfer_ca.ca_2lc;
		}
	}

	public String getCuc_3lc() {
		return cuc_3lc;
	}

	public void setCuc_3lc(String cuc_3lc) {
		this.cuc_3lc = cuc_3lc;
	}

	public String getReq_from()
	{
		return req_from;
	}

	public void setReq_from(String req_from)
	{
		this.req_from = req_from;
	}

	public String getReq_ca_id()
	{
		return req_ca_id;
	}

	public void setReq_ca_id(String req_ca_id)
	{
		this.req_ca_id = req_ca_id;
	}

	public Date getCreated_date()
	{
		return created_date;
	}

	public void setCreated_date(Date created_date)
	{
		this.created_date = created_date;
	}

	public Date getLoaded_date()
	{
		return loaded_date;
	}

	public void setLoaded_date(Date loaded_date)
	{
		this.loaded_date = loaded_date;
	}

	public Integer getPriority()
	{
		return priority;
	}

	public void setPriority(Integer priority)
	{
		this.priority = priority;
	}

	public Long getCom_id()
	{
		return com_id;
	}

	public void setCom_id(Long com_id)
	{
		this.com_id = com_id;
	}

	public Long getAnn_id()
	{
		return ann_id;
	}

	public void setAnn_id(Long ann_id)
	{
		this.ann_id = ann_id;
	}

	public String getFpart()
	{
		return fpart;
	}

	public void setFpart(String fpart)
	{
		this.fpart = fpart;
	}

	public Date getDep()
	{
		return dep;
	}

	public void setDep(Date dep)
	{
		this.dep = dep;
	}

	public Long getCreator_id()
	{
		return creator_id;
	}

	public void setCreator_id(Long creator_id)
	{
		this.creator_id = creator_id;
	}
	
}
