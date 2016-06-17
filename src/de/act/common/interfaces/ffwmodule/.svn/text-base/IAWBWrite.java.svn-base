/**
 * @file IAWBWrite.java
 * @package de.act.blackbox.actions
 * @since 26.01.2006 12:46:09
 * @author Martin Sachs
 */
package de.act.common.interfaces.ffwmodule;

import de.act.common.interfaces.IFormularAction;
import de.act.common.types.SendType;
import de.act.common.types.formulars.IFormularMain;
import de.act.common.types.nonstaticobjects.RFAwbNo;

/**
 * IAWBWrite.java:
 *
 * @since 26.01.2006
 * @author Martin Sachs
 *
 */
public interface IAWBWrite  extends IFormularAction{

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 28.06.2006
	 * @return
	 * @return RFAwbNo
	 */
	RFAwbNo getHouseAWBNo();

	boolean deliverShipments(IFormularMain data);

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 26.10.2006
	 * @param formdata
	 * @return
	 * @return RFAwbNo
	 */
	RFAwbNo getAWBNr(IFormularMain formdata, String caId);
	
	boolean preAdvice(IFormularMain main, SendType type, Boolean isLoadable);

	public RFAwbNo checkAWBNr(IFormularMain formdata, String caId);
}