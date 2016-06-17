package de.act.central.types;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * BookingFlight generated by MyEclipse - Hibernate Tools
 */
@SuppressWarnings({ "unchecked", "unused" })
public class BookingFlight2 extends Central  implements java.io.Serializable {

	// Fields

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 20.11.2006
	 */
	private static final long serialVersionUID = -3316311575261101587L;
	transient private Long bkgFltId;
	private Attachment2 FAtt;
	private PackageItemBKG2 FBkgItem;
	private Short fltRow;
	private String CBkgId;
	private Long fltId;
	private Date bkgFltDate;
	private Date corr;
	private Set FBkgFltStats = new HashSet(0);

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.bkgFltId);
		sb.append(" [");
		sb.append(this.fltRow);sb.append(", ");
		sb.append(this.fltId);sb.append(", ");
		sb.append(this.bkgFltDate);sb.append(", {");
		sb.append(this.FAtt);sb.append("}, ");
		sb.append(this.CBkgId);sb.append(", ");
		sb.append(this.corr);
		sb.append("]");
		return sb.toString();
	}

	// Constructors

	/** default constructor */
	public BookingFlight2() {
		
	}

	/** full constructor */
	public BookingFlight2(Attachment2 FAtt, PackageItemBKG2 FBkgItem, Short fltRow, String CBkgId, Long fltId, Date bkgFltDate, Date corr, Set FBkgFltStats) {
		this.FAtt = FAtt;
		this.FBkgItem = FBkgItem;
		this.fltRow = fltRow;
		this.CBkgId = CBkgId;
		this.fltId = fltId;
		this.bkgFltDate = bkgFltDate;
		this.corr = corr;
		this.FBkgFltStats = FBkgFltStats;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof BookingFlight2)) { return false; }
		if (this == obj) { return true; }
		BookingFlight2 rhs = (BookingFlight2) obj;
		return new EqualsBuilder().append(this.FBkgItem, rhs.FBkgItem).append(this.FAtt, rhs.FAtt).append(this.fltRow, rhs.fltRow).isEquals();
	}

	/**
	 * 12.12.2005
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(this.FBkgItem).append(this.FAtt).append(this.fltRow).toHashCode();
	}

	// Property accessors

	public Long getBkgFltId() {
		return this.bkgFltId;
	}

	public void setBkgFltId(Long bkgFltId) {
		this.bkgFltId = bkgFltId;
	}

	public Attachment2 getFAtt() {
		return this.FAtt;
	}

	public void setFAtt(Attachment2 FAtt) {
		this.FAtt = FAtt;
	}

	public PackageItemBKG2 getFBkgItem() {
		return this.FBkgItem;
	}

	public void setFBkgItem(PackageItemBKG2 FBkgItem) {
		this.FBkgItem = FBkgItem;
	}

	public Short getFltRow() {
		return this.fltRow;
	}

	public void setFltRow(Short fltRow) {
		this.fltRow = fltRow;
	}

	public String getCBkgId() {
		return this.CBkgId;
	}

	public void setCBkgId(String CBkgId) {
		this.CBkgId = CBkgId;
	}

	public Long getFltId() {
		return this.fltId;
	}

	public void setFltId(Long fltId) {
		this.fltId = fltId;
	}

	public Date getBkgFltDate() {
		return this.bkgFltDate;
	}

	public void setBkgFltDate(Date bkgFltDate) {
		this.bkgFltDate = bkgFltDate;
	}

	public Date getCorr() {
		return this.corr;
	}

	public void setCorr(Date corr) {
		this.corr = corr;
	}

	//public Set getFBkgFltStats() {
	//	return this.FBkgFltStats;
	//}

	//public void setFBkgFltStats(Set FBkgFltStats) {
	//	this.FBkgFltStats = FBkgFltStats;
	//}
}