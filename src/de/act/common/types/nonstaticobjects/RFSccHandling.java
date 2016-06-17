package de.act.common.types.nonstaticobjects;

import java.io.Serializable;
import java.util.Date;

public class RFSccHandling implements Serializable{

	private static final long serialVersionUID = -4533956113149265565L;
	private Integer f_scc_id;
	private String SCC;
	private Integer notified;
	private String ca_2lc;
	private String from_dept;
	private String to_dest;
	private String commodity;
	private String consignee;
	private Date departure;
	private String awb;
	private Integer pcs;
	private Double wgt;
	private Double vol;
	private String flt_no;
	private Date date;
	
	public Integer getF_scc_id() {
		return f_scc_id;
	}
	public void setF_scc_id(Integer f_scc_id) {
		this.f_scc_id = f_scc_id;
	}
	public String getSCC() {
		return SCC;
	}
	public void setSCC(String scc) {
		SCC = scc;
	}
	public void setNotified(Integer notified) {
		this.notified = notified;
	}
	public Integer getNotified() {
		return notified;
	}
	
	public String getFrom_dept() {
		return from_dept;
	}
	public void setFrom_dept(String from_dept) {
		this.from_dept = from_dept;
	}
	public String getTo_dest() {
		return to_dest;
	}
	public void setTo_dest(String to_dest) {
		this.to_dest = to_dest;
	}
	public String getCommodity() {
		return commodity;
	}
	public void setCommodity(String commodity) {
		this.commodity = commodity;
	}
	public String getConsignee() {
		return consignee;
	}
	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}
	public Date getDeparture() {
		return departure;
	}
	public void setDeparture(Date departure) {
		this.departure = departure;
	}
	public String getAwb() {
		return awb;
	}
	public void setAwb(String awb) {
		this.awb = awb;
	}
	public void setCa_2lc(String ca_2lc) {
		this.ca_2lc = ca_2lc;
	}
	public String getCa_2lc() {
		return ca_2lc;
	}
	public Integer getPcs() {
		return pcs;
	}
	public void setPcs(Integer pcs) {
		this.pcs = pcs;
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
	public String getFlt_no() {
		return flt_no;
	}
	public void setFlt_no(String flt_no) {
		this.flt_no = flt_no;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getDate() {
		return date;
	}
	
}
