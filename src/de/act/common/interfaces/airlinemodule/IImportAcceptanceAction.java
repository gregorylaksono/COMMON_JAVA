/**
 * 
 */
package de.act.common.interfaces.airlinemodule;

import java.util.Date;
import java.util.List;
import java.util.Map;

import de.act.common.interfaces.IAction;
import de.act.common.types.User;
import de.act.common.types.handling.FAcceptanceAWBItem;
import de.act.common.types.handling.FAcceptanceShipment;
import de.act.common.types.handling.FAcceptanceShipmentItem;
import de.act.common.types.nonstaticobjects.FAcceptanceDiscrepancies;
import de.act.common.types.nonstaticobjects.RFTransfer;
import de.act.common.types.staticobjects.Discrepancies;
import de.act.common.types.staticobjects.RSAdd;
import de.act.common.types.views.ImportAcceptanceView;
import de.act.common.types.views.NewExportAcceptanceView;
import de.act.common.types.views.NewExportAcceptanceViewShipment;

/**
 * @author Henry
 *
 */
public interface IImportAcceptanceAction extends IAction{

	public List<Discrepancies> getDiscrepancies();
	
	public Discrepancies getDiscrepanciesById(Long discr_id);
	
	public List<NewExportAcceptanceView> getExportAcceptance(String ca_3dg, Integer awb_stock, Integer awb_no, String dept, String dest, Date bkg_flt_date, Integer part);
	
	public List<NewExportAcceptanceView> getExportAcceptance(String ca_3dg, Integer awb_stock, Integer awb_no);
	
	public List<NewExportAcceptanceView> getExportAcceptance(String ca_3dg, Integer awb_stock, Integer awb_no, String dept);
	
	public List<NewExportAcceptanceView> getExportAcceptance(String dept, String dest, Date bkg_flt_date);
	
	public List<NewExportAcceptanceView> getExportAcceptanceWithoutLyingList(String ca_3dg, Integer awb_stock, Integer awb_no, String dept, String dest, Date bkg_flt_date);
	
	public List<NewExportAcceptanceView> getExportAcceptance2(String dept, String dest);
	
	public List<NewExportAcceptanceView> getFinalDest(String dest, Date bkg_flt_date);
	
	public List<ImportAcceptanceView> getImportAcceptance(String dept, String dest, Date bkg_flt_date);
	
	public List<ImportAcceptanceView> getImportAcceptance(String ca_3dg, Integer awb_stock, Integer awb_no, String dept, String dest, Date bkg_flt_date, Integer part);
	
	@SuppressWarnings("rawtypes")
	public Map getImportAcceptanceByAWB(String ca_3dg, Integer awb_stock, Integer awb_no);
	
	public FAcceptanceShipmentItem getAcceptanceShipmentItemByID(Long key);
	
	public FAcceptanceShipment getAcceptanceShipmentByID(Long key);
	
	public FAcceptanceAWBItem getAcceptanceAWBByID(Long key);
	
	public boolean acceptAWB(String fid, String dept, Integer flagApprovement, FAcceptanceAWBItem newItem, Integer location);
	
	public boolean acceptShipment(String fid, String dept, String final_dest, FAcceptanceShipment objectShipment, Boolean isAcceptAll, Integer location);
	
	public boolean removeDiscrepancy(String fid, RSAdd add, Integer part);
	
	public boolean setDiscrepancy(String fid, RSAdd add, FAcceptanceDiscrepancies acceptanceDisprecancy);
	
	public List<NewExportAcceptanceView> getExportAcceptanceForLyingList(String flt_no, String dept, String dest);

	public List<NewExportAcceptanceView> getExportAcceptanceWithBkgItemId(String ca_3dg, Integer awb_stock, Integer awb_no, String dept, String dest, Date bkg_flt_date, Long bkg_item_id);
	
	public List<NewExportAcceptanceView> getExportAcceptanceForPreadvise();
	
	public boolean acceptAWB(String fid, String dept, Integer flagApprovement, FAcceptanceAWBItem newItem, Integer location, Integer part, Boolean discr);
	
	public boolean acceptShipment(String fid, String dept, String final_dest, FAcceptanceShipment objectShipment, Boolean isAcceptAll, Integer location, Integer part, Boolean discr);
	
	public boolean setNewDiscrepancy(String fid, RSAdd add, FAcceptanceDiscrepancies acceptanceDisprecancy);
	
	public List<NewExportAcceptanceView> getExportAcceptanceWithoutLyingList(String dept, String dest, Date bkg_flt_date);
	
	public List<NewExportAcceptanceView> getExportAcceptanceWithoutLyingList(String flt_no, String dept, String dest, Date bkg_flt_date);
	
	public List<ImportAcceptanceView> getImportAcceptanceWithoutLyingList(String ca_3dg, Integer awb_stock, Integer awb_no, String dept, String dest, Date bkg_flt_date);
	
	public Map checkCompleteShipmentAcceptance(String f_id, String ap_3lc);
	
	public Integer saveTransferManifest(List<RFTransfer> list);
	
	public List<NewExportAcceptanceView> getExportAcceptance(String flt_no, String dept, String dest, Date bkg_flt_date);
	
	public List<ImportAcceptanceView> getImportAcceptance(String flt_no, String dept, String dest, Date bkg_flt_date);

	public List<ImportAcceptanceView> getImportAcceptance(String ca_3dg, Integer awb_stock, Integer awb_no);
	
	public List<ImportAcceptanceView> getImportAcceptanceByPackageInformation(ImportAcceptanceView view);
	
	public List<NewExportAcceptanceViewShipment> getExportAcceptanceForBookingModification(String ca_3dg, Integer awb_stock, Integer awb_no);
	
	public List<NewExportAcceptanceView> getExportAcceptance(String ca_3dg, Integer awb_stock, Integer awb_no, String dept, String dest, Date bkg_flt_date);
	
	public List<NewExportAcceptanceView> getExportAcceptanceForBookingPackageModification(String ca_3dg, Integer awb_stock, Integer awb_no, String dept, String dest, String flt_no, String ca_id, Date flt_date);
	
	public boolean acceptAWB(String fid, String dept, Integer flagApprovement, FAcceptanceAWBItem newItem, Integer location, Integer part, Boolean discr, User user);
	
	public boolean acceptShipment(String fid, String dept, String final_dest, FAcceptanceShipment objectShipment, Boolean isAcceptAll, Integer location, Integer part, Boolean discr, User user);
	
}
