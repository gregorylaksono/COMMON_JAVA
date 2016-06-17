/**
 * @author Martin Sachs
 * @since 18.04.2006
 */
package de.act.common.types.handling;

import java.io.Serializable;

import org.apache.commons.lang.builder.HashCodeBuilder;

import de.act.common.types.attachment.CAcceptanceAttachment;
import de.act.common.types.formulars.FormularType;
import de.act.common.types.formulars.IAttachment;
import de.act.common.types.nonstaticobjects.PackageVol;
import de.act.common.types.nonstaticobjects.ULDObject;
import de.act.common.types.packageitems.AbstractItem;
import de.act.common.types.packageitems.ItemBKG;
import de.act.common.types.packageitems.ItemHandlingBKG;
import de.act.common.types.packageitems.ItemPKG;
import de.act.common.types.staticobjects.RSPkg;
import de.act.common.types.staticobjects.RSScc;

public abstract class AbstractAccItem extends AbstractItem implements Serializable{

	private static final long serialVersionUID = -8385176884457804102L;
	private ULDObject uld_id ;
	private Double wgt = 0.0;
	private PackageVol volObj = new PackageVol();
	private RSScc scc;
	private Double vol = 0.0;
	private RSPkg kindPkg = new RSPkg();

	private FAcceptance acceptance;
	// n-m mapping reference list

	public AbstractAccItem() {
		super(FormularType.ACCEPTANCE);
	}

	public AbstractAccItem(AbstractAccItem item) {
		super(item);
		this.uld_id = item.getUld_id();
		this.kindPkg = item.getKindPkg();
		this.volObj = (item.getVolObj());
		this.scc  =(item.getScc());
		this.vol  = item.getVol();
		this.wgt = (item.getWgt());
	}

	public AbstractAccItem(ItemPKG item) {
		super(item);
		this.setId(-1L);
		this.uld_id = item.getUld();
		this.kindPkg = item.getKindPkg();
		this.volObj = (item.getVolObj());
		this.scc  =(item.getScc());
		this.vol  = item.getVol();
		this.wgt = (item.getWgt());
		this.setMetadata(new CAcceptanceAttachment());
		this.setCommodity(item.getCommodity());
		this.setPcs(item.getPcs());
		//
	}

	public AbstractAccItem(ItemBKG booking2) {
		super(booking2);
		this.setId(new Long(-1L));
		this.uld_id = booking2.getUld();
		this.wgt = booking2.getWgt();
		this.vol = booking2.getVol();
		this.volObj = booking2.getVolObj();
		this.scc = booking2.getScc();
		this.setMetadata(new CAcceptanceAttachment());
		this.setCommodity(booking2.getCommodity());
		this.setPcs(booking2.getPcs());
	}

	public AbstractAccItem(ItemHandlingBKG booking2) {
		super(booking2);
		this.setId(new Long(-1L));
		this.uld_id = booking2.getUld();
		this.wgt = booking2.getWgt();
		this.vol = booking2.getVol();
		this.volObj = booking2.getVolObj();
		this.scc = booking2.getScc();
		this.setMetadata(new CAcceptanceAttachment());
		this.setCommodity(booking2.getCommodity());
		this.setPcs(booking2.getPcs());
	}
	
	/* (non-Javadoc)
	 * @see de.act.common.types.packageitems.AbstractItem#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this== obj) return true;
		if (obj instanceof AbstractAccItem) {
			AbstractAccItem a = (AbstractAccItem) obj;
			if (getRowNo()==null ) {
				//log.error("this.rowno is null");
				return false;
			}
			if (a.getRowNo()==null){
				//log.error("obj.rowno is null"+ this.commodity);
				return false;
			}
			if (a.acceptance!=null) {
				return getRowNo().equals(a.getRowNo()) && a.acceptance.equals(this.acceptance);
			}
			else {
				return getRowNo().equals(a.getRowNo());
			}
		}
		return false;
	}
	
	/* (non-Javadoc)
	 * @see de.act.common.types.packageitems.AbstractItem#hashCode()
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(this.getRowNo()).append(this.acceptance).toHashCode();
	}

	public RSScc getScc() {
		return scc;
	}

	public void setScc(RSScc scc) {
		this.scc = scc;
	}

	public Double getVol() {
		return vol;
	}

	public void setVol(Double vol) {
		this.vol = vol;
	}

	public PackageVol getVolObj() {
		return volObj;
	}

	public void setVolObj(PackageVol volObj) {
		this.volObj = volObj;
	}

	public Double getWgt() {
		return wgt;
	}

	public void setWgt(Double wgt) {
		this.wgt = wgt;
	}

	public FAcceptance getAcceptance() {
		return acceptance;
	}

	public void setAcceptance(FAcceptance acceptance) {
		this.acceptance = acceptance;
		if (acceptance!=null)
			this.setMetadata(acceptance.getMetadata());
	}

	/* (non-Javadoc)
	 * @see de.act.common.types.packageitems.AbstractItem#getMetadata()
	 */
	@Override
	public IAttachment getMetadata() {
		if (this.acceptance!=null)
			return this.acceptance.getMetadata();
		else
			return super.getMetadata();
	}

	public RSPkg getKindPkg() {
		return kindPkg;
	}

	public void setKindPkg(RSPkg kindPkg) {
		this.kindPkg = kindPkg;
	}

	public ULDObject getUld_id() {
		return uld_id;
	}

	public void setUld_id(ULDObject uld) {
		this.uld_id = uld;
	}
}
