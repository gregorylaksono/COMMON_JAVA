/**
 * 
 */
package de.act.common.types;

import java.io.Serializable;

/**
 * @author Henry
 *
 */
public class FormRight implements Serializable{

	private static final long serialVersionUID = -502657283953711052L;
	private String auth_name;
	private Integer right_id;
	
	public FormRight(){
		
	}
	
	public FormRight(String auth_name, Integer right_id){
		this.auth_name = auth_name;
		this.right_id = right_id;
	}

	public String getAuth_name() {
		return auth_name;
	}

	public void setAuth_name(String auth_name) {
		this.auth_name = auth_name;
	}

	public Integer getRight_id() {
		return right_id;
	}

	public void setRight_id(Integer right_id) {
		this.right_id = right_id;
	}
}