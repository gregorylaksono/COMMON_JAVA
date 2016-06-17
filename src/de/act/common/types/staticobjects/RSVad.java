/**
 * @author Martin Sachs
 * @since 22.05.2006
 */
package de.act.common.types.staticobjects;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Martin Sachs
 * @since 22.05.2006
 */
@SuppressWarnings("deprecation")
@org.jboss.cache.aop.annotation.PojoCacheable
public final class RSVad implements Serializable, Cloneable {

	private static final long serialVersionUID = -6001468580516894822L;
	private String vad_id;
	private Date vad_from ;
	private Date vad_to ;
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */

	public static String createIdByDate( Date vad_from, Date vad_to ) {
		char[] hundred = new char[103];
		char[] ret1 = new char[4];
		char[] ret2 = new char[4];
		int j = 0;
		
		ret1[0] = '0';
		ret1[1] = '0';
		ret1[2] = '0';
		ret1[3] = '0';

		ret2[0] = '0';
		ret2[1] = '0';
		ret2[2] = '0';
		ret2[3] = '0';

		if( vad_from != null || vad_to != null ) {
			for( int k = 48; k < 58; k ++ ) {
				hundred[j++] = (char) (k);
			}
			for( int k = 97; k < 123; k ++ ) {
				hundred[j++] = (char) (k);
			}
			for( int k = 65; k < 91; k ++ ) {
				hundred[j++] = (char) (k);
			}
			for( int k = 32; k < 48; k ++ ) {
				hundred[j++] = (char) (k);
			}
			for( int k = 58; k < 65; k ++ ) {
				hundred[j++] = (char) (k);
			}
			for( int k = 91; k < 97; k ++ ) {
				hundred[j++] = (char) (k);
			}
			for( int k = 123; k < 127; k ++ ) {
				hundred[j++] = (char) (k);
			}

			hundred[j++] = ' ';
			hundred[j++] = '!';
			hundred[j++] = '\"';
			hundred[j++] = '\t';
			hundred[j++] = '\b';
			hundred[j++] = '\f';

			Calendar base = Calendar.getInstance();

			int hh = 0, min = 0, yy = 0, mm = 0, dd = 0;
			int ts = 0, c3 = 0, c2 = 0, c1 = 0;

			if( vad_from != null ) {

				/*vad_from.setHours(0);
				vad_from.setMinutes(0);*/
				vad_from.setSeconds(0);

				base.set( vad_from.getYear(), vad_from.getMonth(), vad_from.getDate(), vad_from.getHours(), vad_from.getMinutes(), vad_from.getSeconds() );

				hh = base.get(Calendar.HOUR_OF_DAY);
				min = base.get(Calendar.MINUTE);
				yy = base.get(Calendar.YEAR);
				mm = base.get(Calendar.MONTH);
				dd = base.get(Calendar.DAY_OF_MONTH);

				yy = yy % 100;
				ts = ((mm*32+dd)*24+hh)*60+min;
				c3 = ts % 100;
				ts = ts / 100;
				c2 = ts % 100;
				c1 = ts / 100;

				ret1[0] = hundred[yy];
				ret1[1] = hundred[c1];
				ret1[2] = hundred[c2];
				ret1[3] = hundred[c3];
			}

			if( vad_to != null ) {

				/*vad_to.setHours(0);
				vad_to.setMinutes(0);*/
				vad_to.setSeconds(0);

				base.set( vad_to.getYear(), vad_to.getMonth(), vad_to.getDate(), vad_to.getHours(), vad_to.getMinutes(), vad_to.getSeconds() );

				hh = base.get(Calendar.HOUR_OF_DAY);
				min = base.get(Calendar.MINUTE);
				yy = base.get(Calendar.YEAR);
				mm = base.get(Calendar.MONTH);
				dd = base.get(Calendar.DAY_OF_MONTH);

				yy = yy % 100;
				ts = ((mm*32+dd)*24+hh)*60+min;
				c3 = ts % 100;
				ts = ts / 100;
				c2 = ts % 100;
				c1 = ts / 100;

				ret2[0] = hundred[yy];
				ret2[1] = hundred[c1];
				ret2[2] = hundred[c2];
				ret2[3] = hundred[c3];
			}
		}

		//System.out.println( String.valueOf(j) );
		//System.out.println( String.valueOf(hundred) );
		return String.valueOf( ret1 ) + String.valueOf( ret2 );
	}

	@Override
	public boolean equals(Object obj) {
		if (this==obj)return true;
		if (obj instanceof RSVad) {
			RSVad vad = (RSVad) obj;
			return vad.vad_id.equals(vad_id);
		}
		return false;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		if (vad_id!=null) return vad_id.hashCode();
		return super.hashCode();
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		if (isValid()) {
			return "valid";
		}
		return "invalid";
	}

	public RSVad() {
		vad_id = "00000000";
		//vad_from = new Date(80,00,01);
		//vad_to = new Date(150,11,31);
	}

	public Boolean isValid() {
		Date now = new Date();
		if (vad_from!=null) {
			if (vad_from.after(now)) {
				return Boolean.FALSE;
			}
		}
		if (vad_to!=null) {
			if (vad_to.before(now)) {
				return Boolean.FALSE;
			}
		}
		return Boolean.TRUE;
	}

	public String getVad_Id() {
		return vad_id;
	}

	public void setVad_Id( String vad_id ) {
		this.vad_id = vad_id;
	}

	public Date getVad_from() {
		return vad_from;
	}

	public void setVad_from(Date vad_from) {
		this.vad_from = vad_from;
	}

	public Date getVad_to() {
		return vad_to;
	}

	public void setVad_to(Date vad_to) {
		this.vad_to = vad_to;
	}
	
	public RSVad clone() throws CloneNotSupportedException
	{
		return (RSVad)super.clone();
	}
}
