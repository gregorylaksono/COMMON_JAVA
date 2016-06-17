package de.act.common.types.views;

import java.io.Serializable;
import java.util.Date;

public class RtView implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1127787876865L;
	private long rtId;
	private long attId;
	private double rtSeq;
	private Date corr;
	private String ap3Lc;
	private String co2Lc;
	private int awbStock;
	private String ca3Dg;
	private int awbNo;
	private String awbNumber;
	private String arCode;
	private long rtCount;

	public long getRtId()
	{
		return rtId;
	}

	public void setRtId(long rtId)
	{
		this.rtId = rtId;
	}

	public long getAttId()
	{
		return attId;
	}

	public void setAttId(long attId)
	{
		this.attId = attId;
	}

	public double getRtSeq()
	{
		return rtSeq;
	}

	public void setRtSeq(double rtSeq)
	{
		this.rtSeq = rtSeq;
	}

	public Date getCorr()
	{
		return corr;
	}

	public void setCorr(Date corr)
	{
		this.corr = corr;
	}

	public String getAp3Lc()
	{
		return ap3Lc;
	}

	public void setAp3Lc(String ap3Lc)
	{
		this.ap3Lc = ap3Lc;
	}

	public String getCo2Lc()
	{
		return co2Lc;
	}

	public void setCo2Lc(String co2Lc)
	{
		this.co2Lc = co2Lc;
	}

	public int getAwbStock()
	{
		return awbStock;
	}

	public void setAwbStock(int awbStock)
	{
		this.awbStock = awbStock;
	}

	public String getCa3Dg()
	{
		return ca3Dg;
	}

	public void setCa3Dg(String ca3Dg)
	{
		this.ca3Dg = ca3Dg;
	}

	public int getAwbNo()
	{
		return awbNo;
	}

	public void setAwbNo(int awbNo)
	{
		this.awbNo = awbNo;
	}

	public String getArCode()
	{
		return arCode;
	}

	public void setArCode(String arCode)
	{
		this.arCode = arCode;
	}

	public String getAwbNumber()
	{
		return awbNumber;
	}

	public void setAwbNumber(String awbNumber)
	{
		this.awbNumber = awbNumber;
	}

	public long getRtCount()
	{
		return rtCount;
	}

	public void setRtCount(long rtCount)
	{
		this.rtCount = rtCount;
	}
	
}
