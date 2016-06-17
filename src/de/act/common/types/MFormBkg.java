package de.act.common.types;

import java.io.Serializable;

import de.act.common.types.packageitems.ItemBKG;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class MFormBkg implements Serializable{

	/**
	 * @author Martin Sachs
	 * @since 28.04.2006
	 */
	private static final long serialVersionUID = 7871461683132868926L;
	public ItemBKG bookingRequests = new ItemBKG();
	//    public BookingData bookingData =null;
	public boolean displayed = false;
	private de.act.common.enums.BOOKINGSTATE bookingState = de.act.common.enums.BOOKINGSTATE.SHIPPER_REQUESTED;

	public void setBookingState(final de.act.common.enums.BOOKINGSTATE requested) {
		this.bookingState  = requested;
	}

	public de.act.common.enums.BOOKINGSTATE getBookingState() {
		return this.bookingState;
	}
}
