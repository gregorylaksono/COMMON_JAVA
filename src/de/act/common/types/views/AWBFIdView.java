/**
 * 
 */
package de.act.common.types.views;

import java.io.Serializable;

/**
 * @author Henry
 *
 */
public class AWBFIdView implements Serializable{

	private static final long serialVersionUID = 5516804547939436487L;
	private String ca_3dg;
	private Integer awb_stock;
	private Integer awb_no;
	private String f_id;
	
	public String getCa_3dg() {
		return ca_3dg;
	}
	
	public void setCa_3dg(String ca_3dg) {
		this.ca_3dg = ca_3dg;
	}
	
	public Integer getAwb_stock() {
		return awb_stock;
	}
	
	public void setAwb_stock(Integer awb_stock) {
		this.awb_stock = awb_stock;
	}
	
	public Integer getAwb_no() {
		return awb_no;
	}
	
	public void setAwb_no(Integer awb_no) {
		this.awb_no = awb_no;
	}
	
	public String getF_id() {
		return f_id;
	}
	
	public void setF_id(String f_id) {
		this.f_id = f_id;
	}
}
