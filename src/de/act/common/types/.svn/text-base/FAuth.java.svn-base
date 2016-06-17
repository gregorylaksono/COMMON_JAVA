/**
 * 
 */
package de.act.common.types;

import java.io.Serializable;

import de.act.common.types.staticobjects.RSAp;

/**
 * @author Henry
 *
 */
public class FAuth implements Serializable{
	
	private static final long serialVersionUID = -4963336600732756706L;
	private String f_id;
	private RSAp airport;
	private Integer part;
	private String user_name;
	private Integer read_only;

	public String getF_id() {
		return f_id;
	}

	public void setF_id(String f_id) {
		this.f_id = f_id;
	}

	public RSAp getAirport() {
		return airport;
	}

	public void setAirport(RSAp airport) {
		this.airport = airport;
	}

	public Integer getPart() {
		return part;
	}

	public void setPart(Integer part) {
		this.part = part;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public Integer getRead_only() {
		return read_only;
	}

	public void setRead_only(Integer read_only) {
		this.read_only = read_only;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof FAuth)
		{
			FAuth temp = (FAuth)obj;
			if(temp.getF_id().equals(this.f_id) && temp.getAirport().equals(this.airport) && temp.getPart().equals(this.part))
				return true;
		}
		
		return false;
	}
}
