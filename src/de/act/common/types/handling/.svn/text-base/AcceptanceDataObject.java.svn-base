/**
 * 
 */
package de.act.common.types.handling;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import de.act.common.types.nonstaticobjects.RFSubt;
import de.act.common.types.staticobjects.RSAdd;
import de.act.common.types.staticobjects.RSAp;
import de.act.common.types.staticobjects.RSState;

/**
 * @author Henry
 *
 */
public class AcceptanceDataObject implements Serializable{

	private static final long serialVersionUID = -3330459547709413762L;
	private String f_id;
	private RSAdd add;
	
	//private Integer awb_acc; //0 -> shipment acceptance, 1 -> airway bill acceptance
	private RSAp ap_dept;
	private RSAp ap_3lc;
	private RSAp ap_dest;
	private RSAdd con_add;
	private RFSubt con_subt;
	private RSState state;
	private String stat_descr;
	private String card;
	
	private List<AcceptanceItemData> listItem;
	
	public String getF_id() {
		return f_id;
	}

	public void setF_id(String f_id) {
		this.f_id = f_id;
	}

	public RSAdd getAdd() {
		return add;
	}

	public void setAdd(RSAdd add) {
		this.add = add;
	}

	/*public Integer getAwb_acc() {
		return awb_acc;
	}
	
	public void setAwb_acc(Integer awb_acc) {
		this.awb_acc = awb_acc;
	}*/
	
	public RSAp getAp_dept() {
		return ap_dept;
	}
	
	public void setAp_dept(RSAp ap_dept) {
		this.ap_dept = ap_dept;
	}
	
	public RSAp getAp_3lc() {
		return ap_3lc;
	}
	
	public void setAp_3lc(RSAp ap_3lc) {
		this.ap_3lc = ap_3lc;
	}
	
	public RSAp getAp_dest() {
		return ap_dest;
	}
	
	public void setAp_dest(RSAp ap_dest) {
		this.ap_dest = ap_dest;
	}
	
	public RSAdd getCon_add() {
		return con_add;
	}

	public void setCon_add(RSAdd con_add) {
		this.con_add = con_add;
	}

	public RFSubt getCon_subt() {
		return con_subt;
	}

	public void setCon_subt(RFSubt con_subt) {
		this.con_subt = con_subt;
	}

	public RSState getState() {
		return state;
	}
	
	public void setState(RSState state) {
		this.state = state;
	}
	
	public String getStat_descr() {
		return stat_descr;
	}
	
	public void setStat_descr(String stat_descr) {
		this.stat_descr = stat_descr;
	}
	
	public String getCard() {
		return card;
	}
	
	public void setCard(String card) {
		this.card = card;
	}

	public List<AcceptanceItemData> getListItem() {
		return listItem;
	}

	public void setListItem(List<AcceptanceItemData> listItem) {
		this.listItem = listItem;
	}
	
	public void addListItem(AcceptanceItemData item){
		if(listItem != null && listItem.size() > 0){
			listItem.add(item);
		}
		else{
			listItem = new ArrayList<AcceptanceItemData>();
			listItem.add(item);
		}
	}
}