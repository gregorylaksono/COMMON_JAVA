/*
 * Created on 02.09.2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package de.act.common.types.nonstaticobjects;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import de.act.common.types.staticobjects.RSCcd;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class RFAwb implements java.io.Serializable{

	/**
	 * @author Martin Sachs
	 * @since 27.01.2006
	 */
	private static final long serialVersionUID = 2607720625291783062L;
	public String			F_ID			= null;
	public Integer			CUR_RATE		= null;
	public Integer			INSU_RATE		= null;
	public RSCcd			CCD_ID			= null;
	public Integer			WGT_CHRG		= null;
	public Integer			VAL_CHRG		= null;
	public Integer			TAX				= null;
	public Integer			CUR_CONV_RATE	= null;
	public Date				AWB_DATE		= null;
	public String			AWB_PLACE		= null;
	public Date				CORR			= null;
	public List<RFAwbItem> 	fawbItems 		= new ArrayList<RFAwbItem>();

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof RFAwb)
			return hashCode()==obj.hashCode();
		else return false;
	}
	
	@Override
	public int hashCode() {
		if (F_ID!=null)
			return (F_ID+CORR.toString()).hashCode();
		else
			return super.hashCode();
	}
}
