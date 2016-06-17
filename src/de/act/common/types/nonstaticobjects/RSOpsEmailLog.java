package de.act.common.types.nonstaticobjects;

import java.io.Serializable;
import java.util.Date;

public class RSOpsEmailLog implements Serializable
{


	/**
	 * 
	 */
	private static final long serialVersionUID = 7342937722992211007L;
	private Long id;
	private String ca_id;
	private Date flt_date;
	private String airport;

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getCa_id()
	{
		return ca_id;
	}

	public void setCa_id(String ca_id)
	{
		this.ca_id = ca_id;
	}

	public Date getFlt_date()
	{
		return flt_date;
	}

	public void setFlt_date(Date flt_date)
	{
		this.flt_date = flt_date;
	}

	public String getAirport()
	{
		return airport;
	}

	public void setAirport(String airport)
	{
		this.airport = airport;
	}

}
