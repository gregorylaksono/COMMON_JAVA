package de.act.common.types.views;

import java.util.Date;

public class Address implements java.io.Serializable {
	private String s_id;
	private String id;
	private String parent_id; //ADD
	private String Name ;
	private String addressOrContact1;
	private String addressOrContact2;
	private String addressOrContact3;
	private String addressOrContact4;
	private String contact1Info;
	private String contact2Info;
	private String contact3Info;
	private String contact4Info;
	private String ZIP;
	private String state;
	private String co_2lc; //ADD
	private String di_2lc;//ADD
	private String ap_3lc;
	private String district;
	private String Country;
	//private RSCo object_country;//ADD
	private String contactPerson;
	private Boolean bank;
	private Boolean government;
	private String importAgentkey;
	private String importAgent;
	private String exportAgentkey;
	private String exportAgent;
	//private RSAdd object_importAgent;//ADD
	//private RSAdd object_exportAgent;//ADD
	private String airport;
	private String airportName;
	private String iataCode;
	private String dgrRefNo;
	private String type;
	private String creator;
	private Date createDate;
	private Date validationDate;	
	
	private String Tel;
	private String Fax;
	private String EMail;
	
	private String telFieldType;
	private String faxFieldType;
	private String emailFieldType;
	
	private String Street;
	private String StreetNo;
	private String place;
	
	
	public String getS_id() {
		return s_id;
	}
	public void setS_id(String s_id) {
		this.s_id = s_id;
	}
	public Date getCreateDate() {
		return this.createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getCreator() {
		return this.creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public Boolean getBank() {
		return this.bank;
	}
	public void setBank(Boolean bank) {
		this.bank = bank;
	}
	public Boolean getGovernment() {
		return this.government;
	}
	public void setGovernment(Boolean government) {
		this.government = government;
	}
	public String getImportAgent() {
		return this.importAgent;
	}
	public void setImportAgent(String importAgent) {
		this.importAgent = importAgent;
	}
	public String getState() {
		return this.state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Date getValidationDate() {
		return this.validationDate;
	}
	public void setValidationDate(Date validationDate) {
		this.validationDate = validationDate;
	}
	public String getDgrRefNo() {
		return this.dgrRefNo;
	}
	public void setDgrRefNo(String dgrRefNo) {
		this.dgrRefNo = dgrRefNo;
	}
	public String getIataCode() {
		return this.iataCode;
	}
	public void setIataCode(String iataCode) {
		this.iataCode = iataCode;
	}
	public String getPlace() {
		return this.place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCountry() {
		return this.Country;
	}
	public void setCountry(String country) {
		this.Country = country;
	}
	public String getEMail() {
		return this.EMail;
	}
	public void setEMail(String mail) {
		this.EMail = mail;
	}
	public String getFax() {
		return this.Fax;
	}
	public void setFax(String fax) {
		this.Fax = fax;
	}
	public String getName() {
		return this.Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getStreet() {
		return this.Street;
	}
	public void setStreet(String street) {
		this.Street = street;
	}
	public String getStreetNo() {
		return this.StreetNo;
	}
	public void setStreetNo(String streetNo) {
		this.StreetNo = streetNo;
	}
	public String getTel() {
		return this.Tel;
	}
	public void setTel(String tel) {

		this.Tel = tel;
	}
	public String getZIP() {
		return this.ZIP;
	}
	public void setZIP(String zip) {
		this.ZIP = zip;
	}
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @param airport
	 */
	 public void setAirport(String airport) {
		this.airport = airport;
	}
	public String getAirport() {
		return this.airport;
	}
	/**
	 * @param contactPerson
	 */
	public void setContactPerson(String contactPerson) {
		this.contactPerson =contactPerson;
	}
	public String getContactPerson() {
		return this.contactPerson;
	}
	public String getExportAgent() {
		return this.exportAgent;
	}
	public void setExportAgent(String exportAgent) {
		this.exportAgent = exportAgent;
	}

	public String getParent_id() {
		return parent_id;
	}
	public void setParent_id(String parent_id) {
		this.parent_id = parent_id;
	}
	public String getDi_2lc() {
		return di_2lc;
	}
	public void setDi_2lc(String di_2lc) {
		this.di_2lc = di_2lc;
	}	
	
	public String getAddressOrContact1() {
		return addressOrContact1;
	}
	
	public void setAddressOrContact1(String addressOrContact1) {
		this.addressOrContact1 = addressOrContact1;
	}
	
	public String getAddressOrContact2() {
		return addressOrContact2;
	}
	
	public void setAddressOrContact2(String addressOrContact2) {
		this.addressOrContact2 = addressOrContact2;
	}
	
	public String getAddressOrContact3() {
		return addressOrContact3;
	}
	
	public void setAddressOrContact3(String addressOrContact3) {
		this.addressOrContact3 = addressOrContact3;
	}
	
	public String getAddressOrContact4() {
		return addressOrContact4;
	}
	
	public void setAddressOrContact4(String addressOrContact4) {
		this.addressOrContact4 = addressOrContact4;
	}
	
	public String getContact1Info() {
		return contact1Info;
	}
	
	public void setContact1Info(String contact1Info) {
		this.contact1Info = contact1Info;
	}
	
	public String getContact2Info() {
		return contact2Info;
	}
	
	public void setContact2Info(String contact2Info) {
		this.contact2Info = contact2Info;
	}
	
	public String getContact3Info() {
		return contact3Info;
	}
	
	public void setContact3Info(String contact3Info) {
		this.contact3Info = contact3Info;
	}
	
	public String getContact4Info() {
		return contact4Info;
	}
	
	public void setContact4Info(String contact4Info) {
		this.contact4Info = contact4Info;
	}
	
	public String getCo_2lc() {
		return this.co_2lc;
	}
	
	public void setCo_2lc(String co_2lc) {
		this.co_2lc = co_2lc;
	}
	
	public String getAp_3lc() {
		return ap_3lc;
	}
	public void setAp_3lc(String ap_3lc) {
		this.ap_3lc = ap_3lc;
	}
	public String getTelFieldType() {
		return telFieldType;
	}
	
	public void setTelFieldType(String telFieldType) {
		this.telFieldType = telFieldType;
	}
	
	public String getFaxFieldType() {
		return faxFieldType;
	}
	
	public void setFaxFieldType(String faxFieldType) {
		this.faxFieldType = faxFieldType;
	}
	
	public String getEmailFieldType() {
		return emailFieldType;
	}
	
	public void setEmailFieldType(String emailFieldType) {
		this.emailFieldType = emailFieldType;
	}
	
	public String getAirportName() {
		return airportName;
	}
	
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
	
	public String getDistrict() {
		return district;
	}
	
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getImportAgentkey() {
		return importAgentkey;
	}
	public void setImportAgentkey(String importAgentkey) {
		this.importAgentkey = importAgentkey;
	}
	public String getExportAgentkey() {
		return exportAgentkey;
	}
	public void setExportAgentkey(String exportAgentkey) {
		this.exportAgentkey = exportAgentkey;
	}
}
