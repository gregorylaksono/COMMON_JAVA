/**
 * @file Location.java
 * @package de.act.batch.data.forms.warehouse
 * @since 06.12.2005 12:49:21
 * @author Martin Sachs
 */
package de.act.common.types.localobjects;

import java.io.Serializable;

/**
 * Location.java: DBObject for using all DB locations
 * 
 * @since 06.12.2005
 * @author Martin Sachs
 * 
 */
@org.jboss.cache.aop.annotation.PojoCacheable
public final class Location implements Serializable
{

	private static final long serialVersionUID = 1481564080573210485L;
	private Long locId;
	// private String locName ;
	// private String locType ;
	private Double maxPkgW;
	private Double maxPkgH;
	private Double maxPkgL;
	private String maxPkgUnit;
	private Double maxPkgWgt;
	private String maxWgtUnit;
	private Double maxFloorWgt;
	private String areaWgtUnit;
	private Short locPlt;
	private Storage stor;
	private Long ownerAddId;
	private Double maxPkgVol;
	private Double availablePkgVol;
	private Double usedPkgVol;
	private Double availablePkgWgt;
	private Double usedPkgWgt;
	private Double availableFloorWgt;
	private Double usedFloorWgt;
	private Long def = null;

	// private List<Location> childs = null;

	public String getAreaWgtUnit()
	{
		return areaWgtUnit;
	}

	public void setAreaWgtUnit(String areaWgtUnit)
	{
		this.areaWgtUnit = areaWgtUnit;
	}

	public Long getLocId()
	{
		return locId;
	}

	public void setLocId(Long locId)
	{
		this.locId = locId;
	}

	public Short getLocPlt()
	{
		return locPlt;
	}

	public void setLocPlt(Short locPlt)
	{
		this.locPlt = locPlt;
	}

	public Double getMaxFloorWgt()
	{
		return maxFloorWgt;
	}

	public void setMaxFloorWgt(Double maxFloorWgt)
	{
		this.maxFloorWgt = maxFloorWgt;
	}

	public Double getMaxPkgH()
	{
		return maxPkgH;
	}

	public void setMaxPkgH(Double maxPkgH)
	{
		this.maxPkgH = maxPkgH;
	}

	public Double getMaxPkgL()
	{
		return maxPkgL;
	}

	public void setMaxPkgL(Double maxPkgL)
	{
		this.maxPkgL = maxPkgL;
	}

	public String getMaxPkgUnit()
	{
		return maxPkgUnit;
	}

	public void setMaxPkgUnit(String maxPkgUnit)
	{
		this.maxPkgUnit = maxPkgUnit;
	}

	public Double getMaxPkgW()
	{
		return maxPkgW;
	}

	public void setMaxPkgW(Double maxPkgW)
	{
		this.maxPkgW = maxPkgW;
	}

	public Double getMaxPkgWgt()
	{
		return maxPkgWgt;
	}

	public void setMaxPkgWgt(Double maxPkgWgt)
	{
		this.maxPkgWgt = maxPkgWgt;
	}

	public String getMaxWgtUnit()
	{
		return maxWgtUnit;
	}

	public void setMaxWgtUnit(String maxWgtUnit)
	{
		this.maxWgtUnit = maxWgtUnit;
	}

	/*
	 * 10.01.2006
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj)
	{
		if (obj instanceof Location)
			return hashCode() == obj.hashCode();
		else
			return false;
	}

	/*
	 * 10.01.2006
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		int re = 17;
		re += 37 * this.locId.hashCode();
		re += 37 * this.locPlt.hashCode();
		return re;
	}

	/*
	 * 10.01.2006
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return super.toString();
	}

	public Storage getStor()
	{
		return stor;
	}

	public void setStor(Storage stor)
	{
		this.stor = stor;
	}

	public Long getOwnerAddId()
	{
		return ownerAddId;
	}

	public void setOwnerAddId(Long ownerAddId)
	{
		this.ownerAddId = ownerAddId;
	}

	public Double getMaxPkgVol()
	{
		return maxPkgVol;
	}

	public void setMaxPkgVol(Double maxPkgVol)
	{
		this.maxPkgVol = maxPkgVol;
	}

	public Double getAvailablePkgVol()
	{
		return availablePkgVol;
	}

	public void setAvailablePkgVol(Double availablePkgVol)
	{
		this.availablePkgVol = availablePkgVol;
	}

	public Double getUsedPkgVol()
	{
		return usedPkgVol;
	}

	public void setUsedPkgVol(Double usedPkgVol)
	{
		this.usedPkgVol = usedPkgVol;
	}

	public Double getAvailablePkgWgt()
	{
		return availablePkgWgt;
	}

	public void setAvailablePkgWgt(Double availablePkgWgt)
	{
		this.availablePkgWgt = availablePkgWgt;
	}

	public Double getUsedPkgWgt()
	{
		return usedPkgWgt;
	}

	public void setUsedPkgWgt(Double usedPkgWgt)
	{
		this.usedPkgWgt = usedPkgWgt;
	}

	public Double getAvailableFloorWgt()
	{
		return availableFloorWgt;
	}

	public void setAvailableFloorWgt(Double availableFloorWgt)
	{
		this.availableFloorWgt = availableFloorWgt;
	}

	public Double getUsedFloorWgt()
	{
		return usedFloorWgt;
	}

	public void setUsedFloorWgt(Double usedFloorWgt)
	{
		this.usedFloorWgt = usedFloorWgt;
	}

	public Long getDef()
	{
		return def;
	}

	public void setDef(Long def)
	{
		this.def = def;
	}

}
