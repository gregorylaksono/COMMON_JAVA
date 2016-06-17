/**
 * 
 */
package de.act.common.types.staticobjects;

import java.io.Serializable;

/**
 * @author Henry
 *
 */
public class RSUldLocStock implements Serializable{
	
	private static final long serialVersionUID = -3875194891800908465L;
	private String ap_3lc;
	private Integer min_stock;
	
	public String getAp_3lc() {
		return ap_3lc;
	}

	public void setAp_3lc(String ap_3lc) {
		this.ap_3lc = ap_3lc;
	}

	public Integer getMin_stock() {
		return min_stock;
	}

	public void setMin_stock(Integer min_stock) {
		this.min_stock = min_stock;
	}

}
