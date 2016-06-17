/**
 * @author Admin
 * @since 27.03.2006
 */
package de.act.common.types.packageitems;
import java.util.LinkedHashSet;
import java.util.Set;

import de.act.common.types.formulars.FormularType;
import de.act.common.types.formulars.IAttachment;
import de.act.common.types.handling.AbstractAccItem;
import de.act.common.types.handling.FAcceptanceItem;
import de.act.common.types.nonstaticobjects.PackageVol;
import de.act.common.types.nonstaticobjects.ULDObject;
import de.act.common.types.staticobjects.ICommodity;
import de.act.common.types.staticobjects.RSAnn;
import de.act.common.types.staticobjects.RSScc;

/**
 * @author Martin Sachs
 * @since 1.0 - 12.06.2006
 */
@SuppressWarnings("unused")
public abstract class AbstractSliItem extends AbstractItem {

	private static final long serialVersionUID  = 3478541725969866746L;
	transient private static final String CONSOLIDATION_ID  = "9150000000000";
	
	/**
	 * this items are AVI ex-or DGR items this should not be an AWB or BKG item !! AWB items must linked to parent and AWBItems have no sliitems . only subitems such as ItemPKG.
	 * 
	 * ItemAWB = SubItem ItemPKG = SubItem ItemAVI = SliItem ItemDGR = SliItem
	 * 
	 * @author Martin Sachs
	 * @since 1.0 - 20.06.2006
	 */
	private ItemAVI itemAvi = null;
	private ItemDGR itemDgr = null;
	private ItemSLI itemSli = null;
	private ItemBKG itemBkg;
	private ItemULD itemUld;
	private Double wgt = 0.0;
	private PackageVol volObj;
	private RSScc scc;
	
	/**
	 * Items for PackageItem many-to-many relation
	 * 
	 * @author Martin Sachs
	 * @since 31.05.2006
	 */
	private Set<AbstractAccItem> acceptedItems = new LinkedHashSet<AbstractAccItem>();
	/**
	 * Items for BKG-one-to-many relation
	 * 
	 * @author Martin Sachs
	 * @since 31.05.2006
	 */
	private Set<FAcceptanceItem> acceptedShipments = new LinkedHashSet<FAcceptanceItem>();

	public void addAcceptedShipment(FAcceptanceItem item) {
		if (item != null){
			if (acceptedShipments == null){
				acceptedShipments = new LinkedHashSet<FAcceptanceItem>();
			}
			if (acceptedShipments.add(item)){
				item.setBooking(this);
			}
		}
	}

	public void removeAcceptedShipment(FAcceptanceItem item) {
		if (item != null){
			if (acceptedShipments != null && acceptedShipments.add(item)){
				item.setBooking(null);
			}
		}
	}

	public AbstractSliItem(AbstractSliItem itemSLI) {
		super(itemSLI);
		this.acceptedItems = itemSLI.acceptedItems;
		this.acceptedShipments = itemSLI.acceptedShipments;
		this.itemBkg = itemSLI.itemBkg;
		this.scc = itemSLI.scc;
		this.volObj = itemSLI.volObj;
		this.wgt = itemSLI.wgt;
	}

	public void addAcceptedItem(FAcceptanceItem item) {
		if (item != null){
			if (acceptedItems == null){
				acceptedItems = new LinkedHashSet<AbstractAccItem>();
			}
			if (acceptedItems.add(item)){
				item.addSliItem(this);
			}
		}
	}

	public void removeAcceptedItem(FAcceptanceItem item) {
		if (item != null){
			if (acceptedItems != null && acceptedItems.add(item)){
				item.removeSliItem(this);
			}
		}
	}

	public AbstractSliItem() {
		super();
	}

	public AbstractSliItem(FormularType awb_item) {
		super(awb_item);
	}

	public Double getVol() {
		if (this.volObj != null)
			return this.volObj.getVolume();
		return null;
	}

	public void setHeight(Integer h) {
		if (this.volObj == null){
			this.volObj = new PackageVol();
		}
		this.volObj.H = h;
	}

	public void setWidth(Integer h) {
		if (this.volObj == null){
			this.volObj = new PackageVol();
		}
		this.volObj.W = h;
	}

	public void setLength(Integer h) {
		if (this.volObj == null){
			this.volObj = new PackageVol();
		}
		this.volObj.L = h;
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

	public RSScc getScc() {
		return scc;
	}

	public void setScc(RSScc scc) {
		this.scc = scc;
	}
	
	@Override
	public RSAnn getAnnotation() {
		// TODO Auto-generated method stub
		return super.getAnnotation();
	}

	@Override
	public void setAnnotation(RSAnn annotation) {
		// TODO Auto-generated method stub
		super.setAnnotation(annotation);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.act.common.types.packageitems.SubItem#getCommodity()
	 */
	@Override
	public ICommodity getCommodity() {
		return super.getCommodity();
		//	   if (sliItems != null && this.sliItems.size() > 0){
		//		  // iterate and calculate
		//		  List<ICommodity> coms = new ArrayList<ICommodity>();
		//		  boolean first = true;
		//		  Set<ICommodity> intersection = null;
		//		  for(AbstractItem s:sliItems){
		//			 ICommodity com = s.getCommodity();
		//			 if (com != null){
		//				// get list of parent
		//				Set<ICommodity> list = com.getParentList();
		//				if (first){
		//				    intersection = new LinkedHashSet<ICommodity>(list);
		//				    first = false;
		//				}else{
		//				    intersection.retainAll(list);
		//				}
		//			 }
		//		  }
		//		  ICommodity ret = null;
		//		  if (intersection != null && intersection.size() > 1){
		//			 ret = Collections.max(intersection, new Comparator<ICommodity>() {
		//				public int compare(ICommodity o1, ICommodity o2) {
		//				    if (o1 != null && o2 != null)
		//					   return o1.getLevel().compareTo(o2.getLevel());
		//				    else return -1;
		//				}
		//			 });
		//		  }
		//		  if (ret != null && ret.getLevel() > 0){
		//			 return ret;
		//		  }else{
		//			 // ret should be ROOT - Commodity
		//			 if (ret instanceof ICommodityTree){
		//				ICommodityTree tr = (ICommodityTree) ret;
		//				CCommodityTree com = new CCommodityTree();
		//				com.setId(CONSOLIDATION_ID);
		//				CommoditySLI comsli = new CommoditySLI();
		//				comsli.setId(CONSOLIDATION_ID);
		//				comsli.setName("CONSOLIDATION");
		//				com.setUserObject(comsli);
		//				return com;
		//			 }
		//			 return null;
		//		  }
		//	   }else{
		//		  // else return this.commodity
		//		  return super.getCommodity();
		//	   }
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.act.common.types.packageitems.SubItem#setCommodity(de.act.common.types.staticobjects.ICommodity)
	 */
	@Override
	public void setCommodity(ICommodity com) {
		super.setCommodity(com);
		//	   // clear Subitemlist
		//	   // this.sliItems.clear();
		//	   // set commodity
		//	   if (this.sliItems != null && this.sliItems.size() == 1){
		//		  AbstractItem sub = this.sliItems.iterator().next();
		//		  sub.setCommodity(com);
		//		  super.setCommodity(null);
		//	   }else if (this.sliItems != null && this.sliItems.size() > 1){
		//		  super.setCommodity(null);
		//	   }else{
		//		  super.setCommodity(com);
		//	   }
	}
	//
	//    public void addSliItemWithRowNo(AbstractItem sub) {
	//	   if (sub != null) this.sliItems.add(sub);
	//	   if (sub != null) sub.setItemAwb(this);
	//    }
	//
	//    public synchronized void addSliItem(AbstractItem sub) {
	//	   if (sub != null) sub.setRowNo(this.sliItems.size());
	//	   this.sliItems.add(sub);
	//	   if (sub != null) sub.setItemAwb(this);
	//    }
	//
	//    public synchronized void removeSliItem(AbstractItem sub) {
	//	   if (sub != null){
	//		  this.sliItems.remove(sub);
	//		  sub.setItemAwb(null);
	//		  this.recalculateRowNos();
	//	   }
	//    }
	//
	//    private void recalculateRowNos() {
	//	   if (this.sliItems != null){
	//		  int row = 0;
	//		  for(AbstractItem i:this.sliItems){
	//			 i.setRowNo(row);
	//			 row++;
	//		  }
	//	   }
	//    }

	public Integer getPcs() {
		//	   Integer p = 0;
		//	   if (sliItems != null && this.sliItems.size() > 0){
		//		  for(AbstractItem a:sliItems){
		//			 p += a.getPcs();
		//		  }
		//		  return p;
		//	   }else 
		return super.getPcs();
	}

	public void setPcs(Integer pcs) {
		//	   if (sliItems != null && this.sliItems.size() == 1){
		//		  for(AbstractItem s:this.sliItems){
		//			 s.setPcs(pcs);
		//		  }
		//		  super.setPcs(0);
		//	   }else if (sliItems != null && this.sliItems.size() > 1){
		//		  // throw new FormularException("SubItems exists, please switch to Avi/Dgr Formular to make this changes.");
		//		  // sliItems.clear();
		//		  // sliItems.add(first);
		//		  // for (AbstractItem it : sliItems) {
		//		  // it.setPcs(0);
		//		  // }
		//		  // AbstractItem first = sliItems.iterator().next();
		//		  // first.setPcs(pcs);
		//	   }else{
		super.setPcs(pcs);
		//	   }
	}

	public void setMetadata(IAttachment metadata) {
		super.setMetadata(metadata);
	}

	public void setVol(Double double1) {
		if (this.volObj == null) {
			this.volObj =  new PackageVol();
			this.volObj.setVolume(double1);
		}
	}

	public ItemBKG getItemBkg() {
		return itemBkg;
	}

	public void setItemBkg(ItemBKG booking) {
		this.itemBkg = booking;
		// if (itemBkg!=null)
		// itemBkg.addSubItem(this);
	}

	public ULDObject getUld() {
		if (itemUld != null){
			return itemUld.getUldObject();
		}
		else{
			return null;
		}
	}

	public void setUld(ULDObject object) {
		this.itemUld = new ItemULD(object);
	}

	public ItemULD getItemUld() {
		return itemUld;
	}

	public void setItemUld(ItemULD itemUld) {
		this.itemUld = itemUld;
	}

	public Set<AbstractAccItem> getAcceptedItems() {
		return acceptedItems;
	}

	public void setAcceptedItems(Set<AbstractAccItem> acceptedItems) {
		this.acceptedItems = acceptedItems;
	}

	public Set<FAcceptanceItem> getAcceptedShipments() {
		return acceptedShipments;
	}

	public void setAcceptedShipments(Set<FAcceptanceItem> acceptedShipments) {
		this.acceptedShipments = acceptedShipments;
	}

	public ItemAVI getItemAvi() {
		return itemAvi;
	}

	public void setItemAvi(ItemAVI itemAvi) {
		this.itemAvi = itemAvi;
	}

	public ItemDGR getItemDgr() {
		return itemDgr;
	}

	public void setItemDgr(ItemDGR itemDgr) {
		this.itemDgr = itemDgr;
	}

	public ItemSLI getItemSli() {
		return itemSli;
	}

	public void setItemSli(ItemSLI itemSli) {
		this.itemSli = itemSli;
	}
}
