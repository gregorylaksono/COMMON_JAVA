package de.act.common.types.formulars;

import java.io.Serializable;
import java.util.Date;

public class FormularCOOItem implements Serializable
{
	private long cooItemId;
//	private long attId;
//	private int cooRow;
	private int linkRow;
	private int pcs;
	private String itemNo;
	private double grossWeight;
	private double netWeight;
	private double tareWeight;
	private long uldId;
	private Date corr;
	private int mot;
	private String motRemark;
	private String cooRemark;
	private String coOrig;

//	public long getAttId()
//	{
//		return attId;
//	}
//
//	public void setAttId(long attId)
//	{
//		this.attId = attId;
//	}
//
//	public int getCooRow()
//	{
//		return cooRow;
//	}
//
//	public void setCooRow(int cooRow)
//	{
//		this.cooRow = cooRow;
//	}

	public int getLinkRow()
	{
		return linkRow;
	}

	public void setLinkRow(int linkRow)
	{
		this.linkRow = linkRow;
	}

	public int getPcs()
	{
		return pcs;
	}

	public void setPcs(int pcs)
	{
		this.pcs = pcs;
	}

	public String getItemNo()
	{
		return itemNo;
	}

	public void setItemNo(String itemNo)
	{
		this.itemNo = itemNo;
	}

	public double getGrossWeight()
	{
		return grossWeight;
	}

	public void setGrossWeight(double grossWeight)
	{
		this.grossWeight = grossWeight;
	}

	public double getNetWeight()
	{
		return netWeight;
	}

	public void setNetWeight(double netWeight)
	{
		this.netWeight = netWeight;
	}

	public double getTareWeight()
	{
		return tareWeight;
	}

	public void setTareWeight(double tareWeight)
	{
		this.tareWeight = tareWeight;
	}

	public long getUldId()
	{
		return uldId;
	}

	public void setUldId(long uldId)
	{
		this.uldId = uldId;
	}

	public Date getCorr()
	{
		return corr;
	}

	public void setCorr(Date corr)
	{
		this.corr = corr;
	}

	public long getCooItemId()
	{
		return cooItemId;
	}

	public void setCooItemId(long cooItemId)
	{
		this.cooItemId = cooItemId;
	}

	public int getMot()
	{
		return mot;
	}

	public void setMot(int mot)
	{
		this.mot = mot;
	}

	public String getMotRemark()
	{
		return motRemark;
	}

	public void setMotRemark(String motRemark)
	{
		this.motRemark = motRemark;
	}

	public String getCoOrig()
	{
		return coOrig;
	}

	public void setCoOrig(String coOrig)
	{
		this.coOrig = coOrig;
	}

	public String getCooRemark()
	{
		return cooRemark;
	}

	public void setCooRemark(String cooRemark)
	{
		this.cooRemark = cooRemark;
	}

}
