/**
 * 
 */
package de.act.common.types.nonstaticobjects;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

import org.apache.commons.lang.builder.EqualsBuilder;

import de.act.common.types.attachment.CAbstractAttachment;
import de.act.common.types.attachment.CBookingFlightAttachment;
import de.act.common.types.packageitems.ItemBKG;
import de.act.common.types.staticobjects.RSCaConx;
import de.act.common.types.staticobjects.RSFlt;
import de.act.common.types.staticobjects.RSFltConxCA;

/**
 * @author Martin Sachs
 * @since 19.01.2006
 */
@org.jboss.cache.aop.annotation.PojoCacheable
public final class BookingRequestFlight implements Serializable {

	private static final long		serialVersionUID	= 97561011309182519L;
	public final static long		ONE_DAY				= 24L * 3600L * 1000L;
	private CAbstractAttachment		attachment			= new CBookingFlightAttachment();
	private Long					bkg_flt_id			= -1L;
	private Long					bkg_id				= -1L;
	private Integer					flt_row;
	// public String flt_id;
	private Date					bkg_flt_date;
	private Date					corr				= new Date();
	private ItemBKG					parent;
	private RSCaConx				airline				= new RSCaConx();
	private RSFlt					flight				= new RSFlt();
	private FlightDate				flightdate			= new FlightDate();
	private FlightAttributes		flightAttributes	= null;
	private Set<BookingFlightState>	flightStates		= null;
	private boolean					selected			= false;
	//private Integer att_id;
	
	private boolean changed = false;
	
	public static enum STATE {
		OK, FULL, VOL_FULL, WGT_VOL
	};
	public STATE    state   = STATE.OK; // ok
	private Boolean checked = false;
	private String  centralBookingId;

	public final String getCentralBookingId() {
		return centralBookingId;
	}

	public final BookingStates getBookingState() {
		if (flightStates != null && flightStates.size() > 0) {
			return flightStates.iterator().next().getBookingState();
		}
		return null;
	}

	public final void setBookingState(BookingStates bookingState) {
		if (this.flightStates != null && this.flightStates.size() > 0) {
			this.flightStates.iterator().next().setBookingState(bookingState);
		} 
		else {
			BookingFlightState flightState = new BookingFlightState(this);
			if (this.flightStates == null) {
				this.flightStates = new LinkedHashSet<BookingFlightState>();
			}
			this.flightStates.clear();
			flightState.setBookingState(bookingState);
			this.flightStates.add(flightState);
		}
	}

	public final String getBookingStatus() {
		if (flightStates == null || flightStates.size() == 0) {
			BookingFlightState flightState = new BookingFlightState(this);
			if (this.flightStates == null) {
				this.flightStates = new LinkedHashSet<BookingFlightState>();
			}
			this.flightStates.clear();
			this.flightStates.add(flightState);
			return flightState.getBookingStatus();
		} 
		else
			return this.flightStates.iterator().next().getBookingStatus();
	}

	public final void setBookingStatus(String bookingStatus) {
		if (flightStates == null || flightStates.size() == 0) {
			BookingFlightState flightState = new BookingFlightState(this);
			if (this.flightStates == null) {
				this.flightStates = new LinkedHashSet<BookingFlightState>();
			}
			this.flightStates.clear();
			flightState.setBookingStatus(bookingStatus);
			this.flightStates.add(flightState);
		} 
		else {
			this.flightStates.iterator().next().setBookingStatus(bookingStatus);
		}
	}

	public final void setCentralBookingId(String centralBookingId) {
		this.centralBookingId = centralBookingId;
	}

	public BookingRequestFlight(BookingRequestFlight flt) {
		this();
		this.flight = flt.flight;
		this.flightAttributes = flt.flightAttributes;
		this.flightdate = flt.flightdate;
		this.flt_row = flt.flt_row;
		airline = flt.airline;
		this.flightStates = flt.flightStates;
		this.corr = new Date();
	}

	public BookingRequestFlight() {
		BookingFlightState flightState = new BookingFlightState(this);
		if (this.flightStates == null) {
			this.flightStates = new LinkedHashSet<BookingFlightState>();
		}
		this.flightStates.clear();
		this.flightStates.add(flightState);
	}

	public BookingRequestFlight(RSFltConxCA flt) {
		this();
		this.flight = flt.flight;
		this.flightdate = new FlightDate(flt.flight.dep);
		this.airline = flt.carrier;
		this.airline.setDEPT(flt.conx.dept);
		this.airline.setDEST(flt.conx.dest);
		this.corr = new Date();
		this.flt_row = 0;
	}
	
	public void setFullBookingRequestFlight(BookingRequestFlight oldFlight){
		this.setBkg_flt_id(oldFlight.getBkg_flt_id());
		this.setAttachment(oldFlight.getAttachment());
		this.setParent(oldFlight.getParent());
		this.setFlt_row(oldFlight.getFlt_row());
		this.setCentralBookingId(oldFlight.getCentralBookingId());
		this.setFlight(oldFlight.getFlight());
		this.setFlightdate(oldFlight.getFlightdate());
		
		this.setBookingState(oldFlight.getBookingState());
	}

	public Date getDepTime() {
		if (flight == null) {
			return null;
		}
		Date depTime = flight.getDep();
		Date now = new Date(depTime.getTime());
		return now;
		/*				commented by andra, 20 nov 09
	    if (this.flightdate != null) {
	      Date s = this.flightdate.getDate();
	      now.setDate(s.getDate());
	      now.setMonth(s.getMonth());
	      now.setYear(s.getYear());
	      return now;
	    }
	
	    return null;*/
	}
	
	public Date getDepTimeForAWB(){
		if (flight == null) {
			return null;
		}
		Date depTime = flight.getDep();
		Date now = new Date(depTime.getTime());
	    if (this.flightdate != null) {
	      Date s = this.flightdate.getDate();
	      now.setDate(s.getDate());
	      now.setMonth(s.getMonth());
	      now.setYear(s.getYear());
	      return now;
	    }
	
	    return null;
	}

	public Date getArrTime() {
		if (flight == null) {
			return null;
		}
		Date arrTime = flight.getArr();
		Date now = new Date(arrTime.getTime());
		return now;
		/*				commented by andra, 20 nov 09
	    if (this.flightdate != null) {
	      Date s = new Date(this.flightdate.getDate().getTime() + (flight.getArr_dt() == null ? 0 : ONE_DAY * flight.getArr_dt()));
	
	      now.setDate(s.getDate());
	      now.setMonth(s.getMonth());
	      now.setYear(s.getYear());
	
	      return now;
	    }
	    return null;*/
	}
	
	public Date getArrTimeForAWB() {
		if (flight == null) {
			return null;
		}
		Date arrTime = flight.getArr();
		Date now = new Date(arrTime.getTime());
	    if (this.flightdate != null) {
	      Date s = new Date(this.flightdate.getDate().getTime() + (flight.getArr_dt() == null ? 0 : ONE_DAY * flight.getArr_dt()));
	
	      now.setDate(s.getDate());
	      now.setMonth(s.getMonth());
	      now.setYear(s.getYear());
	
	      return now;
	    }
	    return null;
	}

	public RSCaConx getAirline() {
		return this.airline;
	}

	public String toString() {
		StringBuffer b = new StringBuffer();
		if (airline != null) b.append(airline.toString());
		if (flight != null && flight.flt_no != null) {
			b.append(flight.flt_no);
			if (airline != null) b.append("/");
		}
		if (flightdate != null && airline != null) b.append(flightdate.toString());
		return b.toString();
	}

	public void setState(STATE s) {
		state = s;
	}

	public STATE getState() {
		return state;
	}

	/*
	 * 10.01.2006
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == this) return true;
		if (obj instanceof BookingRequestFlight) {
			BookingRequestFlight st = (BookingRequestFlight) obj;
			return new EqualsBuilder().append(this.parent, st.parent).append(this.attachment, st.attachment).append(this.flt_row, st.flt_row).isEquals();
		}
		return false;
	}

	/*
	 * 10.01.2006
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		int re = 17;
		if (parent != null) re += 37 * parent.hashCode();
		if (this.attachment != null) re += 37 * attachment.hashCode();
		if (flt_row != null) re += 37 * flt_row.hashCode();
		return re;
	}

	public FlightDate getFlightdate() {
		return flightdate;
	}

	public void setFlightdate(FlightDate flightdate) {
		this.flightdate = flightdate;
	}

	public void setFlightdate() {
		this.flightdate = new FlightDate();
	}

	public final CAbstractAttachment getAttachment() {
		return attachment;
	}

	public final void setAttachment(CAbstractAttachment attachment) {
		this.attachment = attachment;
	}

	public final Date getBkg_flt_date() {
		return bkg_flt_date;
	}

	public final void setBkg_flt_date(Date bkg_flt_date) {
		this.bkg_flt_date = bkg_flt_date;
	}

	public final Long getBkg_flt_id() {
		return bkg_flt_id;
	}

	public final void setBkg_flt_id(Long bkg_flt_id) {
		this.bkg_flt_id = bkg_flt_id;
	}

	public final Long getBkg_id() {
		return bkg_id;
	}

	public final void setBkg_id(Long bkg_id) {
		this.bkg_id = bkg_id;
	}

	public final Boolean getChecked() {
		return checked;
	}

	public final void setChecked(Boolean checked) {
		this.checked = checked;
	}

	public final Date getCorr() {
		return corr;
	}

	public final void setCorr(Date corr) {
		this.corr = corr;
	}

	public final RSFlt getFlight() {
		return flight;
	}

	public final void setFlight(RSFlt flight) {
		this.flight = flight;
	}

	public final FlightAttributes getFlightAttributes() {
		return flightAttributes;
	}

	public final void setFlightAttributes(FlightAttributes flightAttributes) {
		this.flightAttributes = flightAttributes;
	}

	public final Integer getFlt_row() {
		return flt_row;
	}

	public final void setFlt_row(Integer flt_row) {
		this.flt_row = flt_row;
	}

	public final ItemBKG getParent() {
		return parent;
	}

	public final void setParent(ItemBKG parent) {
		this.parent = parent;
	}

	public final boolean isSelected() {
		return selected;
	}

	public final void setSelected(boolean selected) {
		this.selected = selected;
	}

	public final void setAirline(RSCaConx airline) {
		this.airline = airline;
	}

	public final BookingFlightState getFlightState() {
		if (flightStates != null && flightStates.size() > 0) return this.flightStates.iterator().next();
		return null;
	}

	public final void setFlightState(BookingFlightState flightState) {
		if (flightStates == null) {
			flightStates = new LinkedHashSet<BookingFlightState>();
		}
		flightStates.clear();
		flightStates.add(flightState);
	}

	public Set<BookingFlightState> getFlightStates() {
		return this.flightStates;
	}

	public void setFlightStates(Set<BookingFlightState> flightStates) {
		this.flightStates = flightStates;
	}

	public boolean isChanged() {
		return changed;
	}

	public void setChanged(boolean changed) {
		this.changed = changed;
	}

	/*public Integer getAtt_id() {
		return att_id;
	}
	
	public void setAtt_id(Integer att_id) {
		this.att_id = att_id;
	}*/
}
