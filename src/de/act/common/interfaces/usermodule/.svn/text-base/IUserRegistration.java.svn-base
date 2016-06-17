/**
 * 
 */
package de.act.common.interfaces.usermodule;

import java.util.List;

import de.act.common.interfaces.IAction;
import de.act.common.types.UserObject;
import de.act.common.types.staticobjects.RCAdd;
import de.act.common.types.staticobjects.RCAddConf;
import de.act.common.types.staticobjects.RSAdd;
import de.act.common.types.views.UserAuthorityView;

/**
 * @author Henry
 *
 */
public interface IUserRegistration extends IAction{

	List<RCAdd> getAllUSerRegistration();
	
	List<RCAdd> getUserRegistrationHistory();
	
	List<RCAdd> getAllUserRegistrationHistory();
	
	Integer rejectUserRegistration(RCAdd cadd);
	
	Integer disapproveUserRegistration(RCAddConf conf);
	
	Integer acceptUserRegistration(RCAdd cadd, UserObject uo, List<UserAuthorityView> listUserAuth, String blackboxID);
	
	Integer approveUserRegistration(RCAddConf conf, UserObject uo, List<UserAuthorityView> listUserAuth, String blackboxID);
	
	Integer sendUserRegistrationToCentral(RCAdd rca);
	
}
