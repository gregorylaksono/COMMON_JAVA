package de.act.common.types.staticobjects;

import java.io.Serializable;

public class InsuranceStock implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 511098160690609242L;
	
	private Long id;
	private String addId;
	private String policyStart;
	private String policyNext;
	private String policyWarn;
	private Boolean isActive;
	private RSVad vadd;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAddId() {
		return addId;
	}
	public void setAddId(String addId) {
		this.addId = addId;
	}
	public String getPolicyStart() {
		return policyStart;
	}
	public void setPolicyStart(String policyStart) {
		this.policyStart = policyStart;
	}
	public String getPolicyNext() {
		return policyNext;
	}
	public void setPolicyNext(String policyNext) {
		this.policyNext = policyNext;
	}
	public String getPolicyWarn() {
		return policyWarn;
	}
	public void setPolicyWarn(String policyWarn) {
		this.policyWarn = policyWarn;
	}
	public RSVad getVadd() {
		return vadd;
	}
	public void setVadd(RSVad vadd) {
		this.vadd = vadd;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

}