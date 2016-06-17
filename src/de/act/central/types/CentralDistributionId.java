package de.act.central.types;

/**
 * CentralDistributionId generated by MyEclipse - Hibernate Tools
 */

public class CentralDistributionId extends Central implements java.io.Serializable {

	// Fields

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 20.11.2006
	 */
	private static final long serialVersionUID = 2046623325668637505L;
	private FormularInformation FForm;
	private Short part;
	private Short addSeq;

	// Constructors

	/** default constructor */
	public CentralDistributionId() {
		
	}

	/** full constructor */
	public CentralDistributionId(FormularInformation FForm, Short part, Short addSeq) {
		this.FForm = FForm;
		this.part = part;
		this.addSeq = addSeq;
	}

	// Property accessors

	public FormularInformation getFForm() {
		return this.FForm;
	}

	public void setFForm(FormularInformation FForm) {
		this.FForm = FForm;
	}

	public Short getPart() {
		return this.part;
	}

	public void setPart(Short part) {
		this.part = part;
	}

	public Short getAddSeq() {
		return this.addSeq;
	}

	public void setAddSeq(Short addSeq) {
		this.addSeq = addSeq;
	}

	@Override
	public boolean equals(Object other) {
		if ( (this == other ) ){
			return true;
		}
		if ( (other == null ) ){
			return false;
		}
		if ( !(other instanceof CentralDistributionId) ){
			return false;
		}
		CentralDistributionId castOther = ( CentralDistributionId ) other;

		return ( (this.getFForm()==castOther.getFForm()) || ( this.getFForm()!=null && castOther.getFForm()!=null && this.getFForm().equals(castOther.getFForm()) ) )
		&& ( (this.getPart()==castOther.getPart()) || ( this.getPart()!=null && castOther.getPart()!=null && this.getPart().equals(castOther.getPart()) ) )
		&& ( (this.getAddSeq()==castOther.getAddSeq()) || ( this.getAddSeq()!=null && castOther.getAddSeq()!=null && this.getAddSeq().equals(castOther.getAddSeq()) ) );
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 37 * result + ( this.getFForm() == null ? 0 : this.getFForm().hashCode() );
		result = 37 * result + ( this.getPart() == null ? 0 : this.getPart().hashCode() );
		result = 37 * result + ( this.getAddSeq() == null ? 0 : this.getAddSeq().hashCode() );
		return result;
	}
}