/**
 * 
 */
package de.act.common.types.staticobjects;

import java.io.Serializable;

/**
 * @author Henry
 *
 */
public class RSAddName implements Serializable, Comparable<RSAddName>{

	private static final long serialVersionUID = -190862951428887826L;
	private String companyID;
	private String companyName;
	private String defaultAirport;
	private String type;
	private RSVad vad;
	private Long creatorAddId;
	
	private String parentID;

	public String getCompanyID() {
		return companyID;
	}

	public void setCompanyID(String companyID) {
		this.companyID = companyID;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDefaultAirport() {
		return defaultAirport;
	}

	public void setDefaultAirport(String defaultAirport) {
		this.defaultAirport = defaultAirport;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public RSVad getVad() {
		return vad;
	}

	public void setVad(RSVad vad) {
		this.vad = vad;
	}	

	public int compareTo(RSAddName o) {
		return o.companyID.compareToIgnoreCase(companyID);
	}

	public String getParentID()
	{
		return parentID;
	}

	public void setParentID(String parentID)
	{
		this.parentID = parentID;
	}

	public Long getCreatorAddId()
	{
		return creatorAddId;
	}

	public void setCreatorAddId(Long creatorAddId)
	{
		this.creatorAddId = creatorAddId;
	}
	
	
}
