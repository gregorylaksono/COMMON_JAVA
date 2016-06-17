package de.act.common.types.formulars;

import java.io.Serializable;

import de.act.common.types.nonstaticobjects.RFStick;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class CFormularNotoc extends CAbstractFormular implements Serializable{

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 14.12.2006
	 */
	private static final long serialVersionUID = -4065485409968087536L;
	private RFStick sticker;
	
	public CFormularNotoc() {
		super(FormularType.NOTOC);
	}

	public CFormularNotoc(IFormularMain mainform) {
		super(FormularType.NOTOC,mainform);
	}

	public RFStick getSticker() {
		return sticker;
	}

	public void setSticker(RFStick sticker) {
		this.sticker = sticker;
	}
	/* (non-Javadoc)
	 * @see de.act.common.types.formulars.IFormulars#checkMendetoryFields()
	 */
	public boolean checkMendetoryFields() {
		return true;
	}
}
