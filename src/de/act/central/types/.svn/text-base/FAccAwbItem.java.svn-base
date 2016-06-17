package de.act.central.types;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Henry
 */
public class FAccAwbItem extends Central implements java.io.Serializable {

	private static final long serialVersionUID = 114454515502423881L;
	transient private Long accAwbItemId;
	private FAccHeader FAccHeader;
	private Short rowNo;
	private Short sliRow;
	private String marks;
	private Integer pcs;
	private Double wgt;
	private Double vol;
	private Long comId;
	private Long annId;
	private String statId;
	private String statDescr;
	private Date corr;
	private Set<FAccAwbPkg> FAccAwbPkgs = new HashSet<FAccAwbPkg>(0);

	public FAccAwbItem() {
		
	}

	public FAccAwbItem(Long accAwbItemId, FAccHeader FAccHeader) {
		this.accAwbItemId = accAwbItemId;
		this.FAccHeader = FAccHeader;
	}

	public FAccAwbItem(Long accAwbItemId, FAccHeader FAccHeader, Short rowNo,
			Short sliRow, String marks, Integer pcs, Double wgt,
			Double vol, Long comId, Long annId, String statId,
			String statDescr, Date corr, Set<FAccAwbPkg> FAccAwbPkgs) {
		this.accAwbItemId = accAwbItemId;
		this.FAccHeader = FAccHeader;
		this.rowNo = rowNo;
		this.sliRow = sliRow;
		this.marks = marks;
		this.pcs = pcs;
		this.wgt = wgt;
		this.vol = vol;
		this.comId = comId;
		this.annId = annId;
		this.statId = statId;
		this.statDescr = statDescr;
		this.corr = corr;
		this.FAccAwbPkgs = FAccAwbPkgs;
	}

	public Long getAccAwbItemId() {
		return this.accAwbItemId;
	}

	public void setAccAwbItemId(Long accAwbItemId) {
		this.accAwbItemId = accAwbItemId;
	}

	public FAccHeader getFAccHeader() {
		return this.FAccHeader;
	}

	public void setFAccHeader(FAccHeader FAccHeader) {
		this.FAccHeader = FAccHeader;
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

	public String getStatId() {
		return this.statId;
	}

	public void setStatId(String statId) {
		this.statId = statId;
	}

	public String getStatDescr() {
		return this.statDescr;
	}

	public void setStatDescr(String statDescr) {
		this.statDescr = statDescr;
	}

	public Date getCorr() {
		return this.corr;
	}

	public void setCorr(Date corr) {
		this.corr = corr;
	}

	public Set<FAccAwbPkg> getFAccAwbPkgs() {
		return this.FAccAwbPkgs;
	}

	public void setFAccAwbPkgs(Set<FAccAwbPkg> FAccAwbPkgs) {
		this.FAccAwbPkgs = FAccAwbPkgs;
	}
}
