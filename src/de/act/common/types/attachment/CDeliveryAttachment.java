package de.act.common.types.attachment;

import de.act.common.types.DeliveryHeadersView;
import de.act.common.types.formulars.FormularType;

/**
 * @author Martin Sachs
 * @since 1.0 - 08.12.2006
 */
public class CDeliveryAttachment extends CAbstractAttachment {

	private static final long serialVersionUID = -8699423312822081964L;
	private DeliveryHeadersView deliveryView;

	public DeliveryHeadersView getDeliveryView() {
		return deliveryView;
	}

	public void setDeliveryView(DeliveryHeadersView deliveryView) {
		this.deliveryView = deliveryView;
	}

	public CDeliveryAttachment() {
		super(FormularType.DELIVERY);
	}
}
