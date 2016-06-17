/**
 * @author 
 * @since 08.02.2013
 */
package de.act.common.types.staticobjects;

import java.io.Serializable;

public class RSBookingListMailRules implements Serializable {

	private static final long serialVersionUID = -6934395762926086099L;
	private Long id;
	private Integer add_reply_email_no;
	private String ca2lc;
	private String ca_id;
	private String dept;
	private String dest;
	private Integer basis;
	private Integer alert_time;
	private RSAddReplyEmail rsare;
	
	//id
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	//add_reply_email_no
	public Integer getAdd_reply_email_no() {
		return add_reply_email_no;
	}
	public void setAdd_reply_email_no(Integer add_reply_email_no) {
		this.add_reply_email_no = add_reply_email_no;
	}
	//ca2lc
	public String getCa2lc() {
		return ca2lc;
	}
	public void setCa2lc(String ca2lc) {
		this.ca2lc = ca2lc;
	}
	//ca_id
	public String getCa_id() {
		return ca_id;
	}
	public void setCa_id(String ca_id) {
		this.ca_id = ca_id;
	}
	//dept
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	//dest
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	//basis
	public Integer getBasis() {
		return basis;
	}
	public void setBasis(Integer basis) {
		this.basis = basis;
	}
	//alert_time
	public Integer getAlert_time() {
		return alert_time;
	}
	public void setAlert_time(Integer alert_time) {
		this.alert_time = alert_time;
	}
	//rsare
	public RSAddReplyEmail getRsare() {
		return rsare;
	}
	public void setRsare(RSAddReplyEmail rsare) {
		this.rsare = rsare;
	}
}
