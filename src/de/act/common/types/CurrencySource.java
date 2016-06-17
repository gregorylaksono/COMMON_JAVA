package de.act.common.types;

import java.io.Serializable;

import de.act.common.types.staticobjects.RSCur;

public class CurrencySource implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1318161793274745295L;
	
	public static final String SOURCE_EWIRE = "ewire";
	public static final String SOURCE_YAHOO = "yahoo";
	public static final String SOURCE_OPEN_EXCHANGE = "open";
	
	private Integer owner_add_id;
	private Integer add_id;
	private RSCur cur_3lc;
	private String cur_source;
	
	public Integer getOwner_add_id() {
		return owner_add_id;
	}
	public void setOwner_add_id(Integer owner_add_id) {
		this.owner_add_id = owner_add_id;
	}
	
	public Integer getAdd_id() {
		return add_id;
	}
	public void setAdd_id(Integer add_id) {
		this.add_id = add_id;
	}
	
	public RSCur getCur_3lc() {
		return cur_3lc;
	}
	public void setCur_3lc(RSCur cur_3lc) {
		this.cur_3lc = cur_3lc;
	}
	
	public String getCur_source() {
		return cur_source;
	}
	public void setCur_source(String cur_source) {
		this.cur_source = cur_source;
	}

}
