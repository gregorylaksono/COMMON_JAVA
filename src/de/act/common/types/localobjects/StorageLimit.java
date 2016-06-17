/**
 * @file StorageLimit.java
 */
package de.act.common.types.localobjects;

import java.io.Serializable;

import org.apache.log4j.Logger;

import de.act.common.types.staticobjects.RSAdd;

/**
 * StorageLimit.java:
 * 
 * @hibernate.class table="d_storage_limit"
 */
@SuppressWarnings("unused")
@org.jboss.cache.aop.annotation.PojoCacheable
public final class StorageLimit implements Serializable
{
	/**
	 * Logger for this class
	 */
	transient private static final Logger log = Logger.getLogger(StorageLimit.class);
	private static final long serialVersionUID = 74695538225453463L;
	// private static int instances = 0;
	// private Log myLog;
	private Long addId;
	private Integer limitDay;
	private Integer warningDay;
	private RSAdd add;

	public StorageLimit()
	{
		// myLog = LogFactory.getLog(Storage.class);
		// myLog.info("new Storage Nr."+instances);
	}

	public Long getAddId()
	{
		return addId;
	}

	public void setAddId(Long addId)
	{
		this.addId = addId;
	}

	public Integer getLimitDay()
	{
		return limitDay;
	}

	public void setLimitDay(Integer limitDay)
	{
		this.limitDay = limitDay;
	}

	public Integer getWarningDay()
	{
		return warningDay;
	}

	public void setWarningDay(Integer warningDay)
	{
		this.warningDay = warningDay;
	}

	public RSAdd getAdd()
	{
		return add;
	}

	public void setAdd(RSAdd add)
	{
		this.add = add;
	}

	/**
	 * 10.01.2006
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		int re = 17;
		if(this.addId != null)
		{
			re += 37 * this.addId.hashCode();
			return re;
		}
		else
			return super.hashCode();
	}
}
