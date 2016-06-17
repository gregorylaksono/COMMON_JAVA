/**
 * @author Martin Sachs
 * @since 08.03.2006
 */
package de.act.common.exceptions;

import de.act.common.types.formulars.IFormularMain;

public final class FormularException extends Exception {

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 12.06.2006
	 */
	private static final long serialVersionUID = -3089682572673293451L;
	private IFormularMain mainFormular;

	public FormularException(final String message) {
		super(message);
	}
	
	public FormularException(final String message,final IFormularMain main) {
		super(message);
		this.mainFormular = main;
	}

	public IFormularMain getMainFormular() {
		return this.mainFormular;
	}

	public void setMainFormular(final IFormularMain mainFormular) {
		this.mainFormular = mainFormular;
	}
}
