/**
 *
 */
package de.act.common.types.nonstaticobjects;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang.builder.EqualsBuilder;

import de.act.common.types.attachment.CAbstractAttachment;
import de.act.common.types.attachment.CBookingFlightStateAttachment;

/**
 * @author Martin Sachs
 * @since 19.01.2006
 */
@org.jboss.cache.aop.annotation.PojoCacheable
public final class BookingFlightState  implements Serializable{

	private static final long serialVersionUID = 97561011309182519L;
	public final static long ONE_DAY = 24L * 3600L * 1000L;
	private Long bkg_flt_stat_id = -1L;
	private CAbstractAttachment attachment = new CBookingFlightStateAttachment();
	private BookingRequestFlight bookingFlight;
	private BookingRequestFlight2 bookingFlight2; //Henry
	private Date corr= new Date();
	private String stat_descr;
	private String bookingStatus = BookingStates.SHIPPER_REQUEST.getActCode();
	private BookingStates bookingState = BookingStates.SHIPPER_REQUEST;
	/*private Integer att_id;
    private Long bkg_flt_id;*/

	public BookingFlightState() {

	}

	public BookingFlightState(BookingFlightState flt) {
		this.bkg_flt_stat_id = flt.bkg_flt_stat_id;
		this.attachment  = flt.attachment;
		this.bookingFlight = flt.bookingFlight;
		this.stat_descr = flt.stat_descr;
		this.bookingStatus = flt.bookingStatus;
		this.corr = new Date();
	}

	public BookingFlightState(BookingRequestFlight bookingFlight) {
		this.bookingFlight= bookingFlight;
		if (bookingFlight!=null) {
			if (bookingFlight.getParent()!=null) {
				BookingStates bs = bookingFlight.getParent().getRequestedState();
				this.setBookingState(bs);
			}
		}
	}

	public BookingFlightState(BookingRequestFlight2 bookingFlight) {
		this.bookingFlight2 = bookingFlight;
		if (bookingFlight2!=null) {
			if (bookingFlight2.getParent()!=null) {
				BookingStates bs = bookingFlight2.getParent().getRequestedState();
				this.setBookingState(bs);
			}
		}
	}
	
	public void setFullBookingFlightState(BookingFlightState oldFlightState){
		this.setBkg_flt_stat_id(oldFlightState.getBkg_flt_stat_id());
		this.setAttachment(oldFlightState.getAttachment());
		BookingRequestFlight newBookingFlight = new BookingRequestFlight();
		newBookingFlight.setFullBookingRequestFlight(oldFlightState.getBookingFlight());
		this.setBookingFlight(newBookingFlight);
		this.setBookingStatus(oldFlightState.getBookingStatus());
		this.setStat_descr(oldFlightState.getStat_descr());
		this.setCorr(oldFlightState.getCorr());
	}

	public String toString(){
		StringBuffer b=new StringBuffer();
		if (this.bookingState!=null) b.append(this.bookingState.toString());
		return b.toString();
	}


	/*
	 * 10.01.2006
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	 @Override
	 public boolean equals(Object obj) {
		 if (obj==this) return true;
		 if (obj instanceof BookingFlightState) {
			 BookingFlightState st = (BookingFlightState) obj;
			 return new EqualsBuilder().append(this.bookingFlight, st.bookingFlight).append(this.attachment, st.attachment).append(this.bookingStatus,st.bookingStatus).isEquals();
		 }
		 return false;
	 }

	 /*
	  * 10.01.2006
	  * @see java.lang.Object#hashCode()
	  */
	 @Override
	 public int hashCode() {
		 int re =17;
		 if (bookingFlight!=null)
			 re +=37 * bookingFlight.hashCode();
		 if (this.attachment!=null)
			 re+=37* attachment.hashCode();
		 if (bookingStatus!=null)
			 re += 37 * bookingStatus.hashCode();
		 return re;
	 }

	 public final BookingStates getBookingState() {
		 return bookingState;
	 }

	 public final void setBookingState(BookingStates bookingState) {
		 this.bookingState = bookingState;
		 if (bookingState!=null)
			 this.bookingStatus = bookingState.getActCode();
	 }

	 public final String getBookingStatus() {
		 if (bookingStatus!=null) {
			 return bookingStatus;
		 }
		 else if (bookingState!=null) {
			 return bookingState.getActCode();
		 }
		 else {
			 return "";
		 }
	 }

	 public final void setBookingStatus(String bookingStatus) {
		 this.bookingStatus = bookingStatus;
		 for(BookingStates en:BookingStates.values()){
			 if (en.getActCode().equals(this.bookingStatus)) {
				 this.bookingState = en;
				 break;
			 }
		 }
	 }

	 public final CAbstractAttachment getAttachment() {
		 return attachment;
	 }

	 public final void setAttachment(CAbstractAttachment attachment) {
		 this.attachment = attachment;
	 }

	 public final Long getBkg_flt_stat_id() {
		 return bkg_flt_stat_id;
	 }

	 public final void setBkg_flt_stat_id(Long bkg_flt_stat_id) {
		 this.bkg_flt_stat_id = bkg_flt_stat_id;
	 }

	 public final BookingRequestFlight getBookingFlight() {
		 return bookingFlight;
	 }

	 public final void setBookingFlight(BookingRequestFlight bookingFlight) {
		 this.bookingFlight = bookingFlight;
	 }

	 public final Date getCorr() {
		 return corr;
	 }

	 public final void setCorr(Date corr) {
		 this.corr = corr;
	 }

	 public final String getStat_descr() {
		 return stat_descr;
	 }

	 public final void setStat_descr(String stat_descr) {
		 this.stat_descr = stat_descr;
	 }

	 /*public Integer getAtt_id() {
		return att_id;
	}

	public void setAtt_id(Integer att_id) {
		this.att_id = att_id;
	}

	public Long getBkg_flt_id() {
		return bkg_flt_id;
	}

	public void setBkg_flt_id(Long bkg_flt_id) {
		this.bkg_flt_id = bkg_flt_id;
	}*/
}