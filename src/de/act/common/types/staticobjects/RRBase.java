package de.act.common.types.staticobjects;

public class RRBase {
	
	private Long r_id;
	private Long r_parent;
	private String r_type;
	private RSVad vad;
	public Long getR_id() {
		return r_id;
	}
	public void setR_id(Long r_id) {
		this.r_id = r_id;
	}
	public Long getR_parent() {
		return r_parent;
	}
	public void setR_parent(Long r_parent) {
		this.r_parent = r_parent;
	}
	public String getR_type() {
		return r_type;
	}
	public void setR_type(String r_type) {
		this.r_type = r_type;
	}
	public RSVad getVad() {
		return vad;
	}
	public void setVad(RSVad vad) {
		this.vad = vad;
	}

}
