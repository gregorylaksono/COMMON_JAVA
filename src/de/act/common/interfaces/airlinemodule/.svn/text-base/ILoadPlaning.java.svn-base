/**
 * @file ISLIWrite.java
 * @package de.act.blackbox.actions
 * @since 26.01.2006 12:46:37
 * @author Martin Sachs
 */
package de.act.common.interfaces.airlinemodule;

import java.util.Date;
import java.util.List;

import de.act.common.interfaces.IAction;
import de.act.common.types.BookingListView;
import de.act.common.types.ManifestListView;
import de.act.common.types.localobjects.Storage;
import de.act.common.types.staticobjects.RSFltConxCA;
import de.act.common.types.staticobjects.RSUldType;
import de.act.common.types.views.BookingControlView2;
import de.act.common.types.views.ULDView;


/**
 * Ladeliste erstellen
 *  - Von handling action übernehmen.
 *  - bkg list zur ladeliste umbauen, container, comments hinzufügen.
 *
 * @since 02.04.2007
 * @version 1.0
 * @author Martin Sachs
 *
 */
public interface ILoadPlaning extends IAction {

	/**
	 * Get a View for all Shipments, which are booked an the given Flight.
	 * @author Martin Sachs
	 * @since 1.0 - 24.07.2006
	 * @param flt - Flight
	 * @return List<BookingListView> list of Summarized informations
	 */
	public abstract List<BookingListView> getBookingListViewFor(RSFltConxCA flt);

	/**
	 * load shipment on Loadinglist of a flight. 
	 * @author Martin Sachs
	 * @since 1.0 - 24.07.2006
	 * @param bkg - from BookingList
	 * @return ManifestListView
	 */
	public abstract boolean loadingShipment(BookingListView bkg);
	/**
	 * @author Martin Sachs
	 * @since 1.0 - 27.07.2006
	 * @param list
	 * @return
	 * @return boolean
	 */
	public abstract boolean loadingShipment(List<BookingListView> list);

	/**
	 * storeLoadingAdvice on LoadingList
	 * @author Martin Sachs
	 * @since 1.0 - 24.07.2006
	 * @param mani
	 * @return ManifestListView
	 */
	public abstract boolean storeLoadingAdvice(ManifestListView mani);

	public boolean removeULDTypeFromShipment(ManifestListView mani, Storage sto);

	/**
	 * remove an ULDType form Loadinglistelement
	 * @author Martin Sachs
	 * @since 1.0 - 24.07.2006
	 * @param mani
	 * @param sto TODO
	 * @return ManifestListView
	 */
	public abstract boolean removeULDTypeFromLoadingList( ManifestListView mani, Storage sto);


	/**
	 * @author Martin Sachs
	 * @since 1.0 - 03.08.2006
	 * @param man
	 * @param bkgList
	 * @return
	 * @return boolean
	 */
	public abstract boolean loadingShipment(ManifestListView man, List<BookingListView> bkgList);
	/**
	 * @author Martin Sachs
	 * @since 1.0 - 27.07.2006
	 * @param object
	 * @param flight
	 * @return
	 * @return boolean
	 */
	public abstract boolean loadULD(RSUldType object, RSFltConxCA flight);

	public List<ULDView> getAvailableULDByCurrentAddID();

	public List<BookingControlView2> getLoadingList(String flt_no, Date bkg_flt_date, String dept, String dest);
}