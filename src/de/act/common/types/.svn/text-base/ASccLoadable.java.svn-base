package de.act.common.types;

import java.io.Serializable;

import de.act.common.types.ruleobject.RBase;
import de.act.common.types.staticobjects.RSVad;

public class ASccLoadable implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 468017663090695936L;
	
	private long id;
	private int value = 0;
	private Long rulePid;
	private Long ruleSid;
	private AScc sccP;
	private AScc sccS;
	private RSVad vad;
	private RBase pcom;
	private RBase scom;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	public boolean isEnabled()
	{
		return (value == 1);
	}
	public void setEnabled(boolean enabled)
	{
		value = enabled ? 1 : 0;
	}
	
	public Long getRulePid() {
		return rulePid;
	}
	public void setRulePid(Long rulePid) {
		this.rulePid = rulePid;
	}
	
	public Long getRuleSid() {
		return ruleSid;
	}
	public void setRuleSid(Long ruleSid) {
		this.ruleSid = ruleSid;
	}
	
	public AScc getSccP() {
		return sccP;
	}
	public void setSccP(AScc sccP) {
		this.sccP = sccP;
	}
	
	public AScc getSccS() {
		return sccS;
	}
	public void setSccS(AScc sccS) {
		this.sccS = sccS;
	}
	
	public RSVad getVad() {
		return vad;
	}
	public void setVad(RSVad vad) {
		this.vad = vad;
	}
	
	public RBase getPcom() {
		return pcom;
	}
	public void setPcom(RBase pcom) {
		this.pcom = pcom;
	}
	
	public RBase getScom() {
		return scom;
	}
	public void setScom(RBase scom) {
		this.scom = scom;
	}

}
