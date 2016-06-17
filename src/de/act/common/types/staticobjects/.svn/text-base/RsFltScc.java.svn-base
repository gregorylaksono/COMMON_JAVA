package de.act.common.types.staticobjects;

import java.io.Serializable;
import java.sql.Timestamp;

public class RsFltScc implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -493816706956388618L;
	
	private long id;
	private int value;
	private RSFlt flt;
	private RSScc scc;
	private Timestamp corr;
	private Long addId;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	public boolean isEnabled()
	{
		return (value == 1);
	}
	public void setEnabled(boolean enabled)
	{
		value = enabled ? 1 : 0;
	}
	
	public RSFlt getFlt() {
		return flt;
	}
	public void setFlt(RSFlt flt) {
		this.flt = flt;
	}
	
	public RSScc getScc() {
		return scc;
	}
	public void setScc(RSScc scc) {
		this.scc = scc;
	}
	
	public Timestamp getCorr() {
		return corr;
	}
	public void setCorr(Timestamp corr) {
		this.corr = corr;
	}
	public Long getAddId()
	{
		return addId;
	}
	public void setAddId(Long addId)
	{
		this.addId = addId;
	}

	
}
