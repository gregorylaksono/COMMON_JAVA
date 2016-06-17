/*
 * Created on 02.09.2005
 *
 * To change the template for this generated file go to Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package de.act.common.types.nonstaticobjects;

import java.util.Date;

import de.act.common.types.staticobjects.Cons;
import de.act.common.types.staticobjects.RSAp;
import de.act.common.types.staticobjects.RSState;

@SuppressWarnings("unused")
@org.jboss.cache.aop.annotation.PojoCacheable
public final class RFStatView implements java.io.Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2321167896454350352L;
	private Long id = -1L;
	private String fId;
	private Integer part;
	private String statId;
	private String remark;
	private Long addId;
	private String userName;
	private Date corr;
	private RSState state;
	private RSAp ap3Lc;
	private RSAp shipmentAp3Lc;
	private String maniStatId;
	
	private String corrString;

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
		if(corr != null)
			this.corrString = Cons.dateToString(corr);
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

	public RSAp getAp3Lc()
	{
		return ap3Lc;
	}

	public void setAp3Lc(RSAp ap3Lc)
	{
		this.ap3Lc = ap3Lc;
	}

	public RSAp getShipmentAp3Lc()
	{
		return shipmentAp3Lc;
	}

	public void setShipmentAp3Lc(RSAp shipmentAp3Lc)
	{
		this.shipmentAp3Lc = shipmentAp3Lc;
	}

	public String getManiStatId()
	{
		return maniStatId;
	}

	public void setManiStatId(String maniStatId)
	{
		this.maniStatId = maniStatId;
	}

	public String getCorrString()
	{
		return corrString;
	}

	public void setCorrString(String corrString)
	{
		this.corrString = corrString;
	}

}
