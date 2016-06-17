package de.act.common.types.staticobjects;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class CustomArea implements java.io.Serializable, Comparable<CustomArea>
{

	private static final long serialVersionUID = -1877729571687577651L;
	private String code;
	private String name;
	private RSVad vad;

	public CustomArea()
	{

	}

	public String getCode()
	{
		return code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setVad(RSVad vad)
	{
		this.vad = vad;
	}

	public RSVad getVad()
	{
		return vad;
	}

	public int compareTo(CustomArea o)
	{
		if (this.code != null && o != null && o.getCode() != null)
		{
			return this.code.compareTo(o.getCode());
		}
		return 0;
	}
}
