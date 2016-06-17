/**
 * 
 */
package de.act.common.interfaces.usermodule;

import java.util.List;
import java.util.Map;

import de.act.common.interfaces.IAction;
import de.act.common.types.localobjects.Location;
import de.act.common.types.localobjects.RDOt2lcStorage;
import de.act.common.types.localobjects.RDStorageCharges;
import de.act.common.types.localobjects.RDStorageChargesMain;
import de.act.common.types.localobjects.Storage;
import de.act.common.types.localobjects.StorageItem;
import de.act.common.types.localobjects.StorageLimit;
import de.act.common.types.staticobjects.RSDbmWs;
import de.act.common.types.staticobjects.RSOt1lc;
import de.act.common.types.views.NewExportAcceptanceView;

/**
 * CRUD Action for commodities
 * 
 * @author MS
 * @version 1.0 15.06.2007
 */
public interface IStorageAction extends IAction
{
	public List<Storage> findAllByOwnerAddId();
	
	public int insertStorage(Storage bean);
	
	public int updateStorage(Storage bean);
	
	public int deleteStorage(Storage bean);
	
	public int insertNewRoot(Storage bean);
	
	public List<Storage> findChildAndLocationForSelection();
	
	public int insertStorageBkgItem(StorageItem bean, Storage stor);
	
	public int freeStorageBkgItem(List<NewExportAcceptanceView> list);
	
	public int freeStorageBkgItem(Long bkgItemId);
	
	public int freeStorageBkgItemByFId(String FId);
	
	public int freeStorageComItemByFId(String FId);
	
	public long freeStorageItemByBkgItemIdsForSplit(List<Long> list);
	
	public int insertStorageItem(Long bookingItemId, List<StorageItem> beans, Storage stor);
	
	public int saveStorageLimit(StorageLimit bean);
	
	public List<StorageLimit> findStorageLimitByAddId(Long addId);
	
	public List<StorageItem> findStorageItemByLimitDay(Long addId);
	
	public List<StorageItem> findStorageItemByHandlingAgentAddId();
	
	public List<StorageItem> findStorageItemByHandlingAgentAddIdAndStorId(Long storId);
	
	public int insertStorageComItem(List<StorageItem> beans, String FId, Boolean discr);
	
	public List<StorageItem> findStorageItemByFIdAndAirport(String FId);
	
	public int updateStorageComItem(Map<String, StorageItem> oldMap, List<StorageItem> beans, String FId);
	
	public int toManifestStorage(List<String> fIds);
	
	public int toManifestStorage(Map<String, List<NewExportAcceptanceView>> map);
	
	public List<RDOt2lcStorage> getAllOt2Lc();
	
	public List<RSOt1lc> getAllOt1Lc();
	
	public int insertOtherChargeStorage(RDStorageCharges bean);
	
	public int updateOtherChargeStorage(RDStorageCharges bean);
	
	public int deleteOtherChargeStorage(RDStorageCharges bean);
	
	public List<RDStorageCharges> findAllOtherChargesStorageByOwnerAddId();
	
	public RDStorageChargesMain findOtStorageByDayAndKGAndFIdAndOwnerAddId(String fid);
	
	public int insertOt2lcStorage(RDOt2lcStorage bean);
	
	public Map<Integer, List<String>> findAllStorageUnit();
	
	public int insertChargeStorageMain(RDStorageChargesMain bean);
	
	public int updateChargeStorageMain(RDStorageChargesMain bean);
	
	public int deleteChargeStorageMain(RDStorageChargesMain bean);
	
	public List<RDStorageChargesMain> findAllChargesStorageMainByOwnerAddId();
	
	public Integer setLocationAsDefault(Long locId);
	
	public Location findLocationByDef();
}
