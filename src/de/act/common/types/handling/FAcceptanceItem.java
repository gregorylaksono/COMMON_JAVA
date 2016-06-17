/**
 * @file AcceptanceItem.java
 * @package de.act.batch.app.forms.exportacceptance
 * @since 06.12.2005 18:27:58
 * @author Martin Sachs
 */
package de.act.common.types.handling;
import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

import de.act.common.types.attachment.CAcceptanceAttachment;
import de.act.common.types.localobjects.Storage;
import de.act.common.types.packageitems.AbstractItem;
import de.act.common.types.packageitems.AbstractSliItem;
import de.act.common.types.packageitems.ItemBKG;
import de.act.common.types.packageitems.ItemHandlingBKG;
import de.act.common.types.packageitems.ItemPKG;
import de.act.common.types.staticobjects.Discrepancies;
import de.act.common.types.staticobjects.RSAnn;

/**
 * AcceptanceItem.java:
 *
 * @since 06.12.2005
 * @author Martin Sachs F_ACC_ITEM
 */
@org.jboss.cache.aop.annotation.PojoCacheable
public class FAcceptanceItem extends AbstractAccItem implements Serializable {

	private static final long serialVersionUID = 9084487747407820761L;
	/**
	 * Dialog auswahl objecte
	 */
	private Storage storage = null;
	private Discrepancies discrepancies = null;
	private Set<AbstractItem> sliItems = new LinkedHashSet<AbstractItem>();
	private AbstractSliItem booking;
	private APureManifestItem maniItem = null;
	private RSAnn ann = null;
	private Integer awb_acc;
	
	private Set<AcceptancePackageData> f_acc_pkg = new LinkedHashSet<AcceptancePackageData>();

	public APureManifestItem getManiItem() {
		return maniItem;
	}

	public void setManiItem(APureManifestItem maniItem) {
		this.maniItem = maniItem;
	}

	public FAcceptanceItem() {
		super();
		this.setMetadata(new CAcceptanceAttachment());
	}

	public FAcceptanceItem(ItemPKG p) {
		super(p);
		addSliItem(p);
		this.booking = p.getItemBkg();
	}

	public FAcceptanceItem(Shipments p) {
		super((AbstractAccItem) p);
		sliItems = p.getSliItems();
		booking = p.getBooking();
		this.setKindPkg(p.getKindPkg());
		this.setCommodity(p.getCommodity());
		this.setMarks(p.getMarks());
		this.setPcs(p.getPcs());
		this.setVolObj(p.getVolObj());
		this.setScc(p.getScc());
		this.setRowNo(p.getRowNo());
		this.setWgt(p.getWgt());
		this.setAcceptance(p.getAcceptance());
		this.setMetadata(p.getMetadata());
		this.setStorage(p.getStorage());
		this.setDiscrepancies(p.getDiscrepancies());
		
		ann = p.getAnn();
	}

	public FAcceptanceItem(ItemBKG booking) {
		super(booking);
		this.booking = booking;
	}

	public FAcceptanceItem(ItemBKG bkgItem, Storage sto) {
		this.booking = bkgItem;
		this.storage = sto;
	}

	public FAcceptanceItem(ItemHandlingBKG bkgItem) {
		super(bkgItem);
		this.booking = bkgItem;
	}

	public FAcceptanceItem(ItemHandlingBKG bkgItem, Storage sto) {
		this.booking = bkgItem;
		this.storage = sto;
	}

	public FAcceptanceItem(FAcceptanceItem a) {
		super();
		this.setMetadata(a.getMetadata());
		this.setAcceptance(a.getAcceptance());
		this.setCommodity(a.getCommodity());
		this.setPcs(a.getPcs());
		this.setCorr(a.getCorr());
		this.setId(a.getId());
		this.setRowNo(a.getRowNo());
		this.setScc(a.getScc());
		this.setStorage(a.getStorage());
		this.setWgt(a.getWgt());
		this.setVolObj(a.getVolObj());
		this.setUld_id(a.getUld_id());
	}

	/**
	 * Assignment to Storage ( n-m relationship managed via Hibernate)
	 */
	// public Set<AssignmentStorageAcceptanceItem> ass_items = new
	// HashSet<AssignmentStorageAcceptanceItem>();
	// private Set<Storage> storageItems = new HashSet<Storage>(2);
	public String toString() {
		if (this.getAcceptance() != null && this.getAcceptance().getAwbNumber() != null && this.getAcceptance().getAp_dest() != null){
			return this.getAcceptance().getAwbNumber().toString() + " " + this.getAcceptance().getAp_dest().toString()+" "+getPcs() + " a " + this.getWgt() + " kg ";
		}
		else{
			return getPcs() + " " + this.getCommodity() + " a " + this.getWgt() + " kg ";
		}
	}

	public Discrepancies getDiscrepancies() {
		return discrepancies;
	}

	public void setDiscrepancies(Discrepancies discrepancies) {
		this.discrepancies = discrepancies;
	}

	public Storage getStorage() {
		return storage;
	}

	public void setStorage(Storage storage) {
		this.storage = storage;
	}

	public void addWgt(Double wgt) {
		Double w = this.getWgt();
		w += wgt;
		this.setWgt(w);
	}

	public void addPcs(Integer pcs) {
		Integer p = this.getPcs();
		p += pcs;
		this.setPcs(p);
	}

	public void addSliItem(AbstractItem item) {
		if (item != null){
			if (sliItems == null){
				sliItems = new LinkedHashSet<AbstractItem>();
			}
			if (sliItems.add(item)){
				if (item instanceof AbstractSliItem){
					((AbstractSliItem) item).addAcceptedItem(this);
				}
			}
		}
	}

	public void removeSliItem(AbstractSliItem p) {
		if (p != null){
			if (sliItems != null){
				if (sliItems.remove(p)){
					p.removeAcceptedItem(this);
				}
			}
		}
	}

	public Set<AbstractItem> getSliItems() {
		return sliItems;
	}

	public void setSliItems(Set<AbstractItem> sliItems) {
		this.sliItems = sliItems;
	}

	public AbstractSliItem getBooking() {
		return booking;
	}

	public void setBooking(AbstractSliItem item) {
		this.booking = item;
	}

	public RSAnn getAnn() {
		return ann;
	}

	public void setAnn(RSAnn ann) {
		this.ann = ann;
	}

	public Set<AcceptancePackageData> getF_acc_pkg() {
		return f_acc_pkg;
	}

	public void setF_acc_pkg(Set<AcceptancePackageData> f_acc_pkg) {
		this.f_acc_pkg = f_acc_pkg;
	}
	
	public void addF_acc_pkg(AcceptancePackageData pkg){
		if (pkg != null){
			this.f_acc_pkg.add(pkg);
		}
	}

	public Integer getAwb_acc() {
		return awb_acc;
	}

	public void setAwb_acc(Integer awb_acc) {
		this.awb_acc = awb_acc;
	}
}
