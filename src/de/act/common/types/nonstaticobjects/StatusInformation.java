package de.act.common.types.nonstaticobjects;

import java.io.Serializable;
import java.util.Date;

public class StatusInformation implements Serializable{

	private static final long serialVersionUID = -8909598465543891193L;
	private String status;
	private Date date;
	private String remark;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
