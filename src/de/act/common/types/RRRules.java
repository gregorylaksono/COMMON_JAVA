package de.act.common.types;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class RRRules implements Serializable, Cloneable {

	private static final long serialVersionUID = -7087314979086940089L;

	/** Newline. */
	transient private static final String NL = System.getProperty("line.separator");
	private long        ruleId;
	private long        parentId      = -1L;
	private char        ruleType      = '\0';
	private byte        caBool        = -1;
	private byte        caLock        = -1;
	private String      caId          = null;
	private char        caSect        = '\0';
	private short       allianceId    = -1;
	private char        iataStat      = '\0';
	private String      ntCa          = null;
	private String      ntId          = null;
	private byte        comBool       = -1;
	private String      comId         = null;
	private String      annId         = null;
	private byte        apBool        = -1;
	private String      ap3lc         = null;
	private char        apSect        = '\0';
	private byte        diBool        = -1;
	private String      diCo2lc       = null;
	private String      di2lc         = null;
	private char        diSect        = '\0';
	private byte        coBool        = -1;
	private String      co2lc         = null;
	private char        coSect        = '\0';
	private byte        arBool        = -1;
	private String      arCode        = null;
	private char        arSect        = '\0';
	private byte        caGeoBool     = -1;
	private char        caGeoSect     = '\0';
	private String      caGeoCa       = null;
	private short       caGeoAlliance = -1;
	private char        caGeoIataStat = '\0';
	private RRRules     caGeoFrom     = null;
	private RRRules     caGeoTo       = null;
	private byte        uldBool       = -1;
	private String      uldClass      = null;
	private String      uldRate       = null;
	private byte        chargesBool   = -1;
	private char        chargesType   = '\0';
	private byte        curBool       = -1;
	private String      cur3lc        = null;
	private byte        addBool       = -1;
	private String      addId         = null;
	private char        addType       = '\0';
	private char        addSpecType   = '\0';
	private byte        wgtMax        = -1;
	private double      wgt           = Double.NaN;
	private String      wgtUnit       = null;
	private Date        vadFrom       = null;
	private Date        vadTo         = null;
	private List<RRRules> children      = null;
	
	private String      addName       = null;
	private String      arName        = null;
	private String      apName        = null;
	private String      caName        = null;
	private String      coName        = null;
	private String      curName       = null;
	private String      diName        = null;
	private String      comName       = null;
	
	private byte        uldNetBool       = -1;
	private String      uldType       = null;
	private double      uldMinWgt	  = Double.NaN;
	private double      uldMinPercent = Double.NaN;
	
	
	
	public byte getUldNetBool() {
		return uldNetBool;
	}

	public void setUldNetBool(byte uldNetBool) {
		this.uldNetBool = uldNetBool;
	}

	public String getUldType() {
		return uldType;
	}

	public void setUldType(String uldType) {
		this.uldType = uldType;
	}

	public double getUldMinWgt() {
		return uldMinWgt;
	}

	public void setUldMinWgt(double uldMinWgt) {
		this.uldMinWgt = uldMinWgt;
	}

	public double getUldMinPercent() {
		return uldMinPercent;
	}

	public void setUldMinPercent(double uldMinPercent) {
		this.uldMinPercent = uldMinPercent;
	}

	public String getComName() {
		return comName;
	}

	public void setComName(String comName) {
		this.comName = comName;
	}

	public String getAddName() {
		return addName;
	}

	public void setAddName(String addName) {
		this.addName = addName;
	}

	public String getArName() {
		return arName;
	}

	public void setArName(String arName) {
		this.arName = arName;
	}

	public String getApName() {
		return apName;
	}

	public void setApName(String apName) {
		this.apName = apName;
	}

	public String getCaName() {
		return caName;
	}

	public void setCaName(String caName) {
		this.caName = caName;
	}

	public String getCoName() {
		return coName;
	}

	public void setCoName(String coName) {
		this.coName = coName;
	}

	public String getCurName() {
		return curName;
	}

	public void setCurName(String curName) {
		this.curName = curName;
	}

	public String getDiName() {
		return diName;
	}

	public void setDiName(String diName) {
		this.diName = diName;
	}

	public byte getAddBool() {
		return this.addBool;
	}

	public void setAddBool(final byte addBool) {
		this.addBool = addBool;
	}

	public String getAddId() {
		return this.addId;
	}

	public void setAddId(final String addId) {
		this.addId = addId;
	}

	public char getAddSpecType() {
		return this.addSpecType;
	}

	public void setAddSpecType(final char addSpecType) {
		this.addSpecType = addSpecType;
	}

	public char getAddType() {
		return this.addType;
	}

	public void setAddType(final char addType) {
		this.addType = addType;
	}

	public short getAllianceId() {
		return this.allianceId;
	}

	public void setAllianceId(final short allianceId) {
		this.allianceId = allianceId;
	}

	public String getAp3lc() {
		return this.ap3lc;
	}

	public void setAp3lc(final String ap3lc) {
		this.ap3lc = ap3lc;
	}

	public byte getApBool() {
		return this.apBool;
	}

	public void setApBool(final byte apBool) {
		this.apBool = apBool;
	}

	public char getApSect() {
		return this.apSect;
	}

	public void setApSect(final char apSect) {
		this.apSect = apSect;
	}

	public byte getArBool() {
		return this.arBool;
	}

	public void setArBool(final byte arBool) {
		this.arBool = arBool;
	}

	public String getArCode() {
		return this.arCode;
	}

	public void setArCode(final String arCode) {
		this.arCode = arCode;
	}

	public char getArSect() {
		return this.arSect;
	}

	public void setArSect(final char arSect) {
		this.arSect = arSect;
	}

	public byte getCaBool() {
		return this.caBool;
	}

	public void setCaBool(final byte caBool) {
		this.caBool = caBool;
	}

	public short getCaGeoAlliance() {
		return this.caGeoAlliance;
	}

	public void setCaGeoAlliance(final short caGeoAlliance) {
		this.caGeoAlliance = caGeoAlliance;
	}

	public byte getCaGeoBool() {
		return this.caGeoBool;
	}

	public void setCaGeoBool(final byte caGeoBool) {
		this.caGeoBool = caGeoBool;
	}

	public String getCaGeoCa() {
		return this.caGeoCa;
	}

	public void setCaGeoCa(final String caGeoCa) {
		this.caGeoCa = caGeoCa;
	}

	public RRRules getCaGeoFrom() {
		return this.caGeoFrom;
	}

	public void setCaGeoFrom(final RRRules caGeoFrom) {
		this.caGeoFrom = caGeoFrom;
	}

	public char getCaGeoIataStat() {
		return this.caGeoIataStat;
	}

	public void setCaGeoIataStat(final char caGeoIataStat) {
		this.caGeoIataStat = caGeoIataStat;
	}

	public char getCaGeoSect() {
		return this.caGeoSect;
	}

	public void setCaGeoSect(final char caGeoSect) {
		this.caGeoSect = caGeoSect;
	}

	public RRRules getCaGeoTo() {
		return this.caGeoTo;
	}

	public void setCaGeoTo(final RRRules caGeoTo) {
		this.caGeoTo = caGeoTo;
	}

	public String getCaId() {
		return this.caId;
	}

	public void setCaId(final String caId) {
		this.caId = caId;
	}

	public byte getCaLock() {
		return this.caLock;
	}

	public void setCaLock(final byte caLock) {
		this.caLock = caLock;
	}

	public char getCaSect() {
		return this.caSect;
	}

	public void setCaSect(final char caSect) {
		this.caSect = caSect;
	}

	public byte getChargesBool() {
		return this.chargesBool;
	}

	public void setChargesBool(final byte chargesBool) {
		this.chargesBool = chargesBool;
	}

	public char getChargesType() {
		return this.chargesType;
	}

	public void setChargesType(final char chargesType) {
		this.chargesType = chargesType;
	}

	public String getCo2lc() {
		return this.co2lc;
	}

	public void setCo2lc(final String co2lc) {
		this.co2lc = co2lc;
	}

	public byte getCoBool() {
		return this.coBool;
	}

	public void setCoBool(final byte coBool) {
		this.coBool = coBool;
	}

	public byte getComBool() {
		return this.comBool;
	}

	public void setComBool(final byte comBool) {
		this.comBool = comBool;
	}

	public String getComId() {
		return this.comId;
	}

	public void setComId(final String comId) {
		this.comId = comId;
	}

	public String getAnnId() {
		return annId;
	}

	public void setAnnId(String annId) {
		this.annId = annId;
	}

	public char getCoSect() {
		return this.coSect;
	}

	public void setCoSect(final char coSect) {
		this.coSect = coSect;
	}

	public String getCur3lc() {
		return this.cur3lc;
	}

	public void setCur3lc(final String cur3lc) {
		this.cur3lc = cur3lc;
	}

	public byte getCurBool() {
		return this.curBool;
	}

	public void setCurBool(final byte curBool) {
		this.curBool = curBool;
	}

	public String getDi2lc() {
		return this.di2lc;
	}

	public void setDi2lc(final String di2lc) {
		this.di2lc = di2lc;
	}

	public byte getDiBool() {
		return this.diBool;
	}

	public void setDiBool(final byte diBool) {
		this.diBool = diBool;
	}

	public String getDiCo2lc() {
		return this.diCo2lc;
	}

	public void setDiCo2lc(final String diCo2lc) {
		this.diCo2lc = diCo2lc;
	}

	public char getDiSect() {
		return this.diSect;
	}

	public void setDiSect(final char diSect) {
		this.diSect = diSect;
	}

	public char getIataStat() {
		return this.iataStat;
	}

	public void setIataStat(final char iataStat) {
		this.iataStat = iataStat;
	}

	public String getNtCa() {
		return this.ntCa;
	}

	public void setNtCa(final String ntCa) {
		this.ntCa = ntCa;
	}

	public String getNtId() {
		return this.ntId;
	}

	public void setNtId(final String ntId) {
		this.ntId = ntId;
	}

	public long getParentId() {
		return this.parentId;
	}

	public void setParentId(final long parentId) {
		this.parentId = parentId;
	}

	public long getRuleId() {
		return this.ruleId;
	}

	public void setRuleId(final long ruleId) {
		this.ruleId = ruleId;
	}

	public char getRuleType() {
		return this.ruleType;
	}

	public void setRuleType(final char ruleType) {
		this.ruleType = ruleType;
	}

	public byte getUldBool() {
		return this.uldBool;
	}

	public void setUldBool(final byte uldBool) {
		this.uldBool = uldBool;
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

	public double getWgt() {
		return this.wgt;
	}

	public void setWgt(final double wgt) {
		this.wgt = wgt;
	}

	public byte getWgtMax() {
		return this.wgtMax;
	}

	public void setWgtMax(final byte wgtMax) {
		this.wgtMax = wgtMax;
	}

	public String getWgtUnit() {
		return this.wgtUnit;
	}

	public void setWgtUnit(final String wgtUnit) {
		this.wgtUnit = wgtUnit;
	}

	public List<RRRules> getChildren() {
		return this.children;
	}

	/**
	 * Recursively tries to add the child with the given parent ID.
	 * Returns <code>true</code> if successful and <code>false</code> otherwise.
	 *
	 * @param child the child to add.
	 * @param pid   the parent ID of the child.
	 *
	 * @return <code>true</code> if successful and <code>false</code> otherwise.
	 */
	public boolean addChild(final RRRules child, final long pid) {
		if (this.children == null) {
			if (pid == this.ruleId) {
				this.children = new LinkedList<RRRules>();
				this.children.add(child);
				return true;
			}
		}
		else {
			if (pid == this.ruleId) {
				this.children.add(child);
				return true;
			}
			for (final RRRules rule : this.children) {
				if (rule.addChild(child, pid)) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Copy all fields and make a deep copy of the children.
	 */
	@Override
	public Object clone() {
		try {
			final RRRules ret = (RRRules) super.clone();
			if (this.children != null) {
				ret.children = new ArrayList<RRRules>(this.children.size());
				for (final RRRules tmp : this.children) {
					ret.children.add((RRRules) tmp.clone());
				}
			}
			return ret;
		} 
		catch (final CloneNotSupportedException e) {
			return null;
		}
	}

	private char quote(final char c) {
		return c == '\0' ? ' ' : c;
	}

	/** For debugging purposes. */
	@Override
	public String toString() {
		final StringBuffer buf = new StringBuffer(2048);
		buf.append("ruleId: ");           buf.append(this.ruleId);
		buf.append(", parentId: ");       buf.append(this.parentId);
		buf.append(", ruleType: ");       buf.append(this.quote(this.ruleType));
		buf.append(", caBool: ");         buf.append(this.caBool);
		buf.append(", caLock: ");         buf.append(this.caLock);
		buf.append(", caId: ");           buf.append(this.caId);
		buf.append(", caSect: ");         buf.append(this.quote(this.caSect));
		buf.append(", allianceId: ");     buf.append(this.allianceId);
		buf.append(", iataStat: ");       buf.append(this.quote(this.iataStat));
		buf.append(", ntCa: ");           buf.append(this.ntCa);
		buf.append(", ntId: ");           buf.append(this.ntId);
		buf.append(", comBool: ");        buf.append(this.comBool);
		buf.append(", comId: ");          buf.append(this.comId);
		buf.append(", apBool: ");         buf.append(this.apBool);
		buf.append(", ap3lc: ");          buf.append(this.ap3lc);
		buf.append(", apSect: ");         buf.append(this.quote(this.apSect));
		buf.append(", diBool: ");         buf.append(this.diBool);
		buf.append(", diCo2lc: ");        buf.append(this.diCo2lc);
		buf.append(", di2lc: ");          buf.append(this.di2lc);
		buf.append(", diSect: ");         buf.append(this.quote(this.diSect));
		buf.append(", coBool: ");         buf.append(this.coBool);
		buf.append(", co2lc: ");          buf.append(this.co2lc);
		buf.append(", coSect: ");         buf.append(this.quote(this.coSect));
		buf.append(", arBool: ");         buf.append(this.arBool);
		buf.append(", arCode: ");         buf.append(this.arCode);
		buf.append(", arSect: ");         buf.append(this.quote(this.arSect));
		buf.append(", caGeoBool: ");      buf.append(this.caGeoBool);
		buf.append(", caGeoSect: ");      buf.append(this.quote(this.caGeoSect));
		buf.append(", caGeoCa: ");        buf.append(this.caGeoCa);
		buf.append(", caGeoAlliance: ");  buf.append(this.caGeoAlliance);
		buf.append(", caGeoIataStat: ");  buf.append(this.quote(this.caGeoIataStat));
		buf.append(", caGeoFrom: ");      buf.append(this.caGeoFrom);
		buf.append(", caGeoTo: ");        buf.append(this.caGeoTo);
		buf.append(", uldBool: ");        buf.append(this.uldBool);
		buf.append(", uldClass: ");       buf.append(this.uldClass);
		buf.append(", uldRate: ");        buf.append(this.uldRate);
		buf.append(", chargesBool: ");    buf.append(this.chargesBool);
		buf.append(", chargesType: ");    buf.append(this.quote(this.chargesType));
		buf.append(", curBool: ");        buf.append(this.curBool);
		buf.append(", cur3lc: ");         buf.append(this.cur3lc);
		buf.append(", addBool: ");        buf.append(this.addBool);
		buf.append(", addId: ");          buf.append(this.addId);
		buf.append(", addType: ");        buf.append(this.quote(this.addType));
		buf.append(", addSpecType: ");    buf.append(this.quote(this.addSpecType));
		buf.append(", wgtMax: ");         buf.append(this.wgtMax);
		buf.append(", wgt: ");            buf.append(this.wgt);
		buf.append(", wgtUnit: ");        buf.append(this.wgtUnit);
		buf.append(", vadFrom: ");        buf.append(this.vadFrom);
		buf.append(", vadTo: ");          buf.append(this.vadTo);

		if (this.children != null) {
			int i = 1;
			for (final RRRules child : this.children) {
				buf.append("Child #");
				buf.append(i);
				buf.append("\t(");
				buf.append(this.ruleId);
				buf.append("):");
				buf.append(NL);
				buf.append(child.toString());
				i++;
			} // for child
		}
		return buf.toString();
	}
} // CRate
