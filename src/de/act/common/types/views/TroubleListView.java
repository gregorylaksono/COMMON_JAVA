package de.act.common.types.views;

import java.io.Serializable;
import java.util.Date;

public class TroubleListView implements Serializable {
	
	private static final long serialVersionUID = 6795712994278648351L;
	private String ca_3dg;
	private Integer awb_stock;
	private Integer awb_no;
	private String non_standard;
	private String f_id;
	private String ca_id;
	private String dept;
	private String dest;
	private String bkg_status;
	private Long acc_header_id;
	private Integer awb_acc_header;
	private String first_dept;
	private String final_dest;
	private String ap_3lc;
	private Long pcs;
	private Long shp_add_id;
	private Long acc_shipment_id;
	private Integer shipment_pcs;
	private Double shipment_wgt;
	private Double shipment_vol;
	private String com_name;
	private Long flt_id;
	private String flt_no;
	private Date bkg_flt_date;
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
	private Double wgt;
	private Double vol;
	private String ca_2lc;
	
	public TroubleListView(){
		
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

	public String getAp_3lc() {
		return ap_3lc;
	}

	public void setAp_3lc(String ap_3lc) {
		this.ap_3lc = ap_3lc;
	}

	public Long getPcs() {
		return pcs;
	}

	public void setPcs(Long pcs) {
		this.pcs = pcs;
	}

	public Long getShp_add_id() {
		return shp_add_id;
	}

	public void setShp_add_id(Long shp_add_id) {
		this.shp_add_id = shp_add_id;
	}

	public Long getAcc_shipment_id() {
		return acc_shipment_id;
	}

	public void setAcc_shipment_id(Long acc_shipment_id) {
		this.acc_shipment_id = acc_shipment_id;
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

	public Double getShipment_vol() {
		return shipment_vol;
	}

	public void setShipment_vol(Double shipment_vol) {
		this.shipment_vol = shipment_vol;
	}

	public String getCom_name() {
		return com_name;
	}

	public void setCom_name(String com_name) {
		this.com_name = com_name;
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

	public Date getBkg_flt_date() {
		return bkg_flt_date;
	}

	public void setBkg_flt_date(Date bkg_flt_date) {
		this.bkg_flt_date = bkg_flt_date;
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

	public Double getWgt()
	{
		return wgt;
	}

	public void setWgt(Double wgt)
	{
		this.wgt = wgt;
	}

	public Double getVol()
	{
		return vol;
	}

	public void setVol(Double vol)
	{
		this.vol = vol;
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

	public String getCa_2lc() {
		return ca_2lc;
	}

	public void setCa_2lc(String ca_2lc) {
		this.ca_2lc = ca_2lc;
	}
	
}
