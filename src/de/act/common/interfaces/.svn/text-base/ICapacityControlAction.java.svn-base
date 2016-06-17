package de.act.common.interfaces;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import de.act.common.types.Aflt;
import de.act.common.types.views.CapacityControlView;


public interface ICapacityControlAction extends IAction{
	//select
	List<CapacityControlView> getCapacityByCa_Id_Dep_Arr_FilterValue( String ca_id, Date from, Date to, Integer open_for_cargo, List<String> dept, 
			String flightNo, String deptAirport, String destAirport);
	
	List<String> getDepartureByCa_Id( String ca_id );
	
	List<String> getDestinationByCa_Id( String ca_id );
	
	List<String> getFlightNoByCa_Id( String ca_id );
	
	//save
	Integer saveCapacity( Aflt af );
	
	HashMap<Integer, Aflt> saveAFlight( Aflt af );
	
	//update
	Integer updateCapacity( Aflt ra );
}