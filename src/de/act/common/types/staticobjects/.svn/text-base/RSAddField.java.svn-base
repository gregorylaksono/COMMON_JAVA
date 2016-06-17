package de.act.common.types.staticobjects;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * @author Martin Sachs
 * @since 1.0 - 20.02.2007
 */
final class RSAddField implements java.io.Serializable {

	private static final long serialVersionUID = 7660699807562534571L;
	private String street = null;
	private String place = null;
	private String zip = null;
	private String state;
	private String area;
	private String no = null;
	private RSCo country;
	private String di_2lc = null;
	private String contactPerson = null;
	private Integer bank = null;
	private Integer goverment = null;
	private RSAdd importAgent = null;
	private RSAdd add = null;
	transient private static final int baseHash = RSAddField.class.getName().hashCode() * 2 + 1;

	/*
	 * 10.01.2006
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object obj) {
		if (obj == this){
			return true;
		}
		if (obj instanceof RSAddField){
			return new EqualsBuilder().append(((RSAddField) obj).street, this.street).append(((RSAddField) obj).place, this.place).append(((RSAddField) obj).zip, this.zip).isEquals();
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
		return new HashCodeBuilder().append(baseHash).append(this.street).append(this.place).append(this.zip).append(this.no).append(this.area).append(this.state).toHashCode();
	}

	/*
	 * 10.01.2006
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.add.toString();
	}

	public RSAdd getAdd() {
		return add;
	}

	public void setAdd(RSAdd add) {
		this.add = add;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Integer getBank() {
		return bank;
	}

	public void setBank(Integer bank) {
		this.bank = bank;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public RSCo getCountry() {
		return country;
	}

	public void setCountry(RSCo country) {
		this.country = country;
	}

	public String getDi_2lc() {
		return di_2lc;
	}

	public void setDi_2lc(String di_2lc) {
		this.di_2lc = di_2lc;
	}

	public Integer getGoverment() {
		return goverment;
	}

	public void setGoverment(Integer goverment) {
		this.goverment = goverment;
	}

	public RSAdd getImportAgent() {
		return importAgent;
	}

	public void setImportAgent(RSAdd importAgent) {
		this.importAgent = importAgent;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}
}
