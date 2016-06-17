package de.act.common.types.staticobjects;
import java.io.Serializable;

import org.apache.commons.lang.builder.HashCodeBuilder;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class CommodityAVI implements Serializable {
	/**
	 * @author Martin Sachs
	 * @since 01.03.2006
	 */
	private static final long serialVersionUID = 7498067194572521001L;
	private int hashcode = 0;
	private final static int baseHash = CommodityAVI.class.getName().hashCode() * 2 + 1;
	private ICommodity commodity;
	private String id; //HENRY it should be checked
	private String scfName;
	private String cites;
	private String container;
	private String vadId;

	public String getCites() {
		return this.cites;
	}

	public void setCites(final String cites) {
		this.cites = cites;
	}

	public String getContainer() {
		return this.container;
	}

	public void setContainer(final String container) {
		this.container = container;
	}

	public String getId() {
		return this.id;
	}

	public void setId(final String id) {
		this.id = id;
	}

	public String getScfName() {
		return this.scfName;
	}

	public void setScfName(final String scfName) {
		this.scfName = scfName;
	}

	public String getVadId() {
		return this.vadId;
	}

	public void setVadId(final String vadId) {
		this.vadId = vadId;
	}

	public ICommodity getCommodity() {
		return this.commodity;
	}

	public void setCommodity(final ICommodity comId) {
		this.commodity = comId;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object obj) {
		if (obj == this) { return true; }
		if (obj == null || this.hashCode() != obj.hashCode()) { return false; }
		if (this.id != null && obj != null && obj instanceof CommodityAVI) {
			final CommodityAVI com = (CommodityAVI) obj;
			if (this.id != null && com.id != null) { return this.id.equals(com.id); }
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		if (this.hashcode == 0) {
			this.hashcode = new HashCodeBuilder().append(baseHash).append(this.id).toHashCode();
		}
		return this.hashcode;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.scfName;
	}
}
