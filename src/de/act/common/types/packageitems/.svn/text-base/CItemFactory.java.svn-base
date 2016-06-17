/**
 * @author Martin Sachs
 * @since 1.0
 */
package de.act.common.types.packageitems;
import org.apache.log4j.Logger;

import de.act.common.types.attachment.CAbstractAttachment;

/**
 * @author Martin Sachs
 */
public final class CItemFactory implements AbstractItemFactory {
	/**
	 * Logger for this class
	 */
	private static final Logger log = Logger.getLogger(CItemFactory.class);
	final private CAbstractAttachment metadata;

	public CItemFactory(CAbstractAttachment packages) {
		this.metadata = packages;
	}

	// private ItemBKG bkg;
	//
	// /* (non-Javadoc)
	// * @see de.act.batch.gui.packageitems.AbstractItemFactory#createItemBKG()
	// */
	// public List<ItemBKG> createItemBKG() {
	//
	// List<ItemBKG> bkgList = Collections.synchronizedList(new
	// ArrayList<ItemBKG>(1));
	// Set<ItemAWB> awbList = Collections.synchronizedSet(new
	// LinkedHashSet<ItemAWB>(1));
	// Set<ItemPKG> sliList = Collections.synchronizedSet(new
	// LinkedHashSet<ItemPKG>(1));
	// Set<ItemULD> uldList = Collections.synchronizedSet(new
	// LinkedHashSet<ItemULD>(1));
	// Set<ItemDGR> dgrList = Collections.synchronizedSet(new
	// LinkedHashSet<ItemDGR>(1));
	// Set<ItemAVI> aviList = Collections.synchronizedSet(new
	// LinkedHashSet<ItemAVI>(1));
	// Set<ItemSAD> sadList = Collections.synchronizedSet(new
	// LinkedHashSet<ItemSAD>(1));
	//
	// ItemSAD sad = new ItemSAD();
	// ItemDGR dgr = new ItemDGR();
	// ItemAVI avi = new ItemAVI();
	// ItemPKG sli = new ItemPKG();
	// ItemAWB awb = new ItemAWB();
	// ItemULD uld = new ItemULD();
	//
	// ItemBKG bkg = new ItemBKG();
	//
	//
	// // init Lists
	// bkg.setListAWB(awbList);
	// awb.setListSLI(sliList);
	// awb.setListULD(uldList);
	// sli.setListAVI(aviList);
	// sli.setListDGR(dgrList);
	// uld.setListSLI(sliList);
	//
	// // set ItemReferences
	//
	// bkg.add(awb);
	// // awb.add(uld);
	// awb.add(sli);
	// sli.add(avi);
	// sli.add(dgr);
	// sli.setItemSAD(sad);
	// // uld.add(sli);
	// bkgList.add(bkg);
	// return bkgList;
	// }
	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.batch.gui.packageitems.AbstractItemFactory#addEmptyItemSLIRow()
	 */
	// public void addEmptyItemSLIRow(ItemBKG bkg) {
	//
	// }
	
	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.batch.gui.packageitems.AbstractItemFactory#addEmptyItemAVI()
	 */
	public ItemAVI createEmptyItemAVI() {
		log.debug("createEmptyItemAVI");
		ItemAVI list = new ItemAVI(this.metadata);
		return list;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.batch.gui.packageitems.AbstractItemFactory#createEmptyItemDGR()
	 */
	public ItemDGR createEmptyItemDGR() {
		log.debug("createEmptyItemDGR");
		return new ItemDGR(this.metadata);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.batch.gui.packageitems.AbstractItemFactory#createEmptyItemSLI()
	 */
	public ItemSLI createEmptyItemSLI() {
		log.debug("createEmptyItemSLI");
		return new ItemSLI(this.metadata);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.batch.gui.packageitems.AbstractItemFactory#createEmptyItemAWB()
	 */
	public ItemAWB createEmptyItemAWB() {
		log.debug("createEmptyItemAWB");
		return new ItemAWB(this.metadata);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.batch.gui.packageitems.AbstractItemFactory#createEmptyItemAWB()
	 */
	public ItemAWB createEmptyItemAWBWithULD() {
		log.debug("createEmptyItemAWB");
		return new ItemAWB(this.metadata);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.batch.gui.packageitems.AbstractItemFactory#createEmptyItemBKG()
	 */
	public ItemBKG createEmptyItemBKG() {
		log.debug("createEmptyItemBKG");
		return new ItemBKG(this.metadata);
	}

	public ItemSAD createEmptyItemSAD() {
		log.debug("createEmptyItemSAD");
		return new ItemSAD(this.metadata);
	}

	/* (non-Javadoc)
	 * @see de.act.common.types.packageitems.AbstractItemFactory#createEmptyItemPKG()
	 */
	public ItemPKG createEmptyItemPKG() {
		log.debug("createEmptyItemPKG");
		return new ItemPKG(this.metadata);
	}
}
