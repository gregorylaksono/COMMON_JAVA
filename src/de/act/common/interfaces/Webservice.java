
package de.act.common.interfaces;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import de.act.common.types.Aflt;
import de.act.common.types.User;
import de.act.common.types.UserObject;
import de.act.common.types.localobjects.RDDefault;
import de.act.common.types.nonstaticobjects.BookingInformation;
import de.act.common.types.nonstaticobjects.RFStatView;
import de.act.common.types.ruleobject.RBase;
import de.act.common.types.staticobjects.BookingItemParentWrapper;
import de.act.common.types.staticobjects.CommodityInsurance;
import de.act.common.types.staticobjects.RSAnn;
import de.act.common.types.staticobjects.RSAr;
import de.act.common.types.staticobjects.RSCo;
import de.act.common.types.staticobjects.RSCur;
import de.act.common.types.staticobjects.RSFlt;
import de.act.common.types.views.AWBView;
import de.act.common.types.views.BookingControlView2;
import de.act.common.types.views.PackageControlView;

public interface Webservice {

    public SimpleDateFormat flightDateFormat = new SimpleDateFormat("ddMMM");
    public SimpleDateFormat sdfDate = new SimpleDateFormat("dd/MM/yyyy");
    public SimpleDateFormat sdfDate2 = new SimpleDateFormat("MM/dd/yyyy HH:mm");
    public SimpleDateFormat sdfDate3 = new SimpleDateFormat("MMM dd yyyy");
    public SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
    public DecimalFormat nf = new DecimalFormat("0.00", new DecimalFormatSymbols(Locale.ENGLISH));
    public DecimalFormat nf2 = new DecimalFormat("0.00");
    public String success = "00:success";
    public String err_data_not_found = "01:unable to find data!";
    public String err_discrepancy = "01:discrepancy!";
    public String err_shipment_already_loaded = "01:unable to process, shipment already loaded!";
    public String err_flight_is_closed = "01:unable to process, flight is closed!";
    public String err_awb_already_accepted = "01:unable to process, AWB already accepted!";
    public String err_unable_to_accept_awb = "01:unable to accept AWB!";
    public String err_shipment_already_approved = "01:unable to process, shipment already approved!";
    public String err_unable_to_approve_shipment = "01:unable to approve shipment!";
    public String err_unable_to_load_shipment = "01:unable to load shipment!";
    public String err_one_or_more_uld_does_not_have_uld_transfer_mode = "01:one or more ULD does not have ULD Trasfer mode!";
    public String err_manifest_already_closed = "01:unable to process, manifest already closed!";
    public String err_no_schedule_found_for_this_flight = "01:no schedule found for this flight!";
    public String err_no_commodity_view_list_found = "01:no commodity view list found!";
    public String err_no_aircraft_list_found = "01:no aircraft list found!";
    public String err_unable_to_safe_freight_forwarder = "01:unable to save freight forwarder!";
    public String err_unable_to_safe_agent_data = "01:unable to save agent data";
    public String err_email_address_invalid = "01:email address is not valid!";
    public String err_company_name_must_be_entered = "01:company name must be entered!";
    public String err_address_and_contact_at_least_one_must_be_completed = "01:address and contact - at least one must be completed!";
    public String err_country_invalid = "01:country invalid!";
    public String err_district_not_found = "01:unable to find district!";
    public String err_import_agent_not_available = "01:import agent not available!";
    public String err_export_agent_not_available = "01:export agent not available!";
    public String err_airport_not_available = "01:airport not available!";
    public String err_address_type_must_be_entered = "01:address type must be entered!";
    public String err_id_is_incorrect = "01:id is incorrect!";
    public String err_the_address_must_be_provided = "01:the address must be provided!";
    public String err_phone_number_is_not_valid = "01:phone number is not valid!";
    public String err_fax_number_is_not_valid = "01:fax number is not valid!";
    public String err_tel_fax_email_one_must_be_entered = "01:please insert at least telephone or fax or email!";
    public String err_new_address_cannot_be_saved = "01:new address cannot be saved";
    public String err_please_fill_the_package_description_fields = "01:please fill the package description fields!";
    public String err_please_fill_the_package_description_field_pcs = "01:please fill the package description field pcs!";
    public String err_please_fill_the_package_description_field_wgt = "01:please fill the package description field wgt!";
    public String err_please_fill_the_package_description_field_volume = "01:please fill the package description field volume!";
    public String err_no_flight_selected = "01:no flight selected!";
    public String err_is_not_accepted_on_flight_no = "is not accepted on Flight No:";
    public String err_please_enter_the_date = "01:please enter the date!";
    public String err_please_give_consignee_details = "01:please give the consignee details!";
    public String err_please_indicate_the_freight_forwarder = "01:please indicate the freight forwarder!";
    public String err_please_process_acceptance = "01:please process acceptance!";
    public String err_special_cargo_code_conflict = "01:Special Cargo Code Conflict. Your shipment is put on Lying List!";
    public String err_cannot_send_your_booking_request = "01:cannot send your booking request!";
    public String err_use_method_getManifestDataByCa2lc = "01:use method getManifestDataByCa2lc!";
    public String err_unauthorized_user = "01:unauthorized user!";
    public String err_please_user_method_closeManifestByCa2lc = "01:please use method closeManifestByCa2lc!";
    public String err_please_use_method_closemanifest = "01:please use method closeManifest!";
    public String err_unable_to_safe_manifest = "01:unable to save manifest!";
    public String err_unavailable_process = "01:unavailable process ";
    public String err_unavailable_rate = "01:unavailable rate!";
    public String err_weight_or_volume_is_overload = "01:no schedule found for this flight, weight or volume is overload!";
    public String err_one_or_more_scc_schedule_is_invalid = "01:no schedule found for this flight, one or more scc schedule is invalid!";
    public String err_one_or_more_scc_is_not_loadable = "01:no schedule found for this flight, one or more scc is not loadable!";
    public String err_unable_to_save_commodity = "01:unable to save commodiy!";
    public String err_failed_to_save_commodity = "01:failed to save commodity!";
    public String err_unable_to_save_data = "01:unable to save data!";
    public String err_awb_data_not_found = "01:unable to save data, AWB not found!";
    public String err_unable_to_modify_booking_booking_is_cancelled = "01:unable to modify booking, booking is cancelled!";
    public String err_unable_to_modify_booking_booking_is_confirmed_and_flight_is_closed = "01:unable to modify booking, booking is confirmed and flight is closed!";
    public String err_unable_to_send_fwb = "01:unable to send FWB!";
    public String err_unable_to_print_to_pdf = "01:unable to print to pdf!";
    public String err_offload_shipment = "01:failed to offload shipment!";
    public String err_insert_courierjob = "01:failed to update courier job!";
    public String succ_saved_successfully = "00:saved successfully";
    public String succ_one_commodity_has_been_saved = "00:one commodity has been saved";
    public String succ_manifest_is_closed = "00:manifest is closed.";
    public String succ_awb_accepted = "00:AWB Accepted.";
    public String succ_shipment_approved = "00:shipment approved.";
    public String succ_acceptance_is_done = "00:acceptance is done.";
    public String succ_send_yout_booking_request = "00:send your booking request.";
    public String succ_shipment_loaded = "00:shipment loaded.";
    public String succ_your_fwb_has_been_sent_successfully = "00:Your FWB have been sent successfully.";
    public String succ_offload_is_done = "00:offload is done.";
    public String role_code_name_acternity = "Acternity";
    public String role_code_name_airline = "Airline";
    public String role_code_name_ffw = "Freight Forwarder";
    public String role_code_name_handling = "Handling Agent";
    public String role_code_name_gsa = "GSA";
    public String role_code_name_dispatcher = "Courier Dispatcher";
    public String role_code_name_driver = "Courier Driver";

    public enum Constant {Open, Closed, xxx, CONFIRMED, WAIT_LIST, LYING_LIST, APPROVED, NOT_APPROVED, DISCREPANCY, NOT_LOADED, LOADED}
    public enum Charge {PPD, COLL}
    public enum NextProcess {approveawbexport, approveshipmentexport, exportacceptance, loadshipment, unloadshipment, ofldshipment, discrepancy, cancel, importacceptance, none}

    public Map<String, Object> getAwbData(String ca_3dg, Integer awbStock, Integer awbNo, int userAdd_id, String realUserId, String ca_2lc);

    public List<Map<String, Object>> getBookingConfirmWaitingList(Integer user_Add_id, String user_Ca_id, String flt_no, Date bkg_flt_date, Integer status, String user_type, String dept, String dest);

    public Map<String, Object> getManifestData(String ca2lc, String flightNo, String departure, String destination, Date flightDate, String userType, int userAddId);

    public String processAcceptance(String ca3dg, int awbStock, int awbNo, String departure, String destination, Date flightDate, Integer part, User user);

    public String acceptAWB(String ca3dg, int awbStock, int awbNo, String departure, String destination, Date flightDate, Integer part, User user);

    public String approveShipment(String ca3dg, int awbStock, int awbNo, String departure, String destination, Date flightDate, Integer part, User user);

    public String loadShipment(String ca3dg, int awbStock, int awbNo, String departure, String destination, Date flightDate, Integer part, String userType, int userAddId, String username, String userAp3lc);

    public String closeManifest(String fltNo, String dept, String dest, Date flightDate, String ca2lc, User user);

    public List<BookingControlView2> getAllMyShipmentWithUserTypeForContentMyShipmentPager(String criteria, String searchValue, String criteria2, String searchValue2, Integer exportImport, User user);

    public List<BookingControlView2> getMyShipmentLast10(User user);

    public String getNextProcess(String ca3dg, int awbStock, int awbNo, String departure, String destination, Date flightDate, Integer part, User user);

    public String executeProcess(String ca3dg, int awbStock, int awbNo, String departure, String destination, Date flightDate, Integer part, User user, String process);

    public List<RFStatView> getAWBStatusTrack(String ca_3dg, Integer awb_stock, Integer awb_no);

    public Map getShipmentSummary(String ca_3dg, Integer awb_stock, Integer awb_no, User user);

    public Map<String, Object> getSchedules(String airline_ca_id, String airline_ca_3dg, String departure, String destination, 
    		Date minDeparture, Date maxArrival, User user, String[] commodities, String shipper, String consignee, String agent, 
    		String alsoNotify, String deliveredTo, String insurance);

    public Map<String, Object> getCommodityByMatch(String match, int userAddId);

    public Map<String, Object> getConsigneeAddressByMatch(String match, int userAddId);

    public Map<String, Object> getShipperAlsoNotifyDeliveredToAddressByMatch(String match, int userAddId);

    public Map<String, Object> getFfwAddressByMatch(String match, int userAddId);

    public Map<String, Object> getAirportFromToByMatch(String match);

    public String createCommodity(Long parentId, String comName, String awbName, User user);

    public Map<String, Object> getAllCountryByMatch(String match);

    public Map<String, Object> getSccByMatch(String match);

    public String getSccByCommodity(Long com_id, Long ann_id);

    public List<String> getAirlineSccList(String userCaId);

    public Map<String, Object> getPackageColors();

    public Map<String, Object> getPackageShape();

    public Map<String, Object> getPackageMaterial();

    public String addAddress(String companyName, String iataCode, String contactPerson, String street, String city, String postalCode, String postalCodeAndCity, String cityAndPostalCode, String postOfficeBox, String streetAndNumber, String number, String country, String tel, String fax, String email, String addressType, String bank, int userS_id, int userAddId);

    public Map createBooking(String airline_ca_id, String airline_ca_3dg, String[] flights, String[] commodities, String shipper, String consignee, String freightForwarder, String alsoNotify, String deliveredTo, User user, Date deDate, String[] accInfo, String[] handInfo, String insurance);

    public Map<String, Object> getAirportFromToPerDay(Date fromDate, String departure, String destination, User user);

    public List<String> getAirportListByCaId(String request, String airport, String caId);
    
    public List<String> getAirportListByCaId2(String request, String airport, String[] caId);

    public List<String> getAirportListByCaIdMatch(String request, String match, String caId);

    public Map getAirlinessByMatch(String match);

    public List<String> getCustomeCodes();

    /*Rony - 2010325*/
    /*change name to getMrnNumberByAwb*/
    /*
    public List<String> getMrnNumber(String ca3dg, Integer awbStock, Integer awbNo);
	*/

    public String saveCucAndMrnNumber(String ca3dg, Integer awbStock, Integer awbNo, String cucCode, String[] mrns, User user);

    public String sendFWB(String ca3dg, Integer awbStock, Integer awbNo, Integer addId);

    public Map<String,Object> printManifestToPdf(String ca2lc, String flightNo, String departure, String destination, Date date, String type, Integer addId);

    public byte[] getFileDataPDF(String url);

    public byte[] getFileData(String fileName);

    public List<String> generateBarcodeLabel(String ca3dg, String awbStock, String awbNo, Integer addId);

    public List<AWBView> getAWBViewSummary(String ca3dg, Integer awbStock, Integer awbNo, User user);

    public Map executeProcessMobile(String ca3dg, Integer awbStock, Integer awbNo, String dept, String dest, String fltDate, Double pcs, Double wgt, Double vol, Integer part, User user, String process);
    
    /*Rony - 20140220*/
    public String getAddTypeByAddId(String addID);
    
    /*Rony - 20140225*/
    public List<PackageControlView> getShipmentInformationByAWBNo(String ca3dg, Integer awbStock, Integer awbNo, Integer bkgItemId);
    
    /*Rony - 20140314*/
    public boolean saveEPaymentToken(String ca3dg, Integer awbStock, Integer awbNo, String paymentType, String transactionId, String tokenId, String paymentId, String payerId, Double amount, String cur3lc, String status);
    
    /*Rony - 20140320*/
	public Map getAwbByEPaymentToken(String token) ;  
	
	/*Rony - 20140325*/
	public List<String> getMrnNumberByAwb(String ca3dg, Integer awbStock, Integer awbNo) ;
	
	/*Rony - 20140325*/
    public List<String> getCucNumberByAwb(String ca3dg, Integer awbStock, Integer awbNo) ;
    
    /*Rony - 20140325*/
    public List<String> getCucNumber();    
    
    /*Rony - 20140326*/
    public Map getConsigneeAddress(Long userAddId);

    /*Rony - 20140326*/
    public Map getShipperAddress(Long userAddId);

    /*Rony - 20140326*/
    public Map getFfwAddress(Long userAddId, String caId);
    
    /*Rony - 20140404*/
    public boolean saveDiscrepancyByAwb(String ca3dg, Integer awbStock, Integer awbNo, User user, String[] packages);
       
    /*Rony - 20140410*/    
    /*untuk sementara tidak dipakai dulu karena secara fungsi sama dengan getAWBViewSummary*/
    public List<BookingInformation> getBookingInformationByAWBNo(String ca3dg, Integer awbStock, Integer awbNo);
    
    /*Rony - 20140410*/
    public boolean setLoadBookingByAwb(String ca3dg, Integer awbStock, Integer awbNo, Long bkgItemId, Integer part, String bookingStatus,User user);
    
    /*Rony - 20140410*/
    public boolean setUnloadBookingByAwb(String ca3dg, Integer awbStock, Integer awbNo, Long bkgItemId, Integer part, String bookingStatus,User user);
    
    /*heri - 20140422*/
    public RDDefault getDefaultPreference(User user);
    
    /*heri - 20140423*/
    public boolean updateDefaultPreference(User user, UserObject uo, RDDefault defaultData);
    
    /*heri - 20140423*/
    public List<RSCur> getAllCurrencies(User user);
    
    /*heri - 20140428*/
    public String paymentPaypalByBlackBox(String tokenId, String payerId, String currencyCode, String amount);
    
    /*heri - 20140505*/
    public Map retrieveAwbPaymentView(String tokenId);

    /*heri - 20140506*/
    public Map executePaypal(String paymentId, String payerId, String tokenId);

    /*heri - 20140512*/
    public List retrieveAirportDestination(String userDefaultAirport);
    
    /*heri - 20140512*/
    public List<RSFlt> getFlightsByDestination(final String dept, final String dest, final Date now);   
    
    /*heri - 20140519*/    
    public List<Map<String, Object>> getManifestDataDetail(String ca_3dg, Integer awb_stock, Integer awb_no, String dept, String dest, Date bkg_flt_date, Long bkg_item_id, String user_type, Integer add_id);
    
    /*heri - 20140521*/
    public String processImportAcceptance(String ca3dg, int awbStock, int awbNo, Long bkgItemId, String departure, String destination, Date flightDate, Integer part, User user);
    
    /*heri - 20140522*/
    public boolean processDelivery(String ca3dg, int awbStock, int awbNo, String dest, Integer deliverToId, String recipientName, String recipientSignature, String custRefNo, String bankRelNo, String invoiceNo, User user);
    
    /*heri - 20140602*/
    public List getAddressByMatch(String match, Long creator_add_id);

    /*heri - 20140605*/
    public Map loadDefaultPreferences(User user);
    
    /*heri - 20140605*/
	public String offloadShipment(User user, String ca_3dg, Integer awb_stock, Integer awb_no, String dept, String dest, String ca2lcParam,
			String flightNo, Date bkg_flt_date, Integer[] pcsMissing, Double[] wgtMissing, Double[] lMissing, Double[] wMissing,
			Double[] hMissing, Double[] volMissing, Long[] pkgId);

	/*F.H.K*/
    public Map getFfwAddressByAddId(Integer userAddId);
    
    public Boolean saveMissingCargoByAwb(String ca3dg, String awbStock, String awbNo, String ap3lc, Integer part, User user, String[] packages, String[] exportAcceptance);

	public String saveDefaultPreferences(User user, String airport, String companyName, String customReference, String countryName, String fax, String telp, String email, String contactPerson, String street, String currCode);
	
	public Integer saveUserDummy(User user, String addType, String name, String contactPerson, String street, String city, String fax, String telp, String email, String countryName, String longitude, String latitude);
	
	public List<Map<String, String>> getUserPreferencesList(User user, boolean isDTD);	
	
	public Integer saveNewUserLogin(User user, String familyName, String firstName, String loginName, String password, String email);
	
	public Integer removeUserLogin(User user, String userId);
	
	public Integer updateUserLogin(User user, String userId, String familyName, String firstName, String loginName, String password, String email, String passwordChangeFlag, String emailChangeFlag, String vehicleType);
	
	public Boolean addRegistrationId(User user, String regId);
	
	public Boolean updateAcReg(User user, String acReg, String flightNo, String departure, String destination, Date flightDate);
	
	public Map<String, String> getPartnership(User user);
	
	public boolean sendFFW(User user, String paymentTypeCode, Double amountDeposite, Double limitDown, Double limitUp);
	
	public boolean updateDeposite(User user, Double amountDeposite);
	
	public String printAWB2PDF(User user, String ca3dg, Integer awbStock, Integer awbNo);

	public List<Aflt> getAfltByFltId(List<Long> fltId, Date fltDate) ;
	
	public List<String> generateInvoicePdf(String ca3dg, String awbStock, String awbNo, Integer addId, User user);
	
	public Integer registerUser(String addrData);
		
	public List getCheckRangeInCourierByLatitudeLangitude(String addId, String longitude, String latitude);
	
	public Map getDepAndArrAndRateByDistanceDepartureToDestinations(String sessionKey, String shipper, String consignee, Date minDep,
			Date maxArr, String[] commodities, User user, Integer addId1, String latitude1, String langitude1, Integer addId2,
			String latitude2, String langitude2, String insurance);
   
    
	public List<String> retrieveUserLoginRight(User user, Map<String, String> inputMap);
	
	public Boolean courierAcceptance(String ca3dg, int awbStock, int awbNo, String departure, String destination, Date flightDate, Integer part, User user);

	public List<String> getRSApByLatitudeAndLongitude(String latitude, String longitude);
			
	public List<String> getAirlineMatch(String match);	
	
	public Boolean addNewCommodity(User user, String awb_name, boolean status);
	
	public List<Map<String, String>> getCourierRateByAddId(Integer addId);	
	
	public List<Map<String, String>> getCourierCompByAddId(User user);
	
	public List<String> getVehicleType(User user);
	
	public Integer modifyBooking(User user, String[] packages, String ca3dg, Integer awbStock, Integer awbNo);
	
//	public Integer modifyBooking(User user, Long commodity, Integer type, String scc, Integer pieces, Double weight, 
//		Double length, Double width, Double height, Double volume, String ca3dg, Integer awbStock, Integer awbNo);
//	public String getCur3lcByUserLogin(Integer addId);
	
	//Issue for DOORTODOOR
	public Integer removeUserLoginDTD(User user, String userName);
	
	public Map createBookingDoorToDoor(User user, String sessionKey, String rateId, boolean isForce);
	
	public List getVehiclePlateNumberAndDescforDTD();
	
	public Integer saveNewUserLoginDTD(User user, String familyName, String firstName, String loginName, 
			String password, String email, String userType, String vehicleType);
	
	public Integer insertRatesDTD(User user, String vehicleType, Double ratePer, Double min_rate, Double dist_rate, 
			String rate_type, String rate_unit, String min_flat);
	
	public Integer insertCompDTD(User user, String vehicleType, Double dimLength, Double dimWidth, Double dimHeight, 
			Double maxWeight, Double maxVol);

	public Map getShipmentSummaryDoorToDoor(String ca_3dg, Integer awb_stock, Integer awb_no, Double totalRate, User user);
	
	public Map<String, String> getDispatcherPositionLoLa(User user);
	
	public List<Map<String, String>> getShipperPotitionByDispatcher(User user, Integer flag);
	
	public List<Map<String, String>> getAllShipmentInfoByAddId(User user, String shipmentId);
	
	public List<Map<String, String>> getListUserForDispatcher(User user);
	
	public Boolean updateAssignedStatusCourierJob(User user, String formularId, String userId);
	
	public List<UserObject> getAllUser();
	
	public Boolean updateCourierJobFromExport(String ca3dg, int awbStock, int awbNo, String departure, 
			String destination, Date flightDate, Integer part, User user);
	
	public Boolean updateCourierJobFromImport(String ca3dg, int awbStock, int awbNo, Long bkgItemId, 
			String departure, String destination, Date flightDate, Integer part, User user);
	
	public Boolean pushMessageForAssignmentDriverDTD(String userId);
	
	public Boolean pushMessageForDispatcherFromConsignee(String ca3dg, int awbStock, int awbNo, String departure, User user);
	
	public Boolean updateFCJFromBarcode(User user, String ca3dg, String awbStock, String awbNo);
	
	public List<Map<String, String>> getTransitScheduleDoorToDoor(String airline_ca_3dg, String departure, String destination);
	//===================================================== by F.H.K =============================================================
	
	//Issue for FLYAFRICA
	public List<String> getAllOt2Lc();
	
	public Integer saveOtherCharge(User user, String[] otherCh, String ca3dg, String awbStock, String awbNo);
	
	public List<String> getOtherChargeByAWB(User user, String ca3dg, String awbStock, String awbNo);
	//===================================================== by F.H.K =============================================================
	
	//Issue for IPASAR
	
	
	public Boolean saveIPasarTracingPrice(List<Map<String, String>> mapList, String from, String thru);
	public Map<String, Object> doBookingStandalone(String service_code, Integer shipperAddId, Integer consigneeAddId, Double totalRate, String[] commodities,Date dep, Object courierImpl);
	
	//===================================================== by F.H.K =============================================================
	
	public Map<String, Object> getAirportListForDestinationFromDepartureValue(String request, String airport, String caId);
    
    public Map<String, Object> getAirportListForDestinationFromDepartureValue2(String request, String airport, String[] caId);
    
    public boolean saveBookingTemp(String airline_ca_id, String airline_ca_3dg, String[] flights, String[] commodities, String shipper, String consignee, String freightForwarder, String alsoNotify, 
    		String deliveredTo, User user, Date deDate, String[] accInfo, String[] handInfo, String tokenId, String paymentId, String amount, String cur3lc, String insurance);
    
    public Map<String, Object> getBookingTemp(String tokenId/*, String paymentId*/);
    
    public boolean saveBookingTempDoorToDoor(String tokenId, String paymentId,String sessionKey, Long rateId);

	public Map<String, Object> getBookingTempDoorToDoor(String tokenId, String paymentId);
	
	
	public Map createBookingIPasar(String[] commodities, Date deDate, Double totalRate, String insurance);
	

	public List<Map<String, String>> getMakeAnOfferRate(String orderId, String fromCountry, String toCountry, String fromCity,String toCity, String fromDistr, String toDistr, Long fromPostalCode, Long toPostalCode, String[] commodities, Date date);
	
	public void deleteCommodity(Long commId);
	
	public void createEditAnnotation(String name, Long group, String dsp);
	
	public void deleteAnnotation(Long annId);
	
	public RSAnn getAnnotationById(Long annId);
	
	public BigDecimal calculateCommodityInsurance(User user, String commodity, BigDecimal totalValue, BigDecimal itemValue, BigDecimal transportValue, Double weight);
	public List<CommodityInsurance> getCommodityInsuranceById(String addId);
	public Integer deleteInsuranceId(Long insuranceId);
	public CommodityInsurance getCommodityInsurance(String commodity);
	public Integer saveCommodityInsurance(Long comInsId,Long comId, Integer addId, Double rate, String rateUnit, String currency,
			Double min,Date validFrom, Date validUntil, String[] rules);
	
	public boolean editCommodity(Long comId, String comName, String awbName, Long parent, Long annId, String vadId);
	
	public Map getParentBookingItem(String ca_3dg, Integer awb_stock, Integer awb_no, User user);
	
	public Integer saveNewBookingParent(String f_id, String ca_id, List<BookingItemParentWrapper> listBookingItem, String shipper, String consignee,
			Long bkg_id_id, Long bkg_item_id, String from, String to, Double fuelCharConvRate, String fuelCharCurrFrom, String fuelCharCurrTo, Double secCharConvRate,
			String secCharCurrFrom, String secCharCurrTo, Double totalRateOld, Double fuelCharges,	Double securityCharges, User user);
	
	public List<RSAr> getAllAreas();
	public List<RSCo> getAllCountries();
	public List<RSCo> getCountryByArea(String areaCode);

	public String printAWBPDF(User user, Integer orderId, String type);
	public Map prepareHandshakeId(String fId, Long rateId);
	public boolean verifyHandShake(String f_id, String code, String sAddId, String type);
	public Map addAddressFromIPasar(String companyName, String iataCode, String contactPerson, String street, String city, String postalCode, String postalCodeAndCity,String district,
			String cityAndPostalCode, String postOfficeBox, String streetAndNumber, String number, String country, String tel, String fax, String email, 
			String addressType, String bank, int userS_id, int userAddId);
	
	public  List<Map<String, String>> getLatGeoCodeFromInput(String address);
	public Integer saveNewUserLoginUluee(String familyName, String firstName, String loginName, String password, String email, String userType,String langitude, String latitude);

	public Integer doCourierConfirm(User user, String sessionKey, String rateId, String type);
	public Map<String, Object> getAllViewByCreatorId(String creator_id);
	public List<String> getRulesByCommodityInsuranceId(String commInsId);
	public void test();
}

