/**
 * 
 */
package de.act.common.types;

import java.io.Serializable;

/**
 * @author Henry
 *
 */
public class AuthRightDefault implements Serializable{

	private static final long serialVersionUID = -6729867311092573239L;
	private Integer auth_right_default_id;
	private Auth auth;
	private Right right;
	//private String auth_id;
	//private String right_id;

	public Integer getAuth_right_default_id() {
		return auth_right_default_id;
	}

	public void setAuth_right_default_id(Integer auth_right_default_id) {
		this.auth_right_default_id = auth_right_default_id;
	}

	public Auth getAuth() {
		return auth;
	}

	public void setAuth(Auth auth) {
		this.auth = auth;
	}

	public Right getRight() {
		return right;
	}

	public void setRight(Right right) {
		this.right = right;
	}
}
