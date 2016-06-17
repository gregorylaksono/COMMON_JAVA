/**
 * 
 */
package de.act.common.types.staticobjects;

import java.io.Serializable;
import java.util.List;

/**
 * @author Henry
 *
 */
public class RSUldTypeStock implements Serializable{

	private static final long serialVersionUID = -2583382622066977355L;
	private Integer uld_type_id;
	private RSAp airport;
	private Integer min_stock;
	private List<String> uld_prefix;
	
	public Integer getUld_type_id() {
		return uld_type_id;
	}

	public void setUld_type_id(Integer uld_type_id) {
		this.uld_type_id = uld_type_id;
	}

	public RSAp getAirport() {
		return airport;
	}
	
	public void setAirport(RSAp airport) {
		this.airport = airport;
	}
	
	public Integer getMin_stock() {
		return min_stock;
	}
	
	public void setMin_stock(Integer min_stock) {
		this.min_stock = min_stock;
	}

	public List<String> getUld_prefix() {
		return uld_prefix;
	}

	public void setUld_prefix(List<String> uld_prefix) {
		this.uld_prefix = uld_prefix;
	}
}
