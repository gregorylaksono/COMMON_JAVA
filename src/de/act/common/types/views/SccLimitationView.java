package de.act.common.types.views;

import java.io.Serializable;

public class SccLimitationView implements Serializable
{
	private static final long serialVersionUID = 4182699037204271518L;
		
	private int loadVal = 0;
	private String com_name;
	private Long com_id;
	private Long ann_id;
	private String ann_name;
	
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
	public String getCom_name() {
		return com_name;
	}
	public void setCom_name(String com_name) {
		this.com_name = com_name;
	}
	public Long getCom_id() {
		return com_id;
	}
	public void setCom_id(Long com_id) {
		this.com_id = com_id;
	}
	public Long getAnn_id() {
		return ann_id;
	}
	public void setAnn_id(Long ann_id) {
		this.ann_id = ann_id;
	}
	public String getAnn_name() {
		return ann_name;
	}
	public void setAnn_name(String ann_name) {
		this.ann_name = ann_name;
	}
	
}
