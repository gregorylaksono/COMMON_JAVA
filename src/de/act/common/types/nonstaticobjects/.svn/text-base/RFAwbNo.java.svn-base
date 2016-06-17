package de.act.common.types.nonstaticobjects;

import java.util.Date;

/**
 *
 * RFAwbNo.java:
 *
 * @since 13.12.2005
 * @author Martin Sachs
 *
 */

@org.jboss.cache.aop.annotation.PojoCacheable
public final class RFAwbNo implements java.io.Serializable{
	/*
    f_id varchar(21),
    ca_3dg varchar(3),
    awb_stock int2,
    awb_no*/

	private static final long serialVersionUID = 6902720680259209570L;
	private String id;
	private RFForm form;
	private de.act.common.types.staticobjects.RSCa carrier;
	private String ca_3dg;
	private Integer awb_stock =0;
	private Integer awb_no =0;
	private Date corr = null;
	private String ffw_3lc;
	private String non_standard;
	private Boolean request =  false;
	private long owner_add_id;
	
	public RFAwbNo() {

	}

	public RFAwbNo(String text, int i, int j, long owner_add_id, Boolean request) {
		ca_3dg = text;
		this.awb_stock = i;
		this.awb_no = j;
		this.request = request;
		this.owner_add_id = owner_add_id;
	}
	
	public RFAwbNo(String text, int i, int j, String non_standard) {
		ca_3dg = text;
		this.awb_stock = i;
		this.awb_no = j;
		this.non_standard = non_standard;
	}

	public RFAwbNo(String object, String ffw, int stock, int i, long owner_add_id, Boolean request) {
		this(object,stock,i, owner_add_id, request);
		this.ffw_3lc = ffw;
	}

	/*
	 * 10.01.2006
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof RFAwbNo) {
			if (id!=null && ((RFAwbNo)obj).id!=null)
				return id.equals(((RFAwbNo)obj).id);
		}
		return false;
	}
	
	/*
	 * 10.01.2006
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		int re = 17;
		if (id!=null ) {
			re += 37* this.id.hashCode();
		}
		if (re ==17) {
			return super.hashCode();
		}
		return re;
	}
	
	/*
	 * 10.01.2006
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		if (this.awb_no!=null && this.awb_stock!=null) {
			if (this.ca_3dg!=null && this.ca_3dg.length()>0) {
				return this.ca_3dg+"-"+Integer.toString(this.awb_stock)+"-"+Integer.toString(this.awb_no);
			}
			else {
				return this.ffw_3lc+"-"+Integer.toString(this.awb_stock)+"-"+Integer.toString(this.awb_no);
			}
		}
		return "no awbno";
	}

	public Integer getAwb_no() {
		return awb_no;
	}

	public void setAwb_no(Integer awb_no) {
		this.awb_no = awb_no;
	}

	public Integer getAwb_stock() {
		return awb_stock;
	}

	public void setAwb_stock(Integer awb_stock) {
		this.awb_stock = awb_stock;
	}

	public String getCa_3dg() {
		return ca_3dg;
	}

	public void setCa_3dg(String ca_3dg) {
		this.ca_3dg = ca_3dg;
	}

	public Date getCorr() {
		return corr;
	}

	public void setCorr(Date corr) {
		this.corr = corr;
	}

	public de.act.common.types.staticobjects.RSCa getCarrier() {
		return carrier;
	}

	public void setCarrier(de.act.common.types.staticobjects.RSCa carrier) {
		this.carrier = carrier;
	}

	public RFForm getForm() {
		return form;
	}

	public void setForm(RFForm form) {
		this.form = form;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFfw_3lc() {
		return ffw_3lc;
	}

	public void setFfw_3lc(String ffw_3lc) {
		this.ffw_3lc = ffw_3lc;
	}

	public String getNon_standard() {
		return non_standard;
	}

	public void setNon_standard(String non_standard) {
		this.non_standard = non_standard;
	}

	public Boolean getRequest() {
		return request;
	}

	public void setRequest(Boolean request) {
		this.request = request;
	}

	public long getOwner_add_id() {
		return owner_add_id;
	}

	public void setOwner_add_id(long owner_add_id) {
		this.owner_add_id = owner_add_id;
	}

}
