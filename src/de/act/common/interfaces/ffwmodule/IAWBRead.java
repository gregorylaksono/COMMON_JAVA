/**
 * @file IAWBWrite.java
 * @package de.act.blackbox.actions
 * @since 26.01.2006 12:46:09
 * @author Martin Sachs
 */
package de.act.common.interfaces.ffwmodule;

import java.util.List;
import java.util.Map;
import java.util.Set;

import de.act.common.interfaces.IFormularAction;
import de.act.common.types.SendType;
import de.act.common.types.formulars.IFormularMain;
import de.act.common.types.nonstaticobjects.BookingRequestFlight;
import de.act.common.types.nonstaticobjects.RFAwbNo;
import de.act.common.types.packageitems.ItemBKG;
import de.act.common.types.views.AWBForm;

/**
 * IAWBWrite.java:
 *
 * @since 26.01.2006
 * @author Martin Sachs
 *
 */
public interface IAWBRead  extends IFormularAction{

	/**
	 * get the HouseAwbNo
	 * @author Martin Sachs
	 * @since 1.0 - 28.06.2006
	 * @return RFAwbNo
	 */
	RFAwbNo getHouseAWBNo();

	/**
	 * get the rate of the actual packagetable in this formular
	 * @author Martin Sachs
	 * @since 1.0 - 29.06.2006
	 * @param formdata
	 * @return IFormularMain
	 */
	Map getRate(IFormularMain formdata, String currency);
	
	IFormularMain loadAWBForm(String ca_3dg, Integer awb_stock, Integer awb_no);

	Integer isOrignal(String f_id);
	
	Integer savePrintData(String f_id);
	
	String printPdf(AWBForm awbForm);
	
	boolean storeFormularAWBForm(IFormularMain formId, SendType type, List<Long> bkgIdList, List<BookingRequestFlight> oldBookingRequestFlight, Set<ItemBKG> itemBKGs);
	
	Integer saveABkgAndAMani(IFormularMain formular, List<Long> listAFlt);
	
	public boolean storeFormularAndSaveABkgAndAMani(IFormularMain formId, SendType type, List<Long> listAFlt, List<BookingRequestFlight> oldFlights);
	
	public Map getRateTransfer(IFormularMain formdata, String currency);
	
	boolean storeFormular(IFormularMain formId, SendType type, List<Long> bkgIdList, List<BookingRequestFlight> oldBookingRequestFlight);
}