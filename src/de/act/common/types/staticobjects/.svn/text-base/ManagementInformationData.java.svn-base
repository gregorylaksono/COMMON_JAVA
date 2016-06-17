package de.act.common.types.staticobjects;

import java.util.Map;

/**
 * Generic persistence class used to hold data from 9 different management information's views. 	 
 * @author zouota
 */
public class ManagementInformationData<T, D> implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4942300244813583530L;
	//{ Private Fields
	private String strParamName;
	private Map<T, D> mapData;
	//}
	
	//{ Constructor
	public ManagementInformationData(){
		
	}
	public ManagementInformationData(String strParamName){
		this.setParamName(strParamName);
	}
	//}
	
	//{ Public Property

	public String getParamName() {
		return strParamName;
	}

	public void setParamName(String strParamName) {
		this.strParamName = strParamName;
	}

	public Map<T, D> getMapData() {
		return mapData;
	}

	public void setMapData(Map<T, D> mapData) {
		this.mapData = mapData;
	}
	//}
}
