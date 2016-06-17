/**
 * 
 */
package de.act.common.jmstypes.beanwrapper;

import java.io.Serializable;
import java.util.List;

import de.act.common.types.staticobjects.RSAc;
import de.act.common.types.staticobjects.RSAcComp;

/**
 * @author Henry
 *
 */
public class JMSAircraftObject implements Serializable{

	private static final long serialVersionUID = -7385974541415689233L;
	private RSAc ac;
	private List<RSAcComp> rac;
	private String state;
	private int blackboxID;
	private Long addId;

	public RSAc getAc() {
		return ac;
	}

	public void setAc(RSAc ac) {
		this.ac = ac;
	}

	public List<RSAcComp> getRac() {
		return rac;
	}

	public void setRac(List<RSAcComp> rac) {
		this.rac = rac;
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

	public Long getAddId()
	{
		return addId;
	}

	public void setAddId(Long addId)
	{
		this.addId = addId;
	}
}
