/**
 * 
 */
package de.act.common.types.handling;

import java.io.Serializable;

import de.act.common.types.packageitems.AbstractSubItem;
import de.act.common.types.packageitems.ItemPKG;
import de.act.common.types.staticobjects.RSAnn;

/**
 * @author Henry
 *
 */
public class FAcceptanceAWBPkg extends AbstractSubItem implements Serializable{

	private static final long serialVersionUID = 2884990944136511289L;
	private Long acc_awb_pkg_id;
	private FAcceptanceAWBItem acc_awb_item_id;
	private ItemPKG pkg_id;
	//private Integer pcs;
	//private Double wgt;
	//private CCommodityTree com_id;
	private RSAnn ann_id;
	//private RSScc scc_3lc;
	//private PackageVol volObj = new PackageVol();
	
	public FAcceptanceAWBPkg(){
		
	}

	public Long getAcc_awb_pkg_id() {
		return acc_awb_pkg_id;
	}

	public void setAcc_awb_pkg_id(Long acc_awb_pkg_id) {
		this.acc_awb_pkg_id = acc_awb_pkg_id;
	}

	public FAcceptanceAWBItem getAcc_awb_item_id() {
		return acc_awb_item_id;
	}

	public void setAcc_awb_item_id(FAcceptanceAWBItem acc_awb_item_id) {
		this.acc_awb_item_id = acc_awb_item_id;
	}

	public ItemPKG getPkg_id() {
		return pkg_id;
	}

	public void setPkg_id(ItemPKG pkg_id) {
		this.pkg_id = pkg_id;
	}

	/*public Integer getPcs() {
		return pcs;
	}

	public void setPcs(Integer pcs) {
		this.pcs = pcs;
	}

	public Double getWgt() {
		return wgt;
	}

	public void setWgt(Double wgt) {
		this.wgt = wgt;
	}

	public CCommodityTree getCom_id() {
		return com_id;
	}

	public void setCom_id(CCommodityTree com_id) {
		this.com_id = com_id;
	}*/

	public RSAnn getAnn_id() {
		return ann_id;
	}

	public void setAnn_id(RSAnn ann_id) {
		this.ann_id = ann_id;
	}

	/*public RSScc getScc_3lc() {
		return scc_3lc;
	}

	public void setScc_3lc(RSScc scc_3lc) {
		this.scc_3lc = scc_3lc;
	}

	public PackageVol getVolObj() {
		return volObj;
	}

	public void setVolObj(PackageVol volObj) {
		this.volObj = volObj;
	}*/
}
