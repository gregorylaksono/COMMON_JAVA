package de.act.central.types;


/**
 * @author Henry
 */
public class FAccAwbPkg extends Central implements java.io.Serializable {

	private static final long serialVersionUID = -4147185759040581193L;
	transient private Long accAwbPkgId;
	private FAccAwbItem FAccAwbItem;
	private Long pkgId;
	private Integer pcs;
	private Long comId;
	private Long annId;
	private Double wgt;
	private Short l;
	private Short w;
	private Short h;
	private String scc3lc;

	public FAccAwbPkg() {
		
	}

	public FAccAwbPkg(Long accAwbPkgId, FAccAwbItem FAccAwbItem) {
		this.accAwbPkgId = accAwbPkgId;
		this.FAccAwbItem = FAccAwbItem;
	}

	public FAccAwbPkg(Long accAwbPkgId, FAccAwbItem FAccAwbItem, Long pkgId,
			Integer pcs, Long comId, Long annId, Double wgt, Short l,
			Short w, Short h, String scc3lc) {
		this.accAwbPkgId = accAwbPkgId;
		this.FAccAwbItem = FAccAwbItem;
		this.pkgId = pkgId;
		this.pcs = pcs;
		this.comId = comId;
		this.annId = annId;
		this.wgt = wgt;
		this.l = l;
		this.w = w;
		this.h = h;
		this.scc3lc = scc3lc;
	}

	public Long getAccAwbPkgId() {
		return this.accAwbPkgId;
	}

	public void setAccAwbPkgId(Long accAwbPkgId) {
		this.accAwbPkgId = accAwbPkgId;
	}

	public FAccAwbItem getFAccAwbItem() {
		return this.FAccAwbItem;
	}

	public void setFAccAwbItem(FAccAwbItem FAccAwbItem) {
		this.FAccAwbItem = FAccAwbItem;
	}

	public Long getPkgId() {
		return this.pkgId;
	}

	public void setPkgId(Long pkgId) {
		this.pkgId = pkgId;
	}

	public Integer getPcs() {
		return this.pcs;
	}

	public void setPcs(Integer pcs) {
		this.pcs = pcs;
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

	public Double getWgt() {
		return this.wgt;
	}

	public void setWgt(Double wgt) {
		this.wgt = wgt;
	}

	public Short getL() {
		return this.l;
	}

	public void setL(Short l) {
		this.l = l;
	}

	public Short getW() {
		return this.w;
	}

	public void setW(Short w) {
		this.w = w;
	}

	public Short getH() {
		return this.h;
	}

	public void setH(Short h) {
		this.h = h;
	}

	public String getScc3lc() {
		return this.scc3lc;
	}

	public void setScc3lc(String scc3lc) {
		this.scc3lc = scc3lc;
	}
}
