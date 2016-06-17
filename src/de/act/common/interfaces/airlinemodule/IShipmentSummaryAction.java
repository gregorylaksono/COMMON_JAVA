package de.act.common.interfaces.airlinemodule;

import java.util.List;
import java.util.Map;

import de.act.common.interfaces.IAction;
import de.act.common.types.nonstaticobjects.BookingInformation;
import de.act.common.types.nonstaticobjects.RFStat;
import de.act.common.types.nonstaticobjects.RFStatView;
import de.act.common.types.nonstaticobjects.ShipmentInformation;
import de.act.common.types.nonstaticobjects.StatusInformation;
import de.act.common.types.views.NewExportAcceptanceView;

public interface IShipmentSummaryAction extends IAction{

	/**
	 * get Shipment Summary data by AWB number	 
	 * @param String AWB Number	 
	 * @return BookingInformation object
	 */
	public List<BookingInformation>  getBookingInformationByAWBNo(String ca_3dg, Integer awb_no, Integer awb_stock);
	
	/**
	 * get Shipment Summary data by AWB number	 
	 * @param String AWB Number	 
	 * @return ShipmentInformation object
	 */
	public List<ShipmentInformation> getShipmentInformationByAWBNo(String ca_3dg, Integer awb_no, Integer awb_stock);
	
	/**
	 * get Status Information data by AWB number	 
	 * @param String ca_3dg, Integer awb_stock, Integer awb_no
	 * @return StatusInformation object
	 */
	public List<StatusInformation> getStatusInformation(String ca_3dg, Integer awb_stock, Integer awb_no);
	
	/**
	 * get Addresses data by AWB number	 
	 * @param String awb_no
	 * @return Addresses object
	 */
	public Map<String, Integer> getShipmentInformationAddress(String ca_3dg, Integer awb_stock, Integer awb_no);
	
	public List<RFStat> getStatsByLimitAndFId(Integer limit, String fId);
	
	public List<RFStatView> getRFStatsViewByLimitAndFId(Integer limit, String fId);
	
	public List<NewExportAcceptanceView> getExportAcceptance(String ca_3dg, Integer awb_stock, Integer awb_no);
}
