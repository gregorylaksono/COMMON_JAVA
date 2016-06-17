package de.act.common.types.staticobjects;

import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * @author Martin Sachs
 * @since 1.0 - 06.07.2006
 */
public abstract class RSInformations implements java.io.Serializable{

	private static final long serialVersionUID = -4138403979613344349L;
	public String             id;
	public String             name;
	public String             usedBy;

	/*
	 * 10.01.2006
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object obj) {
		if (obj== this) {
			return true;
		}
		if (obj ==null)return false;
		if (obj instanceof RSInformations) {
			if (id==null || ((RSInformations)obj).id ==null) return false;
			return id.equals(((RSInformations)obj).id);
		}
		else {
			return false;
		}
	}

	/*
	 * 10.01.2006
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		if (id!=null)
			return new HashCodeBuilder().append(this.id).toHashCode();
		else 
			return super.hashCode();
	}

	/*
	 * 10.01.2006
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		if (name!=null)
			return this.name.toString();
		return "";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsedBy() {
		return usedBy;
	}

	public void setUsedBy(String usedBy) {
		this.usedBy = usedBy;
	}
}
