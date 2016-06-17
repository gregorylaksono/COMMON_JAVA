package de.act.common.types.localobjects;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class RDUser implements java.io.Serializable{
	/**
	 * @author Martin Sachs
	 * @since 26.01.2006
	 */
	private static final long serialVersionUID = -2563392503026631150L;
	public String USER_ID;
	public String USER_NAME;
	public String USER_PASSWORD;
	public String USER_FIRST_NAME;
	public String USER_FAM_NAME;
	public Boolean USER_ROOT;
	public Boolean USER_BLOCKED;
	public String USER_SIGN;
	
	/*
	 * 10.01.2006
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof RDUser) {
			return hashCode() == obj.hashCode();
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
		return USER_ID.hashCode();
	}
	
	/*
	 * 10.01.2006
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return USER_NAME.toString();
	}
}
