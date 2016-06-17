/**
 * 
 */
package de.act.common.jmstypes.beanwrapper;

import java.io.Serializable;
import java.util.List;

import de.act.common.types.staticobjects.RSFlt;

/**
 * @author Henry
 *
 */
public class JMSScheduleObject implements Serializable{

	private static final long serialVersionUID = 379687227219985375L;
	private List<RSFlt> lrf;
	private Long flt_group;
	private String state;
	private int blackboxID;
	private Long addId;

	public List<RSFlt> getLrf() {
		return lrf;
	}

	public void setLrf(List<RSFlt> lrf) {
		this.lrf = lrf;
	}

	public Long getFlt_group() {
		return flt_group;
	}

	public void setFlt_group(Long flt_group) {
		this.flt_group = flt_group;
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
