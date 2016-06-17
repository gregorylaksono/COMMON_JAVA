package de.act.common.types.views;

import java.io.Serializable;
import java.util.List;

import de.act.common.types.ASccValue;

public class SccPreferenceView implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3225858148436871142L;
	
	private long asccId = -1;
	private int asccVal = 0;
	private String caId;
	private int asccPriority = 0;
	private int sccPriority = 0;
	private String scc3lc;
	private String sccName;
	private Short preadvise = 0;
	private Short notocDangerous = 0;
	private Short notocOther = 0;
	private List<ASccValue> valueList = null;
	
	
	public long getAsccId() {
		return asccId;
	}
	public void setAsccId(long asccId) {
		this.asccId = asccId;
	}
	
	public int getAsccVal() {
		return asccVal;
	}
	public void setAsccVal(int asccVal) {
		this.asccVal = asccVal;
	}
	
	public boolean isSccEnabled()
	{
		return (asccVal == 1);
	}
	public void setSccEnabled(boolean enabled)
	{
		asccVal = enabled ? 1 : 0;
	}
	
	public String getCaId() {
		return caId;
	}
	public void setCaId(String caId) {
		this.caId = caId;
	}
	
	public int getAsccPriority() {
		return asccPriority;
	}
	public void setAsccPriority(int asccPriority) {
		this.asccPriority = asccPriority;
	}
	
	public int getSccPriority() {
		return sccPriority;
	}
	public void setSccPriority(int sccPriority) {
		this.sccPriority = sccPriority;
	}
	
	public String getScc3lc() {
		return scc3lc;
	}
	public void setScc3lc(String scc3lc) {
		this.scc3lc = scc3lc;
	}
	
	public String getSccName() {
		return sccName;
	}
	public void setSccName(String sccName) {
		this.sccName = sccName;
	}
	
	public Short getPreadvise() {
		return preadvise;
	}
	public void setPreadvise(Short preadvise) {
		this.preadvise = preadvise;
	}
	
	public Short getNotocDangerous() {
		return notocDangerous;
	}
	public void setNotocDangerous(Short notocDangerous) {
		this.notocDangerous = notocDangerous;
	}
	
	public Short getNotocOther() {
		return notocOther;
	}
	public void setNotocOther(Short notocOther) {
		this.notocOther = notocOther;
	}
	
	public List<ASccValue> getValueList() {
		return valueList;
	}
	public void setValueList(List<ASccValue> valueList) {
		this.valueList = valueList;
	}

}
