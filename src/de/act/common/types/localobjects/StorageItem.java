package de.act.common.types.localobjects;

import java.io.Serializable;
import java.util.Set;

import de.act.central.types.PackageItem2;
import de.act.common.types.packageitems.ItemBKG;
import de.act.common.types.staticobjects.CCommodityTree;
import de.act.common.types.staticobjects.Commodity;
import de.act.common.types.staticobjects.RSAp;
import de.act.common.types.staticobjects.RSVad;

/**
 * StorageBkgItem.java: DBObject as bridging table between d_stor, d_loc and
 * f_bkg_item
 * 
 * 
 */
@org.jboss.cache.aop.annotation.PojoCacheable
public final class StorageItem implements Serializable
{

	private static final long serialVersionUID = 1481564080573210485L;
	private Long id;
	private Long storId;
	private Long bkgItemId;
	private Long pkgId;
	private String fId;
	private Long comId;
	private Integer pkgPcs;
	private Double pkgTotalWgt;
	private Double pkgTotalVol;
	private RSVad validation;
	private PackageItem2 pkg;
	private CCommodityTree com;
	private ItemBKG bkgItem;
	private Set<PackageItem2> pkgs;
	private Storage stor;
	private String ap3Lc;
	private RSAp airport;
	private Double vol;
	private Double wgt;
	private String vadId;
	
	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public Long getStorId()
	{
		return storId;
	}

	public void setStorId(Long storId)
	{
		this.storId = storId;
	}

	public Long getBkgItemId()
	{
		return bkgItemId;
	}

	public void setBkgItemId(Long bkgItemId)
	{
		this.bkgItemId = bkgItemId;
	}

	public Integer getPkgPcs()
	{
		return pkgPcs;
	}

	public void setPkgPcs(Integer pkgPcs)
	{
		this.pkgPcs = pkgPcs;
	}

	public RSVad getValidation()
	{
		return validation;
	}

	public void setValidation(RSVad validation)
	{
		this.validation = validation;
	}

	public PackageItem2 getPkg()
	{
		return pkg;
	}

	public void setPkg(PackageItem2 pkg)
	{
		this.pkg = pkg;
	}

	public Double getPkgTotalWgt()
	{
		return pkgTotalWgt;
	}

	public void setPkgTotalWgt(Double pkgWgt)
	{
		this.pkgTotalWgt = pkgWgt;
	}

	public Double getPkgTotalVol()
	{
		return pkgTotalVol;
	}

	public void setPkgTotalVol(Double pkgVol)
	{
		this.pkgTotalVol = pkgVol;
	}

	public Long getPkgId()
	{
		return pkgId;
	}

	public void setPkgId(Long pkgId)
	{
		this.pkgId = pkgId;
	}

	public Set<PackageItem2> getPkgs()
	{
		return pkgs;
	}

	public void setPkgs(Set<PackageItem2> pkgs)
	{
		this.pkgs = pkgs;
	}

	public ItemBKG getBkgItem()
	{
		return bkgItem;
	}

	public void setBkgItem(ItemBKG bkgItem)
	{
		this.bkgItem = bkgItem;
	}

	public Storage getStor()
	{
		return stor;
	}

	public void setStor(Storage stor)
	{
		this.stor = stor;
	}

	public String getFId() {
		return fId;
	}

	public void setFId(String id) {
		fId = id;
	}

	public Long getComId() {
		return comId;
	}

	public void setComId(Long comId) {
		this.comId = comId;
	}

	public CCommodityTree getCom() {
		return com;
	}

	public void setCom(CCommodityTree com) {
		this.com = com;
	}

	public String getAp3Lc()
	{
		return ap3Lc;
	}

	public void setAp3Lc(String ap3Lc)
	{
		this.ap3Lc = ap3Lc;
	}

	public RSAp getAirport()
	{
		return airport;
	}

	public void setAirport(RSAp airport)
	{
		this.airport = airport;
	}

	public Double getWgt()
	{
		return wgt;
	}

	public void setWgt(Double wgt)
	{
		this.wgt = wgt;
	}

	public Double getVol()
	{
		return vol;
	}

	public void setVol(Double vol)
	{
		this.vol = vol;
	}

	public String getVadId()
	{
		return vadId;
	}

	public void setVadId(String vadId)
	{
		this.vadId = vadId;
	}

}
