package de.act.common.types.nonstaticobjects;

import java.io.Serializable;


/**
 * this is the class persistence for fDeliveryView.hbm.xml mapper.
 * @author soultani 
 */

@org.jboss.cache.aop.annotation.PojoCacheable
public class RFDeliveryView implements Serializable{

	
	//{Private field	
	private static final long serialVersionUID = 3463040938640243926L;	
	private String awbNo;
	private Long attId;
	private RFDelivery deliveryData;
	//}
	
	//{Constructor
	public RFDeliveryView(){
		
	}
	//}	
	
	//{Public Property	
	public String getAwbNo() {
		return awbNo;
	}

	public void setAwbNo(String awbNo) {
		this.awbNo = awbNo;
	}

	public RFDelivery getDeliveryData() {
		return deliveryData;
	}

	public void setDeliveryData(RFDelivery deliveryData) {
		this.deliveryData = deliveryData;
	}

	public Long getAttId()
	{
		return attId;
	}

	public void setAttId(Long attId)
	{
		this.attId = attId;
	}
	
	
	//}	
}
