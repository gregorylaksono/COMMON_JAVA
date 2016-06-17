package de.act.common.types.staticobjects;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class RSCourierVehicle implements java.io.Serializable {
	
	private static final long serialVersionUID = 9018606823761294067L;
	private Long id;
	private Long acId;
	private Integer addId;
	private RSVad vad;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getAcId() {
		return acId;
	}
	public void setAcId(Long acId) {
		this.acId = acId;
	}
	public Integer getAddId() {
		return addId;
	}
	public void setAddId(Integer addId) {
		this.addId = addId;
	}
	public RSVad getVad() {
		return vad;
	}
	public void setVad(RSVad vad) {
		this.vad = vad;
	}
	
}
