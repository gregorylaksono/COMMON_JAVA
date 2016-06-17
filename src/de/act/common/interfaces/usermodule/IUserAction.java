/**
 * 
 */
package de.act.common.interfaces.usermodule;

import java.util.List;

import de.act.common.interfaces.IAction;
import de.act.common.types.UserObject;
import de.act.common.types.localobjects.RDDefault;

/**
 * Usermanagement 
 * @note the current user can only handle users, who are 
 * associated to the current company
 * @author MS
 * @version 1.0 15.06.2007
 */
public interface IUserAction extends IAction {

	//public UserObject getUserById(String id);
	
	public UserObject getUserById();
	
	public UserObject getUserByEmail(String email);
	
	public List<UserObject> getUserByCompany();  

	public Boolean createUser(UserObject user);
	
	public Boolean editUser(UserObject user);
	
	public Boolean deleteUser(UserObject user);
	
	public Boolean storeDefault(UserObject uo, RDDefault defaultData);
	
	public Boolean updateUserStatusLogin(String user);

}
