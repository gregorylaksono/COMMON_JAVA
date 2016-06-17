package de.act.common.types.formulars;

import java.io.Serializable;
import java.util.Date;

import de.act.common.types.ManifestList;
import de.act.common.types.nonstaticobjects.RFStick;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class CFormularManifest extends CAbstractFormular implements Serializable{

	/**
	 * @author Admin
	 * @since 23.03.2006
	 */
	private static final long serialVersionUID = -4877018548614225645L;
	private RFStick sticker;
	private Date date;
	private String lading;
	private String unlading;
	private ManifestList data ;

	public CFormularManifest() {
		super(FormularType.MANIFEST);
	}

	public CFormularManifest(IFormularMain main) {
		super(FormularType.MANIFEST,main);
	}

	public ManifestList getData() {
		return data;
	}

	public void setData(ManifestList data) {
		this.data = data;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getLading() {
		return lading;
	}

	public void setLading(String lading) {
		this.lading = lading;
	}

	public String getUnlading() {
		return unlading;
	}

	public void setUnlading(String unlading) {
		this.unlading = unlading;
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
