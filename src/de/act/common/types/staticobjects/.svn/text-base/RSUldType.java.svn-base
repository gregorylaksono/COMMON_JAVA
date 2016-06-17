/**
 * @file RSUldName.java
 * @package de.act.batch.dbi.tab.types
 * @since 14.12.2005 15:06:51
 * @author Martin Sachs
 */
package de.act.common.types.staticobjects;
import java.io.Serializable;

/**
 * RSUldName.java:
 *
 * @since 14.12.2005
 * @author Martin Sachs
 */
@org.jboss.cache.aop.annotation.PojoCacheable
public final class RSUldType implements Serializable {

	private static final long serialVersionUID = -1885252410776878542L;
	public Integer id;
	public Integer uld_type_id;
	public String uld_name;
	public String uld_type_name;
	public Boolean iata_standart;
	public String uld_type_designator;
	public RSVad vad;

	/*
	 * 04.01.2006
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object obj) {
		if (obj instanceof RSUldType) {
			return obj.hashCode() == this.hashCode();
		} 
		else {
			return false;
		}
	}

	/*
	 * 04.01.2006
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return this.id.hashCode();
	}

	/*
	 * 04.01.2006
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.uld_name;
	}
}
