/**
 * @file IHandlingOffice.java
 * @package de.act.blackbox.actions
 * @since 26.01.2006 12:45:13
 * @author Martin Sachs
 */
package de.act.common.interfaces.handlingmodule;

import de.act.common.interfaces.IAction;


/**
 * IHandlingOffice.java:
 *
 * @since 26.01.2006
 * @author Martin Sachs
 *
 */
public interface IHandlingOffice  extends IAction{

	/**
	 * Store the Acceptance with the concret formData
	 * @param CONSIGNEE
	 * @param defaults
	 * @param formData
	 * @return FAcceptnace- object, if succeed
	 */

	/**
	 * load the Acceptance formulardata by f_id, add_id and awb_acc. This Methode
	 * gets all information for the exportacceptance formular. Additional Information
	 * for the Acceptance are Remarks and AWB-No
	 * @param f_id
	 * @param add_id
	 * @param awb_acc
	 * @return the general MForm Dataclass for all Informations
	 */

}