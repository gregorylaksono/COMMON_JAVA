/**
 * 
 */
package de.act.common.types.views;

import java.io.Serializable;
import java.util.Date;

/**
 * this is the class persistence for fBookingListView.hbm.xml mapper.
 * @author soultani
 *
 */
@org.jboss.cache.aop.annotation.PojoCacheable
public class BookingListForScheduleClosedView implements Serializable {	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2361488557082748479L;
	//<Private field>
	private String formId;
	private Long bookingFlightId;
	private String bookingStatus;
	private Long masterFlightId;
	private Date departure;
	private Long bookingItemId;
	private Long bookingId;
	private Long flightId;
	private String flightNumber;
	private String manifestStatus;
	//</Private field>
	
	//<Constructor>
	public BookingListForScheduleClosedView(){		
	}
	//</Constructor>
	
	//<Public Getter Property>
	public String getFormId() {
		return formId;
	}	
	public Long getBookingFlightId() {
		return bookingFlightId;
	}
	public String getBookingStatus() {
		return bookingStatus;
	}
	public Long getMasterFlightId() {
		return masterFlightId;
	}
	public Date getDeparture() {
		return departure;
	}
	public Long getBookingItemId() {
		return bookingItemId;
	}
	public Long getBookingId() {
		return bookingId;
	}
	public Long getFlightId() {
		return flightId;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	//</Public Getter Property>
	
	//<Public Setter Property>
	public void setFormId(String formId) {
		this.formId = formId;
	}
	public void setBookingFlightId(Long bookingFlightId) {
		this.bookingFlightId = bookingFlightId;
	}
	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	public void setMasterFlightId(Long masterFlightId) {
		this.masterFlightId = masterFlightId;
	}
	public void setDeparture(Date departure) {
		this.departure = departure;
	}
	public void setBookingItemId(Long bookingItemId) {
		this.bookingItemId = bookingItemId;
	}
	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}
	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	
	public String getManifestStatus() {
		return manifestStatus;
	}

	public void setManifestStatus(String manifestStatus) {
		this.manifestStatus = manifestStatus;
	}
	//</Public Setter Property>
}
