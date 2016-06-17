package de.act.common.types.nonstaticobjects;

import java.io.Serializable;
import java.util.Date;

public class OperationInformation implements Serializable{

	private static final long serialVersionUID = -7755629699864085461L;
	
	private long ops_temp_id;
	private String ca_2lc;
	private String ca_id;
	private String flt_no;
	private Date flt_date;
	private String dept;
	private String dest;
	private double wgt;
	private Integer is_sent;
		
	public long getOps_temp_id() {
		return ops_temp_id;
	}
	public void setOps_temp_id(long ops_temp_id) {
		this.ops_temp_id = ops_temp_id;
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
	public Date getFlt_date() {
		return flt_date;
	}
	public void setFlt_date(Date flt_date) {
		this.flt_date = flt_date;
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
	public double getWgt() {
		return wgt;
	}
	public void setWgt(double wgt) {
		this.wgt = wgt;
	}
	public Integer getIs_sent() {
		return is_sent;
	}
	public void setIs_sent(Integer is_sent) {
		this.is_sent = is_sent;
	}
	public String getCa_id()
	{
		return ca_id;
	}
	public void setCa_id(String ca_id)
	{
		this.ca_id = ca_id;
	}
	
}
