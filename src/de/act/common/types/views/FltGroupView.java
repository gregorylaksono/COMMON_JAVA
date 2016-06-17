package de.act.common.types.views;

public class FltGroupView implements java.io.Serializable{

	private static final long serialVersionUID = 5988826068756333780L;
	private Long flt_group;
	private String dept;
	private String dest;

	public Long getFlt_group() {
		return flt_group;
	}
	
	public void setFlt_group(Long flt_group) {
		this.flt_group = flt_group;
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
}
