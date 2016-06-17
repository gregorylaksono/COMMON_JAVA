package de.act.common.types.views;

import java.io.Serializable;
import java.util.Date;

public class ReportPerdayView implements Serializable{

	private static final long serialVersionUID = 5585760214339495546L;
	private Long flt_id;
	private String dept;
	private String dest;
	private int schedule;
	private String flt;
	private int perday;
	private double total_wgt;
	private Date date;
	private Double mmt;
	private String caId;
	
	public Long getFlt_id() {
		return flt_id;
	}
	public void setFlt_id(Long flt_id) {
		this.flt_id = flt_id;
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
	public int getSchedule() {
		return schedule;
	}
	public void setSchedule(int schedule) {
		this.schedule = schedule;
	}
	public String getFlt() {
		return flt;
	}
	public void setFlt(String flt) {
		this.flt = flt;
	}
	public int getPerday() {
		return perday;
	}
	public void setPerday(int perday) {
		this.perday = perday;
	}
	public double getTotal_wgt() {
		return total_wgt;
	}
	public void setTotal_wgt(double total_wgt) {
		this.total_wgt = total_wgt;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Double getMmt()
	{
		return mmt;
	}
	public void setMmt(Double mmt)
	{
		this.mmt = mmt;
	}
	public String getCaId() {
		return caId;
	}
	public void setCaId(String caId) {
		this.caId = caId;
	}
	
}
