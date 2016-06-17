package de.act.common.types.staticobjects;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import de.act.common.types.views.AddressView;

/**
 * @author Martin Sachs
 * @since 1.0 - 13.07.2006
 */
public class ZHandlingAirport implements Serializable {

	private static final long serialVersionUID = -6409617095888969175L;
	private String ap_3lc;
	private String ca_id;
	private String service;
	private Long add_id;
	private String vad_id;
	private AddressView address;
	private RSAp airport;
	private RSVad validation;
	private RSCa carrier;
	private Long id;
	private String ca_2lc;
	private Long creatorAddId;
	private String ha_type; //i = internal, c = CargoIMP
	private List<RSAddReplyEmail> emails;
	private RSCimpAdd cimpAdd;
	private String ca_3dg;

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == this)return true;
		if (obj instanceof ZHandlingAirport) {
			ZHandlingAirport z = (ZHandlingAirport) obj;
			return new EqualsBuilder().append(this.ap_3lc, z.ap_3lc).append(this.ca_id, z.ca_id).append(this.service, z.service).isEquals();
		}
		return false;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {        
		return new HashCodeBuilder().append(this.ap_3lc).append(this.ca_id).append(this.service).toHashCode();
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.ap_3lc+"/"+this.address+"/"+this.ca_id+"/"+this.service;
	}

	public Long getAdd_id() {
		return add_id;
	}

	public void setAdd_id(Long add_id) {
		this.add_id = add_id;
	}

	public AddressView getAddress() {
		return address;
	}

	public void setAddress(AddressView address) {
		this.address = address;
	}

	public RSAp getAirport() {
		return airport;
	}

	public void setAirport(RSAp airport) {
		this.airport = airport;
	}

	public String getAp_3lc() {
		return ap_3lc;
	}

	public void setAp_3lc(String ap_3lc) {
		this.ap_3lc = ap_3lc;
	}

	public String getCa_id() {
		return ca_id;
	}

	public void setCa_id(String ca_id) {
		this.ca_id = ca_id;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getVad_id() {
		return vad_id;
	}

	public void setVad_id(String vad_id) {
		this.vad_id = vad_id;
	}

	public RSVad getValidation() {
		return validation;
	}

	public void setValidation(RSVad validation) {
		this.validation = validation;
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public RSCa getCarrier()
	{
		return carrier;
	}

	public void setCarrier(RSCa carrier)
	{
		this.carrier = carrier;
	}

	public String getCa_2lc()
	{
		return ca_2lc;
	}

	public void setCa_2lc(String ca_2lc)
	{
		this.ca_2lc = ca_2lc;
	}

	public Long getCreatorAddId()
	{
		return creatorAddId;
	}

	public void setCreatorAddId(Long creatorAddId)
	{
		this.creatorAddId = creatorAddId;
	}

	public String getHa_type()
	{
		return ha_type;
	}

	public void setHa_type(String ha_type)
	{
		this.ha_type = ha_type;
	}

	public List<RSAddReplyEmail> getEmails()
	{
		return emails;
	}

	public void setEmails(List<RSAddReplyEmail> emails)
	{
		this.emails = emails;
	}

    public RSCimpAdd getCimpAdd() {
        return cimpAdd;
    }

    public void setCimpAdd(RSCimpAdd cimpAdd) {
        this.cimpAdd = cimpAdd;
    }

	public String getCa_3dg() {
		return ca_3dg;
	}

	public void setCa_3dg(String ca_3dg) {
		this.ca_3dg = ca_3dg;
	}
}
