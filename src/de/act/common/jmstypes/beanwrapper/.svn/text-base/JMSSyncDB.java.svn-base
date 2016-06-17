/**
 * 
 */
package de.act.common.jmstypes.beanwrapper;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

import de.act.common.types.FAuth;
import de.act.common.types.User;
import de.act.common.types.agent.ContentData;
import de.act.common.types.nonstaticobjects.RFForm;
import de.act.common.types.nonstaticobjects.RFStat;
import de.act.common.types.staticobjects.CustomNumber;

/**
 * @author Henry
 *
 */
public class JMSSyncDB implements Serializable{

	private static final long serialVersionUID = 6748022180571840994L;
	private User user;
	private RFForm rfForm;
	private String state;
	private Integer blackboxID;
	private HashMap<String, String> destinationID;
	private ArrayList<Integer> blackboxChecker = new ArrayList<Integer>();
	private ContentData contentData;
	private ContentData contentCentral;
	private Vector<RFStat> rfStat;
	private Vector<FAuth> fAuth;
	private Vector<CustomNumber> numbers;
	
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

	public Vector<RFStat> getRfStat()
	{
		return rfStat;
	}

	public void setRfStat(Vector<RFStat> rfStat)
	{
		this.rfStat = rfStat;
	}

	public Vector<FAuth> getfAuth()
	{
		return fAuth;
	}

	public void setfAuth(Vector<FAuth> fAuth)
	{
		this.fAuth = fAuth;
	}

	public Vector<CustomNumber> getNumbers()
	{
		return numbers;
	}

	public void setNumbers(Vector<CustomNumber> numbers)
	{
		this.numbers = numbers;
	}
	
}
