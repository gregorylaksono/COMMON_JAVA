package de.act.common.types;


public class AAwbStock implements java.io.Serializable{

	private static final long serialVersionUID = 5473763949464808972L;
	private String caid;
	private String awbStart;
	private String awbNext;
	private String awbEnd;
	
	public String getCaid() {
		return caid;
	}
	public void setCaid(String caid) {
		this.caid = caid;
	}
	public String getAwbStart() {
		return awbStart;
	}
	public void setAwbStart(String awbStart) {
		this.awbStart = awbStart;
	}
	public String getAwbNext() {
		return awbNext;
	}
	public void setAwbNext(String awbNext) {
		this.awbNext = awbNext;
	}
	public String getAwbEnd() {
		return awbEnd;
	}
	public void setAwbEnd(String awbEnd) {
		this.awbEnd = awbEnd;
	}
}
