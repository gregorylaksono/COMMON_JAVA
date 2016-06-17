/**
 * @author Martin Sachs
 * @since 27.01.2006
 */
package de.act.common.interfaces.ffwmodule;

import java.util.List;

import de.act.common.interfaces.IFormularAction;
import de.act.common.types.formulars.IFormularMain;
import de.act.common.types.formulars.IFormulars;
import de.act.common.types.packageitems.ItemBKG;

/**
 * @author Martin Sachs
 *
 */
public interface IBooking  extends IFormularAction{

	/**
	 * @author Martin Sachs
	 * @since 08.03.2006
	 * @param formId
	 * @return
	 */
	public abstract IFormulars loadBKGFormular(String formId);

	/**
	 * @author Martin Sachs
	 * @since 09.03.2006
	 * @param formId
	 * @return
	 */
	public abstract boolean storeBKGFormular(IFormularMain formId);
	/**
	 * @param stmt
	 * @param f_id
	 * @return
	 */
	public abstract List<ItemBKG> getBookingRequest(String f_id);

	/**
	 * @param stmt
	 * @param f_id
	 * @return
	 */
	public abstract boolean setBookingRequest(List<ItemBKG> bk);
}