/**
 * 
 */
package de.act.common.exceptions;

import de.act.common.types.staticobjects.RSAdd;

/**
 * @author User
 * @version 1.0 18.06.2007
 */
public class CompanyExistException extends RuntimeException {

	private static final long serialVersionUID = 2240709829669023219L;
	private RSAdd address;

	public CompanyExistException(String string, RSAdd add) {
		super(string);
		this.address = add;
	}

	public RSAdd getAddress() {
		return this.address;
	}
}