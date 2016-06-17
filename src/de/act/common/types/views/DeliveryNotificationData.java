package de.act.common.types.views;

import java.io.Serializable;
import java.util.List;

import de.act.common.types.nonstaticobjects.RFDelivery;
import de.act.common.types.nonstaticobjects.RFNotification;

/**
 * this is the class persistence only for hold all Notification and delivery Data
 * @author soultani
 *
 */
@org.jboss.cache.aop.annotation.PojoCacheable
public class DeliveryNotificationData  implements Serializable{
		
	//{ Private Field
	private static final long serialVersionUID = 5918862922095482934L;
	private List<RFNotification> liNotification;
	private List<RFDelivery> liDelivery;
	//}
	
	//{ Constructor
	public DeliveryNotificationData(){
		
	}
	
	public DeliveryNotificationData(List<RFNotification> liNotification, List<RFDelivery> liDelivery){
		this.setLiNotification(liNotification);
		this.setLiDelivery(liDelivery);
	}
	//}	
	
	//{ Public Property
	public List<RFNotification> getLiNotification() {
		return liNotification;
	}

	public void setLiNotification(List<RFNotification> liNotification) {
		this.liNotification = liNotification;
	}

	public List<RFDelivery> getLiDelivery() {
		return liDelivery;
	}

	public void setLiDelivery(List<RFDelivery> liDelivery) {
		this.liDelivery = liDelivery;
	}
	//}	
}
