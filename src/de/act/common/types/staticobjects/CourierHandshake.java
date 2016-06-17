package de.act.common.types.staticobjects;

import java.io.Serializable;
import java.util.Date;

import de.act.central.types.Attachment;
import de.act.common.types.attachment.CAbstractAttachment;
import de.act.common.types.nonstaticobjects.RFForm;

public class CourierHandshake implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7895353247229619937L;
	

	private Long handshake_id;
	private String generatedCode;
	private Date updatedOn;
	private String type;
	public static String TYPE_PICKUP = "cur_p";
	public static String TYPE_DELIVER = "cur_d";
	
	private RSAddID user;
	private Attachment attachment;
	private RFForm form;
	
	public String getGeneratedCode() {
		return generatedCode;
	}
	public void setGeneratedCode(String generatedCode) {
		this.generatedCode = generatedCode;
	}
	public Date getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}
	public Long getHandshake_id() {
		return handshake_id;
	}
	public void setHandshake_id(Long handshake_id) {
		this.handshake_id = handshake_id;
	}
	public Attachment getAttachment() {
		return attachment;
	}
	public void setAttachment(Attachment attachment) {
		this.attachment = attachment;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public RSAddID getUser() {
		return user;
	}
	public void setUser(RSAddID user) {
		this.user = user;
	}
	public RFForm getForm() {
		return form;
	}
	public void setForm(RFForm form) {
		this.form = form;
	}
	
	
}
