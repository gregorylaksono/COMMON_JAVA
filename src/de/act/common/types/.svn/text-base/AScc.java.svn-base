package de.act.common.types;

import java.io.Serializable;
import java.util.List;

import de.act.common.types.staticobjects.RSScc;
import de.act.common.types.staticobjects.RSVad;

public class AScc implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1249614017970951850L;
	
	private long id = -1;
	private long oldId;
	private int value;
	private int priority;
	private String caId;
	private RSScc scc;
	private RSVad vad;
	private List<ASccValue> valueList;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public long getOldId() {
		return oldId;
	}
	public void setOldId(long oldId) {
		this.oldId = oldId;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	public boolean isEnabled()
	{
		return (value == 1);
	}
	public void setEnabled(boolean enabled)
	{
		value = enabled ? 1 : 0;
	}
	
	public String getCaId() {
		return caId;
	}
	public void setCaId(String caId) {
		this.caId = caId;
	}
	
	public RSScc getScc() {
		return scc;
	}
	public void setScc(RSScc scc) {
		this.scc = scc;
	}
	
	public RSVad getVad() {
		return vad;
	}
	public void setVad(RSVad vad) {
		this.vad = vad;
	}
	
	public List<ASccValue> getValueList() {
		return valueList;
	}
	public void setValueList(List<ASccValue> valueList) {
		this.valueList = valueList;
	}
	
}
