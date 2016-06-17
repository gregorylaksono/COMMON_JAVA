package de.act.common.types.staticobjects;

import java.io.Serializable;

public class RSCoAr  implements Serializable{
	
	private static final long serialVersionUID = 1136383690375352108L;
	private Long co_ar_id;
	private String co_2lc;
	private RSAr ar;
	private String vad_id;
	
	//co_ar_id
	public Long getCo_ar_id() {
		return co_ar_id;
	}
	public void setCo_ar_id(Long co_ar_id) {
		this.co_ar_id = co_ar_id;
	}
	
	//co_2lc
	public String getCo_2lc() {
		return co_2lc;
	}
	public void setCo_2lc(String co_2lc) {
		this.co_2lc = co_2lc;
	}
	
	//ar
	public RSAr getAr() {
		return ar;
	}
	public void setAr(RSAr ar) {
		this.ar = ar;
	}
	//vad_id
	public String getVad_id() {
		return vad_id;
	}
	public void setVad_id(String vad_id) {
		this.vad_id = vad_id;
	}
	
	
}
