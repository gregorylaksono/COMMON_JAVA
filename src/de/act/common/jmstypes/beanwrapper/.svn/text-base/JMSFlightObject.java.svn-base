/**
 * 
 */
package de.act.common.jmstypes.beanwrapper;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import de.act.common.types.Aflt;

/**
 * @author Henry
 *
 */
public class JMSFlightObject implements Serializable{

	private static final long serialVersionUID = 6341520953505958113L;
	private Integer blackboxID;
	private List<Aflt> listAflt = new ArrayList<Aflt>();
	private JMSRequestBookingObject data;
	private String state;
	private boolean sendToFArea = false;
	private boolean useCurrentID = false;
	private boolean isPreadvise = false;
	private boolean loadable = true;
	
	public Integer getBlackboxID() {
		return blackboxID;
	}
	
	public void setBlackboxID(Integer blackboxID) {
		this.blackboxID = blackboxID;
	}
	
	public List<Aflt> getListAflt() {
		return listAflt;
	}
	
	public void setListAflt(List<Aflt> listAflt) {
		this.listAflt = listAflt;
	}

	public JMSRequestBookingObject getData() {
		return data;
	}

	public void setData(JMSRequestBookingObject data) {
		this.data = data;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public boolean getSendToFArea() {
		return sendToFArea;
	}

	public void setSendToFArea(boolean sendToFArea) {
		this.sendToFArea = sendToFArea;
	}

	public boolean isUseCurrentID() {
		return useCurrentID;
	}

	public void setUseCurrentID(boolean useCurrentID) {
		this.useCurrentID = useCurrentID;
	}

	public boolean isPreadvise(){
		return isPreadvise;
	}

	public void setPreadvise(boolean isPreadvise){
		this.isPreadvise = isPreadvise;
	}
	
	public boolean isLoadable() {
		return loadable;
	}

	public void setLoadable(boolean loadable) {
		this.loadable = loadable;
	}
}
