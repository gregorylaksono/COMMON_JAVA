/**
 * @author Admin
 * @since 14.03.2006
 */
package de.act.common.types.formulars;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import de.act.common.types.nonstaticobjects.RFStick;
import de.act.common.types.packageitems.ItemBKG;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class CFormularBKG extends CAbstractFormular implements Serializable{

	private static final long serialVersionUID = 5311723761682738933L;
	private Date corr = new Date();
	private List<ItemBKG> itemBKGs = new ArrayList<ItemBKG>();
	private RFStick sticker;

	public CFormularBKG() {
		super(FormularType.BKG);
	}

	public CFormularBKG(IFormularMain main) {
		super(FormularType.BKG,main);
	}

	public RFStick getSticker() {
		return sticker;
	}

	public void setSticker(RFStick sticker) {
		this.sticker = sticker;
	}

	public List<ItemBKG> getItemBKGs() {
		return itemBKGs;
	}

	public void setItemBKGs(List<ItemBKG> itemBKGs) {
		this.itemBKGs = itemBKGs;
	}

	public Date getCorr() {
		return corr;
	}

	public void setCorr(Date corr) {
		this.corr = corr;
	}

	/* (non-Javadoc)
	 * @see de.act.common.types.formulars.IFormulars#checkMendetoryFields()
	 */
	public boolean checkMendetoryFields() {
		return true;
	}
}