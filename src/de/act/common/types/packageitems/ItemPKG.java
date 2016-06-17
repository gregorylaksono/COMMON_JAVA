package de.act.common.types.packageitems;
import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

import de.act.common.types.attachment.CAbstractAttachment;
import de.act.common.types.formulars.FormularCOOItem;
import de.act.common.types.formulars.FormularType;
import de.act.common.types.nonstaticobjects.PackageState;
import de.act.common.types.staticobjects.RSAnn;
import de.act.common.types.staticobjects.RSPkg;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class ItemPKG extends AbstractSubItem implements Serializable {
	/**
	 * @author Martin Sachs
	 * @since 1.0 - 08.01.2007
	 */
	private static final long serialVersionUID = 5540790852173871231L;
	private RSPkg kindPkg = new RSPkg();
	private RSAnn annotation;
	private Set<PackageState> pkgStates;
	private Integer pcsDelivered;
	private String uldType;
	private String uldNo;
	private FormularCOOItem cooItem;
	public ItemPKG() {
		super(FormularType.PACKAGE);
		pkgStates = new LinkedHashSet<PackageState>();
	}

	public ItemPKG(ItemPKG itemPKG) {
		super(itemPKG);
		annotation = itemPKG.annotation;
		kindPkg = itemPKG.kindPkg;
		pkgStates = new LinkedHashSet<PackageState>();
	}

	public ItemPKG(CAbstractAttachment metadata) {
		this();
		this.setMetadata(metadata);
	}
	
	public void setFullPackage(ItemPKG oldItem){
		this.setId(oldItem.getId());
		this.setMetadata(oldItem.getMetadata());
		this.setRowNo(oldItem.getRowNo());
		this.setCorr(oldItem.getCorr());
		this.setMarks(oldItem.getMarks());
		this.setPcs(oldItem.getPcs());
		this.setWgt(oldItem.getWgt());
		this.setPcsDelivered(oldItem.getPcsDelivered());
		this.setVolObj(oldItem.getVolObj());
		this.setCommodity(oldItem.getCommodity());
		this.setScc(oldItem.getScc());
		this.setKindPkg(oldItem.getKindPkg());
		this.setAnnotation(oldItem.getAnnotation());
		this.setItemAwb(oldItem.getItemAwb());
		ItemBKG itemBKG = new ItemBKG();
		itemBKG.setFullBookingItem(oldItem.getItemBkg());
		this.setItemBkg(itemBKG);
		this.setItemSli(oldItem.getItemSli());
		this.setItemAvi(oldItem.getItemAvi());
		this.setItemDgr(oldItem.getItemDgr());
		this.setIsTotal(oldItem.getIsTotal());
	}

	public RSPkg getKindPkg() {
		return kindPkg;
	}

	public void setKindPkg(RSPkg kindPkg) {
		this.kindPkg = kindPkg;
	}

	/*public RSAnn getAnnotation() {
		return annotation;
	}

	public void setAnnotation(RSAnn annotation) {
		this.annotation = annotation;
	}*/

	public Set<PackageState> getPkgStates() {
		return pkgStates;
	}

	public void setPkgStates(Set<PackageState> pkgStates) {
		this.pkgStates = pkgStates;
	}

	public Integer getPcsDelivered() {
		return pcsDelivered;
	}

	public void setPcsDelivered(Integer pcsDelivered) {
		this.pcsDelivered = pcsDelivered;
	}

	public String getUldType() {
		return uldType;
	}

	public void setUldType(String uldType) {
		this.uldType = uldType;
	}

	public String getUldNo() {
		return uldNo;
	}

	public void setUldNo(String uldNo) {
		this.uldNo = uldNo;
	}

	public FormularCOOItem getCooItem()
	{
		return cooItem;
	}

	public void setCooItem(FormularCOOItem cooItem)
	{
		this.cooItem = cooItem;
	}

	
	
}
