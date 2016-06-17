package de.act.common.types.staticobjects;

import java.io.Serializable;
import java.util.Date;

public class RSTimeZoneLog implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1456210719988201154L;
	
	private long id;
	private String ap3lc;
	private Long timeZone;
	private Date logDate;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getAp3lc() {
		return ap3lc;
	}
	public void setAp3lc(String ap3lc) {
		this.ap3lc = ap3lc;
	}
	
	public Long getTimeZone() {
		return timeZone;
	}
	public void setTimeZone(Long timeZone) {
		this.timeZone = timeZone;
	}
	
	public Date getLogDate() {
		return logDate;
	}
	public void setLogDate(Date logDate) {
		this.logDate = logDate;
	}
	
}
