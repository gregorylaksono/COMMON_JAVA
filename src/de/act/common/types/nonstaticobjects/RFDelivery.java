package de.act.common.types.nonstaticobjects;

import java.io.Serializable;
import java.util.Date;

import de.act.common.types.formulars.CFAttTemplate;
import de.act.common.types.staticobjects.RSAdd;

/**
 * this is the class persistence for fDelivery.hbm.xml mapper.
 * @author soultani 
 */

@org.jboss.cache.aop.annotation.PojoCacheable
public class RFDelivery implements Serializable {
	
	//{Private field
	private static final long serialVersionUID = 8048167745056975897L;
	private Integer attachmentId;
	private String awbNo;
	private Integer deliverAddressId;	
	private RSAdd deliverAddress;	
	private Integer pcs;
	private Double weight;
	private String recipientName;
	private String recipientSignature;
	private String customRefNo;
	private String bankReleaseNo;
	private String invoiceNo;
	private String userName;	
	private Date corr;
	private CFAttTemplate template;
	//}
	
	//{Constructor
	public RFDelivery(){		
		
	}
	//}
	
	//{Public Property
	public Integer getAttachmentId() {
		return attachmentId;
	}

	public void setAttachmentId(Integer attachmentId) {
		this.attachmentId = attachmentId;
	}
	
	public void setAwbNo(String awbNo) {
		this.awbNo = awbNo;
	}

	public String getAwbNo() {
		return awbNo;
	}
	
	public Integer getDeliverAddressId() {
		return deliverAddressId;
	}
	
	public RSAdd getDeliverAddress() {
		return deliverAddress;
	}

	public void setDeliverAddress(RSAdd deliverAddress) {
		this.deliverAddress = deliverAddress;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setDeliverAddressId(Integer deliverAddressId) {
		this.deliverAddressId = deliverAddressId;
	}

	public Integer getPcs() {
		return pcs;
	}

	public void setPcs(Integer pcs) {
		this.pcs = pcs;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public String getRecipientName() {
		return recipientName;
	}

	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}

	public String getRecipientSignature() {
		return recipientSignature;
	}

	public void setRecipientSignature(String recipientSignature) {
		this.recipientSignature = recipientSignature;
	}

	public String getCustomRefNo() {
		return customRefNo;
	}

	public void setCustomRefNo(String customRefNo) {
		this.customRefNo = customRefNo;
	}

	public String getBankReleaseNo() {
		return bankReleaseNo;
	}

	public void setBankReleaseNo(String bankReleaseNo) {
		this.bankReleaseNo = bankReleaseNo;
	}

	public String getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public Date getCorr() {
		return corr;
	}

	public void setCorr(Date corr) {
		this.corr = corr;
	}

	public CFAttTemplate getTemplate()
	{
		return template;
	}

	public void setTemplate(CFAttTemplate template)
	{
		this.template = template;
	}
	
	//}
	
}
