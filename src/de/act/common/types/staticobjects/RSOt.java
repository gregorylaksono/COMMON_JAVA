package de.act.common.types.staticobjects;


/**
 * @author Henry
 */
public class RSOt implements java.io.Serializable {

	private static final long serialVersionUID = 1597095698554020287L;
	private long otId;
	private String ca2lc;
	private RSAp ap3lc;
	private Long ownerAddId;
	private RSOt2lc ot2lc;
	private RSOt1lc ot1lc;
	private Double otRate;
	private RSVad vad;
	private Long blackboxId;
	private String cur3lc;

	public RSOt() {
		
	}

	public RSOt(long otId) {
		this.otId = otId;
	}

	public RSOt(long otId, String ca2lc, RSAp ap3lc, Long ownerAddId,
			RSOt2lc ot2lc, RSOt1lc ot1lc, Double otRate, RSVad vad) {
		this.otId = otId;
		this.ca2lc = ca2lc;
		this.ap3lc = ap3lc;
		this.ownerAddId = ownerAddId;
		this.ot2lc = ot2lc;
		this.ot1lc = ot1lc;
		this.otRate = otRate;
		this.vad = vad;
	}

	public long getOtId() {
		return otId;
	}

	public void setOtId(long otId) {
		this.otId = otId;
	}

	public String getCa2lc() {
		return ca2lc;
	}

	public void setCa2lc(String ca2lc) {
		this.ca2lc = ca2lc;
	}

	public RSAp getAp3lc() {
		return ap3lc;
	}

	public void setAp3lc(RSAp ap3lc) {
		this.ap3lc = ap3lc;
	}

	public Long getOwnerAddId() {
		return ownerAddId;
	}

	public void setOwnerAddId(Long ownerAddId) {
		this.ownerAddId = ownerAddId;
	}

	public RSOt2lc getOt2lc() {
		return ot2lc;
	}

	public void setOt2lc(RSOt2lc ot2lc) {
		this.ot2lc = ot2lc;
	}

	public RSOt1lc getOt1lc() {
		return ot1lc;
	}

	public void setOt1lc(RSOt1lc ot1lc) {
		this.ot1lc = ot1lc;
	}

	public Double getOtRate() {
		return otRate;
	}

	public void setOtRate(Double otRate) {
		this.otRate = otRate;
	}

	public RSVad getVad() {
		return vad;
	}

	public void setVad(RSVad vad) {
		this.vad = vad;
	}

	public Long getBlackboxId()
	{
		return blackboxId;
	}

	public void setBlackboxId(Long blackboxId)
	{
		this.blackboxId = blackboxId;
	}

	public String getCur3lc() {
		return cur3lc;
	}

	public void setCur3lc(String cur3lc) {
		this.cur3lc = cur3lc;
	}
	
}
