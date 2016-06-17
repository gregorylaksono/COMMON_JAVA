/**
 * @author Martin Sachs
 * @since 08.05.2006
 */
package de.act.common.types.formulars;

import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * @author Martin Sachs
 * @since 08.05.2006
 */
@org.jboss.cache.aop.annotation.PojoCacheable
public final class FormularError implements java.io.Serializable{

	private static final long serialVersionUID = 2736610164411673767L;
	private final Integer id ;
	private final String error ;
	private final Integer prio ;
	private final String fieldname ;
	private final FormularType formular;

	public FormularError(final Integer id, String error, Integer prio, String fieldname, FormularType formular) {
		super();
		this.id = id;
		this.error = error;
		this.prio = prio;
		this.fieldname = fieldname;
		this.formular = formular;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj==this) return true;
		if (obj instanceof FormularError) {
			FormularError f = (FormularError) obj;
			return f.error.equals(this.error) && f.fieldname.equals(this.fieldname) && f.formular.equals(this.formular);
		}
		return false;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(this.error).append(this.fieldname).append(this.formular).append(this.prio).append(this.id).toHashCode();
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String buf = "";
		//if (this.prio!=null)        buf += this.prio +" ";
		//if (this.formular!=null)    buf += this.formular +" ";
		if (this.fieldname!=null) buf += this.fieldname +" ";
		if (this.error!=null) buf += "'"+this.error +"'";
		return buf ;
	}
}
