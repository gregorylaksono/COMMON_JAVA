package de.act.common.types.localobjects;

import java.io.Serializable;
import java.sql.Timestamp;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class RDForm implements Serializable {

	/**
	 * @author Martin Sachs
	 * @since 11.01.2006
	 */
	private static final long serialVersionUID = -3169417060787142074L;
	public String F_ID =null;
	public String NAME =null;
	public int READ_ONLY =0;
	public Timestamp SET_STAMP =null;
	public int IS_LOCAL = -1;
	public String STATUS = null;
	public Integer image_id = null;

	/*
	 * 10.01.2006
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof RDForm) {
			return F_ID.equals(((RDForm)obj).F_ID);
		}
		else
			return false;
	}
	
	/*
	 * 10.01.2006
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return F_ID.hashCode();
	}
	
	/*
	 * 10.01.2006
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return F_ID.toString();
	}
}