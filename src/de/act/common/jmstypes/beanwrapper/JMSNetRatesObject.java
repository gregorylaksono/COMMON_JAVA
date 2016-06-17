/**
 * 
 */
package de.act.common.jmstypes.beanwrapper;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import de.act.common.types.staticobjects.RSRate;
import de.act.common.types.staticobjects.RSRateAuto;

/**
 * @author Henry
 *
 */
public class JMSNetRatesObject implements Serializable{

	private static final long serialVersionUID = 6856739742528831994L;
	private RSRate ra;
	private RSRateAuto raa;
	private List<RSRate> lra;
	private String conx_id;
	private String state;
	private Date date;
	private int blackboxID;

	public RSRate getRa() {
		return ra;
	}

	public void setRa(RSRate ra) {
		this.ra = ra;
	}

	public RSRateAuto getRaa() {
		return raa;
	}

	public void setRaa(RSRateAuto raa) {
		this.raa = raa;
	}

	public List<RSRate> getLra() {
		return lra;
	}

	public void setLra(List<RSRate> lra) {
		this.lra = lra;
	}

	public String getConx_id() {
		return conx_id;
	}

	public void setConx_id(String conx_id) {
		this.conx_id = conx_id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getBlackboxID() {
		return blackboxID;
	}

	public void setBlackboxID(int blackboxID) {
		this.blackboxID = blackboxID;
	}

	public Date getDate()
	{
		return date;
	}

	public void setDate(Date date)
	{
		this.date = date;
	}
	
	
}
