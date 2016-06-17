package de.act.common.types.staticobjects;

public final class CustomCountryArea implements java.io.Serializable
{
	private static final long serialVersionUID = -1877729571777577651L;
	private String co2Lc;
	private String areaCode;
	private RSVad vad;

	public String getCo2Lc()
	{
		return co2Lc;
	}

	public void setCo2Lc(String co2Lc)
	{
		this.co2Lc = co2Lc;
	}

	public String getAreaCode()
	{
		return areaCode;
	}

	public void setAreaCode(String areaCode)
	{
		this.areaCode = areaCode;
	}

	public RSVad getVad()
	{
		return vad;
	}

	public void setVad(RSVad vad)
	{
		this.vad = vad;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj != null && obj instanceof CustomCountryArea)
		{
			CustomCountryArea bean = (CustomCountryArea)obj;
			if(bean.getAreaCode().equals(this.getAreaCode()))
			{
				return true;
			}
		}
		
		return false;
	}

}
