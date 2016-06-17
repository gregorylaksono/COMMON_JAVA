package de.act.common.types.nonstaticobjects;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * @author Martin Sachs
 * @since 14.02.2006
 */
@org.jboss.cache.aop.annotation.PojoCacheable
public final class RFSubtTcom implements java.io.Serializable{

	private static final long serialVersionUID = -6825113118465743203L;
	private Long id = null;
	private RFSubt parent;
	private String no = null;
	private String type = null;
	
	/*
	 * 10.01.2006
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj== this) return true;
		if (obj instanceof RFSubtTcom) {
			RFSubtTcom s = (RFSubtTcom) obj;
			return new EqualsBuilder().append(s.parent, parent).append(s.no, no).append(s.type, type).isEquals();
		}
		return false;
	}
	/*
	 * 10.01.2006
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(parent).append(no).append(type).toHashCode();
	}
	
	/*
	 * 10.01.2006
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.no.toString();
	}

	public final Long getId() {
		return id;
	}

	public final void setId(Long id) {
		this.id = id;
	}

	public final String getNo() {
		return no;
	}

	public final void setNo(String no) {
		this.no = no;
	}

	public final RFSubt getParent() {
		return parent;
	}

	public final void setParent(RFSubt parent) {
		this.parent = parent;
	}

	public final String getType() {
		return type;
	}

	public final void setType(String type) {
		this.type = type;
	}
}
