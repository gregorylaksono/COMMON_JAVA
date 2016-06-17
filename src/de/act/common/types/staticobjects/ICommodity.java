package de.act.common.types.staticobjects;
import java.util.Set;

public interface ICommodity {

	public void setId(Long id);

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.act.common.types.packages.ICommodity#getComName()
	 */
	public String getComName();
	
	public void setComName(String name);

	public RSAnn getAnnotation();
	
	public void setAnnotation(RSAnn annotation);

	public String getAwbName();

	public void setAwbName(String awbName);

	public CommodityAVI getComAVI();

	public CommodityDGR getComDGR();

	public String getFlag();

	public Long getId();

	public Integer getLevel();

	public String getName();

	public Long getParentId();

	public Boolean isAVI();

	public Boolean isDGR();

	public Set<CommodityDGR> getComDGRs();

	public Set<CommodityAVI> getComAVIs();

	public void setComDGR(CommodityDGR commodityDGR);

	public void setComAVI(CommodityAVI commodityAVI);

	public Set<ICommodity> getParentList();

	public RSScc getCommodityScc();

	public void setParentId(Long comId);
}
