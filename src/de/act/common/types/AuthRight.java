/**
 * 
 */
package de.act.common.types;

import java.io.Serializable;

/**
 * @author Henry
 *
 */
public class AuthRight implements Serializable{

	private static final long serialVersionUID = 6678989900627158995L;
	private Integer auth_right_id;
	private UserAuth userAuth;
	private Right right;

	public Integer getAuth_rught_id() {
		return auth_right_id;
	}

	public void setAuth_right_id(Integer auth_right_id) {
		this.auth_right_id = auth_right_id;
	}

	public UserAuth getUserAuth() {
		return userAuth;
	}

	public void setUserAuth(UserAuth userAuth) {
		this.userAuth = userAuth;
	}

	public Right getRight() {
		return right;
	}

	public void setRight(Right right) {
		this.right = right;
	}
}
