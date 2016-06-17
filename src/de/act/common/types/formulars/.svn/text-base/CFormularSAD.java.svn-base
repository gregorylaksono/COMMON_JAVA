package de.act.common.types.formulars;

import java.io.Serializable;

import de.act.common.types.nonstaticobjects.RFStick;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class CFormularSAD extends CAbstractFormular implements Serializable{
	/**
	 * @author Admin
	 * @since 14.03.2006
	 */
	private static final long serialVersionUID = 3042500622297379419L;
	private RFStick sticker;

	public CFormularSAD() {
		super(FormularType.SAD);
	}

	public CFormularSAD(IFormularMain mainform) {
		super(FormularType.SAD,mainform);
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
