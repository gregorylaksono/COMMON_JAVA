/**
 * @author Martin Sachs
 * @since 26.01.2006
 */
package de.act.common.interfaces.handlingmodule;

import de.act.common.interfaces.IAction;
import de.act.common.types.handling.Shipments;
import de.act.common.types.localobjects.Storage;
import de.act.common.types.nonstaticobjects.ULDObject;

/**
 * @author Martin Sachs
 *
 */
public interface IHandlingWarehouse extends IAction{
	/**
	 * Move the ULDObject from one Storage to another. The Storage-objects musst
	 * be updated.
	 * @note This is a new development for this class (Version 2) for store the Location of an ULD/Shipment
	 * @author Martin Sachs
	 * @since 18.01.2006
	 * @param old Storage
	 * @param newst Storage
	 * @param uld ULDObject to move.
	 * @return true, if succeed
	 */
	boolean moveULD(Long old, Long newst, ULDObject uld);

	/**
	 * Move the Shipement from one Storage to another. The Storage-objects musst
	 * be updated.
	 * <table><th><td>Case</td><td>Description</td></th>
     <tr><td>Shipment contains only a booking</td><td>a shipment can not be assigned to a Storage.</td></tr>
     <tr><td>Shipment contains an accepted Item</td><td>this shipment can assigned to one Storage.</td></tr>
	 * </table>
	 * @author Martin Sachs
	 * @since 18.01.2006
	 * @param old Storage
	 * @param newst Storage
	 * @param uld ULDObject to move.
	 * @return true, if succeed
	 */
	boolean moveShipment(Long old, Long newst, Shipments uld);

	/**
	 * move a Shipment to an ULDObject. All assigned Storage of the shipment must be deleted.
	 * @author Martin Sachs
	 * @since 18.01.2006
	 * @param shp Shipment
	 * @param uld ULDObject
	 * @return true, if succeed
	 */
	boolean moveShipmentToULD(Shipments shp, ULDObject uld);

	/**
	 * remove a Shipment from an ULDObject. The Shipment can assigned to a Storage,if
	 * the Shipments contains an accepted Item, otherwise the Shipment is only deassigned from ULD
	 * @author Martin Sachs
	 * @since 18.01.2006
	 * @param shp
	 * @param uld
	 * @param sto
	 * @return
	 */
	boolean removeShipmentFromULD(Shipments shp, ULDObject uld, Storage sto);

	/**
	 * @author Martin Sachs
	 * @since 18.01.2006
	 * @param uld2
	 * @param fid
	 * @param addId
	 * @param awbAcc
	 * @return
	 */
	boolean moveShipmentToULD(ULDObject uld2, String fid, String addId, String awbAcc,Integer rowno);

}