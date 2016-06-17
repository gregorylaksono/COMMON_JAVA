/*
 *
 * To change the template for this generated file go to Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package de.act.common.types.nonstaticobjects;

import java.util.Date;

import de.act.common.types.staticobjects.RSState;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class RFStat implements java.io.Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2440715426454350352L;
	private Long id = -1L;
	private String fId;
	private Integer part;
	private String statId;
	private String remark;
	private Long addId;
	private String userName;
	private Date corr;
	private RSState state;
	private String ap3Lc;

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getfId()
	{
		return fId;
	}

	public void setfId(String fId)
	{
		this.fId = fId;
	}

	public String getStatId()
	{
		return statId;
	}

	public void setStatId(String statId)
	{
		this.statId = statId;
	}

	public String getRemark()
	{
		return remark;
	}

	public void setRemark(String remark)
	{
		this.remark = remark;
	}

	public Date getCorr()
	{
		return corr;
	}

	public void setCorr(Date corr)
	{
		this.corr = corr;
	}

	public RSState getState()
	{
		return state;
	}

	public void setState(RSState state)
	{
		this.state = state;
	}

	public Integer getPart()
	{
		return part;
	}

	public void setPart(Integer part)
	{
		this.part = part;
	}

	public Long getAddId()
	{
		return addId;
	}

	public void setAddId(Long addId)
	{
		this.addId = addId;
	}

	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public String getAp3Lc()
	{
		return ap3Lc;
	}

	public void setAp3Lc(String ap3Lc)
	{
		this.ap3Lc = ap3Lc;
	}

	
}
