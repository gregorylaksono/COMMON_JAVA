/**
 * 
 */
package de.act.common.types.staticobjects;

import java.io.Serializable;

/**
 * @author User
 * @version 1.0 30.03.2007
 */
public class CommodityClass implements Serializable {

	private static final long serialVersionUID = -6281939619299028663L;
	private Long id;
	private RSAnn annotation;
	private Classes classes;
	private RSVad validation;

	public RSVad getValidation() {
		return this.validation;
	}

	public void setValidation(RSVad validation) {
		this.validation = validation;
	}

	public RSAnn getAnnotation() {
		return annotation;
	}

	public void setAnnotation(RSAnn annotation) {
		this.annotation = annotation;
	}

	public Classes getClasses() {
		return classes;
	}

	public void setClasses(Classes classes) {
		this.classes = classes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj==this) return true;
		if (obj instanceof CommodityClass) {
			CommodityClass c = (CommodityClass) obj;
			return c.id.equals(id);
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return this.id.hashCode()*51;
	}
}
