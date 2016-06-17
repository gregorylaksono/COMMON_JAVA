/**
 * @file ULDTypeObject.java
 * @package de.act.batch.data.forms.manifest
 * @since 21.12.2005 16:53:44
 * @author Martin Sachs
 */
package de.act.common.types.staticobjects;
import java.awt.Color;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.swing.ImageIcon;

import org.apache.commons.lang.builder.HashCodeBuilder;

import de.act.common.types.ManifestObject;
import de.act.common.types.handling.Shipments;
import de.act.common.types.nonstaticobjects.ULDObject;

/**
 * ULDTypeObject.java:
 *
 * @since 21.12.2005
 * @author Martin Sachs
 */
@org.jboss.cache.aop.annotation.PojoCacheable
public final class RSUld implements ManifestObject, Serializable {
	/**
	 * @author Martin Sachs
	 * @since 19.01.2006
	 */
	private static final long serialVersionUID = 1883829040470406260L;
	public Long uld_id;
	public Long uld_type_id;
	public String ca_id;
	public String uld_rate;
	public String uld_shape;
	public Integer pallet;
	public Integer forkliftable;
	public Integer cooled;
	public Integer uld_icon;
	public Double uld_l;
	public Double uld_w;
	public Double uld_h;
	public Double oversize;
	public Double load_l;
	public Double load_w;
	public Double load_h;
	public Double door_l;
	public Double door_w;
	public Double door_h;
	public String len_unit;
	public Double max_vol;
	public String vol_unit;
	public Double tare_wgt;
	public Double max_wgt;
	public String wgt_unit;
	public String us_type;
	public String uld_rem;
	public Double rate_wgt;
	public RSVad vad;
	//private Set<RSUldType> uldNames = new LinkedHashSet<RSUldType>();
	private List<RSUldType> uldTypes = new ArrayList<RSUldType>();
	public Set<ULDObject> ulds = new LinkedHashSet<ULDObject>();
	private List<Shipments> shippments = new ArrayList<Shipments>();
	private boolean remove = true;
	private int hashcode = 0;
	transient private static final int baseHash = RSFlt.class.getName().hashCode() * 2 + 1;

	/**
	 * marks the UldType to show the real ULDs which are in a specific Location
	 */
	public boolean showUlds = false;
	private boolean open;
	private String loadingAdvice;

	public RSUld() {
		final Shipments shp = new Shipments();
		this.shippments.add(shp);
	}

	public List<Shipments> getShippments() {
		return this.shippments;
	}

	public String getDisplayName() {
		if (!this.ulds.isEmpty()) { return this.ulds.iterator().next().uld_prefix; }
		return "unk";
	}

	public void setShippments(final List<Shipments> shippments) {
		this.shippments = shippments;
	}

	public int getShippmentsCount() {
		return this.shippments.size();
	}

	public Color getColor() {
		return ManifestObject.ULDTYPECOLOR;
	}

	public void addShipmentAt(final int row, final Shipments shipments) {
		final Shipments empty = this.shippments.get(this.shippments.size() - 1);
		this.shippments.remove(empty);
		this.shippments.add(row, shipments);
		this.shippments.add(empty);
	}

	public void addShipment(final Shipments shipments) {
		final Shipments empty = this.shippments.get(this.shippments.size() - 1);
		this.shippments.remove(empty);
		this.shippments.add(shipments);
		this.shippments.add(empty);
	}

	public boolean removeShipment(final ManifestObject object) {
		int count = 0;
		boolean found = false;
		for (final Shipments s : this.shippments) {
			if (s == object) {
				found = true;
				break;
			}
			count++;
		}
		if (found) {
			this.shippments.remove(count);
		}
		return found;
	}

	public boolean canRemove() {
		final boolean ret = this.remove;
		this.remove = true;
		return ret;
	}

	public void setCanRemove(final boolean b) {
		this.remove = b;
	}

	/*
	 * 05.12.2005
	 *
	 * @see de.act.batch.data.forms.manifest.ManifestObject#getImage()
	 */
	public ImageIcon getImage() {
		final ImageIcon img = ManifestObject.icon_type;
		return img;
	}

	/*
	 * 05.12.2005
	 *
	 * @see de.act.batch.data.forms.manifest.ManifestObject#isInvalid()
	 */
	public ManifestObject ifInvalidGetRoot() {
		return this;
	}

	public int getCount() {
		return this.ulds.size();
	}

	public ULDObject getFirstUld() {
		if (this.ulds.isEmpty()) { return null; }
		return this.ulds.iterator().next();
	}

	public void removeUld(final ULDObject u) {
		this.ulds.remove(u);
	}

	public void addUld(final ULDObject uld) {
		this.ulds.add(uld);
	}

	public void openClose() {
		if (this.open) {
			this.open = false;
		} 
		else {
			this.open = true;
		}
		for (final ULDObject uld : this.ulds) {
			uld.isType = !this.open;
		}
	}

	public boolean isOpen() {
		return this.open;
	}

	/*
	 * 10.01.2006
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object obj) {
		if (obj == this) { return true; }
		if (obj == null || this.hashCode() != obj.hashCode()) { return false; }
		if (obj instanceof RSUld) { return ((RSUld) obj).uld_id.equals(this.uld_id); }
		return false;
	}

	/*
	 * 10.01.2006
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		if (this.hashcode == 0) {
			this.hashcode = new HashCodeBuilder().append(baseHash).append(this.uld_id).toHashCode();
		}
		return this.hashcode;
	}

	/*
	 * 10.01.2006
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.uld_id.toString();
	}

	public void setLoadingAdvice(final String ad) {
		this.loadingAdvice = ad;
	}

	public String getLoadingAdvice() {
		if (this.loadingAdvice != null) {
			return this.loadingAdvice;
		} 
		else {
			return "";
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.ManifestObject#getPcs()
	 */
	public Integer getPcs() {
		return 0;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.ManifestObject#getWgt()
	 */
	public Double getWgt() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.ManifestObject#isBooked()
	 */
	public boolean isBooked() {
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.ManifestObject#isNothing()
	 */
	public boolean isNothing() {
		return false;
	}

	public int getHashcode() {
		return this.hashcode;
	}

	public void setHashcode(final int hashcode) {
		this.hashcode = hashcode;
	}

	public String getLen_unit() {
		return this.len_unit;
	}

	public void setLen_unit(final String len_unit) {
		this.len_unit = len_unit;
	}

	public Integer getPallet() {
		return this.pallet;
	}

	public void setPallet(final Integer pallet) {
		this.pallet = pallet;
	}

	public boolean isRemove() {
		return this.remove;
	}

	public void setRemove(final boolean remove) {
		this.remove = remove;
	}

	public boolean isShowUlds() {
		return this.showUlds;
	}

	public void setShowUlds(final boolean showUlds) {
		this.showUlds = showUlds;
	}

	public String getUld_shape() {
		return this.uld_shape;
	}

	public void setUld_shape(final String uld_shape) {
		this.uld_shape = uld_shape;
	}

	public List<RSUldType> getUldTypes() {
		return uldTypes;
	}

	public void setUldTypes(List<RSUldType> uldTypes) {
		this.uldTypes = uldTypes;
	}

	public Set<ULDObject> getUlds() {
		return this.ulds;
	}

	public void setUlds(final Set<ULDObject> ulds) {
		this.ulds = ulds;
	}

	public String getUs_type() {
		return this.us_type;
	}

	public void setUs_type(final String us_type) {
		this.us_type = us_type;
	}

	public String getVol_unit() {
		return this.vol_unit;
	}

	public void setVol_unit(final String vol_unit) {
		this.vol_unit = vol_unit;
	}

	public void setOpen(final boolean open) {
		this.open = open;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.ManifestObject#setColor(java.awt.Color)
	 */
	public void setColor(final Color col) {

	}

	/* (non-Javadoc)
	 * @see de.act.common.types.ManifestObject#isImport()
	 */
	public boolean isImport() {
		return false;
	}

	/* (non-Javadoc)
	 * @see de.act.common.types.ManifestObject#setImport(boolean)
	 */
	public void setImport(boolean isimport) {

	}

	public RSVad getVad() {
		return vad;
	}

	public void setVad(RSVad vad) {
		this.vad = vad;
	}

}
