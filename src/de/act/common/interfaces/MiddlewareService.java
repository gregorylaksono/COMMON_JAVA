package de.act.common.interfaces;

import java.util.Map;

public interface MiddlewareService
{
	/*
	 * ============================================================================================================================
	 * 		Constants
	 * ============================================================================================================================
	 */
	
	public static final String PARAM_USER_ID = "userID";
	public static final String PARAM_CA3DG = "ca3dg";
	public static final String PARAM_CA2LC = "ca2lc";
	public static final String PARAM_AWBNO = "awbno";
	public static final String PARAM_DEPT = "dept";
	public static final String PARAM_DEST = "dest";
	public static final String PARAM_FLT_NO = "fltNo";
	public static final String PARAM_FLT_DATE = "fltDate";
	public static final String PARAM_EXPORT_FLAG = "exportFlag";
	public static final String PARAM_ACC_STATUS = "accStatus";
	
	public static final String METHOD_ACCEPTANCE_AWB = "awb";
	public static final String METHOD_ACCEPTANCE_SHIPMENT = "shipment";
	
	public static final String RESULT_STATUS = "status";
	public static final String RESULT_ERRCD = "errCode";
	public static final String RESULT_AWB_NO = "awbNo";
	public static final String RESULT_FLIGHT_NUMBER = "flightNumber";
	public static final String RESULT_FLIGHT_DATE = "flightDate";
	public static final String RESULT_DEPARTURE = "departure";
	public static final String RESULT_DESTINATION = "destination";
	public static final String RESULT_ADDRESS_SHIPPER = "addressShipper";
	public static final String RESULT_ADDRESS_CONSIGNEE = "addressConsignee";
	public static final String RESULT_ADDRESS_FFW = "addressFfw";
	public static final String RESULT_ADDRESS_DELIVER_TO = "addressDeliverTo";
	public static final String RESULT_ADDRESS_NOTIFY = "addressNotify";
	public static final String RESULT_CHARGES = "charges";
	public static final String RESULT_COMMODITY_LIST = "commodityList";
	public static final String RESULT_FLIGHT_LIST = "flightList";
	public static final String RESULT_CONSIGNMENT_LIST = "consignmentList";
	
	public static final String STATUS_OK = "00";
	public static final String STATUS_FAILED = "01";
	
	public static final String ERRCD_SYSTEM = "99";
	public static final String ERRCD_WRONG_USER_ID = "001";
	public static final String ERRCD_WRONG_DATE_FORMAT = "002";
	
	public static final String ERRCD_WRONG_METHOD = "101";
	public static final String ERRCD_SHIPMENT_NOT_FOUND = "102";
	public static final String ERRCD_SHIPMENT_NOT_IN_BOOKING_LIST = "103";
	public static final String ERRCD_FLIGHT_IS_CLOSE = "104";
	public static final String ERRCD_MANIFEST_EMPTY = "105";
	
	/*
	 * ============================================================================================================================
	 * 		Methods used by SOAP message
	 * ============================================================================================================================
	 */
	
	public Map<String, Object> getAwbData(Map<String, Object> data);
	
	public Map<String, Object> getManifestData(Map<String, Object> data);
	
	public Map<String, String> executeAcceptance(String method, Map<String, Object> data);
	
	/*
	 * ============================================================================================================================
	 * 		Methods used by Mail message
	 * ============================================================================================================================
	 */
	
	public boolean processExportAcceptance(Map<String, Object> data);
	
	public boolean processImportAcceptance(Map<String, Object> data);
	
	public boolean processShipmentDiscrepancy(Map<String, Object> data);
	
	public boolean processShipmentNotified(Map<String, Object> data);
	
	public boolean processShipmentDelivered(Map<String, Object> data);
	
	public boolean processFlightManifest(Map<String, Object> data);
	
	public boolean processAwb(Map<String, Object> data);
	
	public boolean processFlightBookingList(Map<String, Object> data);
	
}
