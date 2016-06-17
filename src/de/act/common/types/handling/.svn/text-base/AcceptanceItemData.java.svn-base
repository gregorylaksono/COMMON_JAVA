/**
 * 
 */
package de.act.common.types.handling;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import de.act.common.types.nonstaticobjects.PackageVol;
import de.act.common.types.nonstaticobjects.ULDObject;
import de.act.common.types.staticobjects.ICommodityTree;
import de.act.common.types.staticobjects.RSAnn;
import de.act.common.types.staticobjects.RSScc;

/**
 * @author Henry
 *
 */
public class AcceptanceItemData implements Serializable{

	private static final long serialVersionUID = -9154867962912862581L;
	private ULDObject uld_id;
	private Long bkg_item_id;
	private Integer awb_acc;
	private String marks;
	private Integer pcs;
	private ICommodityTree com;
	private RSAnn ann;
	private Double wgt;
	private PackageVol pkgVol;
	private RSScc scc;
	
	private List<AcceptancePackageData> packageData;
	
	public ULDObject getUld_id() {
		return uld_id;
	}
	
	public void setUld_id(ULDObject uld_id) {
		this.uld_id = uld_id;
	}
	
	public Long getBkg_item_id() {
		return bkg_item_id;
	}
	
	public void setBkg_item_id(Long bkg_item_id) {
		this.bkg_item_id = bkg_item_id;
	}
	
	public Integer getAwb_acc() {
		return awb_acc;
	}

	public void setAwb_acc(Integer awb_acc) {
		this.awb_acc = awb_acc;
	}

	public String getMarks() {
		return marks;
	}
	
	public void setMarks(String marks) {
		this.marks = marks;
	}
	
	public Integer getPcs() {
		return pcs;
	}
	
	public void setPcs(Integer pcs) {
		this.pcs = pcs;
	}
	
	public ICommodityTree getCom() {
		return com;
	}
	
	public void setCom(ICommodityTree com) {
		this.com = com;
	}
	
	public RSAnn getAnn() {
		return ann;
	}
	
	public void setAnn(RSAnn ann) {
		this.ann = ann;
	}
	
	public Double getWgt() {
		return wgt;
	}
	
	public void setWgt(Double wgt) {
		this.wgt = wgt;
	}
	
	public PackageVol getPkgVol() {
		return pkgVol;
	}
	
	public void setPkgVol(PackageVol pkgVol) {
		this.pkgVol = pkgVol;
	}
	
	public RSScc getScc() {
		return scc;
	}
	
	public void setScc(RSScc scc) {
		this.scc = scc;
	}

	public List<AcceptancePackageData> getPackageData() {
		return packageData;
	}

	public void setPackageData(List<AcceptancePackageData> packageData) {
		this.packageData = packageData;
	}
	
	public void addListItem(AcceptancePackageData pkg){
		if(packageData != null && packageData.size() > 0){
			packageData.add(pkg);
		}
		else{
			packageData = new ArrayList<AcceptancePackageData>();
			packageData.add(pkg);
		}
	}
}