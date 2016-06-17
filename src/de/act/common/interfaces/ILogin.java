package de.act.common.interfaces;

/**
 * This is the only entry point for the client to the blackbox.
 *
 * @author OB
 */
public interface ILogin {

	/**
	 * Login a user to the blackbox and return a session object.
	 * Every login returns a new distinct session object.
	 *
	 * @param user   the user to login.
	 * @param passwd the users password.
	 *
	 * @return a session object for the user.
	 */
	ISession login(String user, String passwd);

}