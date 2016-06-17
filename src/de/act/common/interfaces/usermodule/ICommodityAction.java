/**
 * 
 */
package de.act.common.interfaces.usermodule;

import java.util.List;

import de.act.common.interfaces.IAction;
import de.act.common.types.staticobjects.Classes;
import de.act.common.types.staticobjects.ICommodityTree;
import de.act.common.types.staticobjects.RDDefCom;
import de.act.common.types.staticobjects.RSAnn;
import de.act.common.types.staticobjects.RSScc;
import de.act.common.types.views.ComAnnSccClassView;
import de.act.common.types.views.CommodityView;

/**
 * CRUD Action for commodities
 * @author MS
 * @version 1.0 15.06.2007
 */
public interface ICommodityAction extends IAction {

	/**
	 * get commodities by id
	 * @param id
	 * @return CommodityTree
	 */
	public ICommodityTree getCommodityByID(Long id);
	/**
	 * get commodity by awbName
	 * @param name
	 * @return CommodityTree
	 */
	public ICommodityTree getCommodityByName(String name);
	/**
	 * get all commodities by the scc 
	 * @param scc
	 * @return list of CommodityTree
	 */
	public List<ICommodityTree> getCommodityByScc(String scc);
	/**
	 * get all child commodities by id
	 * @param id
	 * @return list of CommodityTree
	 */
	public List<ICommodityTree> getCommodityChilds(Long id);

	public List<CommodityView> getCommodityAnnotation(Long id);

	/**
	 * create a commodity with annotations, item_no, scc and a concret parent.
	 * @param com
	 * @return true, if succeeded
	 */
	public Boolean createCommodity(ICommodityTree com, Boolean status);
	
	public Boolean createCommodityJoinTable(ICommodityTree com, Boolean status);
	/**
	 * edit the commodity is restricted. you can not change the ID, awbName. 
	 * You can modify the parent and com_name and the annotation.
	 * @param com
	 * @return true, if succeeded
	 */
	public Boolean editCommodity(ICommodityTree com, Boolean status);
	//  /**
	//   * delete a commodity
	//   * @note a commodity can not simply removed from DB, since the commodity 
	//   * can be referenced in other dbs. we flag the commodity, so that no one 
	//   * can fetch it from the db. (vad_id)
	//   * @param com
	//   * @return true, if succeeded
	//   */
	public Boolean deleteCommodity(ICommodityTree com);

	public List<RSAnn> getAnnotations();

	public List<RSAnn> getAnnotationsByMatch(Long com_id, String match);

	public Boolean deleteAnnotation(RSAnn ann);
	
	public Boolean createAnnotation(RSAnn ann);

	public Boolean editAnnotation(RSAnn ann);
	
	public RSAnn getAnnotationsByID(Long ID);

	public List<Classes> getClassType();

	public Integer saveSCC(RSScc scc);

	public Integer updateSCC(RSScc scc);

	public Integer saveClass(Classes cls);

	public Integer updateClass(Classes cls);
	
	public ComAnnSccClassView getComAnnSccClass(Long com_id, Long ann_id);
	
	public Boolean deleteClass(Classes cls);
	
	public Boolean deleteSCC(RSScc scc);
	
	public Boolean deleteCommodityAnnotation(Long com_id, Long ann_id);
	
	public List<RDDefCom> getDefaultCommodity();
	
	public List<ICommodityTree> getCommodityNonDefault();
	
	public Boolean createCommodityJoinTableDefault(ICommodityTree com, RDDefCom defaultCommodity);
	
	public Boolean deleteDDefDefault(RDDefCom def_com);
	
	public RSAnn getRsAnn(Long ann_id);
}
