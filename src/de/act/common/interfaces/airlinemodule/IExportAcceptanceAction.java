/**
 * 
 */
package de.act.common.interfaces.airlinemodule;

import java.util.Date;
import java.util.List;

import de.act.common.interfaces.IAction;
import de.act.common.types.handling.AcceptanceDataObject;
import de.act.common.types.handling.Shipments;
import de.act.common.types.views.ExportAcceptanceView;
import de.act.common.types.views.NewExportAcceptanceView;

/**
 * @author Henry
 *
 */
public interface IExportAcceptanceAction extends IAction{

	public List<ExportAcceptanceView> getExportAcceptance(String ca_3dg, Integer awb_stock, Integer awb_no, String dept, Date bkg_flt_date);
	
	public Shipments getAcceptanceItemByID(Long acc_item_id);
	
	public boolean acceptShipment(AcceptanceDataObject data);
	
	//public Integer disapproveAcceptance(String f_id, Integer awb_acc, String dept, String dest);
	
	public List<NewExportAcceptanceView> getExportAcceptanceByBookingItemID(Long bkgItemID, String dept, String dest);
	
	public List<NewExportAcceptanceView> getExportAcceptance(String ca_3dg, Integer awb_stock, Integer awb_no);
	
	public List<NewExportAcceptanceView> getExportAcceptanceByPackageInformation(NewExportAcceptanceView view);
}
