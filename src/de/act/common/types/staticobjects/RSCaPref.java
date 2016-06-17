package de.act.common.types.staticobjects;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class RSCaPref implements java.io.Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6021310754663416868L;
	private Long ca_pref_id;
	private String ca_id;
	private Integer mod_rebook;
	private Integer mani_rebook;
	private Integer trouble_rebook;
	private Integer switch_deposit;
	
	public Long getCa_pref_id()
	{
		return ca_pref_id;
	}

	public void setCa_pref_id(Long ca_pref_id)
	{
		this.ca_pref_id = ca_pref_id;
	}

	public String getCa_id()
	{
		return ca_id;
	}

	public void setCa_id(String ca_id)
	{
		this.ca_id = ca_id;
	}

	public Integer getMod_rebook()
	{
		return mod_rebook;
	}

	public void setMod_rebook(Integer mod_rebook)
	{
		this.mod_rebook = mod_rebook;
	}

	public Integer getMani_rebook()
	{
		return mani_rebook;
	}

	public void setMani_rebook(Integer mani_rebook)
	{
		this.mani_rebook = mani_rebook;
	}

	public Integer getTrouble_rebook()
	{
		return trouble_rebook;
	}

	public void setTrouble_rebook(Integer trouble_rebook)
	{
		this.trouble_rebook = trouble_rebook;
	}

	public Integer getSwitch_deposit() {
		return switch_deposit;
	}

	public void setSwitch_deposit(Integer switch_deposit) {
		this.switch_deposit = switch_deposit;
	}
	
}
