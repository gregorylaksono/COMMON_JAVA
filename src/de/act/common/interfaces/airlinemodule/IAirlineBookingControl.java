/**
 * @file ISLIWrite.java
 * @package de.act.blackbox.actions
 * @since 26.01.2006 12:46:37
 * @author Martin Sachs
 */
package de.act.common.interfaces.airlinemodule;

import java.util.Date;
import java.util.List;

import de.act.common.interfaces.IAction;
import de.act.common.types.nonstaticobjects.BookingStates;
import de.act.common.types.staticobjects.RSAp;
import de.act.common.types.staticobjects.RSCaConx;
import de.act.common.types.staticobjects.RSFltConxCA;
import de.act.common.types.views.CentralBookingView;

/**
 * - Buchungsbestätigung / Annahme - c-flight eintrag, f-bkg-flt senden 
 * - Warteliste verwalten - 
 * - Cancelation -
 * 
 * 
 * @since 26.01.2006
 * @author Martin Sachs
 * 
 */
/**
 * @author User
 * @version 1.0 03.04.2007
 */
public interface IAirlineBookingControl extends IAction {

	/**
	 * Alle aktuellen Buchungen auf diesen Flug. +
	 *  + status nn, kk, ...
	 * @param flightNo
	 * @param flightDate
	 * @return a view 
	 */
	public List<CentralBookingView> getCentralFlights(String flightNo , Date flightDate);

	/**
	 * Status ändern und Email generieren
	 *    + Verteilung an die anderen 
	 * @param bkgID
	 * @param status
	 * @param bkgItemID TODO
	 * @param fID TODO
	 * @return
	 */
	public Boolean changeStatus(String bkgID, BookingStates status, Boolean sendMail, Long bkgItemID, String fID);

	public Boolean changeStatus(String bkgID, BookingStates status, Long bkgItemID, String fID);

	public List<CentralBookingView> getCentralFlights(Date flightDate);

	public List<CentralBookingView> getCentralFlights(String flightID);

	public List<RSCaConx> getFlightCarriersFrom(RSAp airp, Date now) ;

	public List<RSFltConxCA> getFlightsFrom(RSCaConx ca, Date now); 
}