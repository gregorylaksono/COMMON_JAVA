/**
 * 
 */
package de.act.common.interfaces.airlinemodule;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import de.act.common.interfaces.IAction;
import de.act.common.types.User;
import de.act.common.types.attachment.CAbstractAttachment;
import de.act.common.types.formulars.FormularType;
import de.act.common.types.formulars.IFormularMain;
import de.act.common.types.nonstaticobjects.AWBPrint;
import de.act.common.types.nonstaticobjects.BookingRequestFlight;
import de.act.common.types.nonstaticobjects.RFStat;
import de.act.common.types.packageitems.ItemPKG;
import de.act.common.types.staticobjects.CustomNumber;
import de.act.common.types.staticobjects.Discrepancies;
import de.act.common.types.staticobjects.RSAdd;
import de.act.common.types.staticobjects.RSAp;
import de.act.common.types.staticobjects.RSFlt;
import de.act.common.types.views.BookingItemControlView;
import de.act.common.types.views.BookingItemParent;
import de.act.common.types.views.NewExportAcceptanceView;
import de.act.common.types.views.PackageControlView;
import de.act.common.types.views.PackageView;

/**
 * @author Henry
 *
 */
public interface IBookingItemAction extends IAction{

	public List<BookingItemControlView> getBookingItemByAwbNo(String ca_3dg, Integer awb_stock, Integer awb_no);
	
	public List<PackageControlView> getPackageItemByAwbNoAndBookingID(String ca_3dg, Integer awb_stock, Integer awb_no, Integer bkg_item_id);
	
	public List<PackageView> getPackage(Long bkg_item_id);
	
	//public Integer unactivatingABkg(RCBkg bkg);
	
//	public Map<Integer, Integer> saveSplit(String f_id, ArrayList<HashMap<String, Integer>> data, Long bookingFlightID, Long bkg_id_id, Map<Integer, Discrepancies> disprecancyPart, RSAp airport);
	public Map<Integer, Integer> saveSplit(String f_id, List ata, Long bookingFlightID, Long bkg_id_id, Map<Integer, Discrepancies> disprecancyPart, RSAp airport);
	
	public List<BookingItemParent> getParentBookingItem(String ca_3dg, Integer awb_stock, Integer awb_no);
	
	public List<BookingItemParent> getParentBookingItemWithUserAirport(String ca_3dg, Integer awb_stock, Integer awb_no);
	
	public Integer saveNewBookingParent(String f_id, String carrier_ca_id, List<ItemPKG> newPackage, RSAdd shipper, RSAdd consignee, RSAdd freight, Long bkg_id_id, Long bkg_item_id);
	
	public List<BookingItemParent> getParentBookingItemForPreadvise();
	
	public List<BookingRequestFlight> getBookingFlights(String f_id);
	
	public Integer saveNewBookingParentNew(String f_id, String carrier_ca_id, List<ItemPKG> newPackage, RSAdd shipper, 
			RSAdd consignee, RSAdd freight, Long bkg_id_id, Long bkg_item_id, String from, String to, 
			String fuelCharCurrFrom, String fuelCharCurrTo, String secCharCurrFrom, String secCharCurrTo, String comingFrom);
	
	public Map getRateModification(String f_id, String carrier_ca_id, List<ItemPKG> newPackage, RSAdd shipper, 
			RSAdd consignee, RSAdd freight, Long bkg_id_id, Long bkg_item_id, String from, String to,
			String fuelCharCurrFrom, String fuelCharCurrTo, String secCharCurrFrom, String secCharCurrTo);
	
	public Integer saveNewBookingParentForCargoImp(String ca3dg, String awbStock, String awbNo, String dept, String dest, String ca2lc, RSAdd shipperName,
			RSAdd conName, String commodity, Integer pcs, Double weight, Long userAddId, String mrnCustoms);

	public List<String> getCustomCodes();
	
	public Integer missingAllShipment(String f_id, Long bkg_item_id, String flt_no, Long bkg_flt_id, Long a_flt_id, String booking_status, 
			Long bkg_id_id, Long mani_item_id, Integer part, String airport);
	
	public Integer saveCucAndMrnNumber(String f_id, String cuc_code, List<String> mrn_no);
	
	public List<AWBPrint> getAwbPrintByFId(String fId);
	
	public Integer saveAwbPrint(AWBPrint print);
	
	public Integer sendFWB(String f_id);
	
	public List<CustomNumber> getMrnNumberByFid(String fId);
	
	/*Rony - 20140606*/
	public List<String> getCucNumberByFid(String fId);
	
	public Integer saveMRNNumbers(List<CustomNumber> list);
	
	public Integer splitBooking(Long bkg_item_id, String f_id, Long bkg_flt_id, Long a_flt_id,
			Long bkg_id_id, List<NewExportAcceptanceView> list, Boolean fromEmail, Date fltdate);
	
	public Integer modifyPackageBooking(String f_id, String carrier_ca_id, List<ItemPKG> newPackage, 
			RSAdd shipper, RSAdd consignee, RSAdd freight, Long bkg_item_id, Integer part, String comingFrom);
	
	public Integer changeRoute(String f_id, List<BookingRequestFlight> newRoute, 
			Long bkg_flt_id, Integer changeRoute, User user, Boolean emailFlag);
	
	public Map getRateNew(String f_id, String carrier_ca_id, List<ItemPKG> newPackage, RSAdd shipper, RSAdd consignee, RSAdd freight, Long bkg_id_id, Long bkg_item_id,
			String from, String to,	String fuelCharCurrFrom, String fuelCharCurrTo, String secCharCurrFrom, String secCharCurrTo);
	
	public Integer saveNewBookingParentForCargoImpNew(String ca3dg, String awbStock, String awbNo, String dept, String dest, String ca2lc, RSAdd shipperName,
			RSAdd conName, RSAdd agent, String commodity, Integer pcs, Double weight, Integer userAddId, String mrnCustoms, List<RSFlt> fltNo, String currency, Double volume);
	
	public void saveNewBookingForCargoImpInFFM(String ca3dg, String awbStock, String awbNo, String dept, String dest, String ca2lc, RSAdd shipperName,
			RSAdd conName, RSAdd agent, String commodity, Integer pcs, Double weight, Long userAddId, String fltNo, String currency, Double volume);
	
	public void saveNewBookingForCargoImpInFFM(List<Map> flightsWrapperList, String ca3dg, String awbStock, String awbNo, String dept, String dest, String ca2lc, RSAdd shipperName, RSAdd conName,
			RSAdd agent, String commodity, Integer pcs, Double weight, Long userAddId, String fltNo, String currency, Double volume, String emailSubject, String sccCode);
	
	public Integer disableBKG(IFormularMain mainFormular);
	
	public CAbstractAttachment getLastAttachmentFor(List<CAbstractAttachment> attachments, FormularType t);
	
	public Integer saveABkgAndAManiItem(IFormularMain formular);
	
	public void saveManifestItem(Long fltID, Date fltDate, Integer add_id, Long bkg_item_id, Integer item_pcs, Long cur_bkg_item);
	
	public void syncDB(String f_id, String status, RSAp airport, List<Integer> notifiedBlackbox, Vector<RFStat> stat, Vector<CustomNumber> mrns);
	
}
