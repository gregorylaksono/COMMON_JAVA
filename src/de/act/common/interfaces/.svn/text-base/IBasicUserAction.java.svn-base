package de.act.common.interfaces;
import java.util.List;
import java.util.Map;

import de.act.common.types.SendType;
import de.act.common.types.User;
import de.act.common.types.UserObject;
import de.act.common.types.formulars.FormularType;
import de.act.common.types.formulars.IFormularMain;
import de.act.common.types.handling.AManifest;
import de.act.common.types.localobjects.IconFolder;
import de.act.common.types.localobjects.RDDefault;
import de.act.common.types.nonstaticobjects.RFForm;
import de.act.common.types.staticobjects.RSAc;
import de.act.common.types.staticobjects.RSAdd;

/**
 * Userspecific basic methods
 * @author Martin Sachs
 * @since 1.0 - 19.07.2006
 */
public interface IBasicUserAction extends IAction {
	/**
	 * get the Desktop with all Folders for the logged in user.
	 * @author Martin Sachs
	 * @param user 
	 * @since 16.02.2006
	 * @return IconFolder
	 */
	public abstract IconFolder getDesktop();

	/** 
	 * get the defaults for the actual user. 
	 * @author Martin Sachs
	 * @since 1.0 - 20.10.2006
	 * @return RDDefault
	 */
	public abstract RDDefault getDefaults();

	/**
	 * Send the Formular ID to the Blackbox-Clients. This method should not
	 * send data to the CentralServer.
	 * The clients take the formular ids and update themself.
	 * @author Martin Sachs
	 * @param form
	 * @param sendType TODO
	 * @since 15.02.2006
	 * @return true, if succeed
	 */
	public abstract boolean sendSave(final RFForm forms, final SendType sendType);
	
	public abstract boolean sendSaveAc(final RSAc forms, final SendType sendType);

	/**
	 * Send the Formular ID to the Blackbox-Clients. This method should not
	 * send data to the CentralServer.
	 * The clients take the formular ids and update themself.
	 * @author Martin Sachs
	 * @since 15.02.2006
	 * @param forms
	 * @return true, if succeed
	 */
	public abstract boolean sendUpdate(final RFForm forms);
	/**
	 * send a String message to all user on this blackbox
	 * @author Martin Sachs
	 * @since 1.0 - 20.10.2006
	 * @param text - Text to send 
	 * @return boolean
	 */
	public abstract boolean sendText(final String text);
	/**
	 * Creates a Formularmodel for specified FormularType (SLI,DGR,AVI ...) if mainform==null
	 * a new MainFormular will created. If mainform!=null a formular will added to
	 * the MainFormular container.
	 * The Server dont store a Referenz of the Formular.
	 * @author Martin Sachs
	 * @since 07.03.2006
	 * @param type
	 * @param mainform
	 * @return the Serialized Formular
	 */
	public abstract IFormularMain createAddFormular(final FormularType type, final IFormularMain mainform);
	/**
	 * @author Martin Sachs
	 * @since 09.03.2006
	 * @param t
	 * @return
	 */
	public IFormularMain createAddFormular(FormularType t);
	/**
	 * get the hole formulars for one f_id from the database
	 * @author Martin Sachs
	 * @since 1.0 - 20.10.2006
	 * @param formId
	 * @return IFormularMain
	 */
	public abstract IFormularMain getMainFormular(final String formId);
	/**
	 * Send and save a manifest V/O or closeout 
	 * @author Martin Sachs
	 * @since 1.0 - 20.10.2006
	 * @param maniret - Manifestdata
	 * @param type - SendType of this request
	 * @return boolean
	 */
	public abstract boolean sendSave(final AManifest maniret, final SendType type);
	/**
	 * get the formularInfomationobject
	 * @author Martin Sachs
	 * @since 1.0 - 20.10.2006
	 * @param f_id
	 * @return RFForm
	 */
	public abstract RFForm getFormularInformation(String f_id);

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 15.02.2007
	 * @param caNo - 
	 * @param awbSeq - 
	 * @param awbNo -
	 * @return String - f_id  
	 */
	public abstract RFForm getFidByAwbNo(String caNo, Integer awbSeq, Integer awbNo);

	/**
	 * get the current userobject to change details 
	 * @return
	 */
	public UserObject getCurrentUser();
	
	public Boolean storeUserDetails(UserObject userobj);

	public abstract RSAdd getUserAddress();
	
	public String getUserCAID();
	
	public String getUserCA2LC();

	public Map getDefaultSignatureForAWB();
	
	public String getUserNameForAWB();
	
	public String getDefaultAirport();
	
	public List<String> getAuthorizedAirport();
	
	public String getUserAuthority();
	
	public Long getNextDBSeq();
	
	public List<RSAdd> getAllCompanyAddress();
	
	public Map<String, List<String>> getUserAttributeWithRules();
	
	public Map<String, List<String>> getUserAttributeWithRulesByRId(Long r_id);
	
	public Boolean updateUserStatusLogin();
	
	public Boolean updateUserStatusLogout();
	
	public abstract RDDefault getDefaults(Integer addId);
	
	public abstract boolean sendSave(final RFForm forms, final SendType sendType, User user);
	
	RSAdd getAddress(String companyName);
	
}