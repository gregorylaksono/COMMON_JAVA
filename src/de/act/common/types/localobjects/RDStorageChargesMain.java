package de.act.common.types.localobjects;

import java.io.Serializable;

import de.act.common.types.staticobjects.RSOt1lc;

@org.jboss.cache.aop.annotation.PojoCacheable
public class RDStorageChargesMain implements Serializable, Comparable<RDStorageChargesMain>
{

	private static final long serialVersionUID = 7972217369723144556L;
	private RSOt1lc ot_1lc = null;
	private String ot_1lc_code = null;
	private Double ot_rate = null;
	private String ot_unit = null;
	private Integer ot_days = null;
	private Long owner_add_id = null; // add_id

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Comparable#compareTo(T)
	 */
	public int compareTo(RDStorageChargesMain o)
	{
		return toString().compareToIgnoreCase((o).toString());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		if (this.ot_1lc != null)
			return ot_1lc.hashCode() * 37;
		else
			return super.hashCode();
	}

	public RSOt1lc getOt_1lc()
	{
		return ot_1lc;
	}

	public void setOt_1lc(RSOt1lc ot_1lc)
	{
		this.ot_1lc = ot_1lc;
	}

	public Double getOt_rate()
	{
		return ot_rate;
	}

	public void setOt_rate(Double ot_rate)
	{
		this.ot_rate = ot_rate;
	}

	public String getOt_unit()
	{
		return ot_unit;
	}

	public void setOt_unit(String ot_unit)
	{
		this.ot_unit = ot_unit;
	}

	public Long getOwner_add_id()
	{
		return owner_add_id;
	}

	public void setOwner_add_id(Long owner_add_id)
	{
		this.owner_add_id = owner_add_id;
	}

	public String getOt_1lc_code()
	{
		return ot_1lc_code;
	}

	public void setOt_1lc_code(String ot_1lc_code)
	{
		this.ot_1lc_code = ot_1lc_code;
	}

	public Integer getOt_days()
	{
		return ot_days;
	}

	public void setOt_days(Integer ot_days)
	{
		this.ot_days = ot_days;
	}	
}