package de.act.common.interfaces.usermodule;

import java.util.List;

import de.act.common.interfaces.IAction;
import de.act.common.types.formulars.IFormularMain;
import de.act.common.types.nonstaticobjects.RFDelivery;
import de.act.common.types.nonstaticobjects.RFDeliveryNotification;
import de.act.common.types.nonstaticobjects.RFNotification;
import de.act.common.types.nonstaticobjects.RFRt;
import de.act.common.types.staticobjects.RSAdd;
import de.act.common.types.views.DeliveryNotificationData;

public interface IDeliveryNotificationAction extends IAction{
	/**
	 * get DeliveryNotification data by AWB number	 
	 * @param String AWB Number	 
	 * @return RFDeliveryNotification object
	 */
	RFDeliveryNotification getDeliverNotificationByAwbNo(String awbNo);
	
	public RFDeliveryNotification getDeliverNotificationForCargoImp(String awbNo);
	
	/**
	 * save new notification	 
	 * @param RFNotification notification	
	 * @param String f_id
	 * @param String consAddId  
	 * @return Boolean value
	 */
	Boolean createNotification(RFNotification notification, String f_id);
	
	/**
	 * save new delivery	 
	 * @param RFDelivery delivery	 
	 * @param String f_id
	 * @param String consAddId
	 * @return Boolean value
	 */
	Boolean createDelivery(RFDelivery delivery, String f_id);
	
	/**
	 * get Address details	 
	 * @param Long addressId	 
	 * @return RSAdd object
	 */
	RSAdd getAddressbyId(Integer addressId);
	
	/**
	 * get all Notification and Delivery data	  
	 * @param String awbNo
	 * @return DeliveryNotificationData object
	 */
	DeliveryNotificationData getAllDeliveryAndNotification(String awbNo);
	
	/**
	 * get Address details	 
	 * @param Long addressId	 
	 * @return List of RSAdd
	 */
	List<RSAdd> getListAddressbyName(String addressName);
	
//	public boolean checkCustomClearance(String awbNo);
//	
//	public Boolean checkCustomClearanceFormular(IFormularMain formular);
	
	public String checkCustomFormular(IFormularMain formular);
	public List<RFRt> checkCustom(IFormularMain formular);
	public String checkCountryForTax(IFormularMain formular);
	public Integer checkVAT(IFormularMain formular);
	public String checkCustomVAT(IFormularMain formular);	
	public String sendEmailNotification(String emailAddr, String body);
}
