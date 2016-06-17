package de.act.common.types.nonstaticobjects;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * FlightDate is the Date of the beginn of the Flight. Customizing the To String
 * Methode to return the Date in the Format: ddMMM ,
 * @since 28.10.2005
 * @author Martin Sachs
 *
 */
@org.jboss.cache.aop.annotation.PojoCacheable
public final class FlightDate implements Serializable{

	private static final long serialVersionUID = -6657202372799374945L;
	public Long bkg_id;
	public String f_id;
	private Date date = null;

	public FlightDate() {
		date = new Date();
	}
	public FlightDate(Date d) {
		this.date= d;
	}

	public String toString() {
		if (date ==null) return "";

		SimpleDateFormat sf = new SimpleDateFormat("ddMMM");
		return sf.format(date);
	}

	public Date getDate() {
		// TODO Auto-generated method stub
		return date;
	}

	public void setDate(Date date2) {
		date = date2;
	}

	/*
	 * 10.01.2006
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof FlightDate) {
			return hashCode() == obj.hashCode();
		}
		else
			return false;
	}

	/*
	 * 10.01.2006
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		if(date!=null)
			return date.hashCode();
		else
			return super.hashCode();
	}
}
