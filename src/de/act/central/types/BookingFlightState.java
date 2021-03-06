package de.act.central.types;

import java.util.Date;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * BookingFlightState generated by MyEclipse - Hibernate Tools
 */

public class BookingFlightState extends Central implements java.io.Serializable {

	// Fields

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 20.11.2006
	 */
	private static final long serialVersionUID = -8681778665544020734L;
	transient private Long bkgFltStatId;
	private BookingFlight FBkgFlt;
	private Attachment FAtt;
	private String bkgStatus;
	private String statDescr;
	private Date corr;

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.bkgFltStatId);
		sb.append(" [");
		sb.append(this.bkgStatus);sb.append(", ");
		sb.append(this.statDescr);sb.append(", {");
		sb.append(this.FAtt);sb.append("}, ");
		sb.append(this.corr);
		sb.append("]");
		return sb.toString();
	}

	// Constructors

	/** default constructor */
	public BookingFlightState() {
		
	}

	/** full constructor */
	public BookingFlightState(BookingFlight FBkgFlt, Attachment FAtt, String bkgStatus, String statDescr, Date corr) {
		this.FBkgFlt = FBkgFlt;
		this.FAtt = FAtt;
		this.bkgStatus = bkgStatus;
		this.statDescr = statDescr;
		this.corr = corr;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof BookingFlightState)) { return false; }
		if (this == obj) { return true; }
		BookingFlightState rhs = (BookingFlightState) obj;
		return new EqualsBuilder().append(this.FBkgFlt, rhs.FBkgFlt).append(this.FAtt, rhs.FAtt).append(this.bkgStatus, rhs.bkgStatus).isEquals();
	}

	/**
	 * 12.12.2005
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(this.FBkgFlt).append(this.FAtt).append(this.bkgStatus).toHashCode();
	}

	// Property accessors

	public Long getBkgFltStatId() {
		return this.bkgFltStatId;
	}

	public void setBkgFltStatId(Long bkgFltStatId) {
		this.bkgFltStatId = bkgFltStatId;
	}

	public BookingFlight getFBkgFlt() {
		return this.FBkgFlt;
	}

	public void setFBkgFlt(BookingFlight FBkgFlt) {
		this.FBkgFlt = FBkgFlt;
	}

	public Attachment getFAtt() {
		return this.FAtt;
	}

	public void setFAtt(Attachment FAtt) {
		this.FAtt = FAtt;
	}

	public String getBkgStatus() {
		return this.bkgStatus;
	}

	public void setBkgStatus(String bkgStatus) {
		this.bkgStatus = bkgStatus;
	}

	public String getStatDescr() {
		return this.statDescr;
	}

	public void setStatDescr(String statDescr) {
		this.statDescr = statDescr;
	}

	public Date getCorr() {
		return this.corr;
	}

	public void setCorr(Date corr) {
		this.corr = corr;
	}
}