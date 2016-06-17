package de.act.common.types.views;

import java.io.Serializable;
import java.util.Date;

public class ReportView1 implements Serializable{

	private static final long serialVersionUID = 5585760214339495546L;
	private String flt_id;
	private Date date;
	private String flt;
	private String wgt;
	private String dest;
	
	public String getFlt_id() {
		return flt_id;
	}
	public void setFlt_id(String flt_id) {
		this.flt_id = flt_id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getFlt() {
		return flt;
	}
	public void setFlt(String flt) {
		this.flt = flt;
	}

	public String getWgt() {
		return wgt;
	}
	public void setWgt(String wgt) {
		this.wgt = wgt;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
		
}
