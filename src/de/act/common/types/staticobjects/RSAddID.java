/**
 * 
 */
package de.act.common.types.staticobjects;

import java.io.Serializable;

/**
 * @author Henry
 *
 */
public class RSAddID implements Serializable{

	private static final long serialVersionUID = -2192825066995577575L;
	private Integer add_id;

	public Integer getAdd_id() {
		return add_id;
	}

	public void setAdd_id(Integer add_id) {
		this.add_id = add_id;
	}
}
