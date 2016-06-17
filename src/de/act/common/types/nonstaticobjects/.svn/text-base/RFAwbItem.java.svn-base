package de.act.common.types.nonstaticobjects;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import de.act.common.types.staticobjects.RSUnit;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class RFAwbItem implements Serializable{

	private static final long serialVersionUID = -2445518072162240092L;
	public Integer	awb_item_id;
	public String	F_ID		= null;
	public Integer	AWB_ROW		= -1;
	public Date		CORR		= null;
	public Integer	SLI_ROW		= null;
	public Integer	PCS			= null;
	public Integer	WGT			= null;
	public RSUnit	WGT_UNIT	= null;
	public String	SERVICE_CODE= null;
	public String	RATE_ID		= null;
	public String	CLASS_ID	= null;
	public Integer	CHRGBL_WGT	= null;
	public Integer	TOTAL		= null;
	public String	COM_ID		= null;
	public List<RFAwbCom> fawbComs =new ArrayList<RFAwbCom>();

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof RFAwbItem)
			return hashCode()==obj.hashCode();
		else return false;
	}

	@Override
	public int hashCode() {
		if (awb_item_id!=null)
			return awb_item_id.hashCode();
		else
			return super.hashCode();
	}

	/*
    awb_item_id	-5	bigserial
    f_id	12	varchar
    awb_row	4	int4
    corr	93	timestamp
    link_row	4	int4
    sli_row	4	int4
    pcs	4	int4
    wgt	2	numeric
    wgt_unit	12	varchar
    service_code	1111	cn_srvc_code
    rate_id	12	varchar
    class_id	12	varchar
    chrgbl_wgt	2	numeric
    total	2	numeric
	 */
}
