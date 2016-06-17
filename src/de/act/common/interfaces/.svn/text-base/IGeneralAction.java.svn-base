/**
 * @file IGeneralAction.java
 * @package de.act.blackbox.actions
 * @since 01.02.2006 15:25:33
 * @author Martin Sachs
 */
package de.act.common.interfaces;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.List;
import java.util.Map;

import de.act.central.types.AwbNo;
import de.act.common.types.CheckRuleParams;
import de.act.common.types.RuleParams;
import de.act.common.types.UserObject;
import de.act.common.types.handling.AManifestData;
import de.act.common.types.handling.Shipments;
import de.act.common.types.localobjects.IconFolder;
import de.act.common.types.localobjects.RDOt;
import de.act.common.types.nonstaticobjects.BookingRequestFlight;
import de.act.common.types.nonstaticobjects.ProcessStates;
import de.act.common.types.nonstaticobjects.RFAwbNo;
import de.act.common.types.nonstaticobjects.RFForm;
import de.act.common.types.nonstaticobjects.RFOt;
import de.act.common.types.nonstaticobjects.ULDObject;
import de.act.common.types.packageitems.ItemAWBAccount;
import de.act.common.types.ruleobject.RBase;
import de.act.common.types.staticobjects.CommodityAnn;
import de.act.common.types.staticobjects.CommodityScc;
import de.act.common.types.staticobjects.Discrepancies;
import de.act.common.types.staticobjects.GSAPartnership;
import de.act.common.types.staticobjects.ICommodityTree;
import de.act.common.types.staticobjects.ModeOfTransport;
import de.act.common.types.staticobjects.Partnership;
import de.act.common.types.staticobjects.RCAdd;
import de.act.common.types.staticobjects.RFCourierJob;
import de.act.common.types.staticobjects.RSAci;
import de.act.common.types.staticobjects.RSAdd;
import de.act.common.types.staticobjects.RSAddAdd;
import de.act.common.types.staticobjects.RSAddCAAccount;
import de.act.common.types.staticobjects.RSAddName;
import de.act.common.types.staticobjects.RSAnn;
import de.act.common.types.staticobjects.RSAp;
import de.act.common.types.staticobjects.RSAr;
import de.act.common.types.staticobjects.RSCa;
import de.act.common.types.staticobjects.RSCaConx;
import de.act.common.types.staticobjects.RSCaPref;
import de.act.common.types.staticobjects.RSCc;
import de.act.common.types.staticobjects.RSCharges;
import de.act.common.types.staticobjects.RSCo;
import de.act.common.types.staticobjects.RSCoAr;
import de.act.common.types.staticobjects.RSCoTax;
import de.act.common.types.staticobjects.RSCuc;
import de.act.common.types.staticobjects.RSCur;
import de.act.common.types.staticobjects.RSDi;
import de.act.common.types.staticobjects.RSFuelChar;
import de.act.common.types.staticobjects.RSHai;
import de.act.common.types.staticobjects.RSHouseAirwaybill;
import de.act.common.types.staticobjects.RSOt;
import de.act.common.types.staticobjects.RSOt1lc;
import de.act.common.types.staticobjects.RSOt2lc;
import de.act.common.types.staticobjects.RSPkgCol;
import de.act.common.types.staticobjects.RSPkgMat;
import de.act.common.types.staticobjects.RSPkgShp;
import de.act.common.types.staticobjects.RSSalesRates;
import de.act.common.types.staticobjects.RSScc;
import de.act.common.types.staticobjects.RSUnit;
import de.act.common.types.staticobjects.ZHandlingAirport;
import de.act.common.types.views.CommodityView;
import de.act.common.types.views.GSAPartnershipView;
import de.act.common.types.views.RSAddCAAccountView;

/**
 * IGeneralAction.java:
 *
 * @since 01.02.2006
 * @author Martin Sachs
 *
 */
public interface IGeneralAction extends IAction{

	/**Integer delete
	 * Create an IconFolder as Folder type
	 * @author Martin Sachs
	 * @since 16.02.2006
	 * @param name
	 * @param parent
	 * @param type
	 * @param imageid
	 * @param delete
	 * @param p
	 * @param r
	 * @return
	 */
	IconFolder createFolder( String name, IconFolder parent, String type,Integer imageid,Integer delete, Point p, Rectangle r);
	/**
	 * create an IconFolder as File for a Formular representation
	 * @author Martin Sachs
	 * @since 16.02.2006
	 * @param form
	 * @param name
	 * @param parent
	 * @param type
	 * @param delete
	 * @return persistent IconFolder
	 */
	IconFolder createFolder(RFForm form, String name, IconFolder parent, String type,Integer imageid,Integer delete, Point p, Rectangle r);
	/**
	 * create an IconFolder as File for an ExportAcceptanceItem representation
	 * @author Martin Sachs
	 * @since 16.02.2006
	 * @param form
	 * @param name
	 * @param parent
	 * @param type
	 * @param delete
	 * @return persistent IconFolder
	 */
	IconFolder createFolder(Shipments form, String name, IconFolder parent, String type,Integer imageid,Integer delete, Point p, Rectangle r);
	/**
	 * create an IconFolder as File for a Manifest representation
	 * @author Martin Sachs
	 * @since 16.02.2006
	 * @param form
	 * @param name
	 * @param parent
	 * @param type
	 * @param delete
	 * @return persistent IconFolder
	 */
	IconFolder createFolder(AManifestData form, String name, IconFolder parent, String type,Integer imageid,Integer delete, Point p, Rectangle r);
	/**
	 * create an IconFolder as File for an ULD representation
	 * @author Martin Sachs
	 * @since 16.02.2006
	 * @param uld
	 * @param name
	 * @param parent
	 * @param type
	 * @param delete
	 * @return persistent IconFolder
	 */
	IconFolder createFolder(ULDObject uld, String name, IconFolder parent, String type,Integer imageid,Integer delete, Point p, Rectangle r);
	
	public boolean saveIconPostion(IconFolder icon);
	
	public boolean deleteIcon(IconFolder iconFolder);

	public List<Discrepancies> getDiscrepancies();
	
	public List<RSAp> getAirports();

	public ICommodityTree getCommodityTree() ;
	
	public List<ICommodityTree> getCommodityList();
	
	public ICommodityTree getCommodityTreeForFirst(String name) ;

	/* static datas */
	public List<RSAci> getAccountInformations();
	
	public List<RSAdd> getAddresses();
	
	public RSAdd getAddressByS_ID(Integer s_id);
	
	public List<RSCuc> getCustomsCodes();
	
	public List<RSUnit> getWeightUnits();
	
	public List<RSUnit> getVolumeUnits();
	
	public List<RSUnit> getLengthUnits();
	
	public List<RSScc> getSpecialCargoCodes();
	
	public List<RSCaConx> getCarriers();
	
	public List<RSCur> getCurrencies();
	
	public List<RSCur> getCurrenciesByMatch(String match);
	
	public List<RSAr> getAreaByMatch(String match);

	public List<RSDi> getDistrictByMatch(String match);

	public List<RSHai> getHandlingInformations();
	
	public List<RSPkgCol> getPackageColors();
	
	public List<RSPkgMat> getPackageMaterials();
	
	public List<RSPkgShp> getPackageShippments();
	
	public List<ULDObject> getULDStock(String add_id);
	
	public List<RDOt> getOtherChargesRates();

	public List<RSUnit> getDefaultUnits();

	public RFAwbNo getAwbObject(String fid);

	public RuleParams getParamforChargesCollect(List<RSAp> routings);

	public RuleParams getParamforChargesCollectOther(List<RSAp> routings);

	/**
	 * get an information for given SLI Data to determine 
	 * COLLECT or PREPAID for normal charges
	 * @author Martin Sachs
	 * @since 16.05.2006
	 */
	public Boolean isAllowedChargesCollect(long rid, CheckRuleParams chkArgs, double wgt);

	/**
	 * get an information for given SLI Data to determine 
	 * COLLECT or PREPAID for other charges
	 * @author Martin Sachs
	 * @since 16.05.2006
	 */
	public Boolean isAllowedOtherChargesCollect(long rid, CheckRuleParams chkArgs, double wgt);
	
	public RFOt getFuelCharges(Double chargableWeight, List<BookingRequestFlight> flts);

	public RFOt getSecurityCharges(Double chargableWeight, List<BookingRequestFlight> flts);
	
	public RFOt getDisbursmentCharges(List<BookingRequestFlight> bkgflights, Double wgtChrg, Double otChrg, String cur, Boolean cc);
	
	public RFForm changeAwbFormularState(RFForm f, ProcessStates states);  
	
	public List<RSCa> getAirlines();    
	
	public ICommodityTree getConsolidationCommodity();
	
	public List<ICommodityTree> getCommodityChildList(ICommodityTree from);
	/**
	 * get address by matching string to companyNAme or airport
	 * @author Martin Sachs
	 * @since 1.0 - 22.01.2007
	 * @param string
	 * @return RSAdd
	 */
	RSAdd getAddress(Integer string);
	
	public List<RSAdd> getAddressesByAirport(String ap);

	/**
	 * create webuser, generate password, store addresses build unique ids
	 * @author Martin Sachs
	 * @since 1.0 - 19.02.2007
	 * @param user
	 * @param add
	 * @return
	 * @return boolean
	 */
	boolean createNewWebUser(UserObject user ,RSAdd add);

	/**
	 * Load a User per sample 
	 * @author Martin Sachs
	 * @since 1.0 - 19.02.2007
	 * @param user
	 * @return UserObject
	 */
	UserObject loadUserBy(UserObject user);

	/**
	 * get Airports by given startString for 3lc and Name
	 * @param match
	 * @return list of airports
	 */
	List<RSAp> getAirportsByMatch(String match);

	/**
	 * get scc by given startString for 3lc
	 * @param match
	 * @return list of sccs
	 */
	List<RSScc> getSpecialCargoCodesByMatch(String match);
	
	List<RSScc> getAllSpecialCargoCodes();

	/**
	 * get scc by given commodity ID
	 * @param comid
	 * @return SCC - object
	 */
	RSScc getSpecialCargoCodeByComID(Long comid);
	
	List<CommodityScc> getSpecialCargoCodeByComIDAndAnnID(Long comid, Long ann_id);

	/**
	 * get carriers by given startString for 3lc and Name
	 * @param match
	 * @return list of carrier and connections objects
	 */
	List<RSCaConx> getCarriersByMatch(String match);

	/**
	 * get commodities by given startstring for awbname
	 * @param match
	 * @return list of commodities
	 */
	List<ICommodityTree> getCommodityList(String match);

	/**
	 * get commodities by given startstring for awbname
	 * @param match
	 * @return list of commodity view
	 */
	List<CommodityView> getCommodityByMatch(String match);
	
	List<CommodityView> getAllCommodityView();

	/**
	 * get commodity by id
	 * @param comid
	 * @return commodity
	 */
	ICommodityTree getCommodityByid(Long comid);
	/**
	 * get child commodities by given ID
	 * @param comid
	 * @return list of commodities
	 */
	List<ICommodityTree> getCommodityChildList(Long comid);
	/**
	 * get address by matching string to companyNAme only
	 * @param match
	 * @return
	 */
	List<RSAdd> getAddressByMatch(String match);
	/**
	 * @param text
	 * @return
	 */
	RSAp getAirportBy3LC(String id);
	/**
	 * @param match
	 * @return
	 */
	List<RSCaConx> getAirlineByMatch(String match);
	/**
	 * @param ca_3dg
	 * @return
	 */
	RSCa getAirlineBy3dg(String ca_3dg);
	
	RSCa getAirlineByCaID(String ca_id);
	
	/**
	 * @param match
	 * @return
	 */
	List<RSAdd> getAddressesBy(String match);
	/**
	 * @param serviceCode
	 * @return
	 */
	RSScc getSpecialCargoCodesByID(String serviceCode);
	/**
	 * @param add
	 * @return
	 */
	RSAdd createCompanyAddress(RSAdd add);
	/**
	 * @param match
	 * @return
	 */
	List<RSCo> getCountriesByMatch(String match);
	
	List<RSCo> getCountries();

	Integer registerNewUser(RCAdd rca);
	
	List<RSDi> getDistrictByCo2lc(String co_2lc);
	
	List<RSAp> getAirports2();
	
	String getCa2LCByUserLogin();
	
	List<RSDi> getDistrictByCountryByMatch(String co_2lc, String match);
	
	RFOt getChargesCollectFee(final List<BookingRequestFlight> bkgflights, final Double chargeableWeight, String currency, Integer shipperId, Integer consigneeId, Integer agentId);
	
	Map getAllChargesAvailable(String caId, String ca2lc);
	
	Integer saveFuelCharges(RSFuelChar instance);
	
	Integer saveSecurityCharges(RSCharges instance);
	
	Integer saveChargesCollect(List<RBase> rbase, RSCc instance);
	
	Integer saveOtherCharges(RSOt instance);
	
	Integer updateFuelCharges(RSFuelChar instance, Long fuelCharId);
	
	Integer updateSecurityCharges(RSCharges instance, Long chargesId);
	
	Integer updateChargesCollect(List<RBase> rbase, RSCc instance, String cc_id);
	
	Integer updateOtherCharges(RSOt instance, Long otId);
	
	Integer deleteFuelCharges(Long fuelCharId);
	
	Integer deleteSecurityCharges(Long chargesId);
	
	Integer deleteChargesCollect(String cc_id);
	
	Integer deleteOtherCharges(Long ot_id);
	
	List<RSOt2lc> getAllOt2Lc();
	
	List<RSOt1lc> getAllOt1Lc();
	
	List<RSOt2lc> getOt2LcByMatch(String match);
	
	RBase getRBaseById(Long ruleId);
	
	RSFuelChar getFuelCharForBooking(Double charWeight, List<BookingRequestFlight> bkgflights) ;
	
	RSCharges getSecCharForBooking(Double charWeight, List<BookingRequestFlight> bkgflights) ;
	
	List<RSOt> getOtherChargesByCa2lcAndAp3lc(String ca2lc, String ap3lc);
	
	byte[] getImageByName(String name);
	
	List<Integer> getActiveBlackbox();
	
	List<Partnership> getAirlinePartnershipData();
	
	List<Partnership> getRequestedAirlinePartnershipData();
	
	List<Partnership> getFFWPartnershipData();
	
	List<Partnership> getRequestedFFWPartnershipData();
	
	Integer saveParnertshipRequest(Partnership partnership);
	
	Integer updateParnertshipRequest(Partnership partnership);
	
	List<RSAddCAAccount> getAccountNoList();
	
	List<RSAdd> getAllFreightForwarder();
	
	/**
	 * @deprecated
	 * @return
	 */
	List<RSAddCAAccount> getAvailableCarrier();
	
	public List<RSAddCAAccountView> getAvailableCarrierWith2lc();
	
	public List<ModeOfTransport> getModeOfTransports();
	
	public Partnership getPartnershipByCaIdAndFFwAddId(String caId, Integer ffwAddId);
	
	public Integer updateDeposit(Partnership partnership);
	
	public void sendDepositAlert(Double depositAmount);
	
	public Integer saveGSAPartnershipRequest(GSAPartnership partnership);
	
	public List<GSAPartnership> getRequestedGSAPartnershipData();
	
	public Integer updateGSAPartnershipRequest(GSAPartnership partnership);
	
	public List<GSAPartnershipView> getGSAPartnershipByGSAAddId();
	
	public List<GSAPartnershipView> getGSAPartnershipByCaId();
	
	public RSAddCAAccountView getRSAddCAAccountViewByAddId();
	
	public RSCoTax getTaxByCountry(String country, String custom, Integer type);
	
	public void updateDepositNew(Partnership partnership);
	
	RSSalesRates getSalesRateByRateId(String rateId);
	
	public void saveAwbAccount(ItemAWBAccount itemAWBAccount);
	
	public Partnership getPartnershipByCaIdAndPartnershipId(String caId, Long partnershipId);
	
	public RSOt getOtherChargesByAp3lcAndOt2lc(String ap3lc, String ot2lc);
	
	List<RSCharges> getListCharForBooking(Double charWeight, List<BookingRequestFlight> bkgflights) ;
	
	RSAnn getAnnotationById(Long annId);
	
	public RSCaPref getAirlinePreferenceByCaId(String caId);
	
	public void sendDepositAlert(Double depositAmount, Integer ffwAddId);
	
	public void sendDepositAlert(Double depositAmount, Double sisaLimit, Double warningLimit, Integer ffwAddId);
	
	public List<RSAddName> getAddressByMatchForLocation(String match);
	
	public List<RSAddAdd> getAddByID(Integer addID);
	
	public List<Map<String,String>> getAddressByMatchForLocationWithGoogleMaps(String match);
	
	public List<ZHandlingAirport> getAirlineByGHAAddId();
	
	CommodityAnn getComAnnotationByComId(Long comId);
	
	public Boolean saveRFCourierJob(RFCourierJob rfCJ);
	
	public Long getNextCJId();
	
	public List<AwbNo> getAirlineByAwbNo();
	
	public Long getNextOTId();
	
	public Long getNextRSCRService();
	
	public RSCoAr getCountryByAreaCode(String areaCode, String country);
	
	//-----by rusman------
	public Long getNextRSCourierRoute();
	public Long getNextRSCourierRate();
	public Long getNextRSCity();
	public Long getNextRSDistrict();
	public Long getNextRSPostalCode();	
	public Long getNextRRBase();
	//-----finish by rusman-----
		
	public Integer saveHouseAirwaybill(List<RSHouseAirwaybill> bean);
	
	
	
}