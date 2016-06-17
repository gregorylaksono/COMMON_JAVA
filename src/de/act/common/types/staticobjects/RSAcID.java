package de.act.common.types.staticobjects;

import java.io.Serializable;

/**
 * @author Henry
 *
 */
public class RSAcID implements Serializable{

	private static final long serialVersionUID = -4496423216167282157L;
	private Long ac_id;

	public Long getAc_id() {
		return ac_id;
	}

	public void setAc_id(Long ac_id) {
		this.ac_id = ac_id;
	}
}
