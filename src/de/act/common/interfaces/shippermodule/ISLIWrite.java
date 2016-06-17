/**
 * @file ISLIWrite.java
 * @package de.act.blackbox.actions
 * @since 26.01.2006 12:46:37
 * @author Martin Sachs
 */
package de.act.common.interfaces.shippermodule;

import de.act.common.interfaces.IFormularAction;
import de.act.common.types.SendType;
import de.act.common.types.formulars.IFormularMain;
import de.act.common.types.nonstaticobjects.RFAwbNo;


/**
 * ISLIWrite.java:
 *
 * @since 26.01.2006
 * @author Martin Sachs
 *
 */
public interface ISLIWrite  extends IFormularAction{

	public RFAwbNo getAWBNr(IFormularMain formdata);

	boolean preAdvice(IFormularMain main, SendType type);
}