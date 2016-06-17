/**
 * @file ISLIWrite.java
 * @package de.act.blackbox.actions
 * @since 26.01.2006 12:46:37
 * @author Martin Sachs
 */
package de.act.common.interfaces.airlinemodule;

import java.util.Date;

import de.act.common.interfaces.IAction;
import de.act.common.types.nonstaticobjects.CentralFlightData;

/**
 * Definition der Frachtkapazitäten für Flüge.
 * 
 * Im wesentlich wird die C-Flight tabelle angepasst.
 * 
 *      - Vol, Gewicht. 
 *      - auslesen, verändern, auslastung
 * 
 * @since 26.01.2006
 * @author Martin Sachs
 * 
 */
public interface ICentralPlaning extends IAction {

	/**
	 * Alle Flüge in Zukunft ansehen auf der lokalen Box
	 * @param flightID
	 * @param flightDate
	 * @return a view 
	 */
	public CentralFlightData getCentralFlights(String flightID , Date flightDate);

	/**
	 * submit changed flightattributes
	 * @param flt
	 * @return 
	 */
	public Boolean storeCentralFlight(CentralFlightData flt);
	
//	public Integer sendAwbRequest(String caId,Integer owner_add_id, int ownerAddId);
	
}