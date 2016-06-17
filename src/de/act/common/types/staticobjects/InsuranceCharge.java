package de.act.common.types.staticobjects;

import java.io.Serializable;

import de.act.common.types.attachment.CAbstractAttachment;
import de.act.common.types.nonstaticobjects.RFForm;

public class InsuranceCharge implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8034247781656729638L;
	
	private Long id;
	private CAbstractAttachment attachment;
	private String policyNo;
	private Double cost;
	private RFForm form;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public RFForm getForm() {
		return form;
	}
	public void setForm(RFForm form) {
		this.form = form;
	}
	public CAbstractAttachment getAttachment() {
		return attachment;
	}
	public void setAttachment(CAbstractAttachment attachment) {
		this.attachment = attachment;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

}