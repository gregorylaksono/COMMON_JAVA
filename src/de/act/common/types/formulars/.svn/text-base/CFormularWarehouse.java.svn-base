/**
 * @file MFormWarehouse.java
 * @package de.act.common.types.formulars.warehouse
 * @since 05.12.2005 09:44:49
 * @author Martin Sachs
 */
package de.act.common.types.formulars;

import java.io.Serializable;

import de.act.common.types.attachment.CWarehouseAttachment;
import de.act.common.types.nonstaticobjects.RFStick;

/**
 * MFormWarehouse.java:
 *
 * @since 05.12.2005
 * @author Martin Sachs
 *
 */
@org.jboss.cache.aop.annotation.PojoCacheable
public final class CFormularWarehouse implements Serializable{

	private static final long serialVersionUID = -2529956438953783927L;
	private IAttachment metadata = new CWarehouseAttachment();
	private Long id =-1L;
	private final FormularType type = FormularType.WAREHOUSE;
	private IFormularMain mainFormular;
	private RFStick sticker;

	public RFStick getSticker() {
		return sticker;
	}

	public void setSticker(RFStick sticker) {
		this.sticker = sticker;
	}

	/* (non-Javadoc)
	 * @see de.act.common.types.formulars.IFormulars#getType()
	 */
	public FormularType getType() {
		return type;
	}

	public void setMainFormular(IFormularMain mainFormular) {
		this.mainFormular = mainFormular;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public IAttachment getMetadata() {
		return metadata;
	}

	public void setMetadata(IAttachment metadata) {
		this.metadata = metadata;
	}

	/* (non-Javadoc)
	 * @see de.act.common.types.formulars.IFormulars#getDisplayable()
	 */
	public Boolean getDisplayable() {
		if (this.metadata!=null) {
			return this.metadata.isDisplayable();
		}
		return false;
	}

	public IFormularMain getMainFormular() {
		return mainFormular;
	}
}
