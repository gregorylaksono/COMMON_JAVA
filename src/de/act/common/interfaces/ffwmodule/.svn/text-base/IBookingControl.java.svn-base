/**
 * @file ISLIWrite.java
 * @package de.act.blackbox.actions
 * @since 26.01.2006 12:46:37
 * @author Martin Sachs
 */
package de.act.common.interfaces.ffwmodule;

import java.util.Date;
import java.util.List;

import de.act.common.interfaces.IAction;
import de.act.common.types.nonstaticobjects.RFForm;

/**
 * - Buchungsbestätigung / Annahme - c-flight eintrag, f-bkg-flt senden 
 * - Warteliste verwalten - 
 * - Cancelation -
 * 
 * 
 * @since 26.01.2006
 * @author Martin Sachs
 * 
 */
public interface IBookingControl extends IAction {

	/**
	 * Informations for own processes
	 * @param date TODO
	 * @param startIndex TODO
	 * @param endIndex TODO
	 * @return
	 */
	List<RFForm> getFormularInformationByAdd(Date date, Integer startIndex, Integer endIndex);
}