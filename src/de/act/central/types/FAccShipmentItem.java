package de.act.central.types;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Henry
 */
public class FAccShipmentItem extends Central implements java.io.Serializable {

	private static final long serialVersionUID = 3196346461102540983L;
	transient private Long accShipmentItemId;
	private FAccShipment FAccShipment;
	private Short rowNo;
	private Short sliRow;
	private String marks;
	private Integer pcs;
	private Double wgt;
	private Double vol;
	private Long comId;
	private Long annId;
	private Integer pkgsPltsd;
	private String pkgsCol;
	private String pkgsMat;
	private String pkgsShp;
	private Integer locId;
	private Set<FAccShipmentPkg> FAccShipmentPkgs = new HashSet<FAccShipmentPkg>(0);

	public FAccShipmentItem() {
		
	}

	public FAccShipmentItem(Long accShipmentItemId, FAccShipment FAccShipment) {
		this.accShipmentItemId = accShipmentItemId;
		this.FAccShipment = FAccShipment;
	}

	public FAccShipmentItem(Long accShipmentItemId, FAccShipment FAccShipment,
			Short rowNo, Short sliRow, String marks, Integer pcs,
			Double wgt, Double vol, Long comId, Long annId,
			Integer pkgsPltsd, String pkgsCol, String pkgsMat,
			String pkgsShp, Integer locId, Set<FAccShipmentPkg> FAccShipmentPkgs) {
		this.accShipmentItemId = accShipmentItemId;
		this.FAccShipment = FAccShipment;
		this.rowNo = rowNo;
		this.sliRow = sliRow;
		this.marks = marks;
		this.pcs = pcs;
		this.wgt = wgt;
		this.vol = vol;
		this.comId = comId;
		this.annId = annId;
		this.pkgsPltsd = pkgsPltsd;
		this.pkgsCol = pkgsCol;
		this.pkgsMat = pkgsMat;
		this.pkgsShp = pkgsShp;
		this.locId = locId;
		this.FAccShipmentPkgs = FAccShipmentPkgs;
	}

	public Long getAccShipmentItemId() {
		return this.accShipmentItemId;
	}

	public void setAccShipmentItemId(Long accShipmentItemId) {
		this.accShipmentItemId = accShipmentItemId;
	}

	public FAccShipment getFAccShipment() {
		return this.FAccShipment;
	}

	public void setFAccShipment(FAccShipment FAccShipment) {
		this.FAccShipment = FAccShipment;
	}

	public Short getRowNo() {
		return this.rowNo;
	}

	public void setRowNo(Short rowNo) {
		this.rowNo = rowNo;
	}

	public Short getSliRow() {
		return this.sliRow;
	}

	public void setSliRow(Short sliRow) {
		this.sliRow = sliRow;
	}

	public String getMarks() {
		return this.marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}

	public Integer getPcs() {
		return this.pcs;
	}

	public void setPcs(Integer pcs) {
		this.pcs = pcs;
	}

	public Double getWgt() {
		return this.wgt;
	}

	public void setWgt(Double wgt) {
		this.wgt = wgt;
	}

	public Double getVol() {
		return this.vol;
	}

	public void setVol(Double vol) {
		this.vol = vol;
	}

	public Long getComId() {
		return this.comId;
	}

	public void setComId(Long comId) {
		this.comId = comId;
	}

	public Long getAnnId() {
		return this.annId;
	}

	public void setAnnId(Long annId) {
		this.annId = annId;
	}

	public Integer getPkgsPltsd() {
		return this.pkgsPltsd;
	}

	public void setPkgsPltsd(Integer pkgsPltsd) {
		this.pkgsPltsd = pkgsPltsd;
	}

	public String getPkgsCol() {
		return this.pkgsCol;
	}

	public void setPkgsCol(String pkgsCol) {
		this.pkgsCol = pkgsCol;
	}

	public String getPkgsMat() {
		return this.pkgsMat;
	}

	public void setPkgsMat(String pkgsMat) {
		this.pkgsMat = pkgsMat;
	}

	public String getPkgsShp() {
		return this.pkgsShp;
	}

	public void setPkgsShp(String pkgsShp) {
		this.pkgsShp = pkgsShp;
	}

	public Integer getLocId() {
		return this.locId;
	}

	public void setLocId(Integer locId) {
		this.locId = locId;
	}

	public Set<FAccShipmentPkg> getFAccShipmentPkgs() {
		return this.FAccShipmentPkgs;
	}

	public void setFAccShipmentPkgs(Set<FAccShipmentPkg> FAccShipmentPkgs) {
		this.FAccShipmentPkgs = FAccShipmentPkgs;
	}
}
