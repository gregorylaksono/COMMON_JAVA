/**
 * @author Martin Sachs
 * @since 07.03.2006
 */
package de.act.common.types.formulars;

import java.io.Serializable;
import java.util.List;

/**
 * Interface for each FormularImplementation. 
 * @author Martin Sachs
 * @version 2.0
 */
public interface IFormulars extends Serializable{

	/**
	 * @author Martin Sachs
	 * @since 2.0
	 * @return true, if the Formular is displayable (allowed to be
	 * displayed for this BLACKBOX)
	 */
	Boolean getDisplayable();

	/**
	 * Get the type of this formular
	 * @author Martin Sachs
	 * @since 2.0
	 * @return Type of Formular as Enum object.
	 */
	FormularType getType();
	/**
	 * @author Admin
	 * @since 17.03.2006
	 * @param formular
	 */
	void setMainFormular(IFormularMain formular);
	
	IFormularMain getMainFormular() ;
	/**
	 * @author Martin Sachs
	 * @since 08.05.2006
	 * @return
	 */
	boolean checkMendetoryFields();
	
	public List<FormularError> getErrorList();

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 23.10.2006
	 * @return
	 * @return boolean
	 */
	boolean isWriteable();

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 23.10.2006
	 * @return
	 * @return boolean
	 */
	boolean isSendable();

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 23.10.2006
	 * @param string
	 * @return void
	 */
	void setAuthState(String string);
}
