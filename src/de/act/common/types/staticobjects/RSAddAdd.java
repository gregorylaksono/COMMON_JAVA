/**
 * 
 */
package de.act.common.types.staticobjects;

import java.io.Serializable;

/**
 * @author Henry
 *
 */
public class RSAddAdd implements Serializable{

	private static final long serialVersionUID = -4481608216926251699L;
	private Integer add_add_id;
	//private RSAdd add_id;
	private Integer add_id;
	private String add_add_value;
	private String add_add_type;
	private Integer add_add_order;
	private RSVad vad;
	
	public static final String COUNTRY = "co";
	public static final String DISTRICT = "di";
	public static final String CITY = "c";
	public static final String ZIP = "z";
	public static final String STREET = "s";
	public static final String LANGTITUDE = "lo";
	public static final String LATITUDE = "la";

	public Integer getAdd_add_id() {
		return add_add_id;
	}

	public void setAdd_add_id(Integer add_add_id) {
		this.add_add_id = add_add_id;
	}

	public Integer getAdd_id() {
		return add_id;
	}

	public void setAdd_id(Integer add_id) {
		this.add_id = add_id;
	}

	public String getAdd_add_value() {
		return add_add_value;
	}

	public void setAdd_add_value(String add_add_value) {
		this.add_add_value = add_add_value;
	}

	public String getAdd_add_type() {
		return add_add_type;
	}

	public void setAdd_add_type(String add_add_type) {
		this.add_add_type = add_add_type;
	}

	public Integer getAdd_add_order() {
		return add_add_order;
	}

	public void setAdd_add_order(Integer add_add_order) {
		this.add_add_order = add_add_order;
	}

	public RSVad getVad() {
		return vad;
	}

	public void setVad(RSVad vad) {
		this.vad = vad;
	}
}
