package de.act.common.types.staticobjects;

import de.act.common.types.views.AddressView;

public class Partnership implements java.io.Serializable{
	/* 	Status :
	 * 		0 = Request
	 * 		1 = Accept
	 * 		2 = Reject
	 */
	
	/*	Payment Type :
	 * 		0 = Cash / Transfer
	 * 		1 = Credit
	 * 		2 = Deposit
	 * 		3 = Credit Card
	 */

	
	private static final long serialVersionUID = -5392222431221930411L;
	private long partnershipId;
	private String caId;
	private long ffwAddId;
	private String accountNo;
	private String status;
	private String paymentType;
	private Double amountDeposit = 0.0;
	private RSVad vad;
	private String caIdDisplayName; 
	private String ffwDisplayName;
	private String currency;
	private String oldStatus;
	private AddressView address;
	private Double amountDepositActual = 0.0;
	private Double warningLimit = 0.0;
	private Double warningLimitDown = 0.0;
	
	public String getOldStatus() {
		return oldStatus;
	}
	public void setOldStatus(String oldStatus) {
		this.oldStatus = oldStatus;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCaIdDisplayName() {
		return caIdDisplayName;
	}
	public void setCaIdDisplayName(String caIdDisplayName) {
		this.caIdDisplayName = caIdDisplayName;
	}
	public String getFfwDisplayName() {
		return ffwDisplayName;
	}
	public void setFfwDisplayName(String ffwDisplayName) {
		this.ffwDisplayName = ffwDisplayName;
	}
	public long getPartnershipId() {
		return partnershipId;
	}
	public void setPartnershipId(long partnershipId) {
		this.partnershipId = partnershipId;
	}
	public String getCaId() {
		return caId;
	}
	public void setCaId(String caId) {
		this.caId = caId;
	}
	public long getFfwAddId() {
		return ffwAddId;
	}
	public void setFfwAddId(long ffwAddId) {
		this.ffwAddId = ffwAddId;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public Double getAmountDeposit() {
		return amountDeposit;
	}
	public void setAmountDeposit(Double amountDeposit) {
		this.amountDeposit = amountDeposit;
	}
	public RSVad getVad() {
		return vad;
	}
	public void setVad(RSVad vad) {
		this.vad = vad;
	}
	public AddressView getAddress()
	{
		return address;
	}
	public void setAddress(AddressView address)
	{
		this.address = address;
	}
	public Double getAmountDepositActual() {
		return amountDepositActual;
	}
	public void setAmountDepositActual(Double amountDepositActual) {
		this.amountDepositActual = amountDepositActual;
	}
	public Double getWarningLimit() {
		return warningLimit;
	}
	public void setWarningLimit(Double warningLimit) {
		this.warningLimit = warningLimit;
	}
	public Double getWarningLimitDown() {
		return warningLimitDown;
	}
	public void setWarningLimitDown(Double warningLimitDown) {
		this.warningLimitDown = warningLimitDown;
	}
	@Override
	public boolean equals(Object obj)
	{
		if(obj != null && obj instanceof Partnership)
		{
			Partnership bean = (Partnership)obj;
			if(bean.getPartnershipId() == this.getPartnershipId())
			{
				return true;
			}
		}
		
		return false;
	}
}
