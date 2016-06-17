/**
 * 
 */
package de.act.common.interfaces.usermodule;

import java.util.List;
import java.util.Map;

import de.act.common.interfaces.IAction;
import de.act.common.types.Right;
import de.act.common.types.UserObject;
import de.act.common.types.ruleobject.RBase;
import de.act.common.types.views.UserAuthorityDefaultView;
import de.act.common.types.views.UserAuthorityView;

/**
 * @author Henry
 *
 */
public interface IPreferenceUserAction extends IAction{

	List<UserObject> listUser();
	
	List<Right> rightHeader();
	
	List<UserAuthorityDefaultView> getDefaultAuthority();
	
	List<UserAuthorityDefaultView> getDefaultAuthorityByType(String type);
	
	List<UserAuthorityView> getUserAuthority(String user_id);

	Integer getNextUserID();

	Integer updateUser(UserObject uo, List<UserAuthorityView> listUserAuth, List<RBase> ruleList);
	
	Integer deleteUser(UserObject userObject);
	
	Integer saveUser(UserObject userObject, List<UserAuthorityView> listUserAuth, List<RBase> ruleList);
	
	Boolean saveDUser(UserObject uo, Integer add_id);
	
	UserObject getUserObject();
	Boolean isUserObjectExist(String userName);
	Integer updateUserPreferenceScheduler(Map<String,Integer> data);
	/*Integer deleteDAuthRight(String user_id);
	Integer deleteDUserAuth(String user_id);
	Integer insertDUserAuth(UserAuth userAuth);
	Integer insertDAuthRight(List<AuthRight> listAuthRight);
	Integer updateDUser(UserObject userObject);*/
}
