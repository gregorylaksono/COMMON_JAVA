/**
 * 
 */
package de.act.common.exceptions;

import java.util.List;

import de.act.common.types.staticobjects.RSAnn;

/**
 * @author User
 * @version 1.0 21.06.2007
 */
public class AnnotationExistException extends RuntimeException {

	private static final long serialVersionUID = -4149145518194114097L;
	private List<RSAnn> annotations;

	public AnnotationExistException(String string, List<RSAnn> list) {
		super(string);
		this.annotations = list;
	}

	public List<RSAnn> getAnnotations() {
		return this.annotations;
	}
}