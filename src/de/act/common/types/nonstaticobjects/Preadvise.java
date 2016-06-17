package de.act.common.types.nonstaticobjects;

import java.io.Serializable;

public class Preadvise implements Serializable{

	private static final long serialVersionUID = 2741900783224086799L;
	private Integer a_preadvise_id;
	private String f_id;
	private Integer acceptance;
	
	public Integer getAcceptance() {
		return acceptance;
	}
	public void setAcceptance(Integer acceptance) {
		this.acceptance = acceptance;
	}
	public void setA_preadvise_id(Integer a_preadvise_id) {
		this.a_preadvise_id = a_preadvise_id;
	}
	public Integer getA_preadvise_id() {
		return a_preadvise_id;
	}
	public void setF_id(String f_id) {
		this.f_id = f_id;
	}
	public String getF_id() {
		return f_id;
	}
	
}
