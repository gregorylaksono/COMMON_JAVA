package de.act.common.types.nonstaticobjects;

/**
 * @author Martin Sachs
 * @since 1.0 - 09.10.2006
 */
public enum BookingStates {

	/**
	 * @deprecated
	 * @author Martin Sachs
	 * @since 1.0 - 09.10.2006
	 */
	AGAINST_ALLOTMENT("xxca","ca","1100","against allotment","Shipment booked against allotment"),
	/**
	 *
	 * @author Martin Sachs
	 * @since 1.0 - 09.10.2006
	 */
	HOLD_CONFIRMED("xxhk","hk","2000","hold confirmed","Booking hold confirmed"),
	/**
	 * request a defined space on a flight.
	 * @author Martin Sachs
	 * @since 1.0 - 09.10.2006
	 */
	REQUEST_SPACE_ALLOCATION("xxhn","hn","1700","request space allocation","Request space allocation"),
	/**
	 * all ok
	 * @author Martin Sachs
	 * @since 1.0 - 09.10.2006
	 */
	BOOKING_CONFIRMED("xxkk","kk","1000","confirmed","Booking confirmed"),
	/**
	 * booking is accepted, but not on the flight until another one is loaded off
	 * @author Martin Sachs
	 * @since 1.0 - 09.10.2006
	 */
	SHIPMENT_ON_WAITING_LIST("xxll","ll","3500","wait list","Shipment on waiting list"),
	/**
	 * the booking request allows alternativ bookingsroutings, so the ffw/airline can change the request dynamically
	 * @author Martin Sachs
	 * @since 1.0 - 09.10.2006
	 */
	BOOKING_REQUESTED_WITH_ALTERNATIVES("xxna","na","1600","accept alternatives","Booking requested (alterantives accepted)"),
	/**
	 * the booking requests does not allow any alternativ bookingflights.
	 * @author Martin Sachs
	 * @since 1.0 - 09.10.2006
	 */
	BOOKING_REQUESTED_WITHOUT_ALTERNATIVES("xxnn","nn","1500","need need / no alternatives","Booking requested (alternatives not accepted)"),
	/**
	 *
	 * @author Martin Sachs
	 * @since 1.0 - 09.10.2006
	 */
	UTC("xxuc","uc","5900","unable to confirm","Unable to confirm boooking"),
	/**
	 * @author Martin Sachs
	 * @since 1.0 - 09.10.2006
	 */
	UTC_FLIGHT_DOESNOT_OPERATE("xxun","un","5700","flight does not operate","Unable to confirm boooking due to - flight does not operate"),
	/**
	 * @author Martin Sachs
	 * @since 1.0 - 09.10.2006
	 */
	UTC_NO_CAPACITY("xxuu","uu","5800","unable to confirm / no capacity","Unable to confirm boooking due to - no capacity available"),

	BOOKING_CANCELED("xxxx","xx","6000","cancellation","Booking cancelled"),

	SHIPPER_REQUEST("xsnn","nn","1500","need need","Booking requested by shipper(alterantives accepted)"),
	SHIPPER_ALTERNATIVE_REQUEST("xsna","na","1600","accept alternatives","Booking requested by shipper(alternatives not accepted)"),
	SHIPPER_CANCEL("xsxr","xr","5500","Cancellation request","Booking cancellation requested by shipper"),
	AGENT_REQUEST("xann","nn","1500","need need","Booking requested by agent (alterantives accepted)"),
	AGENT_ALTERNATIVE_REQUEST("xana","","1600","accept alternatives","Booking requested by agent (alternatives not accepted)"),
	AGENT_CANCEL("xaxr","xr","5500","Cancellation request","Booking cancellation requested by agent "),
	
	SPLIT_PACKAGE("xxsp", "sp", "1200", "split package", "Split Package to different flight"),
	
	SHIPMENT_ON_LYING_LIST("xxly","ly","3500","lying list","Shipment on lying list"),
	
	SHIPMENT_ON_PREADVISE("xxpa", "pa", "1000", "Preadvise", "Preadvise"),
	
	NONE("","","9000","nothing","nothing");

	private final String actCode;
	private final String bkg2cl;
	private final String badness;
	private final String shortDescription;
	private final String description;

	private BookingStates(String actCode, String bkg2cl,String badness, String shortDescription, String description){
		this.actCode = actCode;
		this.bkg2cl = bkg2cl;
		this.badness = badness;
		this.shortDescription = shortDescription;
		this.description = description;
	}

	public final String getActCode() {
		return actCode;
	}

	public final String getBadness() {
		return badness;
	}

	public final String getBkg2cl() {
		return bkg2cl;
	}

	public final String getDescription() {
		return description;
	}

	public final String getShortDescription() {
		return shortDescription;
	}

	/* (non-Javadoc)
	 * @see java.lang.Enum#toString()
	 */
	@Override
	public String toString() {
		return actCode;
	}

	public static BookingStates getStateForActCode(String requestedStat) {
		for(BookingStates s:BookingStates.values()){
			if (s.getActCode().equals(requestedStat)) {
				return s;
			}
		}
		return BookingStates.NONE;
	}
}
