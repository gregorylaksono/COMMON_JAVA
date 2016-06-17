/**
 * 
 */
package de.act.common.jmstypes.beanwrapper;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import de.act.common.jmstypes.FormObjectMessageObject.SendState;
import de.act.common.types.User;
import de.act.common.types.agent.ContentData;
import de.act.common.types.nonstaticobjects.RCBkg;
import de.act.common.types.nonstaticobjects.RFForm;

/**
 * @author Henry
 *
 */
public class JMSPreAdvice implements Serializable{

	private static final long serialVersionUID = -4007240869580009516L;
	
	private User user;
	private RFForm rfForm;
	private SendState sendState;
	private String state;
	private Integer blackboxID;
	private HashMap<String, String> destinationID;
	private ArrayList<Integer> blackboxChecker = new ArrayList<Integer>();
	private ContentData contentData;
	private ContentData contentCentral;
	private HashMap<Long, Date> dep;
	private HashMap<Long, Date> arr;
	private RCBkg bkg;
	private boolean loadable = true;
	
	public JMSPreAdvice(){
		
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public RFForm getRfForm() {
		return rfForm;
	}

	public void setRfForm(RFForm rfForm) {
		this.rfForm = rfForm;
	}

	public SendState getSendState() {
		return sendState;
	}

	public void setSendState(SendState sendState) {
		this.sendState = sendState;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getBlackboxID() {
		return blackboxID;
	}

	public void setBlackboxID(Integer blackboxID) {
		this.blackboxID = blackboxID;
	}

	public HashMap<String, String> getDestinationID() {
		return destinationID;
	}

	public void setDestinationID(HashMap<String, String> destinationID) {
		this.destinationID = destinationID;
	}

	public ArrayList<Integer> getBlackboxChecker() {
		return blackboxChecker;
	}

	public void setBlackboxChecker(ArrayList<Integer> blackboxChecker) {
		this.blackboxChecker = blackboxChecker;
	}
	
	public void addBlackboxChecker(Integer blackboxID) {
		this.blackboxChecker.add(blackboxID);
	}

	public boolean canSend(Integer blackboxID){
		return !(this.blackboxChecker.contains(blackboxID));
	}

	public ContentData getContentData() {
		return contentData;
	}

	public void setContentData(ContentData contentData) {
		this.contentData = contentData;
	}

	public ContentData getContentCentral() {
		return contentCentral;
	}

	public void setContentCentral(ContentData contentCentral) {
		this.contentCentral = contentCentral;
	}

	public HashMap<Long, Date> getDep() {
		return dep;
	}

	public void setDep(HashMap<Long, Date> dep) {
		this.dep = dep;
	}

	public HashMap<Long, Date> getArr() {
		return arr;
	}

	public void setArr(HashMap<Long, Date> arr) {
		this.arr = arr;
	}

	public RCBkg getBkg() {
		return bkg;
	}

	public void setBkg(RCBkg bkg) {
		this.bkg = bkg;
	}
	
	public boolean isLoadable() {
		return loadable;
	}

	public void setLoadable(boolean loadable) {
		this.loadable = loadable;
	}
	
}
