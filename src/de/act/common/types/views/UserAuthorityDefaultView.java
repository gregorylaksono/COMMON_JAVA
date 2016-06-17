/**
 * 
 */
package de.act.common.types.views;

import java.io.Serializable;

/**
 * @author Henry
 *
 */
public class UserAuthorityDefaultView implements Serializable{

	private static final long serialVersionUID = 4418381927729041959L;
	private String role_id;
	private String role_name;
	private String auth_id;
	private String caption;
	private String right_id;
	private String right_name;

	public String getRole_id() {
		return role_id;
	}

	public void setRole_id(String role_id) {
		this.role_id = role_id;
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	public String getAuth_id() {
		return auth_id;
	}

	public void setAuth_id(String auth_id) {
		this.auth_id = auth_id;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String getRight_id() {
		return right_id;
	}

	public void setRight_id(String right_id) {
		this.right_id = right_id;
	}

	public String getRight_name() {
		return right_name;
	}

	public void setRight_name(String right_name) {
		this.right_name = right_name;
	}
}
