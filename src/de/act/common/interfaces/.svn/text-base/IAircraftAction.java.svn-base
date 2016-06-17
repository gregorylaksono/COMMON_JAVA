/**
 * @file IAircraftAction.java
 * @package de.act.blackbox.actions
 * @since 01.02.2006 15:25:33
 * @author Martin Sachs
 */
package de.act.common.interfaces;

import java.util.List;
import java.util.Map;

import de.act.common.types.staticobjects.RSAc;
import de.act.common.types.staticobjects.RSAcComp;
import de.act.common.types.staticobjects.RSAcType;
import de.act.common.types.staticobjects.RSAcTypeComp;
import de.act.common.types.staticobjects.RSFlt;
import de.act.common.types.staticobjects.RsAcScc;
import de.act.common.types.views.AircraftView;

public interface IAircraftAction extends IAction{

	//select :
	List<AircraftView> getActiveAircraftsByCa_Id( String ca_id );
	
	List<RSAcComp> getCompartmentsByAc_Id( Long ac_id );
	
	List<RSAcTypeComp> getDefaultCompartmentsByAc_Type_Id( Integer ac_type_id );
	
	List<RSAcType> getAllAircraftsType();
	
	/**
	 * Get all flight that using the aircraft 	 
	 * @param Integer ac_id	
	 * @return RSFlt object
	 */
	List<RSFlt> getScheduleByAircraftId(Long ac_id);

	//insert
	Integer saveAircraftandCompartments(RSAc ac, List<RSAcComp> rac );  

	//update
	Integer updateAircraftandCompartments( RSAc ac, List<RSAcComp> rac );

	//delete
	Integer deleteAircraft( RSAc ac );	
	
	public RSAc loadAircraftByFltNo(String flt_no);
	
	/*
	 * ============================================================================================================================
	 * 		Aircraft SCC Part
	 * ============================================================================================================================
	 */
	
	public RsAcScc getAircraftSccByAcidNScc(Long acid, String scc3lc);
	
	public RsAcScc getAircraftSccByFltNScc(Long fltId, String scc3lc);
	
	public List<RsAcScc> getAircraftSccList(Long acid);
	
	public Map<String, String> getExcludedAircraftScc(Long fltId);
	
	public RsAcScc saveAircraftScc(RsAcScc scc);
	
	public int updateAircraftScc(RsAcScc scc);
	
}