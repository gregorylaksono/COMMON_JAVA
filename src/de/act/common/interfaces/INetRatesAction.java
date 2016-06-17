package de.act.common.interfaces;

import java.util.List;

import de.act.common.types.staticobjects.RSAp;
import de.act.common.types.staticobjects.RSAr;
import de.act.common.types.staticobjects.RSClassRate;
import de.act.common.types.staticobjects.RSCo;
import de.act.common.types.staticobjects.RSProvision;
import de.act.common.types.staticobjects.RSRate;
import de.act.common.types.staticobjects.RSRateAuto;
import de.act.common.types.staticobjects.RSSalesRates;
import de.act.common.types.views.NetRatesView;

public interface INetRatesAction extends IAction{

	//select :
	List<NetRatesView> getNetRatesByCa_Id_From_To(String ca_id, String from, String to, String now);
	
	List<NetRatesView> getProvisionRatesByCa_Id_From_To(String ca_id, String from, String to);
	
	List<String> getNetRatesDeptByCa_Id(String ca_id);
	
	List<String> getNetRatesDestByCa_Id(String ca_id);
	
	List<RSCo> getAllCountriesByObject();
	
	List<RSAr> getAllAreasByObject();
	
	List<String> getAllAirports();
	
	List<RSAp> getAirportByMatch(String match);
	
	List<RSProvision> getProvisionsByRateIdAndAddId(String rateId, Long addId);

	//insert
	Integer saveNetRates( List<RSRate> lra , List<RSClassRate> listClassRate);
	
	Integer saveAutoRate( RSRate ra, RSRateAuto raa );
	
	Integer saveProvisions(List<RSProvision> list);

	//update
	Integer updateNetRates( String conx_id, List<RSRate> lra );
	
	Integer updateAutoRate( String conx_id, RSRate ra, RSRateAuto raa );

	//delete
	Integer deleteRates( String conx_id, String date );
	
	List<NetRatesView> getSalesRatesByRateId(String rateId, String ca_id);
	
	List<RSSalesRates> getSalesRateByConxId(String conxId);
}