package de.act.common.types.localobjects;

import java.io.Serializable;

import de.act.common.types.staticobjects.RSOt1lc;
import de.act.common.types.staticobjects.RSOt2lc;

@org.jboss.cache.aop.annotation.PojoCacheable
public class RDStorageUnit implements Serializable, Comparable<RDStorageUnit>
{

	private static final long serialVersionUID = 7972217362313144556L;
	private String ot_unit = null;
	private Integer status = null;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Comparable#compareTo(T)
	 */
	public int compareTo(RDStorageUnit o)
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
		return super.hashCode();
	}

	public String getOt_unit()
	{
		return ot_unit;
	}

	public void setOt_unit(String ot_unit)
	{
		this.ot_unit = ot_unit;
	}

	public Integer getStatus()
	{
		return status;
	}

	public void setStatus(Integer status)
	{
		this.status = status;
	}

}