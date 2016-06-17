package de.act.common.types;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import de.act.common.types.staticobjects.RSAdd;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class CheckRuleParams implements Serializable, Cloneable {

	private static final long serialVersionUID = 2235054765710214603L;
	private Date     depTime     = null;
	private Date     arrTime     = null;
	private String[] cas         = null;
	private String   awbCa       = null;
	private String[] aps         = null;
	private String   uldClass    = null;
	private String   uldRate     = null;
	private char     chargesType = '\0'; // 'o' 'f' 'a' - all
	private String   cur         = null;
	private String[] ars         = null;
	private String[] dis		 = null;
	private String[] cos		 = null;
	private RSAdd Shipper        = null;
	private RSAdd consignee      = null;
	private RSAdd freightFwd     = null;
	private Long comId           = null;
	private String  uldType      = null;

	public String getUldType() {
		return uldType;
	}

	public void setUldType(String uldType) {
		this.uldType = uldType;
	}

	public Long getComId() {
		return comId;
	}

	public void setComId(Long comId) {
		this.comId = comId;
	}

	public RSAdd getShipper() {
		return Shipper;
	}

	public void setShipper(RSAdd shipper) {
		Shipper = shipper;
	}

	public RSAdd getConsignee() {
		return consignee;
	}

	public void setConsignee(RSAdd consignee) {
		this.consignee = consignee;
	}

	public RSAdd getFreightFwd() {
		return freightFwd;
	}

	public void setFreightFwd(RSAdd freightFwd) {
		this.freightFwd = freightFwd;
	}

	public String[] getArs() {
		return ars;
	}

	public void setArs(String[] ars) {
		this.ars = ars;
	}

	public String[] getDis() {
		return dis;
	}

	public void setDis(String[] dis) {
		this.dis = dis;
	}

	public String[] getCos() {
		return cos;
	}

	public void setCos(String[] cos) {
		this.cos = cos;
	}

	public String[] getAps() {
		return this.aps;
	}

	public void setAps(final String[] aps) {
		this.aps = aps;
	}

	public Date getArrTime() {
		return this.arrTime;
	}

	public void setArrTime(final Date arrTime) {
		this.arrTime = arrTime;
	}

	public String getAwbCa() {
		return this.awbCa;
	}

	public void setAwbCa(final String awbCa) {
		this.awbCa = awbCa;
	}

	public String[] getCas() {
		return this.cas;
	}

	public void setCas(final String[] cas) {
		this.cas = cas;
	}

	public char getChargesType() {
		return this.chargesType;
	}

	public void setChargesType(final char chargesType) {
		this.chargesType = chargesType;
	}

	public String getCur() {
		return this.cur;
	}

	public void setCur(final String cur) {
		this.cur = cur;
	}

	public Date getDepTime() {
		return this.depTime;
	}

	public void setDepTime(final Date depTime) {
		this.depTime = depTime;
	}

	public String getUldClass() {
		return this.uldClass;
	}

	public void setUldClass(final String uldClass) {
		this.uldClass = uldClass;
	}

	public String getUldRate() {
		return this.uldRate;
	}

	public void setUldRate(final String uldRate) {
		this.uldRate = uldRate;
	}

	@Override
	public Object clone() {
		try {
			return super.clone();
		}
		catch (final Exception e) {
			return null;
		}
	}
}
