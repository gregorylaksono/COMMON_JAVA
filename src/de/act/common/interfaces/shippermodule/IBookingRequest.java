/**
 * @author Martin Sachs
 * @since 27.01.2006
 */
package de.act.common.interfaces.shippermodule;

import de.act.common.interfaces.IFormularAction;
import de.act.common.types.formulars.IFormularMain;
import de.act.common.types.formulars.IFormulars;
import de.act.common.types.packageitems.ItemBKG;

/**
 * @author Martin Sachs
 *
 */
public interface IBookingRequest  extends IFormularAction{

	public abstract int checkAndBook(String new_fid, ItemBKG selectedBookingRequests);

	/**
	 * @param f_id
	 * @return
	 */
	public abstract int cancelBooking(String f_id);

	/**
	 * @author Martin Sachs
	 * @since 08.03.2006
	 * @param formId
	 * @return
	 */
	public abstract IFormulars loadBKGRequestFormular(String formId);

	/**
	 * @author Martin Sachs
	 * @since 09.03.2006
	 * @param formId
	 * @return
	 */
	public abstract boolean storeBKGRequestFormular(IFormularMain formId);

}