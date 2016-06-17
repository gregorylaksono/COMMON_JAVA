package de.act.common.types.views;

import java.io.Serializable;
import java.util.Date;

public class ReportForSendMailView implements Serializable{

	private static final long serialVersionUID = 5585760214339495546L;
	private Date date;
	private String flt_no;
	private double wgt;
	private String dept;
	private String dest;
	private String ca_2lc;
	private String ca_id;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getWgt() {
		return wgt;
	}
	public void setWgt(double wgt) {
		this.wgt = wgt;
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
	public String getFlt_no() {
		return flt_no;
	}
	public void setFlt_no(String flt_no) {
		this.flt_no = flt_no;
	}
	public String getCa_2lc() {
		return ca_2lc;
	}
	public void setCa_2lc(String ca_2lc) {
		this.ca_2lc = ca_2lc;
	}
	
	public String getCa_id()
	{
		return ca_id;
	}
	public void setCa_id(String ca_id)
	{
		this.ca_id = ca_id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ReportForSendMailView)
		{
			ReportForSendMailView bean = (ReportForSendMailView) obj;
			
			if(bean.getCa_2lc().equals(ca_2lc) && 
			   bean.getDate().equals(date) && 
			   bean.getDept().equals(dept) && 
			   bean.getDest().equals(dest) && 
			   bean.getFlt_no().equals(flt_no) &&
			   bean.getCa_2lc().equals(ca_2lc)){
				return true;
			}
		}
		return false;
	}
	
	public boolean equalsWithoutDate(Object obj) {
		if(obj instanceof ReportForSendMailView)
		{
			ReportForSendMailView bean = (ReportForSendMailView) obj;
			
			if(bean.getCa_2lc().equals(ca_2lc) && 
			   bean.getDept().equals(dept) && 
			   bean.getDest().equals(dest) && 
			   bean.getFlt_no().equals(flt_no) &&
			   bean.getCa_2lc().equals(ca_2lc)){
				return true;
			}
		}
		return false;
	}
}
