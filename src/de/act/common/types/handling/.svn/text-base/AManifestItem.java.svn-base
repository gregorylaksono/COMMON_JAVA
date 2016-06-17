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
import de.act.common.types.packageitems.ItemHandlingBKG;
import de.act.common.types.staticobjects.RSUldType;

/**
 * AManifestItem.java:
 *
 * @since 23.12.2005
 * @author Martin Sachs
 */
@org.jboss.cache.aop.annotation.PojoCacheable
public final class AManifestItem implements IItem, Serializable {

	private static final long serialVersionUID = 8277014722417951583L;
	private Long						id				= -1L;
	private AManifest					mani_id;
	private Integer						mani_row		= 0;
	private Integer						mani_sort		= 0;
	private String 						mani_rem;
	private ULDObject					uldObj;
	private ItemHandlingBKG				booking;
	private Integer						ll_row			= 0;
	private Date						corr			= new Date();
	private Integer						pcs;
	private RSUldType					uldType;
	private Long						uldNo;
	private String						advice;
	
	private ULDObject					ll_uld;
	private Integer						is_active;
	private Integer						is_loaded;
	private Long						bkg_item_id;

	AManifestItem(AManifest m, ItemHandlingBKG p, Integer row, RSUldType type) {
		this(m, p, row);
		this.uldType = type;
	}

	AManifestItem(AManifest m, ItemHandlingBKG p, int row) {
		this.booking = p;
		if (p != null) this.advice = p.getLoadingAdvice();
		mani_id = m;
		this.ll_row = row;
	}

	public final ULDObject getUldObj() {
		return uldObj;
	}

	public final void setUldObj(ULDObject uldObj) {
		this.uldObj = uldObj;
	}

	public AManifestItem() {
		
	}

	public AManifestItem(AManifest mani, int c) {
		this.mani_id = mani;
		this.mani_row = c;
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
		if (obj instanceof AManifestItem){
			AManifestItem m = (AManifestItem) obj;
			return new EqualsBuilder().append(this.mani_id, m.getMani_id()).append(this.mani_row, m.mani_row).isEquals();
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

	public AManifest getMani_id() {
		return mani_id;
	}

	public void setMani_id(AManifest mani_id) {
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

	public final String getAdvice() {
		return advice;
	}

	public final void setAdvice(String advice) {
		this.advice = advice;
	}

	public final ItemHandlingBKG getBooking() {
		return booking;
	}

	public final void setBooking(ItemHandlingBKG booking) {
		this.booking = booking;
	}

	public final Integer getLl_row() {
		return ll_row;
	}

	public final void setLl_row(Integer ll_row) {
		this.ll_row = ll_row;
	}

	public final Integer getPcs() {
		return pcs;
	}

	public final void setPcs(Integer pcs) {
		this.pcs = pcs;
	}

	public final Long getUldNo() {
		return uldNo;
	}

	public final void setUldNo(Long uldNo) {
		this.uldNo = uldNo;
	}

	public final RSUldType getUldType() {
		return uldType;
	}

	public synchronized final void setUldType(RSUldType uldType) {
		this.uldType = uldType;
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

	public Long getBkg_item_id()
	{
		return bkg_item_id;
	}

	public void setBkg_item_id(Long bkg_item_id)
	{
		this.bkg_item_id = bkg_item_id;
	}
	
	
}
