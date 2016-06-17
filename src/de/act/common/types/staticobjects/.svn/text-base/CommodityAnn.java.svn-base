/**
 * @author Martin Sachs
 * @since 06.03.2006
 */
package de.act.common.types.staticobjects;
import java.io.Serializable;

import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * @author Martin Sachs
 * @since 06.03.2006
 */
@org.jboss.cache.aop.annotation.PojoCacheable
public final class CommodityAnn implements Serializable {

	private static final long serialVersionUID = -1045387580406633642L;
	private Long comId;
	private RSAnn annotation;
	// private String vadId;
	private RSVad vad = null;
	private final static int baseHash = CommodityAnn.class.getName().hashCode() * 2 + 1;

	public CommodityAnn() {

	}

	public RSAnn getAnnotation() {
		return this.annotation;
	}

	public void setAnnotation(final RSAnn annotation) {
		this.annotation = annotation;
	}

	public Long getComId() {
		return this.comId;
	}

	public void setComId(final Long comId) {
		this.comId = comId;
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
		if (this.getComId() != null && obj != null && obj instanceof CommodityAnn) {
			final CommodityAnn com = (CommodityAnn) obj;
			if (this.getComId() != null && com.getComId() != null) { return this.getComId().equals(com.getComId()); }
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
		return new HashCodeBuilder().append(baseHash).append(this.getComId()).toHashCode();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString();
	}

	public RSVad getVad() {
		return vad;
	}

	public void setVad(RSVad vad) {
		this.vad = vad;
	}

	/* public String getVadId() {
        return vadId;
    }*/
	/*
    public void setVadId(String vadId) {
        this.vadId = vadId;
    }*/
}
