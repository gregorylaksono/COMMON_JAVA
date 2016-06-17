package de.act.common.types.staticobjects;

import java.io.Serializable;
import java.sql.Timestamp;

public class RsAcScc implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7768966026369876408L;
	
	private long id;
	private int value;
	private long acId;
	private RSScc scc;
	private Timestamp corr;
	
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
	
	public long getAcId() {
		return acId;
	}
	public void setAcId(long acId) {
		this.acId = acId;
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
	
}
