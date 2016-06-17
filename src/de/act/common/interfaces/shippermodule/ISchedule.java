/**
 * @author Admin
 * @since 13.03.2006
 */
package de.act.common.interfaces.shippermodule;

import java.util.Date;
import java.util.List;

import de.act.common.interfaces.IAction;
import de.act.common.types.nonstaticobjects.Schedule;
import de.act.common.types.packageitems.ItemBKG;
import de.act.common.types.staticobjects.RSAp;
import de.act.common.types.staticobjects.RSCa;
import de.act.common.types.staticobjects.RSCaConx;
import de.act.common.types.staticobjects.RSFltConxCA;
import de.act.common.types.views.CFltBkg;
import de.act.common.types.views.DefaultCapacityView;

/**
 * @author Martin Sachs
 * @version 1.0 - 21.03.2006
 * @version 2.0 - 13.09.2006
 *
 */
public interface ISchedule extends IAction{

	/**
	 * get a list of available Flights for specified attributes.
	 * @author Martin Sachs
	 * @since 1.0 
	 * @param ca is a concret carrier or null for all carriers
	 * @param dep must contain at least the departure und destination airport
	 * @param des TODO
	 * @param depDate must be equal/greater than now()
	 * @param desDate must be greater than depDate
	 * @param results is the count of flights.
	 * @return List of BookingRequests
	 * @deprecated since 2.0
	 */
	List<ItemBKG> getBookingRequests(RSCaConx ca, RSAp dep, RSAp des, Date depDate, Date desDate);

	/**
	 * get a Carrier by id
	 * @author Martin Sachs
	 * @since 1.0
	 * @param unique carrier id
	 * @return Carrier object for displaying in the gui
	 */
	RSCaConx getCarrierById(String id);

	/**
	 * @author Admin
	 * @since 1.0
	 * @return
	 */
	List<RSCa> getAirlines();

	/**
	 * @author Admin
	 * @since 1.0
	 * @param ca
	 * @param dep
	 * @param des TODO
	 * @param depDate
	 * @param desDate
	 * @return
	 * @deprecated since 2.0
	 */
	List<ItemBKG> getSingleBookingRequests(RSCaConx ca, RSAp dep, RSAp des, Date depDate, Date desDate);

	/**
	 * Returns a schedule for the requested departure and destination.
	 * The parameters <code>deptAp, destAp</code> and <code>minDep</code> have
	 * to be provided.
	 * All other parameters can be null or negative for usage of default values.
	 *
	 * @param deptAp     the departure airport.
	 * @param destAp     the destination aiport.
	 * @param minDep     the the first acceptable point in time for the
	 *                   departure at the departure airport
	 *                   (according to the schedule).
	 * @param maxArr     the last acceptable point in time for the arrival
	 *                   at the destination airport (according to the schedule;
	 *                   the default is 1 week after minDep).
	 * @param cas        if not null, only these carriers are considered
	 *                   (currently not supported). 
	 * @param alliance   if not null, only carriers of this alliance are
	 *                   considered (currently not supported).
	 * @param minResults the minimal number of results that should be returned
	 *                   (the default is 50).
	 * @param maxStops   the maximal number of stops (the default is 2).
	 *
	 * @return a schedule for the requested departure and destination.
	 * since 2.0
	 */
	Schedule getSchedule(String deptAp, String destAp, Date minDep,
			Date maxArr, String[] cas, String alliance, Integer minResults,
			Integer maxStops, Date now);
	
	Schedule getScheduleAP(String deptAp, String destAp, Date minDep,
			Date maxArr, String[] cas, String alliance, Integer minResults,
			Integer maxStops, Date now);

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 27.09.2006
	 * @param fltId
	 * @return
	 * @return RSFltConxCA
	 */
	RSFltConxCA getFlightById(String fltId);
	
	List<DefaultCapacityView> getDefaultCapacityByDeptDest(String dept, String dest);	
	
	List<CFltBkg> getExistingCapacityByDeptDest(String dept, String dest);
	
	List<CFltBkg> getAllExistingCapacity();
	
	List<CFltBkg> getAllExistingCapacityByDept(List<String> dept);
	
	/**
	 * Get object of Default Capacity	 
	 * @param Long flight_id
	 * @param String Departure
	 * @param String Destination
	 * @return DefaultCapacityView object
	 */
	List<DefaultCapacityView> getDefaultCapacityByFlightIdDeptDest(Long flt_id, String dept, String dest);

	public List<RSCa> getListOfAirlinesByAirlineAlliance(String airline);
	
	public List<CFltBkg> getExistingCapacityByDeptDestAFltId(String dept, String dest, Long fltId);
	
	public RSCaConx getCarrierByCa2lc(String ca2lc);
	
	public List<RSCaConx> getCarrierByAlliance(Integer allianceId);
}
