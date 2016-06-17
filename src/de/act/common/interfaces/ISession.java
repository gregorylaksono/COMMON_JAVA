package de.act.common.interfaces;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import de.act.common.types.FormRight;
import de.act.common.types.User;

/**
 * This is the session object that the client gets when he logins a user.
 *
 * @author OB
 */
public interface ISession extends Serializable {

	/**
	 * Get the user who is owning this session.
	 *
	 * @return the user who is owning this session.
	 */
	User getUser();
	
	void setUser(User user);

	/**
	 * Returns the actions that are available in this session.
	 * The availability of actions depends on the rights of the user.
	 *
	 * @return the actions that are available in this session.
	 */
	Set<String> getAvailableActions();

	/**
	 * Returns the action with the requested name.
	 * Multiple requests with the same name give multiple distinct objects.
	 * A bean with this name has to be registered at the blackbox
	 * (in its config file). And the name must be the name of an authority
	 * that is assigned to the user in the database.
	 *
	 * @param name the name of the action to get.
	 *
	 * @return the action with the requested name.
	 */
	IAction getAction(String name);

	/**
	 * Returns all forms after the parameter date.
	 * If the date is null return all RFForm for current user.
	 * 
	 *  @param last Date of Documents
	 *  @return general formdata 
	 */

	// RFForm getNewForms(Date time);
	
	List<String> getAvailableForms();
	
	List<FormRight> getAvailableFormRight();
}