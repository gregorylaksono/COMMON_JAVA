package de.act.common.types.localobjects;

import de.act.common.types.staticobjects.RSUnit;

@org.jboss.cache.aop.annotation.PojoCacheable
public class RDDefUnit implements java.io.Serializable {
	/**final
	 * @author Martin Sachs
	 * @since 23.02.2006
	 */
	private static final long serialVersionUID = 557980158395554710L;
	public Integer DEF_UNIT_ID;
	public String UNIT_TYPE = null;
	public String UNIT_ID = null;
	public RSUnit unit = null;
	public Integer OWNER_ADD_ID;
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this== obj)return true;
		if (obj instanceof RDDefUnit)
			return UNIT_TYPE.equals(((RDDefUnit)obj).UNIT_TYPE);
		return false;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return UNIT_TYPE.hashCode()*53;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		if (unit!=null)
			return unit.toString();
		else
			return "defUnit";
	}
}
