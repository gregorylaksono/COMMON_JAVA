/**
 * 
 */
package de.act.common.interfaces.airlinemodule;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import de.act.common.interfaces.IAction;
import de.act.common.types.UserObject;
import de.act.common.types.staticobjects.RSAdd;
import de.act.common.types.staticobjects.RSAddAdd;
import de.act.common.types.staticobjects.RSAddCAAccount;
import de.act.common.types.staticobjects.RSAddCAAccountKickback;
import de.act.common.types.staticobjects.RSAddName;
import de.act.common.types.staticobjects.RSAddReplyEmail;
import de.act.common.types.staticobjects.RSAp;
import de.act.common.types.staticobjects.RSBookingListMailRules;
import de.act.common.types.staticobjects.RSCo;
import de.act.common.types.staticobjects.RSDi;
import de.act.common.types.views.UserAuthorityView;

/**
 * @author Henry
 *
 */
public interface IPreferenceAddressAction extends IAction{
	
	HashMap<Boolean, Integer> saveAgentAddress(RSAdd rsa, UserObject uo, List<UserAuthorityView> listUserAuth);
	
	HashMap<Boolean, Integer> saveAgentAddressWithCreatorId(RSAdd rsa);
	
	Integer deleteAddress(Integer add_id);
	
	Integer saveAddress(RSAdd rsa);
	
	Integer SaveEmailReplies(ArrayList<RSAddReplyEmail> rSAddREList);
	
	Integer saveBookingListMailRules(ArrayList<RSBookingListMailRules> RSBLMailRules);
	
	Integer saveAddressWithCreatorId(RSAdd rsa);
	
	HashMap<Integer, RSAdd> saveAddressAWB(RSAdd rsa);
	
	Integer updateAddressParent(RSAdd rsa);
	
	Integer updateAddressBranch(RSAdd rsa);
	
	/*Rony - 20140610*/
	Integer updateAddressBranchWithoutParentId(RSAdd rsa);
	
	List<RSAddReplyEmail> getDiscrEmailAddressList();
	
	Map getEmailAddressList();
	
	List<RSAdd> getAllAddress();
	
	List<RSAdd> getAddressByID(Integer add_id);
	
	List<RSAdd> getAddressByCompanyNameMatch(String match);
	
	List<RSAddName> getAddressForAgent();
	
	List<RSAddName> getAddressByMatch(String match, String ap_3lc);
	
	List<RSAddName> getAddressByMatchAndUserAirport(String match);
	
	List<RSAddName> getAddressByMatch(String match);
	
	List<RSAddName> getFreightForwarderAddressByMatch(String match);
	
	List<RSAddName> getFreightForwarderAddressByNameAndAirportMatch(String match, String airport);
	
	List<RSCo> getAllCountry();
	
	List<RSAp> getAllAirport();
	
	List<RSDi> getDistrictByCountry(String co_2lc);

	List<RSCo> getAllCountryByMatch(String match);
	
	List<RSAp> getAllAirportByMatch(String match);
	
	List<RSDi> getDistrictByCountryByMatch(String co_2lc, String match);

	UserObject getSavedData();
	
	Integer updateCAAccount(RSAddCAAccount caAccount);	

	//	Integer getAgentByID(String ID);
	//	Integer getCountryByID(String co_2lc);
	//	Integer getNextAddressID();
	
	/* Added for Address Management */
	List<RSAdd> getAddressByUserId();
	HashMap<Integer, RSAdd> saveAddressManagement(RSAdd rsa);
	
	Integer deleteAddressManagement(Integer add_id);
	
	List<RSAdd> getAddressAndKickbackByUserId();
	Integer save(List<RSAddCAAccountKickback> list);
	Integer deleteKickback(Integer kickback, Integer add_id);
	List<RSAddCAAccount> getAllAccNo();
	
	List<RSAdd> getAddressAndKickbackByCompany(String company);
	List<RSAdd> getAddressAndKickbackByUserType(String userType);
	List<RSAdd> getAddressAndKickbackByAirport(String airport);
	List<RSAdd> getAddressAndKickbackByAccountNo(String accountNo);
	
	List<RSAddAdd> getAddByID(Integer addID);
}
