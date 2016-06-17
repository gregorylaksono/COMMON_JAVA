package de.act.common.types.nonstaticobjects;

import java.io.Serializable;
import java.util.Date;

import de.act.common.types.staticobjects.RSAdd;

@org.jboss.cache.aop.annotation.PojoCacheable
public class BookingInformation implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1135886402990774362L;
	private Integer bkgFltId;
	private Integer segment;
	private Integer part;
	private String flight;
	private String routing;
	private String status;
	private Double totalPcs;
	private Double totalWgt;
	private Double totalVol;
	private String commodity;
	private String scc;
	private Integer bkg_item_id;
	private RSAdd shipperAdd;
	private RSAdd ffwAdd;
	private RSAdd consigneeAdd;
	private RSAdd deliveredToAdd;
	private RSAdd alsoNotifyAdd;
	private String ap_3lc;
	private String f_id;
	private String dept;
	private String bookingStatus;
	private String stat_id;
	private String commodityParentName;
	private Integer flt_row;
	private String cuc_3lc;
	private String caId;
	private String flt_no;
	private String dest;
    private String req_to;
    private String ann_id;
    private String ann_name;
    private String ann_dsp;
    private String ca_3dg;
    private Integer awb_stock;
    private Integer awb_no;

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

	public String getAnn_id() {
		return ann_id;
	}
    
	public void setAnn_id(String ann_id) {
		this.ann_id = ann_id;
	}
	
	public String getAnn_name() {
		return ann_name;
	}
	
	public void setAnn_name(String ann_name) {
		this.ann_name = ann_name;
	}
	
	public String getAnn_dsp() {
		return ann_dsp;
	}
	
	public void setAnn_dsp(String ann_dsp) {
		this.ann_dsp = ann_dsp;
	}

    public String getFlt_no()
	{
		return flt_no;
	}

	public void setFlt_no(String flt_no)
	{
		this.flt_no = flt_no;
	}

	public Date getFlt_date()
	{
		return flt_date;
	}

	public void setFlt_date(Date flt_date)
	{
		this.flt_date = flt_date;
	}

	public String getCa_2lc()
	{
		return ca_2lc;
	}

	public void setCa_2lc(String ca_2lc)
	{
		this.ca_2lc = ca_2lc;
	}

	private Date flt_date;
	private String ca_2lc;

	public Integer getBkgFltId()
	{
		return bkgFltId;
	}

	public void setBkgFltId(Integer bkgFltId)
	{
		this.bkgFltId = bkgFltId;
	}

	public Integer getSegment()
	{
		return segment;
	}

	public void setSegment(Integer segment)
	{
		this.segment = segment;
	}

	public Integer getPart()
	{
		return part;
	}

	public void setPart(Integer part)
	{
		this.part = part;
	}

	public String getFlight()
	{
		return flight;
	}

	public void setFlight(String flight)
	{
		this.flight = flight;
	}

	public String getRouting()
	{
		return routing;
	}

	public void setRouting(String routing)
	{
		this.routing = routing;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	public String getCommodity()
	{
		return commodity;
	}

	public void setCommodity(String commodity)
	{
		this.commodity = commodity;
	}

	public String getScc()
	{
		return scc;
	}

	public void setScc(String scc)
	{
		this.scc = scc;
	}

	public void setTotalPcs(Double totalPcs)
	{
		this.totalPcs = totalPcs;
	}

	public Double getTotalPcs()
	{
		return totalPcs;
	}

	public void setTotalWgt(Double totalWgt)
	{
		this.totalWgt = totalWgt;
	}

	public Double getTotalWgt()
	{
		return totalWgt;
	}

	public void setTotalVol(Double totalVol)
	{
		this.totalVol = totalVol;
	}

	public Double getTotalVol()
	{
		return totalVol;
	}

	public void setBkg_item_id(Integer bkg_item_id)
	{
		this.bkg_item_id = bkg_item_id;
	}

	public Integer getBkg_item_id()
	{
		return bkg_item_id;
	}

	public RSAdd getShipperAdd()
	{
		return shipperAdd;
	}

	public void setShipperAdd(RSAdd shipperAdd)
	{
		this.shipperAdd = shipperAdd;
	}

	public RSAdd getFfwAdd()
	{
		return ffwAdd;
	}

	public void setFfwAdd(RSAdd ffwAdd)
	{
		this.ffwAdd = ffwAdd;
	}

	public RSAdd getConsigneeAdd()
	{
		return consigneeAdd;
	}

	public void setConsigneeAdd(RSAdd consigneeAdd)
	{
		this.consigneeAdd = consigneeAdd;
	}

	public RSAdd getDeliveredToAdd()
	{
		return deliveredToAdd;
	}

	public void setDeliveredToAdd(RSAdd deliveredToAdd)
	{
		this.deliveredToAdd = deliveredToAdd;
	}

	public RSAdd getAlsoNotifyAdd()
	{
		return alsoNotifyAdd;
	}

	public void setAlsoNotifyAdd(RSAdd alsoNotifyAdd)
	{
		this.alsoNotifyAdd = alsoNotifyAdd;
	}

	public String getAp_3lc()
	{
		return ap_3lc;
	}

	public void setAp_3lc(String ap_3lc)
	{
		this.ap_3lc = ap_3lc;
	}

	public String getF_id()
	{
		return f_id;
	}

	public void setF_id(String f_id)
	{
		this.f_id = f_id;
	}

	public String getDept()
	{
		return dept;
	}

	public void setDept(String dept)
	{
		this.dept = dept;
	}

	public String getBookingStatus()
	{
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus)
	{
		this.bookingStatus = bookingStatus;
	}

	public String getStat_id()
	{
		return stat_id;
	}

	public void setStat_id(String stat_id)
	{
		this.stat_id = stat_id;
	}

	public String getCommodityParentName()
	{
		return commodityParentName;
	}

	public void setCommodityParentName(String commodityParentName)
	{
		this.commodityParentName = commodityParentName;
	}

	public Integer getFlt_row()
	{
		return flt_row;
	}

	public void setFlt_row(Integer flt_row)
	{
		this.flt_row = flt_row;
	}

	public String getCuc_3lc()
	{
		return cuc_3lc;
	}

	public void setCuc_3lc(String cuc_3lc)
	{
		this.cuc_3lc = cuc_3lc;
	}

	public String getCaId()
	{
		return caId;
	}

	public void setCaId(String caId)
	{
		this.caId = caId;
	}

	public String getDest()
	{
		return dest;
	}

	public void setDest(String dest)
	{
		this.dest = dest;
	}

    public void setReq_to(String req_to) {
        this.req_to = req_to;
    }

    public String getReq_to() {
        return req_to;
    }
}
