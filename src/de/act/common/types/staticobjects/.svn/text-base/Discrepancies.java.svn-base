/**
 * @file Discrepancies.java
 * @package de.act.batch.data.forms.warehouse
 * @since 06.12.2005 16:57:09
 * @author Martin Sachs
 */
package de.act.common.types.staticobjects;
import java.io.Serializable;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class Discrepancies implements Serializable {

	private static final long serialVersionUID = -4445750535961677826L;
	transient private static final int basehashcode = Discrepancies.class.getName().hashCode() * 2 + 1;
	private Long discr_id;
	private String discr_4lc;
	private String discr_name;
	private String used_by; // cn_form_type;
	private String process_used;
	private String vad_id;
	private RSVad vad;
	private Integer hashcode = 0;
	private Integer opposite_discr_id;
	private Integer condition_flag;

	@Override
	public String toString() {
		return this.discr_4lc;
	}

	/*
	 * 10.01.2006
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object obj) {
		if (obj == this) { return true; }
		if (obj instanceof Discrepancies) {
			if (this.discr_id != null && ((Discrepancies) obj).discr_id != null) { return this.discr_id.equals(((Discrepancies) obj).discr_id); }
		}
		return false;
	}

	/**
	 * 10.01.2006
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		if (this.discr_id != null && this.hashcode == null) {
			this.hashcode = this.discr_id.hashCode() * 17 + Discrepancies.basehashcode;
			return this.hashcode;
		}
		else {
			return this.hashcode;
		}
	}

	public String getDiscr_4lc() {
		return this.discr_4lc;
	}

	public void setDiscr_4lc(final String discr_4lc) {
		this.discr_4lc = discr_4lc;
	}

	public Long getDiscr_id() {
		return this.discr_id;
	}

	public void setDiscr_id(final Long discr_id) {
		this.discr_id = discr_id;
	}

	public String getDiscr_name() {
		return this.discr_name;
	}

	public void setDiscr_name(final String discr_name) {
		this.discr_name = discr_name;
	}

	public String getUsed_by() {
		return this.used_by;
	}

	public void setUsed_by(final String used_by) {
		this.used_by = used_by;
	}

	public String getVad_id() {
		return this.vad_id;
	}

	public void setVad_id(final String vad_id) {
		this.vad_id = vad_id;
	}

	public RSVad getVad() {
		return vad;
	}

	public void setVad(RSVad vad) {
		this.vad = vad;
	}

	public String getProcess_used()
	{
		return process_used;
	}

	public void setProcess_used(String process_used)
	{
		this.process_used = process_used;
	}

	public Integer getOpposite_discr_id()
	{
		return opposite_discr_id;
	}

	public void setOpposite_discr_id(Integer opposite_discr_id)
	{
		this.opposite_discr_id = opposite_discr_id;
	}

	public Integer getCondition_flag()
	{
		return condition_flag;
	}

	public void setCondition_flag(Integer condition_flag)
	{
		this.condition_flag = condition_flag;
	}
	
	
}
