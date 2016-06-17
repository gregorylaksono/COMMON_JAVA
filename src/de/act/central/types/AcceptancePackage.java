package de.act.central.types;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * AcceptancePackage generated by MyEclipse - Hibernate Tools
 */

public class AcceptancePackage extends Central implements java.io.Serializable {

	// Fields

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 20.11.2006
	 */
	private static final long serialVersionUID = -4867450466898714415L;
	transient private Long accPkgId;
	private PackageItem FPkg;
	private Long pkg_id;
	private AcceptanceItem FAccItem;
	private Integer pcs;

	// Constructors

	/** default constructor */
	public AcceptancePackage() {

	}

	/** full constructor */
	public AcceptancePackage(PackageItem FPkg, AcceptanceItem FAccItem, Integer pcs) {
		this.FPkg = FPkg;
		this.FAccItem = FAccItem;
		this.pcs = pcs;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof AcceptancePackage)) { return false; }
		if (this == obj) { return true; }
		AcceptancePackage rhs = (AcceptancePackage) obj;
		return new EqualsBuilder().append(this.FPkg, rhs.FPkg).append(this.FAccItem, rhs.FAccItem).append(this.pcs, rhs.pcs).isEquals();
	}

	/**
	 * 12.12.2005
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(this.FPkg).append(this.FAccItem).append(this.pcs).toHashCode();
	}

	// Property accessors

	public Long getAccPkgId() {
		return this.accPkgId;
	}

	public void setAccPkgId(Long accPkgId) {
		this.accPkgId = accPkgId;
	}

	public PackageItem getFPkg() {
		return this.FPkg;
	}

	public void setFPkg(PackageItem FPkg) {
		this.FPkg = FPkg;
	}

	public Long getPkg_id() {
		return pkg_id;
	}

	public void setPkg_id(Long pkg_id) {
		this.pkg_id = pkg_id;
	}

	public AcceptanceItem getFAccItem() {
		return this.FAccItem;
	}

	public void setFAccItem(AcceptanceItem FAccItem) {
		this.FAccItem = FAccItem;
	}

	public Integer getPcs() {
		return this.pcs;
	}

	public void setPcs(Integer pcs) {
		this.pcs = pcs;
	}
}