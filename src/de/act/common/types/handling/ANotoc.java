/**
 *
 */
package de.act.common.types.handling;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class ANotoc implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -88259488639020793L;
	private Long id;
	private Long maniId;
	private String signNotoc;
	private String signSupervisor;
	private String signCaptain;
	private String otherInfo;
	private Date corr;
	private AManifest manifest;
	private Set<ANotocItem> notocItems;

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public Long getManiId()
	{
		return maniId;
	}

	public void setManiId(Long maniId)
	{
		this.maniId = maniId;
	}

	public String getSignNotoc()
	{
		return signNotoc;
	}

	public void setSignNotoc(String signNotoc)
	{
		this.signNotoc = signNotoc;
	}

	public String getSignSupervisor()
	{
		return signSupervisor;
	}

	public void setSignSupervisor(String signSupervisor)
	{
		this.signSupervisor = signSupervisor;
	}

	public String getSignCaptain()
	{
		return signCaptain;
	}

	public void setSignCaptain(String signCaptain)
	{
		this.signCaptain = signCaptain;
	}

	public String getOtherInfo()
	{
		return otherInfo;
	}

	public void setOtherInfo(String otherInfo)
	{
		this.otherInfo = otherInfo;
	}

	public Date getCorr()
	{
		return corr;
	}

	public void setCorr(Date corr)
	{
		this.corr = corr;
	}

	public AManifest getManifest()
	{
		return manifest;
	}

	public void setManifest(AManifest manifest)
	{
		this.manifest = manifest;
	}

	public Set<ANotocItem> getNotocItems()
	{
		return notocItems;
	}

	public void setNotocItems(Set<ANotocItem> notocItems)
	{
		this.notocItems = notocItems;
	}

}
