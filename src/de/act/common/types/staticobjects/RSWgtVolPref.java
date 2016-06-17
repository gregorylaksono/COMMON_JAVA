package de.act.common.types.staticobjects;

public final class RSWgtVolPref implements java.io.Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9086489841626919504L;

	private Long id;
	private String ca_id;
	private String co_2lc;
	private Integer is_active;
	private Double pref_value;

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

	public String getCo_2lc()
	{
		return co_2lc;
	}

	public void setCo_2lc(String co_2lc)
	{
		this.co_2lc = co_2lc;
	}

	public Integer getIs_active()
	{
		return is_active;
	}

	public void setIs_active(Integer is_active)
	{
		this.is_active = is_active;
	}

	public Double getPref_value()
	{
		return pref_value;
	}

	public void setPref_value(Double pref_value)
	{
		this.pref_value = pref_value;
	}

}