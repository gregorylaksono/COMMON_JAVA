package de.act.common.types.staticobjects;

import java.io.Serializable;

/**
 * @author User
 * @version 1.0 30.03.2007
 */
public class Classes implements Serializable {
	
	private static final long serialVersionUID = 5664269006116616230L;
	private Integer id;
	private String classType;
	private Integer mixable;
	private String class_name;
	private RSVad validation;

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	public RSVad getValidation() {
		return validation;
	}

	public void setValidation(RSVad validation) {
		this.validation = validation;
	}

	public String getClass_name() {
		return class_name;
	}

	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMixable() {
		return mixable;
	}

	public void setMixable(Integer mixable) {
		this.mixable = mixable;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj==this) return true;
		if (obj instanceof Classes) {
			Classes c = (Classes) obj;
			return c.id.equals(id);
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return this.id.hashCode()*31;
	}
}
