/**
 * @file AManifestItem.java
 * @package de.act.batch.dbi.tab.types
 * @since 23.12.2005 13:36:07
 * @author Martin Sachs
 */
package de.act.common.types.handling;
import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import de.act.common.types.nonstaticobjects.ULDObject;
import de.act.common.types.staticobjects.RSUldType;

/**
 * AManifestItem.java:
 *
 * @since 23.12.2005
 * @author Martin Sachs
 */
@org.jboss.cache.aop.annotation.PojoCacheable
public final class APureManifestItem implements IItem, Serializable {

	private static final long serialVersionUID = 8277014722417951583L;
	private Long						id				= -1L;
	private APureManifest				mani_id;
	private ULDObject					uldObj;
	private Integer						mani_row		= 0;
	private Integer						mani_sort		= 0;
	private Date						corr			= new Date();
	private String						mani_rem;
	private Long						bkgItemId;
	private Integer						uldNo;
	private Integer						pcs;
	private RSUldType				uldType;
	private String						advice;

	private ULDObject					ll_uld;
	private Integer						is_active;
	private Integer						is_loaded;

	public APureManifestItem() {
		
	}

	public APureManifestItem(APureManifest mani, int c, int sort) {
		this.mani_id = mani;
		this.mani_row = c;
		this.mani_sort = sort;
	}

	public APureManifestItem(APureManifest mani, RSUldType object, Integer uldNo2, int row, int sort) {
		this.mani_id = mani;
		this.uldType = object;
		this.uldNo = uldNo2;
		this.mani_row = row;
		this.mani_sort = sort;
	}

	public APureManifestItem(APureManifest mani, ULDObject object, int row, int sort) {
		this.mani_id = mani;
		this.uldObj = object;
		this.mani_row = row;
		this.mani_sort = sort;
	}

	public APureManifestItem(APureManifest newMani, int row, int row2, Long bkg_item_id) {
		this(newMani, row, row2);
		this.setBkgItemId(bkg_item_id);
	}

	public APureManifestItem(APureManifestItem found) {
		super();
		this.id = found.id;
		this.mani_id = found.mani_id;
		this.uldObj = found.uldObj;
		this.mani_row = found.mani_row;
		this.mani_sort = found.mani_sort;
		this.corr = found.corr;
		this.mani_rem = found.mani_rem;
		this.bkgItemId = found.bkgItemId;
		this.uldNo = found.uldNo;
		this.pcs = found.pcs;
		this.uldType = found.uldType;
		this.advice = found.advice;
	}

	// unique {mani_id, acceptanceItem}
	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj instanceof APureManifestItem){
			APureManifestItem m = (APureManifestItem) obj;
			return new EqualsBuilder().append(this.mani_id, m.mani_id).append(this.mani_row, m.mani_row).isEquals();
		}
		else return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(this.mani_id).append(this.mani_row).toHashCode();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		if (mani_id != null && this.mani_row != null){
			return mani_id + "-" + this.mani_row.toString();
		}
		return this.getClass().getSimpleName();
	}

	public Date getCorr() {
		return corr;
	}

	public void setCorr(Date corr) {
		this.corr = corr;
	}

	public APureManifest getMani_id() {
		return mani_id;
	}

	public void setMani_id(APureManifest mani_id) {
		this.mani_id = mani_id;
	}

	public Integer getMani_row() {
		return mani_row;
	}

	public void setMani_row(Integer mani_row) {
		this.mani_row = mani_row;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMani_rem() {
		return mani_rem;
	}

	public void setMani_rem(String mani_rem) {
		this.mani_rem = mani_rem;
	}

	public final ULDObject getUldObj() {
		return uldObj;
	}

	public final void setUldObj(ULDObject uldObj) {
		this.uldObj = uldObj;
	}

	public final String getAdvice() {
		return advice;
	}

	public final void setAdvice(String advice) {
		this.advice = advice;
	}

	public final Long getBkgItemId() {
		return bkgItemId;
	}

	public final void setBkgItemId(Long bkgItemId) {
		this.bkgItemId = bkgItemId;
	}

	public final Integer getPcs() {
		return pcs;
	}

	public final void setPcs(Integer pcs) {
		this.pcs = pcs;
	}

	public final RSUldType getUldType() {
		return uldType;
	}

	public final void setUldType(RSUldType uldType) {
		this.uldType = uldType;
	}

	public final Integer getUldNo() {
		return uldNo;
	}

	public final void setUldNo(Integer uldNo) {
		this.uldNo = uldNo;
	}

	public final Integer getMani_sort() {
		return mani_sort;
	}

	public final void setMani_sort(Integer mani_sort) {
		this.mani_sort = mani_sort;
	}

	public ULDObject getLl_uld() {
		return ll_uld;
	}

	public void setLl_uld(ULDObject ll_uld) {
		this.ll_uld = ll_uld;
	}

	public Integer getIs_active() {
		return is_active;
	}

	public void setIs_active(Integer is_active) {
		this.is_active = is_active;
	}

	public Integer getIs_loaded()
	{
		return is_loaded;
	}

	public void setIs_loaded(Integer is_loaded)
	{
		this.is_loaded = is_loaded;
	}
	
	
}