/**
 * 
 */
package de.act.common.types;

import java.io.Serializable;

/**
 * @author Henry
 *
 */
public class Right implements Serializable{

	private static final long serialVersionUID = 6057281990751093262L;
	private Integer right_id;
	private String right_name;

	public Integer getRight_id() {
		return right_id;
	}

	public void setRight_id(Integer right_id) {
		this.right_id = right_id;
	}

	public String getRight_name() {
		return right_name;
	}

	public void setRight_name(String right_name) {
		this.right_name = right_name;
	}
}
