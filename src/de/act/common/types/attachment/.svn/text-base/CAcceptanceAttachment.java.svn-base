/**
 * @author Admin
 * @since 14.03.2006
 */
package de.act.common.types.attachment;
import java.io.Serializable;
import java.util.Set;

import de.act.common.types.formulars.FormularType;
import de.act.common.types.handling.Shipments;

/**
 * @author Martin Sachs
 * @since 1.0 - 08.12.2006
 */
public class CAcceptanceAttachment extends CAbstractAttachment implements Serializable {

	private static final long serialVersionUID = 8669623049223161990L;
	private Set<Shipments> originalShipment;

	public CAcceptanceAttachment() {
		super(FormularType.ACCEPTANCE);
	}

	public Set<Shipments> getOriginalShipment() {
		return originalShipment;
	}

	public void setOriginalShipment(Set<Shipments> originalShipment) {
		this.originalShipment = originalShipment;
	}
}
