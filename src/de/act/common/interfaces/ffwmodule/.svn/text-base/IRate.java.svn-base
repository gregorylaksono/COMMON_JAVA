/**
 * @author Martin Sachs
 * @since 24.02.2006
 */
package de.act.common.interfaces.ffwmodule;

import java.util.Map;

import de.act.common.interfaces.IAction;
import de.act.common.types.formulars.IFormularMain;

/**
 * @author Martin Sachs
 *
 */
public interface IRate extends IAction{
	/**
	 * get the rate of the actual packagetable in this formular
	 * @author Martin Sachs
	 * @since 1.0 - 29.06.2006
	 * @param formdata
	 * @return IFormularMain
	 */
	Map getRate(IFormularMain formdata, String currency);
	
	Map getRateTransfer(IFormularMain formdata, String currency);
	
	Map getRateForRate(IFormularMain formdata, String currency);
	
	Map getRate(IFormularMain formdata, String currency, Integer addId, boolean cargoImp);
}
