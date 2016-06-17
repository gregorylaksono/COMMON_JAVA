package de.act.common.types.staticobjects;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class RSFltMmt implements java.io.Serializable, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3777982897108782523L;
	private Long flt_id;
	private Double mmt;
	private Long mmt_set_by;
	private String mmt_set_name;
	
	public Long getFlt_id()
	{
		return flt_id;
	}

	public void setFlt_id(Long flt_id)
	{
		this.flt_id = flt_id;
	}

	public Double getMmt()
	{
		return mmt;
	}

	public void setMmt(Double mmt)
	{
		this.mmt = mmt;
	}

	public Long getMmt_set_by()
	{
		return mmt_set_by;
	}

	public void setMmt_set_by(Long mmt_set_by)
	{
		this.mmt_set_by = mmt_set_by;
	}

	public String getMmt_set_name()
	{
		return mmt_set_name;
	}

	public void setMmt_set_name(String mmt_set_name)
	{
		this.mmt_set_name = mmt_set_name;
	}

	@Override
	public RSFltMmt clone() throws CloneNotSupportedException
	{
		RSFltMmt temp = (RSFltMmt)super.clone();
		
		return temp;
	}
}
