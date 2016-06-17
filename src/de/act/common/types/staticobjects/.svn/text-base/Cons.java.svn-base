package de.act.common.types.staticobjects;

import java.util.Date;

public class Cons
{
	public final static int STORAGE_CHARGES_RULE_NONE = 0;
	public final static int STORAGE_CHARGES_RULE_EACH = 1;
	public final static int STORAGE_CHARGES_RULE_MINIMUM = 2;
	
	public final static int PREADVISE_ACCEPTANCE_STATUS_NONE = 0;
	public final static int PREADVISE_ACCEPTANCE_STATUS_REJECTED = -1;
	public final static int PREADVISE_ACCEPTANCE_STATUS_PARTIAL = 1;
	public final static int PREADVISE_ACCEPTANCE_STATUS_ACCEPTED = 2;
	
	public final static int PREADVISE_USERS_RESPOND_STATUS_NONE = 0;
	public final static int PREADVISE_USERS_RESPOND_STATUS_REJECTED = -1;
	public final static int PREADVISE_USERS_RESPOND_STATUS_ACCEPTED = 1;
	
	public static final int SCC_VALUE_TYPE_WEIGHT = 0;
	public static final int SCC_VALUE_TYPE_L = 1;
	public static final int SCC_VALUE_TYPE_W = 2;
	public static final int SCC_VALUE_TYPE_H = 3;
	
	public static final String SCC_3LC_HEA = "HEA";
	public static final String SCC_3LC_BIG = "BIG";
	public static final String SCC_3LC_NA = "N/A";
	
	public static final String CURRENCY_SOURCE_EWIRE = "ewire";
	public static final String CURRENCY_SOURCE_YAHOO = "yahoo";
	
	public static final String MY_SHIPMENT_SORT_DEPT_DATE =  "deptDate";
	
	public static final String MY_SHIPMENT_SEARCH_DEPT_DATE = "departureDate";
	public static final String MY_SHIPMENT_SEARCH_FLIGHT = "flight";
	public static final String MY_SHIPMENT_SEARCH_DEPARTURE = "departure";
	public static final String MY_SHIPMENT_SEARCH_DESTINATION = "destination";
	public static final String MY_SHIPMENT_SEARCH_COMMODITY = "commodity";
	public static final String MY_SHIPMENT_SEARCH_SHIPPER = "shipper";
	public static final String MY_SHIPMENT_SEARCH_STATUS_SHIPMENT = "statusShipment";
	public static final String MY_SHIPMENT_SEARCH_AWB_NO = "awbNo";
	public static final String MY_SHIPMENT_SEARCH_BOOKING_DATE = "bookingDate";
	public static final String MY_SHIPMENT_SEARCH_LOADING_DATE = "loadingDate";
	
	public static final int MANAGEMENT_INFORMATION_DATE_ISSUE_SEARCH = 0;
	public static final int MANAGEMENT_INFORMATION_DATE_BOOKING_SEARCH = 1;
	public static final int MANAGEMENT_INFORMATION_DATE_LOADING_SEARCH = 2;
	
	public final static String HA_TYPE_INTERNAL = "i";
	public final static String HA_TYPE_CARGO_IMP = "c";
	
	public static final String dateToString(Date date)
	{
		if(date != null)
			return (date.getYear() + 1900) + ":" + date.getMonth() + ":" + date.getDate() + ":" + date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds();
					
		return null;
	}
	
	public static final Date stringToDate(String date)
	{
		if(date == null)
			return null;
		
		String[] times = date.split(":");
		
//		Calendar cal = Calendar.getInstance();
//		cal.set(Calendar.YEAR, Integer.parseInt(times[0]));
//		cal.set(Calendar.MONTH, Integer.parseInt(times[1]));
//		cal.set(Calendar.DATE, Integer.parseInt(times[2]));
//		cal.set(Calendar.HOUR_OF_DAY, Integer.parseInt(times[3]));
//		cal.set(Calendar.MINUTE, Integer.parseInt(times[4]));
//		cal.set(Calendar.SECOND, Integer.parseInt(times[5]));
//		cal.set(Calendar.MILLISECOND, 0);
		
//		return cal.getTime();
		
		Date data = new Date();
		data.setYear(Integer.parseInt(times[0]) - 1900);
		data.setMonth(Integer.parseInt(times[1]));
		data.setDate(Integer.parseInt(times[2]));
		if(times.length > 3)
		{
			data.setHours(Integer.parseInt(times[3]));
			data.setMinutes(Integer.parseInt(times[4]));
			data.setSeconds(Integer.parseInt(times[5]));
		}
		
		return data;
	}
	
	public static Long createSequence(Long addId, Long seq)
	{
		if(addId != null && addId > 0)
		{
			String black = addId.toString();
			String temp = String.valueOf(seq);
			while(temp.length() < 8)
			{
				temp = "0" + temp;
			}
			black = black + temp;
			
			return Long.parseLong(black);
		}
		
		return seq;
	}
}
