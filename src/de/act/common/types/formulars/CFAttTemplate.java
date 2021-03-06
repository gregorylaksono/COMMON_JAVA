/**
 * 
 */
package de.act.common.types.formulars;

import java.io.Serializable;

/**
 * @author Henry
 *
 */
public class CFAttTemplate implements Serializable{

	private static final long serialVersionUID = -7846634867470441777L;
	private Integer att_id;
	private String f_id;
	private String att_type;
	private int att_no;
	private Integer add_id;
	private char auth;
	private String sign;

	public Integer getAtt_id() {
		return att_id;
	}

	public void setAtt_id(Integer att_id) {
		this.att_id = att_id;
	}

	public String getF_id() {
		return f_id;
	}

	public void setF_id(String f_id) {
		this.f_id = f_id;
	}

	public String getAtt_type() {
		return att_type;
	}

	public void setAtt_type(String att_type) {
		this.att_type = att_type;
	}

	public int getAtt_no() {
		return att_no;
	}

	public void setAtt_no(int att_no) {
		this.att_no = att_no;
	}

	public Integer getAdd_id() {
		return add_id;
	}

	public void setAdd_id(Integer add_id) {
		this.add_id = add_id;
	}

	public char getAuth() {
		return auth;
	}

	public void setAuth(char auth) {
		this.auth = auth;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}
}
