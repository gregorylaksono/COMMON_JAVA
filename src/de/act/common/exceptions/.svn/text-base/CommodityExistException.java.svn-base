/**
 * 
 */
package de.act.common.exceptions;

import java.util.List;

import de.act.common.types.staticobjects.ICommodityTree;

/**
 * @author User
 * @version 1.0 18.06.2007
 */
public class CommodityExistException extends RuntimeException {

	private static final long serialVersionUID = -696710296309686341L;
	private List<ICommodityTree> existing;

	public CommodityExistException(String string, List<ICommodityTree> list) {
		super(string);
		this.existing = list;
	}

	public List<ICommodityTree> getExisting() {
		return this.existing;
	}
}