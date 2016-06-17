package de.act.common.types.staticobjects;
import java.io.Serializable;
import java.util.Set;

import org.apache.commons.lang.builder.HashCodeBuilder;

@SuppressWarnings("unchecked")
@org.jboss.cache.aop.annotation.PojoCacheable
public final class CommoditySLI implements ICommodity, Serializable, Comparable {
	
	private static final long serialVersionUID = 929428554571459119L;
	private final static int baseHash = CommoditySLI.class.getName().hashCode() * 2 + 1;
	private Long id = null;
	private Long parentId = null;
	private String name = null;
	private String awbName = null;
	private String flag = null;
	private Integer level = null;
	private String vadId = null;
	private RSAnn annotation;
	private CommodityItem commodityItem;
	private CommodityDGR comDGR;                                                   
	private CommodityAVI comAVI;
	private Boolean avi = false;
	private Boolean dgr = false;

	@Override
	public String toString() {
		String ret = this.name;
		// annotations left and right
		if (this.annotation != null && this.annotation.ann_name != null) {
			if ("l".equals(this.annotation.ann_dsp)) {
				ret = this.annotation.ann_name + " " + this.name;
			} 
			else {
				ret = this.name + " " + this.annotation.ann_name;
			}
		} 
		else if (this.comAVI != null) {
			ret += "(" + this.comAVI.getScfName() + ")";
		} 
		else if (this.comDGR != null) {
			ret += "(" + this.comDGR.getPropName() + ")";
		}
		if (ret == null) {
			ret = "Please select ";
		}
		return ret;
	}

	public int compareTo(final Object o) {
		if (this.getComName() != null && o != null && o instanceof ICommodity) {
			final ICommodity com = (ICommodity) o;
			if (this.getComName() != null && com.getComName() != null) {
				if (this.getComAVI() != null) {
					final String st1 = this.getName() + this.getComAVI().getScfName();
					final String st2 = com.getName() + com.getComAVI().getScfName();
					return st1.compareTo(st2);
				} 
				else {
					return this.getComName().compareTo(com.getComName());
				}
			}
		}
		return -1;
	}

	/*
	 * 14.12.2005
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object obj) {
		if (obj == this) { return true; }
		if (obj == null || this.hashCode() != obj.hashCode()) { return false; }
		if (this.getId() != null && obj != null && obj instanceof ICommodity) {
			final ICommodity com = (ICommodity) obj;
			if (this.getId() != null && com.getId() != null) { return this.getId().equals(com.getId()); }
		}
		return false;
	}

	/*
	 * 14.12.2005
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return  new HashCodeBuilder().append(baseHash).append(this.id).toHashCode();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.packages.ICommodity1#getComId()
	 */
	public Long getId() {
		return this.id;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.packages.ICommodity#getComName()
	 */
	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.packages.ICommodity1#getComName()
	 */
	public String getComName() {
		return this.name;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.packages.ICommodity1#getAnnotation()
	 */
	public RSAnn getAnnotation() {
		return this.annotation;
	}

	public void setAnnotation(final RSAnn annotation) {
		this.annotation = annotation;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.packages.ICommodity1#getAwbName()
	 */
	public String getAwbName() {
		return this.awbName;
	}

	public void setAwbName(final String awbName) {
		this.awbName = awbName;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.packages.ICommodity1#getComAVI()
	 */
	public CommodityAVI getComAVI() {
		return this.comAVI;
	}

	public void setComAVI(final CommodityAVI comAVI) {
		this.comAVI = comAVI;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.packages.ICommodity1#getComDGR()
	 */
	public CommodityDGR getComDGR() {
		return this.comDGR;
	}

	public void setComDGR(final CommodityDGR comDGR) {
		this.comDGR = comDGR;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.packages.ICommodity1#getFlag()
	 */
	public String getFlag() {
		return this.flag;
	}

	public void setFlag(final String flag) {
		this.flag = flag;
	}

	public void setId(final Long consolidation_id) {
		this.id = consolidation_id;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.packages.ICommodity1#getLevel()
	 */
	public Integer getLevel() {
		return this.level;
	}

	public void setLevel(final Integer level) {
		this.level = level;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.packages.ICommodity1#getName()
	 */
	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.packages.ICommodity1#getParentId()
	 */
	public Long getParentId() {
		return this.parentId;
	}

	public void setParentId(final Long parentId) {
		this.parentId = parentId;
	}

	public CommodityItem getCommodityItem() {
		return this.commodityItem;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.staticobjects.ICommodity#isAVI()
	 */
	public Boolean isAVI() {
		return this.avi;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.staticobjects.ICommodity#isDGR()
	 */
	public Boolean isDGR() {
		return this.dgr;
	}

	public void setAvi(final Boolean isAvi) {
		this.avi = isAvi;
	}

	public void setDgr(final Boolean isDgr) {
		this.dgr = isDgr;
	}

	public void setCommodityItem(final CommodityItem commodityItem) {
		this.commodityItem = commodityItem;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.staticobjects.ICommodity#getComDGRs()
	 */
	public Set<CommodityDGR> getComDGRs() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.staticobjects.ICommodity#getComAVIs()
	 */
	public Set<CommodityAVI> getComAVIs() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.staticobjects.ICommodity#getParentList()
	 */
	public Set<ICommodity> getParentList() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.act.common.types.staticobjects.ICommodity#getCommodityScc()
	 */
	public RSScc getCommodityScc() {
		return null;
	}

	public String getVadId() {
		return this.vadId;
	}

	public void setVadId(final String vadId) {
		this.vadId = vadId;
	}

	public Boolean getAvi() {
		return avi;
	}

	public Boolean getDgr() {
		return dgr;
	}

	/* (non-Javadoc)
	 * @see de.act.common.types.staticobjects.ICommodity#setComName(java.lang.String)
	 */
	public void setComName(String name) {
		this.name = name;
	}
}
