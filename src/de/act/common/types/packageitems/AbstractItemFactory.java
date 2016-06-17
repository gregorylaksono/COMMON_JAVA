/**
 * @author Martin Sachs
 * @since 1.0
 */
package de.act.common.types.packageitems;

/**
 * Interface for an abstract ItemFactory. Each item belongs to another ItemType,
 * but can generated unattached.
 * 
 * @author Martin Sachs
 * @version 1.0
 */
public interface AbstractItemFactory {
	// /**
	// * Create ItemBKG List for use in Formulars with this elements
	// * @author Martin Sachs
	// * @since 1.0
	// * @return a List of BookingItems without anyitem
	// */
	// List<ItemBKG> createItemBKGs();
	//
	// /**
	// * @author Martin Sachs
	// * @since 1.0
	// */
	// void addEmptyItemSLIRow(ItemBKG bkg);

	ItemAVI createEmptyItemAVI();

	ItemDGR createEmptyItemDGR();

	ItemSLI createEmptyItemSLI();

	ItemAWB createEmptyItemAWB();

	ItemAWB createEmptyItemAWBWithULD();

	ItemBKG createEmptyItemBKG();

	ItemSAD createEmptyItemSAD();

	ItemPKG createEmptyItemPKG();
}
