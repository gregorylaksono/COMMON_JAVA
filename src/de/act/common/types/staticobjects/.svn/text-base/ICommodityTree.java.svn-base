/**
 * @author Martin Sachs
 * @since 01.03.2006
 */
package de.act.common.types.staticobjects;
import java.util.Date;
import java.util.Set;

public interface ICommodityTree extends ICommodity{

	public Set<ICommodityTree> getCommodityChilds();

	public ICommodityTree getParent();
	
	public void setParent(ICommodityTree parent);

	public Set<CommodityAVI> getComAVIs();

	public Set<CommodityDGR> getComDGRs();

	public Set<CommodityClass> getComClass();

	public void setComClass(Set<CommodityClass> comClass);

	public Set<CommodityItem> getComItem();

	public void setComItem(Set<CommodityItem> comItem);

	public Date getCreateDate();
	
	public void setCreateDate(Date createDate);

	public Integer getCreator();

	public void setCreator(Integer creator);

	public RSVad getVad(); //HENRY could it be removed

	public void setVad(RSVad vad); //HENRY could it be removed

	public Set<RSAnn> getAnnotations();
	
	public void setAnnotations(Set<RSAnn> annotations);

	public Long getAddId();

	public void setAddId(Long addId);
}