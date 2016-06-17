/**
 * @author Admin
 * @since 04.04.2006
 */
package de.act.common.types.formulars;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import de.act.common.types.attachment.CAcceptanceAttachment;
import de.act.common.types.attachment.CAviAttachment;
import de.act.common.types.attachment.CAviCheckAttachment;
import de.act.common.types.attachment.CAwbAttachment;
import de.act.common.types.attachment.CBookingAttachment;
import de.act.common.types.attachment.CDeliveryAttachment;
import de.act.common.types.attachment.CDgrAttachment;
import de.act.common.types.attachment.CNotifyAttachment;
import de.act.common.types.attachment.CSadAttachment;
import de.act.common.types.attachment.CSliAttachment;

/**
 * @author Martin Sachs
 * @since 1.0 - 18.12.2006
 */
public abstract class CAbstractFormular implements Serializable, IFormulars {

	private static final long 	serialVersionUID 	= -3771933205477476289L;
	private IAttachment			metadata;
	private IFormularMain		mainFormular;
	private Long				id					= -1L;	// att_id
	private FormularType		type;
	private List<FormularError>	errorList 			= new ArrayList<FormularError>();

	public CAbstractFormular() {
		
	}

	protected CAbstractFormular(FormularType type) {
		this.type = type;
		switch(type){
		case AWB:
			this.metadata = new CAwbAttachment();
			break;
		case AVI:
			this.metadata = new CAviAttachment();
			break;
		case DGR:
			this.metadata = new CDgrAttachment();
			break;
		case SLI:
			this.metadata = new CSliAttachment();
			break;
		case BKG:
			this.metadata = new CBookingAttachment();
			break;
		case SAD:
			this.metadata = new CSadAttachment();
			break;
		case AVICHECK:
			this.metadata = new CAviCheckAttachment();
			break;
		case ACCEPTANCE:
			this.metadata = new CAcceptanceAttachment();
			break;
		case DELIVERY:
			this.metadata = new CDeliveryAttachment();
			break;	   
		case NOTIFY:
			this.metadata = new CNotifyAttachment();
			break;	   }
	}

	public CAbstractFormular(FormularType sli, IFormularMain mainform) {
		this(sli);
		this.mainFormular = mainform;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public IFormularMain getMainFormular() {
		return mainFormular;
	}
	
	public void setMainFormular(IFormularMain mainFormular) {
		this.mainFormular = mainFormular;
	}

	public IAttachment getMetadata() {
		return metadata;
	}

	public void setMetadata(IAttachment metadata) {
		this.metadata = metadata;
	}

	public FormularType getType() {
		return type;
	}

	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj instanceof CAbstractFormular){
			CAbstractFormular avi = (CAbstractFormular) obj;
			if (this.metadata != null && avi.getMetadata() != null){
				return avi.getMetadata().equals(this.metadata);
			}
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		if (this.metadata != null){
			return this.metadata.hashCode() * 37;
		}
		return super.hashCode();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.act.common.types.formulars.IFormulars#getDisplayable()
	 */
	public Boolean getDisplayable() {
		return metadata.isDisplayable();
	}

	public List<FormularError> getErrorList() {
		return errorList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.act.common.types.formulars.IFormulars#isWriteable()
	 */
	public boolean isWriteable() {
		return this.metadata.isWriteable();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.act.common.types.formulars.IFormulars#isSendable()
	 */
	public boolean isSendable() {
		return this.metadata.isSendable();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.act.common.types.formulars.IFormulars#setAuthState(java.lang.String)
	 */
	public void setAuthState(String string) {
		this.metadata.setAuth(string);
	}
}
