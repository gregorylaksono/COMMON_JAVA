/**
 * 
 */
package de.act.common.types.handling;

import java.io.Serializable;
import java.util.Set;

import de.act.common.types.localobjects.Storage;
import de.act.common.types.staticobjects.CCommodityTree;
import de.act.common.types.staticobjects.RSAnn;
import de.act.common.types.staticobjects.RSPkg;

/**
 * @author Henry
 *
 */
public class FAcceptanceShipmentItem implements Serializable{

	private static final long serialVersionUID = -51957670061805062L;
	private Long acc_shipment_item_id;
	private FAcceptanceShipment acc_shipment_id;
	private Integer row_no;
	private Integer sli_row;
	private String marks;
	private Integer pcs;
	private Double wgt;
	private Double vol;
	private Integer pkgs_pltsd;
	private RSPkg kindPkg = new RSPkg();
	private Storage loc_id = null;
	private Set<FAcceptanceShipmentPkg> shipmentPackage;
	
	private CCommodityTree commodity;
	private RSAnn annotation;
	
	public FAcceptanceShipmentItem(){
		
	}
	
	public Long getAcc_shipment_item_id() {
		return acc_shipment_item_id;
	}
	
	public void setAcc_shipment_item_id(Long acc_shipment_item_id) {
		this.acc_shipment_item_id = acc_shipment_item_id;
	}
	
	public FAcceptanceShipment getAcc_shipment_id() {
		return acc_shipment_id;
	}
	
	public void setAcc_shipment_id(FAcceptanceShipment acc_shipment_id) {
		this.acc_shipment_id = acc_shipment_id;
	}
	
	public Integer getRow_no() {
		return row_no;
	}
	
	public void setRow_no(Integer row_no) {
		this.row_no = row_no;
	}
	
	public Integer getSli_row() {
		return sli_row;
	}
	
	public void setSli_row(Integer sli_row) {
		this.sli_row = sli_row;
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
	
	public Double getWgt() {
		return wgt;
	}

	public void setWgt(Double wgt) {
		this.wgt = wgt;
	}

	public Double getVol() {
		return vol;
	}

	public void setVol(Double vol) {
		this.vol = vol;
	}

	public Integer getPkgs_pltsd() {
		return pkgs_pltsd;
	}
	
	public void setPkgs_pltsd(Integer pkgs_pltsd) {
		this.pkgs_pltsd = pkgs_pltsd;
	}
	
	public RSPkg getKindPkg() {
		return kindPkg;
	}
	
	public void setKindPkg(RSPkg kindPkg) {
		this.kindPkg = kindPkg;
	}

	public Storage getLoc_id() {
		return loc_id;
	}
	
	public void setLoc_id(Storage loc_id) {
		this.loc_id = loc_id;
	}
	
	public Set<FAcceptanceShipmentPkg> getShipmentPackage() {
		return shipmentPackage;
	}
	
	public void setShipmentPackage(Set<FAcceptanceShipmentPkg> shipmentPackage) {
		this.shipmentPackage = shipmentPackage;
	}

	public CCommodityTree getCommodity() {
		return commodity;
	}

	public void setCommodity(CCommodityTree commodity) {
		this.commodity = commodity;
	}

	public RSAnn getAnnotation() {
		return annotation;
	}

	public void setAnnotation(RSAnn annotation) {
		this.annotation = annotation;
	}
}
