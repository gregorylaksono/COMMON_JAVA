/**
 * 
 */
package de.act.common.jmstypes.beanwrapper;

import java.io.Serializable;
import java.util.List;

public class JMSObjectWrapper implements Serializable
{
	private static final long serialVersionUID = 5207919402863170975L;
	private Long add_id;
	private String ap_3lc; 
	private String user_id;
	private String state;
	private Integer blackboxID;
	private Object mainObject;
	private List objectList;

	public Long getAdd_id()
	{
		return add_id;
	}

	public void setAdd_id(Long add_id)
	{
		this.add_id = add_id;
	}

	public String getAp_3lc()
	{
		return ap_3lc;
	}

	public void setAp_3lc(String ap_3lc)
	{
		this.ap_3lc = ap_3lc;
	}

	public String getUser_id()
	{
		return user_id;
	}

	public void setUser_id(String user_id)
	{
		this.user_id = user_id;
	}

	public String getState()
	{
		return state;
	}

	public void setState(String state)
	{
		this.state = state;
	}

	public Integer getBlackboxID()
	{
		return blackboxID;
	}

	public void setBlackboxID(Integer blackboxID)
	{
		this.blackboxID = blackboxID;
	}

	public Object getMainObject()
	{
		return mainObject;
	}

	public void setMainObject(Object mainObject)
	{
		this.mainObject = mainObject;
	}

	public List getObjectList()
	{
		return objectList;
	}

	public void setObjectList(List objectList)
	{
		this.objectList = objectList;
	}
	
	
}
