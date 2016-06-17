package de.act.common.interfaces;
import java.util.List;

import de.act.common.types.SendType;
import de.act.common.types.formulars.IFormularMain;
import de.act.common.types.formulars.IFormulars;

/**
 * @author Martin Sachs
 * @since 1.0 - 08.06.2006
 */
public interface IFormularAction extends IAction {
	/**
	 * @author Martin Sachs
	 * @since 09.03.2006
	 * @param formId
	 * @param type
	 * @return
	 */
	boolean storeFormular(IFormularMain formId, SendType type, String comingFrom);

	/**
	 * @author Admin
	 * @since 16.03.2006
	 * @param formId
	 * @return
	 */
	IFormularMain loadFormular(String formId);

	/**
	 * @author Admin
	 * @since 22.03.2006
	 * @param formId
	 * @return
	 */
	IFormulars loadSingleFormular(String formId);

	List<IFormulars> loadMultiFormulars(String formId);
	
}
