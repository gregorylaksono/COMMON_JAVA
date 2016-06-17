package de.act.common.types.staticobjects;
import org.apache.commons.lang.builder.HashCodeBuilder;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class CommodityDGR implements java.io.Serializable {
	/**
	 * @author Martin Sachs
	 * @since 01.03.2006
	 */
	private static final long serialVersionUID = -589487434695405379L;
	private String id; //HENRY it should be checked
	private ICommodity commodity;
	private String propName;
	private String dgrClass;
	private String unNo;
	private String pkgGrp;
	private String subRisk;
	private String dgrAuth;
	private Double ltdMax;
	private RSUnit ltdUnit;
	private String ltdInst;
	private Double psaMax;
	private RSUnit psaUnit;
	private String psaInst;
	private Double caoMax;
	private RSUnit caoUnit;
	private String caoInst;
	private String vadId;
	private int hashcode = 0;
	private final static int baseHash = CommodityDGR.class.getName().hashCode() * 2 + 1;
	private String spcProv;
	private String ergCode;
	private String label;

	@Override
	public String toString() {
		return this.propName;
	}

	public String getCaoInst() {
		return this.caoInst;
	}

	public void setCaoInst(final String caoInst) {
		this.caoInst = caoInst;
	}

	public Double getCaoMax() {
		return this.caoMax;
	}

	public void setCaoMax(final Double caoMax) {
		this.caoMax = caoMax;
	}

	public RSUnit getCaoUnit() {
		return this.caoUnit;
	}

	public void setCaoUnit(final RSUnit caoUnit) {
		this.caoUnit = caoUnit;
	}

	public String getDgrAuth() {
		return this.dgrAuth;
	}

	public void setDgrAuth(final String dgrAuth) {
		this.dgrAuth = dgrAuth;
	}

	public String getDgrClass() {
		return this.dgrClass;
	}

	public void setDgrClass(final String dgrClass) {
		this.dgrClass = dgrClass;
	}

	public String getErgCode() {
		return this.ergCode;
	}

	public void setErgCode(final String ergCode) {
		this.ergCode = ergCode;
	}

	public String getId() {
		return this.id;
	}

	public void setId(final String id) {
		this.id = id;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(final String label) {
		this.label = label;
	}

	public String getLtdInst() {
		return this.ltdInst;
	}

	public void setLtdInst(final String ltdInst) {
		this.ltdInst = ltdInst;
	}

	public Double getLtdMax() {
		return this.ltdMax;
	}

	public void setLtdMax(final Double ltdMax) {
		this.ltdMax = ltdMax;
	}

	public RSUnit getLtdUnit() {
		return this.ltdUnit;
	}

	public void setLtdUnit(final RSUnit ltdUnit) {
		this.ltdUnit = ltdUnit;
	}

	public String getPkgGrp() {
		return this.pkgGrp;
	}

	public void setPkgGrp(final String pkgGrp) {
		this.pkgGrp = pkgGrp;
	}

	public String getPropName() {
		return this.propName;
	}

	public void setPropName(final String propName) {
		this.propName = propName;
	}

	public String getPsaInst() {
		return this.psaInst;
	}

	public void setPsaInst(final String psaInst) {
		this.psaInst = psaInst;
	}

	public Double getPsaMax() {
		return this.psaMax;
	}

	public void setPsaMax(final Double psaMax) {
		this.psaMax = psaMax;
	}

	public RSUnit getPsaUnit() {
		return this.psaUnit;
	}

	public void setPsaUnit(final RSUnit psaUnit) {
		this.psaUnit = psaUnit;
	}

	public String getSpcProv() {
		return this.spcProv;
	}

	public void setSpcProv(final String spcProv) {
		this.spcProv = spcProv;
	}

	public String getSubRisk() {
		return this.subRisk;
	}

	public void setSubRisk(final String subRisk) {
		this.subRisk = subRisk;
	}

	public String getUnNo() {
		return this.unNo;
	}

	public void setUnNo(final String unNo) {
		this.unNo = unNo;
	}

	public ICommodity getCommodity() {
		return this.commodity;
	}

	public void setCommodity(final ICommodity comId) {
		this.commodity = comId;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object obj) {
		if (obj == this) { return true; }
		if (obj == null || this.hashCode() != obj.hashCode()) { return false; }
		if (this.id != null && obj != null && obj instanceof CommodityDGR) {
			final CommodityDGR com = (CommodityDGR) obj;
			if (this.id != null && com.id != null) { return this.id.equals(com.id); }
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
		if (this.hashcode == 0) {
			this.hashcode = new HashCodeBuilder().append(baseHash).append(this.id).toHashCode();
		}
		return this.hashcode;
	}

	public String getVadId() {
		return this.vadId;
	}

	public void setVadId(final String vadId) {
		this.vadId = vadId;
	}
}
