package de.act.common.types.staticobjects;

import java.io.Serializable;

import de.act.common.types.views.AddressView;

public class GSAPartnership implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1944792837832048557L;
	private long partnershipId;
	private String caId;
	private long gsaAddId;
	private String ipAddress;
	private Integer status;
	private RSVad vad;
	private String caIdDisplayName; 
	private String gsaDisplayName;
	private AddressView address;

	public long getPartnershipId() {
		return partnershipId;
	}

	public void setPartnershipId(long partnershipId) {
		this.partnershipId = partnershipId;
	}

	public String getCaId() {
		return caId;
	}

	public void setCaId(String caId) {
		this.caId = caId;
	}

	public long getGsaAddId() {
		return gsaAddId;
	}

	public void setGsaAddId(long gsaAddId) {
		this.gsaAddId = gsaAddId;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public RSVad getVad() {
		return vad;
	}

	public void setVad(RSVad vad) {
		this.vad = vad;
	}

	public String getCaIdDisplayName() {
		return caIdDisplayName;
	}

	public void setCaIdDisplayName(String caIdDisplayName) {
		this.caIdDisplayName = caIdDisplayName;
	}

	public String getGsaDisplayName() {
		return gsaDisplayName;
	}

	public void setGsaDisplayName(String gsaDisplayName) {
		this.gsaDisplayName = gsaDisplayName;
	}

	public AddressView getAddress() {
		return address;
	}

	public void setAddress(AddressView address) {
		this.address = address;
	}

	@Override
	public boolean equals(Object obj)
	{
		if(obj != null && obj instanceof GSAPartnership)
		{
			GSAPartnership bean = (GSAPartnership)obj;
			if(bean.getPartnershipId() == this.getPartnershipId())
			{
				return true;
			}
		}
		
		return false;
	}
}
