package de.act.common.types.staticobjects;
import de.act.common.types.RObject;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class RSAvi implements RObject/* Compareable */, java.io.Serializable /* Select */{
	/*
	 * Addional fields
	 */
	/*
	 * public String COM_ID; public String COM_NAME; public String PARENT_ID;
	 * public String COM_LEVEL; public String COM_FLAG;
	 */
	/**
	 * @author Martin Sachs
	 * @since 19.05.2006
	 */
	private static final long serialVersionUID = 5094321823379139876L;
	public Commodity COM = new Commodity();
	public String COM_ID = "";
	public String AVI_ID = "";
	public String AVI_SCF_NAME = "";
	public String AVI_CONTAINER = "";
	public String AVI_CITES = "";

	// public String AVI_FLAG;
	@Override
	public String toString() {
		if (this.COM.COM_NAME == null || "".equals(this.COM.COM_NAME)) {
			return "";
		} 
		else if (this.AVI_SCF_NAME == null || "".equals(this.AVI_SCF_NAME)) { 
			return this.COM.COM_NAME + "( Please Select )"; 
		}
		return this.COM.COM_NAME + " (" + this.AVI_SCF_NAME + ")";
	}

	public int compareTo(final Object o) {
		return this.AVI_SCF_NAME.compareTo(((RSAvi) o).AVI_SCF_NAME);
	}
}
