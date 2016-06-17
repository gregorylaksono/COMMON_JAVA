/**
 * 
 */
package de.act.common.interfaces.airlinemodule;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import de.act.common.interfaces.IAction;
import de.act.common.types.handling.AULDTrans;
import de.act.common.types.nonstaticobjects.ULDObject;
import de.act.common.types.staticobjects.Discrepancies;
import de.act.common.types.staticobjects.RSAp;
import de.act.common.types.staticobjects.RSCaUld;
import de.act.common.types.staticobjects.RSState;
import de.act.common.types.staticobjects.RSUld;
import de.act.common.types.staticobjects.RSUldType;
import de.act.common.types.staticobjects.RSUldTypeStock;

/**
 * @author Henry
 *
 */
public interface IULDConfigurationAction extends IAction{

	public List<ULDObject> getAllUldObjects();
	
	public ULDObject getUldById(Long uld_id);
	
	public List<RSUldType> getULD_Type();
	
	public List<RSUldType> getULD_TypeByULDPrefix(String uld_prefix);
	
	public RSUld getULD_TypeByIDAndCaID(Long uld_type_id);
	
	public List<RSState> getStatus();
	
	public List<Discrepancies> getDiscrepancies();
	
	public HashMap<String, Integer> getLocByCA_ID();
	
	public List<RSUldTypeStock> getUldStock(Integer uld_type, RSAp airport);
	
	public Map<String, Double> getULDTypeByAP3LC(String ap_3lc);
	
	public List<ULDObject> getULDByAp3LC(String ap_3lc);
	
	public Integer acceptULD(Long uld_id, Integer add_id, RSState rsState, Integer isUsed, Integer releaseULD);
	
	public AULDTrans getUldTrans(Long uld_id);
	
	public Boolean saveOrUpdateUldTrans(AULDTrans transUld);
	
	//public Integer updateULDStock(RSUldTypeStock uldStock);
	
	public Integer saveULDStock(RSUldTypeStock uldStock);
	
	public RSUld getULDByID(Long uld_id);
	
	public Integer saveULDStandart(ULDObject uld, RSCaUld rscauld);
	
	public Integer setULDFieldVisibility(RSCaUld rscauld);
	
	public Integer getULDFieldVisibilityByUserCaId();
	
	public Integer getULDFieldVisibility(String ca_id);
	
	public Integer saveULDAndULDTypeNonStandart(ULDObject uld, RSUld uld_type);
	
	public Integer updateULDStandart(ULDObject uld);
	
	public Integer updateULDAndULDTypeNonStandart(ULDObject uld, RSUld uld_type);
	
	public Integer deleteAULD(ULDObject a_uld);
	
	public Boolean checkUldTransferMode(Long uld_id);
	
	public ULDObject getULDbyPrefixAndNo(String uldPrefix, String uldNo);
}
