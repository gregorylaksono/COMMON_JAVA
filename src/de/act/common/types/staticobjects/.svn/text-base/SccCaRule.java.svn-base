package de.act.common.types.staticobjects;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class SccCaRule implements java.io.Serializable
{
	private static final long serialVersionUID = -1877729531227577651L;
	private Integer sccCaRuleId;
	private Long comId;
	private String comName;
	private Long annId;
	private int value = 0;
	private RSVad vad;
	
	public Integer getSccCaRuleId() {
		return sccCaRuleId;
	}
	public void setSccCaRuleId(Integer sccCaRuleId) {
		this.sccCaRuleId = sccCaRuleId;
	}
	public Long getComId() {
		return comId;
	}
	public void setComId(Long comId) {
		this.comId = comId;
	}
	public String getComName() {
		return comName;
	}
	public void setComName(String comName) {
		this.comName = comName;
	}
	public Long getAnnId() {
		return annId;
	}
	public void setAnnId(Long annId) {
		this.annId = annId;
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
	public RSVad getVad() {
		return vad;
	}
	public void setVad(RSVad vad) {
		this.vad = vad;
	}
	
}
