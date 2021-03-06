package de.act.central.types;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Discrepencies generated by MyEclipse - Hibernate Tools
 */

public class Discrepencies extends Central implements java.io.Serializable {

	// Fields

	/**
	 * @author Martin Sachs
	 * @since 1.0 - 20.11.2006
	 */
	private static final long serialVersionUID = 3463625349720228720L;
	transient private Long accItemId;
	private AcceptanceItem FAccItem;
	private String ap3lc;
	private String discrForm;
	private Integer discrId;
	private String discrRem;
	private Integer condition_flag;
	private Integer opposite_discr_id;

	// Constructors

	/** default constructor */
	public Discrepencies() {
		
	}

	/** minimal constructor */
	public Discrepencies(AcceptanceItem FAccItem) {
		this.FAccItem = FAccItem;
	}

	/** full constructor */
	public Discrepencies(AcceptanceItem FAccItem, String ap3lc, String discrForm, Integer discrId, String discrRem) {
		this.FAccItem = FAccItem;
		this.ap3lc = ap3lc;
		this.discrForm = discrForm;
		this.discrId = discrId;
		this.discrRem = discrRem;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Discrepencies)) { return false; }
		if (this == obj) { return true; }
		Discrepencies rhs = (Discrepencies) obj;
		return new EqualsBuilder().append(this.FAccItem, rhs.FAccItem).isEquals();
	}

	/**
	 * 12.12.2005
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(this.FAccItem).toHashCode();
	}
	// Property accessors

	public Long getAccItemId() {
		return this.accItemId;
	}

	public void setAccItemId(Long accItemId) {
		this.accItemId = accItemId;
	}

	public AcceptanceItem getFAccItem() {
		return this.FAccItem;
	}

	public void setFAccItem(AcceptanceItem FAccItem) {
		this.FAccItem = FAccItem;
	}

	public String getAp3lc() {
		return this.ap3lc;
	}

	public void setAp3lc(String ap3lc) {
		this.ap3lc = ap3lc;
	}

	public String getDiscrForm() {
		return this.discrForm;
	}

	public void setDiscrForm(String discrForm) {
		this.discrForm = discrForm;
	}

	public Integer getDiscrId() {
		return this.discrId;
	}

	public void setDiscrId(Integer discrId) {
		this.discrId = discrId;
	}

	public String getDiscrRem() {
		return this.discrRem;
	}

	public void setDiscrRem(String discrRem) {
		this.discrRem = discrRem;
	}

	public Integer getCondition_flag()
	{
		return condition_flag;
	}

	public void setCondition_flag(Integer condition_flag)
	{
		this.condition_flag = condition_flag;
	}

	public Integer getOpposite_discr_id()
	{
		return opposite_discr_id;
	}

	public void setOpposite_discr_id(Integer opposite_discr_id)
	{
		this.opposite_discr_id = opposite_discr_id;
	}
	
}