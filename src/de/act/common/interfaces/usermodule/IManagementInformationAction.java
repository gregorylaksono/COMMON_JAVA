package de.act.common.interfaces.usermodule;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import de.act.common.enums.PeriodRange;
import de.act.common.interfaces.IAction;
import de.act.common.types.staticobjects.ManagementInformationData;
import de.act.common.types.staticobjects.RSAc;

public interface IManagementInformationAction extends IAction{
	/**
	 * get all data requested by user based on selected parameters	 
	 * @param String[] arrSelectedParam
	 * @param String strDeptType
 	 * @param String strDestType 
	 * @param String strDeptCode 
	 * @param String strDestCode 
	 * @param Boolean bExport 
	 * @param Boolean bImport 
	 * @param String strFlight 
	 * @param String strAcReg 
	 * @param Date dtPeriodFrom 
	 * @param Date dtPeriodTo 
	 * @param PeriodRange pr
	 * @return list of ManagementInformationData
	 */
	<T, D> List<ManagementInformationData<T, D>> getManagementInformationData(String[] arrSelectedParam, 
												String strDeptType, 
												String strDestType,
												String strDeptCode,
												String strDestCode,
												Boolean bExport,
												Boolean bImport,
												String strFlight,
												String strAcReg,
												Date dtPeriodFrom,
												Date dtPeriodTo,
												PeriodRange pr,
												Integer dateType);
	
	/**
	 * get all departure or destination data by departure or destination type selected by the user 	 
	 * @param String of departure or destination type
	 * @return list of String, concatenation of AC_2LC and Flight Number
	 */
	<E> List<E> getDepartureOrDestinationDataByType(String strType, String strName);
	
	/**
	 * get all flight data	 
	 * @param 
	 * @return list of String, concatenation of Flight Number
	 */
	List<String> getFlights();
	
	/**
	 * get all planes data	 
	 * @param 
	 * @return list of RSAc
	 */
	List<RSAc> getPlanes();
}
