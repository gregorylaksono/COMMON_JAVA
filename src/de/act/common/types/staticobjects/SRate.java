package de.act.common.types.staticobjects;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.log4j.Logger;

import de.act.common.interfaces.INoteContainer;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class SRate implements INoteContainer, Serializable, Cloneable {
	/**
	 * Logger for this class
	 */
	transient private static final Logger log = Logger.getLogger(SRate.class);
	transient private static final long serialVersionUID = -5803055484910030853L;
	private Set<Integer> indices = null;
	private String conxId = null;
	private String caId = null;
	private String deptAp = null;
	private String destAp = null;
	private String cur3lc = null;
	private String rateId = null;
	private char rateClass = '\0';
	private char rateType = '\0';
	private Double wgt = null;
	private Double rate = null;
	private Double overRate = null;
	private Double rateFactor = null;
	private Double chrgWgt = null;
	private Double total = null;
	private Long ruleId = null;
	private Date conxFrom = null;
	private Date conxTo = null;
	private Date vadFrom = null;
	private Date vadTo = null;
	private String ntId = null;
	private String ntCa = null;
	private char classType = '\0';
	private String itemNo = null;
	private String uldClass = null;
	private String uldRate = null;
	private boolean mustClass = false;
	private boolean mustWgt = false;
	private boolean mustCa = false;
	private String comId = null;
	private Double pivotRate = null;
	private Double overPivotRate = null;
	private int hashcode = 0;
	private final static int baseHash = SRate.class.getName().hashCode() * 2 + 1;
	private Double salesRate = 0.0;
	private Double totalSalesRate = 0.0;

	
	public String getComId() {
		return comId;
	}

	public void setComId(String comId) {
		this.comId = comId;
	}

	public Set<Integer> getIndices() {
		return this.indices;
	}

	public void setIndices(final Set<Integer> indices) {
		this.indices = indices;
	}

	public boolean mustClass() {
		return this.mustClass;
	}

	public void setMustClass() {
		this.mustClass = true;
	}

	public boolean mustWgt() {
		return this.mustWgt;
	}

	public void setMustWgt() {
		this.mustWgt = true;
	}

	public boolean mustCa() {
		return mustCa;
	}

	public void setMustCa() {
		this.mustCa = true;
	}

	public String getNtId() {
		return this.ntId;
	}

	public void setNtId(final String ntId) {
		this.ntId = ntId;
	}

	public String getNtCa() {
		return this.ntCa;
	}

	public void setNtCa(final String ntCa) {
		this.ntCa = ntCa;
	}

	public String getCaId() {
		return this.caId;
	}

	public void setCaId(final String caId) {
		this.caId = caId;
	}

	public Double getChrgWgt() {
		return this.chrgWgt;
	}

	public void setChrgWgt(final Double chrgWgt) {
		this.chrgWgt = chrgWgt;
	}

	public char getClassType() {
		return this.classType;
	}

	public void setClassType(final char classType) {
		this.classType = classType;
	}

	public Date getConxFrom() {
		return this.conxFrom;
	}

	public void setConxFrom(final Date conxFrom) {
		this.conxFrom = conxFrom;
	}

	public String getConxId() {
		return this.conxId;
	}

	public void setConxId(final String conxId) {
		this.conxId = conxId;
	}

	public Date getConxTo() {
		return this.conxTo;
	}

	public void setConxTo(final Date conxTo) {
		this.conxTo = conxTo;
	}

	public String getCur3lc() {
		return this.cur3lc;
	}

	public void setCur3lc(final String cur3lc) {
		this.cur3lc = cur3lc;
	}

	public String getDeptAp() {
		return this.deptAp;
	}

	public void setDeptAp(final String deptAp) {
		this.deptAp = deptAp;
	}

	public String getDestAp() {
		return this.destAp;
	}

	public void setDestAp(final String destAp) {
		this.destAp = destAp;
	}

	public String getItemNo() {
		return itemNo;
	}

	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}

	public Double getRate() {
		return this.rate;
	}

	public void setRate(final Double rate) {
		this.rate = rate;
	}

	public char getRateClass() {
		return this.rateClass;
	}

	public void setRateClass(final char rateClass) {
		this.rateClass = rateClass;
	}

	 public Double getRateFactor() {
		return this.rateFactor;
	}

	 public void setRateFactor(final Double rateFactor) {
		 this.rateFactor = rateFactor;
	 }

	 public char getRateType() {
		 return this.rateType;
	 }

	 public void setRateType(final char rateType) {
		 this.rateType = rateType;
	 }

	 public String getRateId() {
		 return this.rateId;
	 }

	 public void setRateId(final String rateId) {
		 this.rateId = rateId;
	 }

	 public Long getRuleId() {
		 return this.ruleId;
	 }

	 public void setRuleId(final Long ruleId) {
		 this.ruleId = ruleId;
	 }

	 public Double getTotal() {
		 return this.total;
	 }

	 public void setTotal(final Double total) {
		 this.total = total;
	 }

	 public String getUldClass() {
		 return uldClass;
	 }

	 public void setUldClass(String uldClass) {
		 this.uldClass = uldClass;
	 }

	 public String getUldRate() {
		 return uldRate;
	 }

	 public void setUldRate(String uldRate) {
		 this.uldRate = uldRate;
	 }

	 public Date getVadFrom() {
		 return this.vadFrom;
	 }

	 public void setVadFrom(final Date vadFrom) {
		 this.vadFrom = vadFrom;
	 }

	 public Date getVadTo() {
		 return this.vadTo;
	 }

	 public void setVadTo(final Date vadTo) {
		 this.vadTo = vadTo;
	 }

	 public Double getWgt() {
		 return this.wgt;
	 }

	 public void setWgt(final Double wgt) {
		 this.wgt = wgt;
	 }

	 public Double getOverRate() {
		return overRate;
	}

	public void setOverRate(final Double overRate) {
		this.overRate = overRate;
	}
	
	public Double getPivotRate() {
		return pivotRate;
	}

	public void setPivotRate(Double pivotRate) {
		this.pivotRate = pivotRate;
	}

	public Double getOverPivotRate() {
		return overPivotRate;
	}

	public void setOverPivotRate(Double overPivotRate) {
		this.overPivotRate = overPivotRate;
	}

	public Double getSalesRate() {
		return salesRate;
	}

	public void setSalesRate(Double salesRate) {
		this.salesRate = salesRate;
	}

	public Double getTotalSalesRate() {
		return totalSalesRate;
	}

	public void setTotalSalesRate(Double totalSalesRate) {
		this.totalSalesRate = totalSalesRate;
	}

	/** Simple implementation is sufficient. */
	 @Override
	 public Object clone() {
		 try {
			 return super.clone();
		 } 
		 catch (final CloneNotSupportedException e) {
			 return null;
		 }
	 }

	 /** For debugging purposes. */
	 @Override
	 public String toString() {
		 return "conxId: "      + this.conxId     +
		 		",caId: "       + this.caId       +
		 		",deptAp: "     + this.deptAp     +
		 		",destAp: "     + this.destAp     +
		 		",cur3lc: "     + this.cur3lc     +
		 		",rateId: "     + this.rateId     +
		 		",rateClass: "  + this.rateClass  +
		 		",rateType: "   + this.rateType   +
		 		",wgt: "        + this.wgt        +
		 		",rate: "       + this.rate       +
		 		",over rate: "  + this.overRate   +
		 		",rateFactor: " + this.rateFactor +
		 		",chrgWgt: "    + this.chrgWgt    +
		 		",total: "      + this.total      +
		 		",ruleId: "     + this.ruleId     +
		 		",conxFrom: "   + this.conxFrom   +
		 		",conxTo: "     + this.conxTo     +
		 		",vadFrom: "    + this.vadFrom    +
		 		",vadTo: "      + this.vadTo      +
		 		",ntId: "       + this.ntId       +
		 		",ntCa: "       + this.ntCa       +
		 		",classType: "  + (this.classType == '\0' ? "" : this.classType+"") +
		 		",uldClass: "   + this.uldClass   +
		 		",uldRate: "    + this.uldRate    +
		 		",mustClass: "  + this.mustClass  +
		 		",mustWgt: "    + this.mustWgt    +
		 		",mustCa: "     + this.mustCa     +
		 		",indices: "    + this.indices;
	 }

	 /*
	  * (non-Javadoc)
	  *
	  * @see java.lang.Object#equals(java.lang.Object)
	  */
	 @Override
	 public boolean equals(final Object obj) {
		 if (obj == this) { return true; }
		 if (obj instanceof SRate) {
			 final SRate s = (SRate) obj;
			 return s.rateId.equals(this.rateId);
		 }
		 return false;
	 }

	 /*
	  * (non-Javadoc)
	  *
	  * @see java.lang.Object#hashCode()
	  */
	 @Override
	 public int hashCode() {
		 if (this.rateId != null) {
			 if (this.hashcode == 0) {
				 this.hashcode = new HashCodeBuilder().append(baseHash).append(this.rateId)
				 .toHashCode();
			 }
			 return this.hashcode;
		 } 
		 else {
			 log.error("immutable Rate with no ID" + this.toString());
			 return super.hashCode();
		 }
	 }
} // SRate
