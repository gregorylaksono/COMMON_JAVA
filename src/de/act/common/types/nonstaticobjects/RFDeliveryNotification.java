package de.act.common.types.nonstaticobjects;

import java.io.Serializable;

import de.act.common.types.staticobjects.RSAdd;

/**
 * this is the class persistence for fDeliveryNotification.hbm.xml mapper.
 * @author soultani 
 */

@org.jboss.cache.aop.annotation.PojoCacheable
public class RFDeliveryNotification implements Serializable {
		
	//{ Private Field
	private static final long serialVersionUID = -5427376547367214393L;
	private String formId;
	private String awbNo;
	private Integer isBank; 
	private Integer isGoverment; 

	private RSAdd consigneAdd; 
	private RSAdd deliveryToAdd; 
	private RSAdd notifyAdd;	

	private Integer consigneAddId;
	private Integer deliveryToAddId;
	private Integer notifyAddId;		

	private Integer pcs; 
	private Integer pcsDeliveredToConsigne; 
	private Integer pcsDelivered; 
	private Integer totaPcs; 
	private Double weight; 
	private Double weightDelivered; 
	private String discrepancyStatus; 
	private String endDestinationPoint; 
	private String departure; 
	private String destination; 
	private String countryDeparture; 
	private String countryDestination; 
	private Integer statusCCAfChrgs; 
	private Integer statusCCOtChrgs; 
	private Double afChrgs; 
	private Double otChrgs; 
	private boolean needCustomClearance;
	//}
	
	//{ Constructor
	public RFDeliveryNotification(){
		
	}
	//}	
	
	//{ Public Property
	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}

	public String getAwbNo() {
		return awbNo;
	}

	public void setAwbNo(String awbNo) {
		this.awbNo = awbNo;
	}

	public Integer getIsBank() {
		return isBank;
	}

	public void setIsBank(Integer isBank) {
		this.isBank = isBank;
	}

	public Integer getIsGoverment() {
		return isGoverment;
	}

	public void setIsGoverment(Integer isGoverment) {
		this.isGoverment = isGoverment;
	}
	
	public Integer getConsigneAddId() {
		return consigneAddId;
	}

	public void setConsigneAddId(Integer consigneAddId) {
		this.consigneAddId = consigneAddId;
	}

	public Integer getDeliveryToAddId() {
		return deliveryToAddId;
	}

	public void setDeliveryToAddId(Integer deliveryToAddId) {
		this.deliveryToAddId = deliveryToAddId;
	}

	public Integer getNotifyAddId() {
		return notifyAddId;
	}

	public void setNotifyAddId(Integer notifyAddId) {
		this.notifyAddId = notifyAddId;
	}

	public RSAdd getConsigneAdd() {
		return consigneAdd;
	}

	public void setConsigneAdd(RSAdd consigneAdd) {
		this.consigneAdd = consigneAdd;
	}

	public RSAdd getDeliveryToAdd() {
		return deliveryToAdd;
	}

	public void setDeliveryToAdd(RSAdd deliveryToAdd) {
		this.deliveryToAdd = deliveryToAdd;
	}

	public RSAdd getNotifyAdd() {
		return notifyAdd;
	}

	public void setNotifyAdd(RSAdd notifyAdd) {
		this.notifyAdd = notifyAdd;
	}

	public Integer getPcs() {
		return pcs;
	}

	public void setPcs(Integer pcs) {
		this.pcs = pcs;
	}

	public Integer getPcsDeliveredToConsigne() {
		return pcsDeliveredToConsigne;
	}

	public void setPcsDeliveredToConsigne(Integer pcsDeliveredToConsigne) {
		this.pcsDeliveredToConsigne = pcsDeliveredToConsigne;
	}

	public Integer getPcsDelivered() {
		return pcsDelivered;
	}

	public void setPcsDelivered(Integer pcsDelivered) {
		this.pcsDelivered = pcsDelivered;
	}

	public Integer getTotaPcs() {
		return totaPcs;
	}

	public void setTotaPcs(Integer totaPcs) {
		this.totaPcs = totaPcs;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public String getDiscrepancyStatus() {
		return discrepancyStatus;
	}

	public void setDiscrepancyStatus(String discrepancyStatus) {
		this.discrepancyStatus = discrepancyStatus;
	}

	public String getEndDestinationPoint() {
		return endDestinationPoint;
	}

	public void setEndDestinationPoint(String endDestinationPoint) {
		this.endDestinationPoint = endDestinationPoint;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getCountryDeparture() {
		return countryDeparture;
	}

	public void setCountryDeparture(String countryDeparture) {
		this.countryDeparture = countryDeparture;
	}

	public String getCountryDestination() {
		return countryDestination;
	}

	public void setCountryDestination(String countryDestination) {
		this.countryDestination = countryDestination;
	}

	public Integer getStatusCCAfChrgs() {
		return statusCCAfChrgs;
	}

	public void setStatusCCAfChrgs(Integer statusCCAfChrgs) {
		this.statusCCAfChrgs = statusCCAfChrgs;
	}

	public Integer getStatusCCOtChrgs() {
		return statusCCOtChrgs;
	}

	public void setStatusCCOtChrgs(Integer statusCCOtChrgs) {
		this.statusCCOtChrgs = statusCCOtChrgs;
	}

	public Double getAfChrgs() {
		return afChrgs;
	}

	public void setAfChrgs(Double afChrgs) {
		this.afChrgs = afChrgs;
	}

	public Double getOtChrgs() {
		return otChrgs;
	}

	public void setOtChrgs(Double otChrgs) {
		this.otChrgs = otChrgs;
	}

	public boolean isNeedCustomClearance()
	{
		return needCustomClearance;
	}

	public void setNeedCustomClearance(boolean needCustomClearance)
	{
		this.needCustomClearance = needCustomClearance;
	}

	public Double getWeightDelivered()
	{
		return weightDelivered;
	}

	public void setWeightDelivered(Double weightDelivered)
	{
		this.weightDelivered = weightDelivered;
	}
	
	
	//}
	
	//{ Functionality
	//}
}
