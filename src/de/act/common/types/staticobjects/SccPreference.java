package de.act.common.types.staticobjects;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class SccPreference implements java.io.Serializable, Comparable<SccPreference>
{

	private static final long serialVersionUID = -1877729531227577651L;
	
	private Long id;
	private String scc3Lc;
	private String sccName;
	private RSScc scc;
	private String caId;
	private Short preadvise = 0;
	private Short notocDangerous = 0;
	private Short notocOther = 0;
	private RSVad vad;
	private Boolean preadviseNeeded = false;
	private Boolean notocDangerousNeeded = false;
	private Boolean notocOtherNeeded = false;
	private Long addId;

	public SccPreference()
	{

	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getScc3Lc()
	{
		return scc3Lc;
	}

	public void setScc3Lc(String scc3Lc)
	{
		this.scc3Lc = scc3Lc;
	}

	public String getCaId()
	{
		return caId;
	}

	public void setCaId(String caId)
	{
		this.caId = caId;
	}

	public Short getPreadvise()
	{
		return preadvise;
	}

	public void setPreadvise(Short preadvise)
	{
		if(preadvise != null && preadvise == 1)
		{
			this.preadviseNeeded = true;
		}
		this.preadvise = preadvise;
	}

	public Short getNotocDangerous()
	{
		return notocDangerous;
	}

	public void setNotocDangerous(Short notoc)
	{
		if(notoc != null && notoc == 1)
		{
			this.notocDangerousNeeded = true;
		}
		this.notocDangerous = notoc;
	}
	
	public Short getNotocOther()
	{
		return notocOther;
	}

	public void setNotocOther(Short notoc)
	{
		if(notoc != null && notoc == 1)
		{
			this.notocOtherNeeded = true;
		}
		this.notocOther = notoc;
	}

	public RSVad getVad()
	{
		return vad;
	}

	public void setVad(RSVad vad)
	{
		this.vad = vad;
	}

	public Boolean getPreadviseNeeded()
	{
		return preadviseNeeded;
	}

	public void setPreadviseNeeded(Boolean preadviseNeeded)
	{
		this.preadviseNeeded = preadviseNeeded;
	}

	public String getSccName()
	{
		return sccName;
	}

	public void setSccName(String sccName)
	{
		this.sccName = sccName;
	}

	public RSScc getScc()
	{
		return scc;
	}

	public Boolean getNotocDangerousNeeded()
	{
		return notocDangerousNeeded;
	}

	public void setNotocDangerousNeeded(Boolean notocDangerousNeeded)
	{
		this.notocDangerousNeeded = notocDangerousNeeded;
	}

	public Boolean getNotocOtherNeeded()
	{
		return notocOtherNeeded;
	}

	public void setNotocOtherNeeded(Boolean notocOtherNeeded)
	{
		this.notocOtherNeeded = notocOtherNeeded;
	}

	public void setScc(RSScc scc)
	{
		if(scc != null)
		{
			this.sccName = scc.SCC_NAME;
		}
		this.scc = scc;
	}

	public int compareTo(SccPreference o)
	{
		if (this.id != null && o != null && o.getId() != null)
		{
			return this.id.compareTo(o.getId());
		}
		return 0;
	}

	public Long getAddId()
	{
		return addId;
	}

	public void setAddId(Long addId)
	{
		this.addId = addId;
	}
	
	
}
