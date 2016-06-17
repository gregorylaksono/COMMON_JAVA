/**
 * 
 */
package de.act.common.types;

import java.io.Serializable;

/**
 * @author Henry
 *
 */
public class Auth implements Serializable{

	private static final long serialVersionUID = -3141847975823765028L;
	private Integer auth_id;
	private Role role;
	private String auth_name;
	private String caption;

	public Integer getAuth_id() {
		return auth_id;
	}

	public void setAuth_id(Integer auth_id) {
		this.auth_id = auth_id;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getAuth_name() {
		return auth_name;
	}

	public void setAuth_name(String auth_name) {
		this.auth_name = auth_name;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}
}
