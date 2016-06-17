package de.act.common.types.nonstaticobjects;

import java.io.Serializable;
import java.util.Date;

import de.act.common.types.staticobjects.RSAp;

public class RFRtCuc implements Serializable{

	private static final long serialVersionUID = 7519687095673909875L;
	private Long rtCucId = -1L;
	private Long custRuleId;
	private Date corr;
	private RFRt rtId;
	private Integer rtSeq;
	public RSAp	AP;
	
	public RFRtCuc(){
		corr = new Date();
	}
	
	public RFRtCuc(RFRt rtId, int seq) {
		this();
		this.rtId = rtId;
		this.rtSeq = seq;
	}
	
	public RFRtCuc(RFRt rtId, String cucCode, int seq) {
		this();
		this.rtId = rtId;
		this.rtSeq = seq;
	}
	
	public Long getRtCucId() {
		return rtCucId;
	}
	public void setRtCucId(Long rtCucId) {
		this.rtCucId = rtCucId;
	}
	public Long getCustRuleId() {
		return custRuleId;
	}
	public void setCustRuleId(Long custRuleId) {
		this.custRuleId = custRuleId;
	}

	public Date getCorr() {
		return corr;
	}
	public void setCorr(Date CORR) {
		this.corr = CORR;
	}
	public RFRt getRtId() {
		return rtId;
	}
	public void setRtId(RFRt rt_id) {
		this.rtId = rt_id;
	}

	public Integer getRtSeq() {
		return rtSeq;
	}

	public void setRtSeq(Integer rt_seq) {
		this.rtSeq = rt_seq;
	}

	public RSAp getAP() {
		return AP;
	}

	public void setAP(RSAp aP) {
		AP = aP;
	}
}
