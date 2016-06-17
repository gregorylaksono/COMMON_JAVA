/**
 * @file IHandlingBasic.java
 * @package de.act.blackbox.actions
 * @since 26.01.2006 12:46:57
 * @author Martin Sachs
 */
package de.act.common.interfaces.handlingmodule;

import java.util.Date;
import java.util.List;

import de.act.common.interfaces.IAction;
import de.act.common.types.AbstractManifestView;
import de.act.common.types.BookingListView;
import de.act.common.types.LayingListView;
import de.act.common.types.ManifestList;
import de.act.common.types.ManifestListView;
import de.act.common.types.attachment.CAbstractAttachment;
import de.act.common.types.attachment.CAcceptanceAttachment;
import de.act.common.types.formulars.IFormularMain;
import de.act.common.types.handling.AManifest;
import de.act.common.types.handling.AManifestData;
import de.act.common.types.handling.Shipments;
import de.act.common.types.localobjects.IconFolder;
import de.act.common.types.localobjects.RDDefault;
import de.act.common.types.localobjects.Storage;
import de.act.common.types.nonstaticobjects.RFAwbNo;
import de.act.common.types.nonstaticobjects.ULDObject;
import de.act.common.types.staticobjects.Discrepancies;
import de.act.common.types.staticobjects.RSAdd;
import de.act.common.types.staticobjects.RSAp;
import de.act.common.types.staticobjects.RSCaConx;
import de.act.common.types.staticobjects.RSFltConxCA;
import de.act.common.types.staticobjects.RSUld;
import de.act.common.types.staticobjects.RSUldType;

/**
 * IHandlingBasic.java:
 *
 * Basic version for Handling
 * @since 06.01.2006
 * @author Martin Sachs
 * @version 1.0
 *
 * Extended version for realtime persistent handling.
 * @since 24.07.2006
 * @author Martin Sachs
 * @version 2.0
 */
public interface IHandlingBasic extends IAction{

	/**
	 * get floor Storage. this ist the default Storage associated to the Desktop
	 * @author Martin Sachs
	 * @since 16.01.2006
	 * @return Floor Storage and all parent, childs Storages
	 */
	public abstract Storage getDefaultStorage();

	public abstract Storage refreshStorage(Long i);

	/**
	 * get the Warehouse structure as tree.
	 * @author Martin Sachs
	 * @since 20.12.2005
	 * @return The Root Storageobject
	 */
	public abstract Storage getAllStorageHierarchie(Long id);

	/**
	 * retrieve all available discrepancies
	 * @author Martin Sachs
	 * @since 20.12.2005
	 * @return List of Discrepancies
	 */
	public abstract List<Discrepancies> getAllDiscrepancies();

	/**
	 * @author Martin Sachs
	 * @since 19.04.2006
	 * @param stor_id
	 * @return
	 */
	public Storage refresh(Long stor_id);

	/**
	 * @author Martin Sachs
	 * @since 19.04.2006
	 * @param stor_id
	 * @param stor_id2
	 * @param shp
	 * @return
	 */
	public boolean moveShipment(Long stor_id, Long stor_id2, Shipments shp);

	/**
	 * @author Martin Sachs
	 * @since 19.04.2006
	 * @param stor_id
	 * @param stor_id2
	 * @param object
	 * @return
	 */
	public boolean moveULD(Long stor_id, Long stor_id2, ULDObject object);

	/**
	 * @author Martin Sachs
	 * @since 19.04.2006
	 * @param flt
	 * @return
	 */
	public ManifestList getLoadListFor(RSFltConxCA flt) ;

	/**
	 * @author Martin Sachs
	 * @since 19.04.2006
	 * @param mani
	 * @param add_id
	 * @param flt
	 * @return
	 */
	public AManifest storeManifestList(ManifestList mani, RDDefault add_id, RSFltConxCA flt);

	/**
	 * @author Martin Sachs
	 * @since 19.04.2006
	 * @param premani
	 * @return
	 */
	public AManifest storePreManifestList(ManifestList mani, RDDefault add_id, RSFltConxCA flt);

	/**
	 * @author Martin Sachs
	 * @since 27.04.2006
	 * @param mani
	 * @param add_id
	 * @param flt
	 * @return
	 */
	public AManifest storeOnBoardList(ManifestList mani, RDDefault add_id, RSFltConxCA flt);

	/**
	 * @author Martin Sachs
	 * @since 19.04.2006
	 * @param loading
	 * @param add_id
	 * @param flt
	 * @return
	 */
	public AManifest storeLoadingList(ManifestList loading, RDDefault add_id, RSFltConxCA flt);

	/**
	 * @author Martin Sachs
	 * @since 19.04.2006
	 * @param uld
	 * @return
	 */
	public ULDObject refreshULD(Long uld) ;

	/**
	 * @author Martin Sachs
	 * @since 19.04.2006
	 * @param uld2
	 * @param accitem
	 * @return
	 */
	public boolean moveShipmentToULD(ULDObject uld2, Shipments accitem) ;

	/**
	 * @author Martin Sachs
	 * @since 19.04.2006
	 * @param shp
	 * @param uld2
	 * @return
	 */
	public boolean moveShipmentToULD(Shipments shp, ULDObject uld2);

	/**
	 * @author Martin Sachs
	 * @since 19.04.2006
	 * @param formId
	 * @return
	 */
	public ULDObject getUldById(Long formId);

	/**
	 * @author Martin Sachs
	 * @since 26.04.2006
	 * @param airp
	 * @param now
	 * @return
	 */
	public abstract List<RSFltConxCA> getFlightsFrom(RSAp airp, Date now);

	/**
	 * @author Martin Sachs
	 * @since 27.04.2006
	 * @return
	 */
	public abstract List<RSUld> getAvailableUldObjects();

	/**
	 * @author Martin Sachs
	 * @since 31.05.2006
	 * @param f_id
	 * @return
	 */
	public abstract List<Storage> isShipmentAccepted(String f_id) ;

	/**
	 * @author Martin Sachs
	 * @since 31.05.2006
	 * @param f_id
	 * @return
	 */
	public abstract IconFolder isAwbAccepted(String f_id);

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 19.06.2006
	 * @param accItem
	 * @return
	 * @return ManifestList
	 */
	public abstract ManifestList getLoadListFor(AManifestData accItem);

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 10.07.2006
	 * @param airp
	 * @param now
	 * @return
	 * @return List<RSCaConx>
	 */
	public abstract List<RSCaConx> getFlightCarriersFrom(RSAp airp, Date now);

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 10.07.2006
	 * @param ca
	 * @param now
	 * @return
	 * @return List<RSFltConxCA>
	 */
	public abstract List<RSFltConxCA> getFlightsFrom(RSCaConx ca, Date now);

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 11.07.2006
	 * @param shp
	 * @param add 
	 * @param isHandlingOffice TODO
	 * @return
	 * @return Shipments
	 */
	public abstract Shipments acceptShipment(Shipments shp, RSAdd add, Boolean isHandlingOffice);



	/**
	 * get a View of all manifest rows. This view should not be stored back. 
	 * Each change on this view could only stored by methodes for each category of change
	 * @author Martin Sachs
	 * @since 1.0 - 13.07.2006
	 * @param flt
	 * @return List<AbstractManifestView> 
	 */
	public abstract List<AbstractManifestView> getManifestView(RSFltConxCA flt);

	/**
	 * @author Martin Sachs
	 * @param stoid 
	 * @since 1.0 - 17.07.2006
	 * @return
	 * @return Storage
	 */
	public abstract List<Storage> getAllStorageAsList(Long stoid);

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 17.07.2006
	 * @param id
	 * @return
	 * @return List<Storage>
	 */
	public abstract List<Storage> getStorageChildList(Long id);

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 17.07.2006
	 * @param storage
	 * @return
	 * @return List<Shipments>
	 */
	public abstract List<Shipments> getStorageShipments(Storage storage);

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 17.07.2006
	 * @param storage
	 * @return
	 * @return List<ULDObject>
	 */
	public abstract List<ULDObject> getStorageUldItems(Storage storage);

	/**
	 * Get a view for all Shipments planned on a Flight. LoadingList and 
	 * Manifest have the same View.  
	 * @author Martin Sachs
	 * @since 2.0 - 24.07.2006
	 * @param flt - Flight and Date of Departure
	 * @return List<ManifestListView> list of shipmentsoverview 
	 */
	public abstract List<ManifestListView> getManifestViewFor(RSFltConxCA flt);

	/**
	 * Get a View for all shipments with a destination of the given Flight.
	 * All elements must have an correct AWB 
	 * @author Martin Sachs
	 * @since 2.0 - 24.07.2006
	 * @return List<LayingListView>
	 */
	public abstract List<LayingListView> getLayingListFor();

	/**
	 * Get a View for all Shipments, which are booked an the given Flight.
	 * @author Martin Sachs
	 * @since 2.0 - 24.07.2006
	 * @param flt - Flight
	 * @return List<BookingListView> list of Summarized informations
	 */
	public abstract List<BookingListView> getBookingListViewFor(RSFltConxCA flt);


	/**
	 * load shipment on Loadinglist of a flight. 
	 * @author Martin Sachs
	 * @since 2.0 - 24.07.2006
	 * @param bkg - from BookingList
	 * @return ManifestListView
	 */
	public abstract boolean loadingShipment(BookingListView bkg);
	/**
	 * storeLoadingAdvice on LoadingList
	 * @author Martin Sachs
	 * @since 2.0 - 24.07.2006
	 * @param mani
	 * @return ManifestListView
	 */
	public abstract boolean storeLoadingAdvice(ManifestListView mani);
	/**
	 * move Shipment from LoadingList to Bookinglist. this is not an acceptance.
	 * @author Martin Sachs
	 * @since 2.0 - 24.07.2006
	 * @param mani
	 * @param sto TODO
	 * @param address TODO
	 * @return BookingListView
	 */
	public boolean removeShipmentFromLoading(ManifestListView mani, Storage sto);
	
	public boolean removeULDTypeFromShipment(ManifestListView mani, Storage sto);
	
	public boolean removeULDFromLoadingList(ManifestListView mani, Storage sto) ;

	/**
	 * remove an ULD from a Shipment
	 * @author Martin Sachs
	 * @since 2.0 - 24.07.2006
	 * @param mani
	 * @param sto TODO
	 * @return ManifestListView
	 */
	public abstract boolean removeULDFromShipment( ManifestListView mani, Storage sto);
	/**
	 * remove an ULDType form Loadinglistelement
	 * @author Martin Sachs
	 * @since 2.0 - 24.07.2006
	 * @param mani
	 * @param sto TODO
	 * @return ManifestListView
	 */
	public abstract boolean removeULDTypeFromLoadingList( ManifestListView mani, Storage sto);

	/**
	 * onload and Book a shipment from Layinglist to ManifestList
	 * @author Martin Sachs
	 * @since 2.0 - 24.07.2006
	 * @param lay
	 * @return ManifestListView
	 */
	public abstract boolean onloadAndBook(LayingListView lay, RSFltConxCA flt);
	/**
	 * book shipment to a flight
	 * @author Martin Sachs
	 * @since 2.0 - 24.07.2006
	 * @param lay
	 * @return BookingListView
	 */
	public abstract boolean bookShipment(LayingListView lay, RSFltConxCA flt);

	/**
	 * offload a shipement and remove the actual booking.
	 * @author Martin Sachs
	 * @since 2.0 - 24.07.2006
	 * @param mani
	 * @return LayingListView
	 */
	public abstract boolean offloadShipment(ManifestListView mani);

	/**
	 * accept a Shipment from
	 * @author Martin Sachs
	 * @since 2.0 - 24.07.2006
	 * @param mani
	 * @return ManifestListView
	 */
	public abstract boolean acceptShipment(ManifestListView mani, Storage sto);
	/**
	 * accept an ULD
	 * @author Martin Sachs
	 * @since 2.0 - 24.07.2006
	 * @param mani
	 * @return ManifestListView
	 */
	public abstract boolean acceptULD(ManifestListView mani, Storage sto);
	/**
	 * set an ULD to a Shipment
	 * @author Martin Sachs
	 * @since 2.0 - 24.07.2006
	 * @param uld
	 * @param mani
	 * @return
	 * @return ManifestListView
	 */
	public abstract boolean assignULDToShipment(ULDObject uld, ManifestListView mani);
	/**
	 * set a ULDType to a LoadingListElement
	 * @author Martin Sachs
	 * @since 2.0 - 24.07.2006
	 * @param uldtype
	 * @param mani
	 * @return
	 * @return ManifestListView
	 */
	public abstract boolean assignULDTypeToLoadingList(RSUldType uldtype, ManifestListView mani);

	/**
	 * load Shipment from Warehouse or Desktop to ManifestListView and create a ManifestlistView Row 
	 * @author Martin Sachs
	 * @since 2.0 - 24.07.2006
	 * @param bkg
	 * @return ManifestListView
	 */
	public abstract boolean loadingShipment(Shipments bkg, RSFltConxCA flt);

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 27.07.2006
	 * @param list
	 * @param flight
	 * @return
	 * @return boolean
	 */
	public abstract boolean offloadShipment(List<BookingListView> list, RSFltConxCA flight);

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 27.07.2006
	 * @param list
	 * @param flight
	 * @return
	 * @return boolean
	 */
	public abstract boolean onloadAndBook(List<LayingListView> list, RSFltConxCA flight);

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 27.07.2006
	 * @param list
	 * @return
	 * @return boolean
	 */
	public abstract boolean loadingShipment(List<BookingListView> list);

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 27.07.2006
	 * @param list
	 * @param flight
	 * @return
	 * @return boolean
	 */
	public abstract boolean bookShipment(List<LayingListView> list, RSFltConxCA flight);

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 27.07.2006
	 * @param flt
	 * @return
	 * @return boolean
	 */
	public abstract boolean generateManifestFor(RSFltConxCA flt);

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 27.07.2006
	 * @param flt
	 * @return boolean
	 */
	public abstract boolean makeVO(RSFltConxCA flt);

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 27.07.2006
	 * @param list
	 * @return boolean
	 */
	public abstract boolean offloadShipment(List<ManifestListView> list);

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 27.07.2006
	 * @param object
	 * @param flight
	 * @return
	 * @return boolean
	 */
	public abstract boolean loadULD(RSUldType object, RSFltConxCA flight);

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 27.07.2006
	 * @param object
	 * @param flight
	 * @return
	 * @return boolean
	 */
	public abstract boolean loadULD(ULDObject object, RSFltConxCA flight);

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 28.07.2006
	 * @param shpList
	 * @param flight
	 * @return
	 * @return boolean
	 */
	public abstract boolean loadingShipment(List<Shipments> shpList, RSFltConxCA flight);

	/**
	 * @author Martin Sachs
	 * @since 2.0 - 28.07.2006
	 * @param bkgList
	 * @param storage
	 * @return
	 * @return boolean
	 */
	public abstract boolean acceptShipment(List<ManifestListView> bkgList, Storage storage);

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 31.07.2006
	 * @param flt
	 * @return
	 * @return AManifestData
	 */
	public abstract AManifestData getManifestData(RSFltConxCA flt);

	/**
	 * @author Martin Sachs
	 * @since 2.0 - 31.07.2006
	 * @param obj
	 * @param defaultStorage
	 * @return
	 * @return Object
	 */
	public abstract boolean acceptShipmentOffice(ManifestListView obj, Storage defaultStorage);

	/**
	 * @author Martin Sachs
	 * @since 2.0 - 03.08.2006
	 * @param man
	 * @param bkgList
	 * @return
	 * @return boolean
	 */
	public abstract boolean loadingShipment(ManifestListView man, List<BookingListView> bkgList);

	/**
	 * @author Martin Sachs
	 * @since 2.0 - 03.08.2006
	 * @param man
	 * @param layList
	 * @param flight
	 * @return
	 * @return boolean
	 */
	public abstract boolean onloadAndBook(ManifestListView man, List<LayingListView> layList, RSFltConxCA flight);

	/**
	 * @author Martin Sachs
	 * @since 2.0 - 03.08.2006
	 * @param man
	 * @param shpList
	 * @param flight
	 * @return boolean
	 */
	public abstract boolean loadingShipment(ManifestListView man, List<Shipments> shpList, RSFltConxCA flight);

	/**
	 * @author Martin Sachs
	 * @since 2.0 - 08.08.2006
	 * @param list
	 * @param storage
	 * @return boolean
	 */
	public abstract boolean removeShipmentFromLoading(List<ManifestListView> list, Storage storage);

	/**
	 * Use the AWB Data to generate an Acceptance for AWB. 
	 * @author Martin Sachs
	 * @since 2.0 - 29.11.2006
	 * @param mform IFormularMain is the main formular dataobject
	 * @return true, if acceptance could created for AWB
	 */
	public abstract boolean storeAWBExportAcceptance(IFormularMain mform);

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 29.11.2006
	 * @param form
	 * @return
	 * @return boolean
	 */
	public abstract List<Shipments> acceptShipment(CAbstractAttachment form);

	/**
	 * Load the Acceptance datas by specified awbNo. The AwbNo is the wold wide 
	 * unique-key. So we load the last version of Acceptance by the known add_id
	 * @author Martin Sachs
	 * @since 1.0 - 29.11.2006
	 * @param awb - AwbNumber
	 * @return CAbstractAttachment
	 */
	public abstract CAcceptanceAttachment getAcceptanceByAwbNo(RFAwbNo awb);

	/**
	 * This methode gives all known accepted shipments by specifieing only one of all parts.
	 * Normally an shipment can be accepted by one row of datas. You can also accept all shipments in parts. 
	 * So for each part you can have one icon and one acceptanced shipment.
	 * 
	 * @author Martin Sachs
	 * @since 1.0 - 29.11.2006
	 * @param accItem - known accepted shipment
	 * @return CAbstractAttachment
	 */
	public abstract CAcceptanceAttachment getAcceptanceByShipment(Shipments accItem);
}