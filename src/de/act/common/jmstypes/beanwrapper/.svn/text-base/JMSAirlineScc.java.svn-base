package de.act.common.jmstypes.beanwrapper;

import java.io.Serializable;
import java.util.List;

import de.act.common.types.AScc;
import de.act.common.types.ASccLoadable;
import de.act.common.types.staticobjects.RsAcScc;
import de.act.common.types.staticobjects.RsFltScc;

public class JMSAirlineScc implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6701028289341702609L;
	
	public static final int TYPE_AIRLINE = 0;
	public static final int TYPE_AIRCRAFT = 1;
	public static final int TYPE_SCHEDULE = 2;
	public static final int TYPE_ASCC_LOAD = 3;
	
	public static final String STATE_SAVE = "save";
	public static final String STATE_UPDATE = "update";
	
	private int blackboxID;
	private int type;
	private String state;
	
	private AScc airlineScc;
	private RsAcScc aircraftScc;
	private RsFltScc scheduleScc;
	private List<ASccLoadable> loadableList;
	
	
	public int getBlackboxID() {
		return blackboxID;
	}
	public void setBlackboxID(int blackboxID) {
		this.blackboxID = blackboxID;
	}
	
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public AScc getAirlineScc() {
		return airlineScc;
	}
	public void setAirlineScc(AScc airlineScc) {
		this.airlineScc = airlineScc;
	}
	
	public RsAcScc getAircraftScc() {
		return aircraftScc;
	}
	public void setAircraftScc(RsAcScc aircraftScc) {
		this.aircraftScc = aircraftScc;
	}
	
	public RsFltScc getScheduleScc() {
		return scheduleScc;
	}
	public void setScheduleScc(RsFltScc scheduleScc) {
		this.scheduleScc = scheduleScc;
	}
	
	public List<ASccLoadable> getLoadableList() {
		return loadableList;
	}
	public void setLoadableList(List<ASccLoadable> loadableList) {
		this.loadableList = loadableList;
	}
	
}
