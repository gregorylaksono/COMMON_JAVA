package de.act.common.types.localobjects;

import java.io.Serializable;

import de.act.common.types.staticobjects.RSOt1lc;

@org.jboss.cache.aop.annotation.PojoCacheable
public class RDStorageCharges implements Serializable, Comparable<RDStorageCharges>
{

	private static final long serialVersionUID = 7972217369723144556L;
	private RDOt2lcStorage ot_2lc = null;
	private RSOt1lc ot_1lc = null;
	private String ot_1lc_code = null;
	private String ot_2lc_code = null;
	private Double ot_rate = null;
	private String ot_unit = null;
	private Integer ot_rule = null;
	private Double ot_rule_value = null;
	private Integer ot_days = null;
	private Long owner_add_id = null; // add_id

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Comparable#compareTo(T)
	 */
	public int compareTo(RDStorageCharges o)
	{
		return toString().compareToIgnoreCase((o).toString());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
		{
			return true;
		}
		if (obj instanceof RDStorageCharges)
		{
			if (this.ot_1lc != null && this.ot_2lc != null && ((RDStorageCharges) obj).ot_1lc != null
					&& ((RDStorageCharges) obj).ot_2lc != null)
			{
				return ((RDStorageCharges) obj).ot_1lc.equals(ot_1lc) && ((RDStorageCharges) obj).ot_2lc.equals(ot_2lc);
			}
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		if (this.ot_1lc != null && this.ot_2lc != null)
			return ot_1lc.hashCode() * 37 + ot_2lc.hashCode() * 17;
		else
			return super.hashCode();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		if (this.ot_1lc != null && this.ot_2lc != null)
			return this.ot_1lc.toString() + " - " + this.ot_2lc.toString();
		else
			return "";
	}

	public RSOt1lc getOt_1lc()
	{
		return ot_1lc;
	}

	public void setOt_1lc(RSOt1lc ot_1lc)
	{
		this.ot_1lc = ot_1lc;
	}

	public RDOt2lcStorage getOt_2lc()
	{
		return ot_2lc;
	}

	public void setOt_2lc(RDOt2lcStorage ot_2lc)
	{
		this.ot_2lc = ot_2lc;
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

	public String getOt_2lc_code()
	{
		return ot_2lc_code;
	}

	public void setOt_2lc_code(String ot_2lc_code)
	{
		this.ot_2lc_code = ot_2lc_code;
	}

	public Integer getOt_days()
	{
		return ot_days;
	}

	public void setOt_days(Integer ot_days)
	{
		this.ot_days = ot_days;
	}

	public Integer getOt_rule()
	{
		return ot_rule;
	}

	public void setOt_rule(Integer ot_rule)
	{
		this.ot_rule = ot_rule;
	}

	public Double getOt_rule_value()
	{
		return ot_rule_value;
	}

	public void setOt_rule_value(Double ot_rule_value)
	{
		this.ot_rule_value = ot_rule_value;
	}
	
}