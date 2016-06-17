/**
 * 
 */
package de.act.common.exceptions;

import de.act.common.types.UserObject;

/**
 * @author User
 * @version 1.0 18.06.2007
 */
public class UserExistException extends RuntimeException {

	private static final long serialVersionUID = 9189827501578554904L;
	private UserObject user;

	public UserExistException(String string, UserObject object) {
		super(string);
		this.user = object;
	}

	public UserObject getUser() {
		return this.user;
	}
}
