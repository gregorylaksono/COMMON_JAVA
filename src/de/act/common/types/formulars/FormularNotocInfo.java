package de.act.common.types.formulars;

import java.io.Serializable;
import java.util.Date;

import de.act.common.types.packageitems.ItemPKG;

public class FormularNotocInfo implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 544875457336084677L;
	private Long id;
	private Long pkgId;
	private String remark;
	private Date corr;
	private ItemPKG pkg;
	private String fId;
	private Long shpAddId;
	private Integer pkgRowNo;

	public String getRemark()
	{
		return remark;
	}

	public void setRemark(String remark)
	{
		this.remark = remark;
	}

	public Date getCorr()
	{
		return corr;
	}

	public void setCorr(Date corr)
	{
		this.corr = corr;
	}

	public ItemPKG getPkg()
	{
		return pkg;
	}

	public void setPkg(ItemPKG pkg)
	{
		this.pkg = pkg;
	}

	public String getfId()
	{
		return fId;
	}

	public void setfId(String fId)
	{
		this.fId = fId;
	}

	public Long getShpAddId()
	{
		return shpAddId;
	}

	public void setShpAddId(Long shpAddId)
	{
		this.shpAddId = shpAddId;
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public Long getPkgId()
	{
		return pkgId;
	}

	public void setPkgId(Long pkgId)
	{
		this.pkgId = pkgId;
	}

	public Integer getPkgRowNo()
	{
		return pkgRowNo;
	}

	public void setPkgRowNo(Integer pkgRowNo)
	{
		this.pkgRowNo = pkgRowNo;
	}
	
}
