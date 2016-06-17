package de.act.central.types;

import java.util.Date;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * PackageItemAVI generated by MyEclipse - Hibernate Tools
 */

public class PackageItemAVI extends Central implements java.io.Serializable {

	// Fields

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 20.11.2006
	 */
	private static final long serialVersionUID = 6012432529263505637L;
	transient private Long aviItemId;
	private Attachment FAtt;
	private Short aviRowNo;
	private String aviId;
	private Long pkgsNo;
	private Long qtyAnm;
	private Date corr;

	// Constructors

	/** default constructor */
	public PackageItemAVI() {
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof PackageItemAVI)) { return false; }
		if (this == obj) { return true; }
		PackageItemAVI rhs = (PackageItemAVI) obj;
		return new EqualsBuilder().append(this.FAtt, rhs.FAtt).append(this.aviRowNo, rhs.aviRowNo).isEquals();
	}

	/**
	 * 12.12.2005
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(this.FAtt).append(this.aviRowNo).toHashCode();
	}

	// Property accessors

	public Long getAviItemId() {
		return this.aviItemId;
	}

	public void setAviItemId(Long aviItemId) {
		this.aviItemId = aviItemId;
	}

	public Attachment getFAtt() {
		return this.FAtt;
	}

	public void setFAtt(Attachment FAtt) {
		this.FAtt = FAtt;
	}

	public Short getAviRowNo() {
		return this.aviRowNo;
	}

	public void setAviRowNo(Short aviRowNo) {
		this.aviRowNo = aviRowNo;
	}

	public Long getPkgsNo() {
		return this.pkgsNo;
	}

	public void setPkgsNo(Long pkgsNo) {
		this.pkgsNo = pkgsNo;
	}

	public Long getQtyAnm() {
		return this.qtyAnm;
	}

	public void setQtyAnm(Long qtyAnm) {
		this.qtyAnm = qtyAnm;
	}

	public Date getCorr() {
		return this.corr;
	}

	public void setCorr(Date corr) {
		this.corr = corr;
	}

	public String getAviId() {
		return aviId;
	}

	public void setAviId(String aviId) {
		this.aviId = aviId;
	}
}