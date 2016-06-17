/**
 * 
 */
package de.act.common.types.staticobjects;

import java.io.Serializable;

import de.act.common.types.views.CommodityView;

/**
 * @author Henry
 *
 */
public class RDDefCom implements Serializable{

	private static final long serialVersionUID = 4991801326191856456L;
	private Integer def_com_id;
	private Integer add_id;
	private Long com_id;
	private Long ann_id;
	private CommodityView comAnnView;
	
	public Integer getDef_com_id() {
		return def_com_id;
	}
	
	public void setDef_com_id(Integer def_com_id) {
		this.def_com_id = def_com_id;
	}
	
	public Integer getAdd_id() {
		return add_id;
	}
	
	public void setAdd_id(Integer add_id) {
		this.add_id = add_id;
	}
	
	public Long getCom_id() {
		return com_id;
	}
	
	public void setCom_id(Long com_id) {
		this.com_id = com_id;
	}
	
	public Long getAnn_id() {
		return ann_id;
	}
	
	public void setAnn_id(Long ann_id) {
		this.ann_id = ann_id;
	}

	public CommodityView getComAnnView() {
		return comAnnView;
	}

	public void setComAnnView(CommodityView comAnnView) {
		this.comAnnView = comAnnView;
	}
}
