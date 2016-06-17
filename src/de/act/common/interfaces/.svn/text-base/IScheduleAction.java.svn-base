package de.act.common.interfaces;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import de.act.common.types.AFltMmt;
import de.act.common.types.Aflt;
import de.act.common.types.handling.AManifest;
import de.act.common.types.nonstaticobjects.RFInfo;
import de.act.common.types.staticobjects.Carrier;
import de.act.common.types.staticobjects.RSAc;
import de.act.common.types.staticobjects.RSAp;
import de.act.common.types.staticobjects.RSCaPref;
import de.act.common.types.staticobjects.RSConx;
import de.act.common.types.staticobjects.RSCostAp;
import de.act.common.types.staticobjects.RSCostCons;
import de.act.common.types.staticobjects.RSCostConx;
import de.act.common.types.staticobjects.RSFlt;
import de.act.common.types.staticobjects.RsFltScc;
import de.act.common.types.views.PackageView;
import de.act.common.types.views.ScheduleView;
import de.act.common.types.views.SchedulerView;


public interface IScheduleAction extends IAction{

	//select :
	List<ScheduleView> getSchedulesByCa_Id_Flt_Group_Date_FilterValue( String ca_id, Long flt_group, Date dt_from, Date dt_to, String from, String to, String flight, String ac_reg );		
	
	List<String> getDepartureByCa_Id( String ca_id );
	
	List<String> getDestinationByCa_Id( String ca_id );
	
	List<String> getFlightNoByCa_Id( String ca_id );
	
	List<RSAc> getAircraftByCa_Id( String ca_id );
	
	RSAc getAircraftByAc_Id( Long ac_id );
	
	List<String> getAllCurrencies();
	
	List<RSAp> getAllAirportsByObject();
	
	List<RSAp> getAllAirportByMatch(String match);

	//insert
	Integer saveFlights( List<RSFlt> lrf );  

	//update
	Integer updateFlights( List<RSFlt> lrf, Long flt_group );

	RSConx getConnectionByFlt_No(String flt_no);
	
	/**
	 * Closed schedule or not activated schedule for temporarily 	 
	 * @note in order to be more specific, we could filter the data based on flight_id and departure date
	 * @param Long flight_id
	 * @param Date departure
	 * @return Status of Integer value
	 */
	public Integer CloseSchedule(List<RSFlt> lrf);
	
	/**
	 * Comparing compare fields on an individual basis from 2 object from the same class and return Keys collection that have different value 	 
	 * @param Object objClass1
	 * @param Object objClass2
	 * @return List<String> of key collection
	 */
	public Map compareObjects(Object newBean, Object oldBean) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException;
	
	public List<SchedulerView> getScheduler(String user_name);
	
	/*
	 * ============================================================================================================================
	 * 		Schedule SCC Part
	 * ============================================================================================================================
	 */
	
	public RsFltScc getScheduleSccByFltNScc(Long fltId, String scc3lc);
	
	public List<RsFltScc> getScheduleSccList(Long fltId);
	
	public Map<String, String> getExcludedScheduleScc(Long fltId);
	
	public RsFltScc saveScheduleScc(RsFltScc scc);
	
	public int updateScheduleScc(RsFltScc scc);
	
	public RSConx getConnectionByFlt_No(String flt_no, String ca_id);
	
	public List<String> getFlightNoByDept(List<String> dept);
	
	public List<RSConx> getMultipleConnectionByFlt_NoAndDept(String flt_no, String ca_id, List<String> airports);
	
	public List<RSConx> getMultipleConnectionByFlt_NoAndDest(String flt_no, String ca_id, List<String> airports);
	
	public List<Carrier> getListOfAirlinesFromReportView();
	
	public Integer saveAFltMmt(AFltMmt bean);
	
	public List<AFltMmt> getAFltMmtByFltIdAndDeptDate(Long fltId, Date deptDate);
	
	public List<AFltMmt> getAFltMmtByAFltId(Long fltId);

	public List<RSConx> getMultipleConnectionByFlt_No(String flt_no, String ca_id);
	
	public List<Aflt> getAfltByAFltId(Long fltId);
	
	public AManifest getManifest(Long flt_id, Date flt_date);
	
	public AManifest getManifestByFltNoDeptDestDate(String dept, String dest, String flt_no, String flt_date);	
	
	public List<String> getAirportListByCa_Id(String request, String ca_id, String airport);
	
	public List<String> getAirportListByCa_Id2(String request, String[] ca_id, String airport);
	
	public List<String> getAirportListByCa_IdMatch(String request, String ca_id, String airportMatch);
	
	public List<RSCostConx> getCostConnectionAll();
	Integer saveCostConx(List<RSCostConx> lrf);
	Integer updateCostConx( List<RSCostConx> lrf);
	public List<RSCostConx> getCostConxList(Long conxCostId);
	Integer deleteCostConx( List<RSCostConx> lrf);
	
	public List<RSCostCons> getCostConsignmentAll();
	Integer saveCostCons(List<RSCostCons> lrf);
	Integer updateCostCons(List<RSCostCons> lrf);
	public List<RSCostCons> getCostConsList(Long consCostId);
	Integer deleteCostCons(List<RSCostCons> lrf);
	
	public List<RSCostAp> getCostAirportAll();
	Integer saveCostAirport(List<RSCostAp> lrf);
	Integer updateCostAirport(List<RSCostAp> lrf);
	public List<RSCostAp> getCostAirportList(Long apCostId);
	Integer deleteCostAirport(List<RSCostAp> lrf);
	
	public Integer saveAirlinePreferences(RSCaPref bean);
	
	public List<RSCaPref> getAirlinePreferencesByAirlineID(String ca_id);
	
	public RSConx getConnectionByFlt_Id(Long flt_id);
	
	public String saveVehiclePlateNo(String vehiclePlateNo);
	
	public Map<String, Object> getAirportListForDestinationFromDepartureValue(String request, String ca_id, String airport);
	public Map<String, Object> getAirportListForDestinationFromDepartureValue2(String request, String[] ca_id, String airport);
}