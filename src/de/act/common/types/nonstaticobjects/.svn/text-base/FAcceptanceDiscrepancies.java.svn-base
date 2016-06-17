package de.act.common.types.nonstaticobjects;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import de.act.common.types.handling.FAcceptanceHeader;
import de.act.common.types.packageitems.ItemBKG;
import de.act.common.types.staticobjects.Discrepancies;
import de.act.common.types.staticobjects.RSAp;

/**
 * 
 * @author Henry
 *
 */
@org.jboss.cache.aop.annotation.PojoCacheable
public final class FAcceptanceDiscrepancies implements Serializable{

	private static final long serialVersionUID = 65075670667610739L;
	private Long acc_discr_id;
	private FAcceptanceHeader accHeader;
	private RSAp airport;
	private Integer part;
	private Discrepancies discrepancies;
	private String discr_form;
	private String discr_rem;
	private String partshipment;

	public Long getAcc_discr_id() {
		return acc_discr_id;
	}

	public void setAcc_discr_id(Long acc_discr_id) {
		this.acc_discr_id = acc_discr_id;
	}

	public FAcceptanceHeader getAccHeader() {
		return accHeader;
	}

	public void setAccHeader(FAcceptanceHeader accHeader) {
		this.accHeader = accHeader;
	}

	public RSAp getAirport() {
		return airport;
	}

	public void setAirport(RSAp airport) {
		this.airport = airport;
	}

	public Integer getPart() {
		return part;
	}

	public void setPart(Integer part) {
		this.part = part;
	}

	public Discrepancies getDiscrepancies() {
		return discrepancies;
	}

	public void setDiscrepancies(Discrepancies discrepancies) {
		this.discrepancies = discrepancies;
	}

	public String getDiscr_form() {
		return discr_form;
	}

	public void setDiscr_form(String discr_form) {
		this.discr_form = discr_form;
	}

	public String getDiscr_rem() {
		return discr_rem;
	}

	public void setDiscr_rem(String discr_rem) {
		this.discr_rem = discr_rem;
	}
	
	public String getPartshipment() {
		return partshipment;
	}

	public void setPartshipment(String partshipment) {
		this.partshipment = partshipment;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof FAcceptanceDiscrepancies)) { return false; }
		if (this == obj) { return true; }
		FAcceptanceDiscrepancies rhs = (FAcceptanceDiscrepancies) obj;
		return new EqualsBuilder().append(this.accHeader.getAcc_header_id(), rhs.getAccHeader().getAcc_header_id()).append(this.airport.ap_3lc, rhs.getAirport().ap_3lc).append(this.part, rhs.part).append(this.discr_form, rhs.discr_form).isEquals();
	}

	@Override
	public int hashCode() {
		if (accHeader != null && accHeader.getAcc_header_id() != null){
			return new HashCodeBuilder().append(this.accHeader.getAcc_header_id()).append(airport.ap_3lc).append(this.part).append(this.discr_form).toHashCode();
		}
		else{
			return new HashCodeBuilder().append(airport.ap_3lc).append(this.part).append(this.discr_form).toHashCode();
		}
	}

	@Override
	public String toString() {
		return discrepancies.toString()+", "+discr_rem+", "+airport.ap_3lc;
	}
}
