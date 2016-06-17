package de.act.common.types.staticobjects;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;


import de.act.common.types.staticobjects.RSCo;

@org.jboss.cache.aop.annotation.PojoCacheable
public class RCAdd implements Serializable{
	private static final long serialVersionUID = 1968351560391337569L;
	private Integer add_id;
	private String companyName;
	private String di_2lc = null;
	private RSCo country;
	private String gender;
	private String airport;
	private String street = null;
	private String no = null;
	private String place = null;
	private String contactPerson = null;
	private String firstName;
	private String lastName = null;
	private String zip = null;
	private String state;
	private String telpString;
	private String faxString;
	private String emailString;
	private String type;
	private Date createDate;
	private String contactName;
	private String meansOfContact;
	private String actUserName;
	private Date verifiedTime;
	private Integer approved;
	private String caId;
	private String currency;
	private Integer isTAndCConfirmed;
	private String ipAddress;
	private Integer addCheck;
	private String longitude;
	private String latitude;
	private Set<RCAddAdd> add_add;
	private Set<RCAddConf> add_conf;
	
	public RCAdd(){
	}
	
	public RCAdd(Integer add_id){
		this.add_id = add_id;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCaId() {
		return caId;
	}
	public void setCaId(String caId) {
		this.caId = caId;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getMeansOfContact() {
		return meansOfContact;
	}
	public void setMeansOfContact(String meansOfContact) {
		this.meansOfContact = meansOfContact;
	}
	public String getActUserName() {
		return actUserName;
	}
	public void setActUserName(String actUserName) {
		this.actUserName = actUserName;
	}
	public Date getVerifiedTime() {
		return verifiedTime;
	}
	public void setVerifiedTime(Date verifiedTime) {
		this.verifiedTime = verifiedTime;
	}
	public Integer getApproved() {
		return approved;
	}
	public void setApproved(Integer approved) {
		this.approved = approved;
	}
	public Integer getAdd_id() {
		return add_id;
	}
	public void setAdd_id(Integer add_id) {
		this.add_id = add_id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getDi_2lc() {
		return di_2lc;
	}
	public void setDi_2lc(String di_2lc) {
		this.di_2lc = di_2lc;
	}
	public RSCo getCountry() {
		return country;
	}
	public void setCountry(RSCo country) {
		this.country = country;
	}
	public String getAirport() {
		return airport;
	}
	public void setAirport(String airport) {
		this.airport = airport;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
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
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getTelpString() {
		return telpString;
	}
	public void setTelpString(String telpString) {
		this.telpString = telpString;
	}
	public String getFaxString() {
		return faxString;
	}
	public void setFaxString(String faxString) {
		this.faxString = faxString;
	}
	public String getEmailString() {
		return emailString;
	}
	public void setEmailString(String emailString) {
		this.emailString = emailString;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public Integer getIsTAndCConfirmed() {
		return isTAndCConfirmed;
	}
	public void setIsTAndCConfirmed(Integer isTAndCConfirmed) {
		this.isTAndCConfirmed = isTAndCConfirmed;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public Set<RCAddAdd> getAdd_add() {
		return add_add;
	}
	public void setAdd_add(Set<RCAddAdd> add_add) {
		this.add_add = add_add;
	}
	public Set<RCAddConf> getAdd_conf() {
		return add_conf;
	}
	public void setAdd_conf(Set<RCAddConf> add_conf) {
		this.add_conf = add_conf;
	}
	public Integer getAddCheck() {
		return addCheck;
	}
	public void setAddCheck(Integer addCheck) {
		this.addCheck = addCheck;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
}
