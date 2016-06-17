package de.act.common.types;

import java.io.Serializable;

public class AFltEmailLog implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4335082842636579820L;
	
	private Long a_flt_id;
	private Long add_id;
	private String email;
	private Integer sent;
	
	public Long getA_flt_id()
	{
		return a_flt_id;
	}
	
	public void setA_flt_id(Long a_flt_id)
	{
		this.a_flt_id = a_flt_id;
	}
	
	public Long getAdd_id()
	{
		return add_id;
	}
	
	public void setAdd_id(Long add_id)
	{
		this.add_id = add_id;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public Integer getSent()
	{
		return sent;
	}
	
	public void setSent(Integer sent)
	{
		this.sent = sent;
	}
	
}
