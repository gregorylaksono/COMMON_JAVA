/**
 * 
 */
package de.act.common.interfaces.airlinemodule;

import java.util.Date;
import java.util.List;

import de.act.common.interfaces.IAction;
import de.act.common.types.FAuth;
import de.act.common.types.handling.AManifest;
import de.act.common.types.handling.AManifestItem;
import de.act.common.types.views.FirstDepartureView;
import de.act.common.types.views.LoadingListView;
import de.act.common.types.views.NewExportAcceptanceView;

/**
 * @author Henry
 *
 */
public interface ILoadingListAction extends IAction{

	public List<LoadingListView> getLoadingList(String dept, String dest, Date bkg_flt_date);
	
	public Integer move2ULDOrBulk(AManifestItem newMani, AManifestItem oldMani, Long flt_id, Date flt_date, String fid, String dept, String dest, Integer isLoaded);

	public Integer check(String fid, String dept, String dest, Long bkg_item_id);
	
	public boolean toManifest(String ca_id, Long flt_id, Date flt_date, String flt_no); //, String first_dept
	
	public AManifest getManifest(Long flt_id, Date flt_date);
	
	public FirstDepartureView findByFId(String fId);
	
	public FAuth getAuth(String f_id,String ap_3lc, Integer part);
	
	public Integer freeUserAuth();
	
	public Integer addUserAuth(FAuth newAuth);
	
	public Integer addUserAuth(List<FAuth> list, String airport);
	
	public Integer updateManiItemLoad(String fId, Long id, Integer load, Integer part);

	public boolean toManifest(String ca_id, Long flt_id, Date flt_date, String flt_no, List<NewExportAcceptanceView> list);
	
	public Integer saveManiItemRemark(String fId, String remark, Integer part);
	
}
