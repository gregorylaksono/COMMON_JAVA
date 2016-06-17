/**
 * 
 */
package de.act.common.interfaces.airlinemodule;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import de.act.common.interfaces.IAction;
import de.act.common.types.Aflt;
import de.act.common.types.User;
import de.act.common.types.staticobjects.RSAc;
import de.act.common.types.staticobjects.RSAcType;
import de.act.common.types.staticobjects.RSAdd;
import de.act.common.types.staticobjects.RSConx;
import de.act.common.types.staticobjects.RSDbmWs;
import de.act.common.types.staticobjects.RSDbmWsCharges;
import de.act.common.types.staticobjects.RSDbmWsView;
import de.act.common.types.staticobjects.RSFlt;
import de.act.common.types.staticobjects.RSFltConxCA;
import de.act.common.types.views.BookingControlView2;
import de.act.common.types.views.NewExportAcceptanceView;
import de.act.common.types.views.ReportPerdayView;
import de.act.common.types.views.ReportPeriodView;
import de.act.common.types.views.TroubleListView;

/**
 * @author Henry
 *
 */
public interface IBookingControlAction extends IAction{

	RSConx getConnectionByFlt_No(String flt_no);
	
	List<String> getFlightNoByCa_Id();
	
	List<RSFlt> getFlightNoByCa_IdNew();
	
	List<String> getFlightNoByCa_IdAndDest(List<String> dest );
	
	List<String> getFlightNoByCa_IdAndDest(String caId, List<String> dest );
	
	List<RSFlt> getFlightNoByCa_IdAndDestNew(String caId, List<String> dest );
	
	List<String> getFlightNoByCa_IdAndDept(List<String> dept );
	
	List<String> getFlightNoByCa_IdAndDept(String caId, List<String> dept );
	
	List<RSFlt> getFlightNoByCa_IdAndDeptNew(String caId, List<String> dept );
	
	List<BookingControlView2> getBookingConfirmWaitingList(String flt_no, String bkg_flt_date, Integer status, String dept, String dest);
	
	List<BookingControlView2> getBookingLyingList(String dept, String dest_hops);
	
	public List<Long> validateFlightHops(String f_id, String flt_no, Date flightDate);
	
	public void updateFlightListToLyingList(String f_id, List<Long> lstBkgFltid);
	
	public List<BookingControlView2> getBookingControlViewByFid(String f_id);
	
	List<TroubleListView> getTroubleList(String ap3lc);
	
	Integer cancelBooking(String f_id, String ap_3lc);
	
	//List<BookingControlView2> getBookingConfirmList(String flt_no, Date bkg_flt_date);
	
	//List<BookingControlView2> getBookingWaitingList(String flt_no, Date bkg_flt_date);
	
	/*Integer toBookingList(List<BookingControlView> changingList);
	
	Integer toWaitingList(List<BookingControlView> changingList);*/
	
	Map<String, Object> toBookingList2(String f_id, Long bkg_item_id, String flt_no, Long bkg_flt_id, HashMap<String, Long> a_flt_id, LinkedHashMap<String, Date> flight, Long bkg_id_id);
	
	Map<String, Object> toBookingList(String f_id, Long bkg_item_id, String flt_no, Long bkg_flt_id, Long a_flt_id, String bkg_flt_date, Long bkg_id_id, Long mani_item_id, Integer fromPage);
	
	Integer toWaitingOrLyingList(String f_id, Long bkg_item_id, String flt_no, Long bkg_flt_id, Long a_flt_id, String booking_status, Long bkg_id_id, Long mani_item_id);
	
	Integer returnShipment(Long bkg_item_id, String f_id, String flt_no, Long bkg_flt_id, Long a_flt_id, String status_booking, Long bkg_id_id, List<NewExportAcceptanceView> list, Long maniID);
	
	Integer returnShipmentOld(Long bkg_item_id, String f_id, String flt_no, Long bkg_flt_id, Long a_flt_id, String status_booking, Long bkg_id_id);
	
	Aflt getAFltByFlt_NoCa3_lcAndDate(String flt_no, Date flight_date, String ca_id);
	
	RSFlt getSFltByFlt_NoAndCa3_lc(String flt_no);
	
	public RSFlt getSFltByFlt_NoAndCa_id(String flt_no, String ca_id);
	
	void autoDropLyingListWhenLogin();
	
	public void setLocalUser(User localUser);
	
	public void autoDropToLyingList(List<NewExportAcceptanceView> list);
	
	List<BookingControlView2> getHoldConfirmedBooking(String ap3lc);
	BookingControlView2 getBookingViewDetail(String fId, Long bookingItemId);
	
	public RSFlt getSFltByFlt_NoAndCa3_lc(String flt_no, String caId);
	
	/*Boolean returnShipment(Long bkg_item_id, Integer add_id, String f_id,
			String flt_no, Long bkg_flt_id, Long a_flt_id,
			String status_booking, Long bkg_id_id);*/
	
	public List<TroubleListView> getTroubleListWithCaId(String ap3lc, String caId);
	
	public RSFlt getSFltByFlt_NoAndCa3_lc(String flt_no, String ca_3lc, Date from, Date to);
	
	public RSConx getConnectionByFlt_No(String flt_no, String ca_id);
	
	public List<RSConx> getMultipleConnectionByFlt_NoAndDept(String flt_no, String ca_id, List<String> dept);
	
	public List<RSConx> getMultipleConnectionByFlt_NoAndDest(String flt_no, String ca_id, List<String> dest);
	
	public List<RSConx> getMultipleConnectionByFlt_No(String flt_no, String ca_id);
	
	public RSFlt getSFltByFlt_NoAndCa3_lcAndDeptAndDest(String flt_no, String ca_3lc, String dept, String dest);
	
	public RSFltConxCA getFltByFltId(String fltId);
	
	public Integer updateABkgPriority(String fid, Integer part, String dept, String dest, Integer prio);
	
	public Integer saveDbmWs(RSDbmWs ws);
	
	public List<RSDbmWsCharges> getDbmWsCharges();
	
	public Map<Date, RSDbmWsView> generateSummaryReport(Date from, Date to);
	
	public String generateDBMDetailReport(Date from, Date to);

	public List<ReportPerdayView> getReportPerday(Integer year, Integer month, Integer week);

	public Integer inactivateAbkgByFltIdAndDeptDateAndFIdAndPart(Long flt_id, Date date, String fId, Integer part);

	public List<ReportPeriodView> getReportPeriod(String dep, String dest, Date from, Date to, String fltNo, 
			String acReg, String caId, Integer view, String deptType, String destType, Integer fromToCriteria);
	
	public Map<String, Object> getCargoSalesReport(Integer year, Integer month);
	
	public List<String> getFlightNoByCa_IdAndDeptWithAlliance(List<String> dept );
	
	public List<RSFlt> getFlightNoByCa_IdAndDeptWithAllianceNew(List<String> dept );

	public List<String> getFlightNoByCa_IdAndDestWithAlliance(List<String> dest );
	
	public List<RSFlt> getFlightNoByCa_IdAndDestWithAllianceNew(List<String> dest );
	
	public List<String> getFlightNoByCa_IdWithAlliance();
	
	public List<RSFlt> getFlightNoByCa_IdWithAllianceNew();
	
	public Integer sendEmailFromBookingList(String flt_no, String bkg_flt_date, Integer status, String dept, String dest);
	
	public RSFlt getSFltByFlt_NoAndCa3_lcAndFltDate(String flt_no, String ca_3lc, String fltDate);
	
	public Map<String, Object> getInvoiceReport(String airport, String accNo, String company, Date from, Date to, Integer fromToCriteria);
	
	public Integer toWaitingOrLyingListManifest(String f_id, Long bkg_item_id, String flt_no, Long bkg_flt_id, Long a_flt_id, String booking_status, 
			Long bkg_id_id, Long mani_item_id, String ca_id);
	
	public boolean removeTroubleDiscrepancy(String f_id, RSAdd add, Integer part);
	
	public RSAc getRSAcByAcId(Long acId, String caId);
	
	public RSAcType getRSAcTypeByAcTypeId(Integer acTypeId);
	
	public String saveVehicleNo(String vehicleNo, Long flt_id, Date flt_date);
	
	Map<String, Object> toBookingListforCargoImp(User user, String f_id, Long bkg_item_id, String flt_id, Long bkg_flt_id, Long a_flt_id, String bkg_flt_date, Long bkg_id_id, Long mani_item_id, Integer fromPage);
}
