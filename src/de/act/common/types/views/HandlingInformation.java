package de.act.common.types.views;

public class HandlingInformation implements java.io.Serializable{
	public HandlingInformation(){}
	
	private String id;
	private String name;
	private String used_by;
	private Integer seq;
	private String remark;
	private String fId;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsed_by() {
		return used_by;
	}
	public void setUsed_by(String used_by) {
		this.used_by = used_by;
	}
	public Integer getSeq() {
		return seq;
	}
	public void setSeq(Integer seq) {
		this.seq = seq;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getfId() {
		return fId;
	}
	public void setfId(String fId) {
		this.fId = fId;
	}
	
}
