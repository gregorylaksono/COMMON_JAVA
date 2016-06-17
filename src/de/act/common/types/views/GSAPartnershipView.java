package de.act.common.types.views;

import java.io.Serializable;

import de.act.common.types.staticobjects.RSVad;

public class GSAPartnershipView implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8390791775831585966L;
	private long partnershipId;
	private String caId;
	private String ca_2lc;
	private String ca_3dg;
	private Integer gsaAddId;
	private Integer status;
	private RSVad vad;
	
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
	public String getCa_2lc() {
		return ca_2lc;
	}
	public void setCa_2lc(String ca_2lc) {
		this.ca_2lc = ca_2lc;
	}
	public String getCa_3dg() {
		return ca_3dg;
	}
	public void setCa_3dg(String ca_3dg) {
		this.ca_3dg = ca_3dg;
	}
	public Integer getGsaAddId() {
		return gsaAddId;
	}
	public void setGsaAddId(Integer gsaAddId) {
		this.gsaAddId = gsaAddId;
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

}
