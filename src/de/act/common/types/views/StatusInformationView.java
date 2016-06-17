/**
 * 
 */
package de.act.common.types.views;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import de.act.common.types.staticobjects.RSAp;
import de.act.common.types.staticobjects.RSState;

/**
 * @author Henry
 *
 */
public class StatusInformationView implements Serializable{

	private static final long serialVersionUID = -8707588666211993408L;
	private String f_id;
	private String ca_3dg;
	private Integer awb_stock;
	private Integer awb_no;
	private RSState awb_shipment_stat_id;
	private Timestamp awb_shipment_stat_corr;
	private RSAp ap_3lc;
	private RSState manifest_stat_id;
	private Timestamp manifest_stat_corr;
	private String bkg_status;
	private Timestamp flight_corr;
	private RSState awb_print_stat_id;
	private Timestamp awb_print_stat_corr;
	private Long stor_id;
	private String stor_name;
	private Date stor_date;

	public String getF_id() {
		return f_id;
	}

	public void setF_id(String f_id) {
		this.f_id = f_id;
	}

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

	public RSState getAwb_shipment_stat_id() {
		return awb_shipment_stat_id;
	}

	public void setAwb_shipment_stat_id(RSState awb_shipment_stat_id) {
		this.awb_shipment_stat_id = awb_shipment_stat_id;
	}

	public Timestamp getAwb_shipment_stat_corr() {
		return awb_shipment_stat_corr;
	}

	public void setAwb_shipment_stat_corr(Timestamp awb_shipment_stat_corr) {
		this.awb_shipment_stat_corr = awb_shipment_stat_corr;
	}

	public RSAp getAp_3lc() {
		return ap_3lc;
	}

	public void setAp_3lc(RSAp ap_3lc) {
		this.ap_3lc = ap_3lc;
	}

	public RSState getManifest_stat_id() {
		return manifest_stat_id;
	}

	public void setManifest_stat_id(RSState manifest_stat_id) {
		this.manifest_stat_id = manifest_stat_id;
	}

	public Timestamp getManifest_stat_corr() {
		return manifest_stat_corr;
	}

	public void setManifest_stat_corr(Timestamp manifest_stat_corr) {
		this.manifest_stat_corr = manifest_stat_corr;
	}

	public String getBkg_status() {
		return bkg_status;
	}

	public void setBkg_status(String bkg_status) {
		this.bkg_status = bkg_status;
	}

	public Timestamp getFlight_corr() {
		return flight_corr;
	}

	public void setFlight_corr(Timestamp flight_corr) {
		this.flight_corr = flight_corr;
	}

	public RSState getAwb_print_stat_id() {
		return awb_print_stat_id;
	}

	public void setAwb_print_stat_id(RSState awb_print_stat_id) {
		this.awb_print_stat_id = awb_print_stat_id;
	}

	public Timestamp getAwb_print_stat_corr() {
		return awb_print_stat_corr;
	}

	public void setAwb_print_stat_corr(Timestamp awb_print_stat_corr) {
		this.awb_print_stat_corr = awb_print_stat_corr;
	}

	public Long getStor_id()
	{
		return stor_id;
	}

	public void setStor_id(Long stor_id)
	{
		this.stor_id = stor_id;
	}

	public String getStor_name()
	{
		return stor_name;
	}

	public void setStor_name(String stor_name)
	{
		this.stor_name = stor_name;
	}

	public Date getStor_date()
	{
		return stor_date;
	}

	public void setStor_date(Date stor_date)
	{
		this.stor_date = stor_date;
	}
	
}
