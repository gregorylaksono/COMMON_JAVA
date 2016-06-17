package de.act.common.types.views;

import java.io.Serializable;

public class ASccValueView implements Serializable
{
	private static final long serialVersionUID = 4182699037204271518L;
		
	private Long aSccValueId;
	private Long aSccId;
	private String val;
	private Integer sccType;
	
	public Long getaSccValueId() {
		return aSccValueId;
	}
	public void setaSccValueId(Long aSccValueId) {
		this.aSccValueId = aSccValueId;
	}
	public Long getaSccId() {
		return aSccId;
	}
	public void setaSccId(Long aSccId) {
		this.aSccId = aSccId;
	}
	public String getVal() {
		return val;
	}
	public void setVal(String val) {
		this.val = val;
	}
	public Integer getSccType() {
		return sccType;
	}
	public void setSccType(Integer sccType) {
		this.sccType = sccType;
	}
	
}
