/**
 * @author Martin Sachs
 * @since 14.02.2006
 * @update 10.09.2009 by Henry
 */
package de.act.common.types.staticobjects;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class RSAdd implements Serializable, Comparable<RSAdd> {

	private static final long serialVersionUID = 1968351560391337569L;
	private Integer s_id;
	private Integer add_id;
	private Integer parentID;
	private RSAdd ObjectparentID = null;
	private String companyName;
	private String customReference;
	private Set<RSAddAdd> addAdd;
	private String di_2lc = null;
	private RSDi districtObject;
	private RSCo country;
	private Integer bank = null;
	private Integer goverment = null;
	private Integer reminder = null;
	private RSAdd importAgent = null;
	private RSAdd exportAgent = null;
	private Integer	importAgentInt;
	private Integer exportAgentInt;
	private String airport;
	private RSAp objectAirport;
	private String iataCode;
	private String dgrRefNo;
	private String type;
	private Integer creator = null;
	private Date createDate = null;
	private String vad_id;
	private RSVad vad;
	private String area;
	private Set<RSAddTcom> tcoms;
	transient private static final int baseHash = RSAdd.class.getName().hashCode() * 2 + 1;
	private String street = null;
	private String no = null;
	private String place = null;
	private String contactPerson = null;
	private String zip = null;
	private String state;
	private String telpString;
	private String faxString;
	private String emailString;
	private String displayString;
	private String caId;
	private Boolean usingLC; 
	private String city;
	private String accNo;
	private Integer addKickbackId;
	private String rateChargesType;
	private Integer kickback;
	
	public RSAdd()
	{
		super();
	}
	
	public RSAdd(Integer add_id)
	{
		this.add_id = add_id;
	}
	
	public String getCaId() {
		return caId;
	}

	public void setCaId(String caId) {
		this.caId = caId;
	}

	public Set<RSAddTcom> getTcoms() {
		return this.tcoms;
	}

	public void setTcoms(final Set<RSAddTcom> tcoms) {
		this.tcoms = tcoms;
		/*if (tcoms != null) {
			for (RSAddTcom tcom : tcoms) {
				if (tcom != null && tcom.getAdd() == null) {
					tcom.setAdd(this.add_id);
				}
			}
		}*/
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj instanceof RSAdd) {
			return new EqualsBuilder().append(((RSAdd) obj).companyName, (this.companyName)).append(((RSAdd) obj).country, (this.country)).append(
					((RSAdd) obj).di_2lc, (this.di_2lc)).append(((RSAdd) obj).street, (this.street)).append(((RSAdd) obj).no, (this.no)).append(((RSAdd) obj).place,
					(this.place)).append(((RSAdd) obj).state, (this.state)).isEquals();
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(baseHash).append(this.companyName).append(this.di_2lc).append(this.street).append(this.no).append(this.place).append(this.state).append(this.country).toHashCode();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.companyName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Comparable#compareTo(T)
	 */
	public int compareTo(final RSAdd o) {
		return this.companyName.compareToIgnoreCase(o.companyName);
	}

	public String getMail() {
		for (RSAddTcom com : this.tcoms) {
			if (com.getType().equals("e")) {
				return com.getNo();
			}
		}
		return null;
	}

	public String getTel() {
		for (RSAddTcom com : this.tcoms) {
			if (com.getType().equals("t")) {
				return com.getNo();
			}
		}
		return null;
	}

	public String getFax() {
		for (RSAddTcom com : this.tcoms) {
			if (com.getType().equals("f")) {
				return com.getNo();
			}
		}
		return null;
	}

	public Integer getAdd_id() {
		return add_id;
	}

	public void setAdd_id(Integer add_id) {
		this.add_id = add_id;
	}

	public String getAirport() {
		return airport;
	}

	public void setAirport(String airport) {
		this.airport = airport;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}	
	
	public String getCustomReference() {
		return customReference;
	}

	public void setCustomReference(String customReference) {
		this.customReference = customReference;
	}

	public String getDgrRefNo() {
		return dgrRefNo;
	}

	public void setDgrRefNo(String dgrRefNo) {
		this.dgrRefNo = dgrRefNo;
	}

	public String getIataCode() {
		return iataCode;
	}

	public void setIataCode(String iataCode) {
		this.iataCode = iataCode;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getVad_id() {
		return vad_id;
	}

	public void setVad_id(String vad_id) {
		this.vad_id = vad_id;
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

	public Integer getReminder() {
		return reminder;
	}

	public void setReminder(Integer reminder) {
		this.reminder = reminder;
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

	public Integer getParentID() {
		return parentID;
	}

	public void setParentID(Integer parentID) {
		this.parentID = parentID;
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

	public RSAdd getExportAgent() {
		return this.exportAgent;
	}

	public void setExportAgent(RSAdd exportAgent) {
		this.exportAgent = exportAgent;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Integer getCreator() {
		return this.creator;
	}

	public void setCreator(Integer creator) {
		this.creator = creator;
	}

	public RSVad getVad() {
		return vad;
	}

	public void setVad(RSVad vad) {
		this.vad = vad;
	}

	public Set<RSAddAdd> getAddAdd() {
		return addAdd;
	}

	public void setAddAdd(Set<RSAddAdd> addAdd) {
		this.addAdd = addAdd;
	}

	public String getStreetFromSet() {
		if(this.addAdd == null)
			return null;
		for (RSAddAdd rsAddAdd : this.addAdd) {
			if (rsAddAdd.getAdd_add_type().equals("s")) {
				return rsAddAdd.getAdd_add_value();
			}
		}
		return null;
	}

	public String getCityFromSet() {
		if(this.addAdd == null)
			return null;
		for (RSAddAdd rsAddAdd : this.addAdd) {
			if (rsAddAdd.getAdd_add_type().equals("c")) {
				return rsAddAdd.getAdd_add_value();
			}
		}
		return null;
	}

	public String getZipFromSet() {
		for (RSAddAdd rsAddAdd : this.addAdd) {
			if (rsAddAdd.getAdd_add_type().equals("z")) {
				return rsAddAdd.getAdd_add_value();
			}
		}
		return null;
	}

	public String getZipAndCityFromSet() {
		for (RSAddAdd rsAddAdd : this.addAdd) {
			if (rsAddAdd.getAdd_add_type().equals("zc")) {
				return rsAddAdd.getAdd_add_value();
			}
		}
		return null;
	}

	public String getCityAndZipFromSet() {
		for (RSAddAdd rsAddAdd : this.addAdd) {
			if (rsAddAdd.getAdd_add_type().equals("cz")) {
				return rsAddAdd.getAdd_add_value();
			}
		}
		return null;
	}

	public String getPOBoxFromSet() {
		for (RSAddAdd rsAddAdd : this.addAdd) {
			if (rsAddAdd.getAdd_add_type().equals("po")) {
				return rsAddAdd.getAdd_add_value();
			}
		}
		return null;
	}

	public String getContactPersonFromSet() {
		for (RSAddAdd rsAddAdd : this.addAdd) {
			if (rsAddAdd.getAdd_add_type().equals("cp")) {
				return rsAddAdd.getAdd_add_value();
			}
		}
		return null;
	}

	public RSAdd getObjectparentID() {
		return ObjectparentID;
	}

	public void setObjectparentID(RSAdd objectparentID) {
		this.ObjectparentID = objectparentID;
	}

	public RSAp getObjectAirport() {
		return objectAirport;
	}

	public void setObjectAirport(RSAp objectAirport) {
		this.objectAirport = objectAirport;
	}

	public String getFaxString() {
		return faxString;
	}

	public void setFaxString(String faxString) {
		this.faxString = faxString;
	}

	public String getTelpString() {
		return telpString;
	}

	public void setTelpString(String telpString) {
		this.telpString = telpString;
	}

	public String getEmailString() {
		return emailString;
	}

	public Integer getS_id() {
		return s_id;
	}

	public void setS_id(Integer s_id) {
		this.s_id = s_id;
	}

	public void setEmailString(String emailString) {
		this.emailString = emailString;
	}

	public Integer getImportAgentInt() {
		return importAgentInt;
	}

	public void setImportAgentInt(Integer importAgentInt) {
		this.importAgentInt = importAgentInt;
	}

	public Integer getExportAgentInt() {
		return exportAgentInt;
	}

	public void setExportAgentInt(Integer exportAgentInt) {
		this.exportAgentInt = exportAgentInt;
	}

	public void setDisplayString(String displayString)
	{
		this.displayString = displayString;
	}

	public String getDisplayString(){
		if(this.displayString == null){
			this.displayString = this.add_id +", "+ this.companyName;
		}
		return this.displayString;
	}

	public RSDi getDistrictObject() {
		return districtObject;
	}

	public void setDistrictObject(RSDi districtObject) {
		this.districtObject = districtObject;
	}

	public void setUsingLC(Boolean usingLC) {
		this.usingLC = usingLC;
	}

	public Boolean getUsingLC() {
		return usingLC;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	
	/**
	 * @return the accNo
	 */
	public String getAccNo() {
		return accNo;
	}

	/**
	 * @param accNo the accNo to set
	 */
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public Integer getAddKickbackId() {
		return addKickbackId;
	}

	public void setAddKickbackId(Integer addKickbackId) {
		this.addKickbackId = addKickbackId;
	}

	public String getRateChargesType() {
		return rateChargesType;
	}

	public void setRateChargesType(String rateChargesType) {
		this.rateChargesType = rateChargesType;
	}

	public Integer getKickback() {
		return kickback;
	}

	public void setKickback(Integer kickback) {
		this.kickback = kickback;
	}
}
