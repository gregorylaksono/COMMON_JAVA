package de.act.common.types.views;

import java.io.Serializable;
import java.util.List;

import de.act.common.types.nonstaticobjects.BookingInformation;
import de.act.common.types.nonstaticobjects.ShipmentInformation;

/**
 * this is a persistence class for holding Shipment Information and Booking Information
 * @author diky
 *
 */
@org.jboss.cache.aop.annotation.PojoCacheable
public class RFShipmentSummary implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9180498805532639705L;
	private List<BookingInformation> liBookingInfo;
	private List<ShipmentInformation> liShipmentInfo;
	
	public List<BookingInformation> getLiBookingInfo() {
		return liBookingInfo;
	}
	public void setLiBookingInfo(List<BookingInformation> liBookingInfo) {
		this.liBookingInfo = liBookingInfo;
	}
	public List<ShipmentInformation> getLiShipmentInfo() {
		return liShipmentInfo;
	}
	public void setLiShipmentInfo(List<ShipmentInformation> liShipmentInfo) {
		this.liShipmentInfo = liShipmentInfo;
	}
}
