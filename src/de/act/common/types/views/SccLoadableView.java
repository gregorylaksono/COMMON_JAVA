package de.act.common.types.views;

import java.io.Serializable;

public class SccLoadableView implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4182699037204271518L;
	
	// note for s_ann ann_dsp
	// 'l' -> ann_name + com_name
	// 'r' -> com_name _ ann_name
	// 'n' -> com_name
	
	private long sccLoadId;
	private int loadVal = 0;
	private long primaryId;
	private long secondaryId;
	private String primaryScc3lc;
	private String scc3lc;
	private long rulePid;
	private long ruleSid;
	private int pcomBool;
	private long pcomId;
	private long pannId;
	private String pcomName;
	private String pannName;
	private String pannDscp;
	private int scomBool;
	private long scomId;
	private long sannId;
	private String scomName;
	private String sannName;
	private String sannDscp;
	
	
	public long getSccLoadId() {
		return sccLoadId;
	}
	public void setSccLoadId(long sccLoadId) {
		this.sccLoadId = sccLoadId;
	}
	
	public int getLoadVal() {
		return loadVal;
	}
	public void setLoadVal(int loadVal) {
		this.loadVal = loadVal;
	}
	
	public boolean isLoadable()
	{
		return (loadVal == 1);
	}
	
	public long getPrimaryId() {
		return primaryId;
	}
	public void setPrimaryId(long primaryId) {
		this.primaryId = primaryId;
	}
	
	public long getSecondaryId() {
		return secondaryId;
	}
	public void setSecondaryId(long secondaryId) {
		this.secondaryId = secondaryId;
	}
	
	public String getPrimaryScc3lc() {
		return primaryScc3lc;
	}
	public void setPrimaryScc3lc(String primaryScc3lc) {
		this.primaryScc3lc = primaryScc3lc;
	}
	
	public String getScc3lc() {
		return scc3lc;
	}
	public void setScc3lc(String scc3lc) {
		this.scc3lc = scc3lc;
	}
	
	public long getRulePid() {
		return rulePid;
	}
	public void setRulePid(long rulePid) {
		this.rulePid = rulePid;
	}
	
	public long getRuleSid() {
		return ruleSid;
	}
	public void setRuleSid(long ruleSid) {
		this.ruleSid = ruleSid;
	}
	
	public int getPcomBool() {
		return pcomBool;
	}
	public void setPcomBool(int pcomBool) {
		this.pcomBool = pcomBool;
	}
	
	public long getPcomId() {
		return pcomId;
	}
	public void setPcomId(long pcomId) {
		this.pcomId = pcomId;
	}
	
	public long getPannId() {
		return pannId;
	}
	public void setPannId(long pannId) {
		this.pannId = pannId;
	}
	
	public String getPcomName() {
		return pcomName;
	}
	public void setPcomName(String pcomName) {
		this.pcomName = pcomName;
	}
	
	public String getPannName() {
		return pannName;
	}
	public void setPannName(String pannName) {
		this.pannName = pannName;
	}
	
	public int getScomBool() {
		return scomBool;
	}
	public void setScomBool(int scomBool) {
		this.scomBool = scomBool;
	}
	
	public long getScomId() {
		return scomId;
	}
	public void setScomId(long scomId) {
		this.scomId = scomId;
	}
	
	public long getSannId() {
		return sannId;
	}
	public void setSannId(long sannId) {
		this.sannId = sannId;
	}
	
	public String getScomName() {
		return scomName;
	}
	public void setScomName(String scomName) {
		this.scomName = scomName;
	}
	
	public String getSannName() {
		return sannName;
	}
	public void setSannName(String sannName) {
		this.sannName = sannName;
	}
	
	public void setPannDscp(int pann)
	{
		String dscp = "n";
		if(pann == 1)
			dscp = "l";
		else if(pann == 2)
			dscp = "r";

		this.pannDscp = dscp;
	}
	
	public void setSannDscp(int sann)
	{
		String dscp = "n";
		if(sann == 1)
			dscp = "l";
		else if(sann == 2)
			dscp = "r";
		
		this.sannDscp = dscp;
	}
	
	public String getPFullDescription()
	{
		StringBuilder builder = new StringBuilder();
		if("l".equals(pannDscp))
		{
			if(pannName!=null)
				builder.append(pannName).append(" ");
			if(pcomName!=null)
				builder.append(pcomName);
		}
		else if("r".equals(pannDscp))
		{
			if(pcomName!=null)
				builder.append(pcomName).append(" ");
			if(pannName!=null)
				builder.append(pannName);
		}
		else
		{
			if(pcomName!=null)
				builder.append(pcomName);
		}
		return builder.toString();
	}
	
	public String getSFullDescription()
	{
		StringBuilder builder = new StringBuilder();
		if("l".equals(sannDscp))
		{
			if(sannName!=null)
				builder.append(sannName).append(" ");
			if(scomName!=null)
				builder.append(scomName);
		}
		else if("r".equals(sannDscp))
		{
			if(scomName!=null)
				builder.append(scomName).append(" ");
			if(sannName!=null)
				builder.append(sannName);
		}
		else
		{
			if(scomName!=null)
				builder.append(scomName);
		}
		return builder.toString();
	}
	
}
