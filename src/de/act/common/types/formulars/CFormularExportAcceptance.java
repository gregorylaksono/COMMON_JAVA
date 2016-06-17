/**
 * @file MFormExportAcceptance.java
 * @package de.act.common.types.formulars
 * @since 02.12.2005 15:17:25
 * @author Martin Sachs
 */
package de.act.common.types.formulars;

import java.io.Serializable;
import java.util.List;

import de.act.common.types.handling.FAcceptance;
import de.act.common.types.handling.Shipments;
import de.act.common.types.nonstaticobjects.RFStick;

/**
 * MFormExportAcceptance.java:
 *
 * @since 02.12.2005
 * @author Martin Sachs
 *
 */
@org.jboss.cache.aop.annotation.PojoCacheable
public final class CFormularExportAcceptance extends CAbstractFormular implements Serializable{

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 12.06.2006
	 */
	private static final long serialVersionUID = -2119390439425034509L;
	private String destAp3lc;
	private String remarks;
	private RFStick sticker;
	private List<Shipments> accItems;
	private FAcceptance acceptance ;

	public CFormularExportAcceptance() {
		super(FormularType.ACCEPTANCE);
	}

	public CFormularExportAcceptance(IFormularMain main) {
		super(FormularType.ACCEPTANCE,main);
	}

	public FAcceptance getAcceptance() {
		return acceptance;
	}

	public void setAcceptance(FAcceptance acceptance) {
		this.acceptance = acceptance;
	}

	public List<Shipments> getAccItems() {
		return accItems;
	}

	public void setAccItems(List<Shipments> accItems) {
		this.accItems = accItems;
	}

	public String getDestAp3lc() {
		return destAp3lc;
	}

	public void setDestAp3lc(String destAp3lc) {
		this.destAp3lc = destAp3lc;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
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
