package de.act.common.types;

import java.io.Serializable;
import java.util.List;

import de.act.common.types.nonstaticobjects.PackageVol;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class RatePackage implements Serializable {

	private static final long serialVersionUID = -3894051556953578997L;
	private long       comId        = -1L;
	private List<Long> comAncestors = null;
	private long       annId        = -1L;
	private PackageVol vol          = null;
	private double     wgt          = Double.NaN;
	private int        pieces       = 1;
	private String     uld_type     = null;
	private String     uld_no		= null;
	private boolean    special   = false;
	private int        indices   = 0;
	

	
	public int getIndices() {
		return indices;
	}

	public void setIndices(int indices) {
		this.indices = indices;
	}

	public boolean isSpecial() {
		return special;
	}

	public void setSpecial(boolean special) {
		this.special = special;
	}

	public String getUld_no() {
		return uld_no;
	}

	public void setUld_no(String uld_no) {
		this.uld_no = uld_no;
	}

	public String getUld_type() {
		return uld_type;
	}

	public void setUld_type(String uld_type) {
		this.uld_type = uld_type;
	}

	public long getAnnId() {
		return this.annId;
	}

	public void setAnnId(final long annId) {
		this.annId = annId;
	}

	public long getComId() {
		return this.comId;
	}

	public void setComId(final long comId) {
		this.comId = comId;
	}

	public List<Long> getComAncestors() {
		return comAncestors;
	}

	public void setComAncestors(List<Long> comAncestors) {
		this.comAncestors = comAncestors;
	}

	public int getPieces() {
		return this.pieces;
	}

	public void setPieces(final int pieces) {
		this.pieces = pieces;
	}

	public PackageVol getVol() {
		return this.vol;
	}

	public void setVol(final PackageVol vol) {
		this.vol = vol;
	}

	public double getWgt() {
		return this.wgt;
	}

	public void setWgt(final double wgt) {
		this.wgt = wgt;
	}
}
