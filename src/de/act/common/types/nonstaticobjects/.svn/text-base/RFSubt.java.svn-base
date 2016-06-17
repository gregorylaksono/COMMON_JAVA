/**
 * @author Admin
 * @since 14.03.2006
 */
package de.act.common.types.nonstaticobjects;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class RFSubt implements Serializable{

	private static final long serialVersionUID = 5266373141717134868L;
	private Long id= -1L;
	private String type;
	private String iataCode;
	private String dgrRefNo;
	private String company;
	private String street;
	private String place;
	private String country;
	private Date corr;
	private  Set<RFSubtTcom> tcoms;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getCorr() {
		return corr;
	}

	public void setCorr(Date date) {
		this.corr = date;
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj== this) return true;
		if (obj instanceof RFSubt) {
			RFSubt s = (RFSubt) obj;
			return new EqualsBuilder().append(s.type, type).append(s.iataCode, iataCode).append(s.dgrRefNo, dgrRefNo).append(s.street, street).append(s.company, company).append(s.place, place).append(s.country, country).append(s.corr, corr).isEquals();
		}
		return false;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(type).append(iataCode).append(dgrRefNo).append(street).append(company).append(place).append(country).append(corr).toHashCode();
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		if (this.company!=null)
			return this.company.toString();
		else
			return "f_subt";
	}

	public Set<RFSubtTcom> getTcoms() {
		return tcoms;
	}

	public void setTcoms(Set<RFSubtTcom> tcoms) {
		this.tcoms = tcoms;
	}

	/*
	 *
subt_id int8 NOT NULL DEFAULT nextval('f_subt_subt_id_seq'::regclass),
  att_id int8,
  subt_type cn_add_type,
  subt_iata_code varchar(30),
  subt_dgr_ref_no varchar(30),
  subt_company varchar(70),
  subt_street varchar(70),
  subt_place varchar(70),
  subt_country varchar(50),
  subt_corr timestamp,
	 */
}
