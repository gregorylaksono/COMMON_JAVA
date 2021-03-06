package de.act.common.types.staticobjects;

import java.io.Serializable;

@org.jboss.cache.aop.annotation.PojoCacheable
public class RCAddAdd implements Serializable {
	private static final long serialVersionUID = 4052167353558866571L;
	private Integer add_add_id;
	private Integer add_id;
	private String add_add_value;
	private String add_add_type;
	private Integer add_add_order;
	private RCAdd add;
	
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

	public RCAdd getAdd() {
		return add;
	}

	public void setAdd(RCAdd add) {
		this.add = add;
	}
	
}
