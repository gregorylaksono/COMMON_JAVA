package de.act.common.types.ruleobject;

/**
 * @author Henry
 */
public class RParamsId implements java.io.Serializable {

	private static final long serialVersionUID = -5095399289222665407L;
	private Integer retBool;
	private Integer retLock;
	private Integer paramBool;
	private Integer timeBool;
	private Integer caBool;
	private Integer apBool;
	private Integer itemBool;
	private Integer uldBool;
	private Integer chargesBool;
	private Integer curBool;
	private Integer addBool;
	private Integer wgtBool;
	private String ntId;

	public RParamsId() {
		
	}

	public RParamsId(Integer retBool, Integer retLock,
			Integer paramBool, Integer timeBool, Integer caBool,
			Integer apBool, Integer itemBool, Integer uldBool,
			Integer chargesBool, Integer curBool,
			Integer addBool, Integer wgtBool, String ntId) {
		this.retBool = retBool;
		this.retLock = retLock;
		this.paramBool = paramBool;
		this.timeBool = timeBool;
		this.caBool = caBool;
		this.apBool = apBool;
		this.itemBool = itemBool;
		this.uldBool = uldBool;
		this.chargesBool = chargesBool;
		this.curBool = curBool;
		this.addBool = addBool;
		this.wgtBool = wgtBool;
		this.ntId = ntId;
	}

	public Integer getRetBool() {
		return this.retBool;
	}

	public void setRetBool(Integer retBool) {
		this.retBool = retBool;
	}

	public Integer getRetLock() {
		return this.retLock;
	}

	public void setRetLock(Integer retLock) {
		this.retLock = retLock;
	}

	public Integer getParamBool() {
		return this.paramBool;
	}

	public void setParamBool(Integer paramBool) {
		this.paramBool = paramBool;
	}

	public Integer getTimeBool() {
		return this.timeBool;
	}

	public void setTimeBool(Integer timeBool) {
		this.timeBool = timeBool;
	}

	public Integer getCaBool() {
		return this.caBool;
	}

	public void setCaBool(Integer caBool) {
		this.caBool = caBool;
	}

	public Integer getApBool() {
		return this.apBool;
	}

	public void setApBool(Integer apBool) {
		this.apBool = apBool;
	}

	public Integer getItemBool() {
		return this.itemBool;
	}

	public void setItemBool(Integer itemBool) {
		this.itemBool = itemBool;
	}

	public Integer getUldBool() {
		return this.uldBool;
	}

	public void setUldBool(Integer uldBool) {
		this.uldBool = uldBool;
	}

	public Integer getChargesBool() {
		return this.chargesBool;
	}

	public void setChargesBool(Integer chargesBool) {
		this.chargesBool = chargesBool;
	}

	public Integer getCurBool() {
		return this.curBool;
	}

	public void setCurBool(Integer curBool) {
		this.curBool = curBool;
	}

	public Integer getAddBool() {
		return this.addBool;
	}

	public void setAddBool(Integer addBool) {
		this.addBool = addBool;
	}

	public Integer getWgtBool() {
		return this.wgtBool;
	}

	public void setWgtBool(Integer wgtBool) {
		this.wgtBool = wgtBool;
	}

	public String getNtId() {
		return this.ntId;
	}

	public void setNtId(String ntId) {
		this.ntId = ntId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof RParamsId))
			return false;
		RParamsId castOther = (RParamsId) other;

		return ((this.getRetBool() == castOther.getRetBool()) || (this
				.getRetBool() != null
				&& castOther.getRetBool() != null && this.getRetBool().equals(
				castOther.getRetBool())))
				&& ((this.getRetLock() == castOther.getRetLock()) || (this
						.getRetLock() != null
						&& castOther.getRetLock() != null && this.getRetLock()
						.equals(castOther.getRetLock())))
				&& ((this.getParamBool() == castOther.getParamBool()) || (this
						.getParamBool() != null
						&& castOther.getParamBool() != null && this
						.getParamBool().equals(castOther.getParamBool())))
				&& ((this.getTimeBool() == castOther.getTimeBool()) || (this
						.getTimeBool() != null
						&& castOther.getTimeBool() != null && this
						.getTimeBool().equals(castOther.getTimeBool())))
				&& ((this.getCaBool() == castOther.getCaBool()) || (this
						.getCaBool() != null
						&& castOther.getCaBool() != null && this.getCaBool()
						.equals(castOther.getCaBool())))
				&& ((this.getApBool() == castOther.getApBool()) || (this
						.getApBool() != null
						&& castOther.getApBool() != null && this.getApBool()
						.equals(castOther.getApBool())))
				&& ((this.getItemBool() == castOther.getItemBool()) || (this
						.getItemBool() != null
						&& castOther.getItemBool() != null && this
						.getItemBool().equals(castOther.getItemBool())))
				&& ((this.getUldBool() == castOther.getUldBool()) || (this
						.getUldBool() != null
						&& castOther.getUldBool() != null && this.getUldBool()
						.equals(castOther.getUldBool())))
				&& ((this.getChargesBool() == castOther.getChargesBool()) || (this
						.getChargesBool() != null
						&& castOther.getChargesBool() != null && this
						.getChargesBool().equals(castOther.getChargesBool())))
				&& ((this.getCurBool() == castOther.getCurBool()) || (this
						.getCurBool() != null
						&& castOther.getCurBool() != null && this.getCurBool()
						.equals(castOther.getCurBool())))
				&& ((this.getAddBool() == castOther.getAddBool()) || (this
						.getAddBool() != null
						&& castOther.getAddBool() != null && this.getAddBool()
						.equals(castOther.getAddBool())))
				&& ((this.getWgtBool() == castOther.getWgtBool()) || (this
						.getWgtBool() != null
						&& castOther.getWgtBool() != null && this.getWgtBool()
						.equals(castOther.getWgtBool())))
				&& ((this.getNtId() == castOther.getNtId()) || (this.getNtId() != null
						&& castOther.getNtId() != null && this.getNtId()
						.equals(castOther.getNtId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getRetBool() == null ? 0 : this.getRetBool().hashCode());
		result = 37 * result
				+ (getRetLock() == null ? 0 : this.getRetLock().hashCode());
		result = 37 * result
				+ (getParamBool() == null ? 0 : this.getParamBool().hashCode());
		result = 37 * result
				+ (getTimeBool() == null ? 0 : this.getTimeBool().hashCode());
		result = 37 * result
				+ (getCaBool() == null ? 0 : this.getCaBool().hashCode());
		result = 37 * result
				+ (getApBool() == null ? 0 : this.getApBool().hashCode());
		result = 37 * result
				+ (getItemBool() == null ? 0 : this.getItemBool().hashCode());
		result = 37 * result
				+ (getUldBool() == null ? 0 : this.getUldBool().hashCode());
		result = 37
				* result
				+ (getChargesBool() == null ? 0 : this.getChargesBool()
						.hashCode());
		result = 37 * result
				+ (getCurBool() == null ? 0 : this.getCurBool().hashCode());
		result = 37 * result
				+ (getAddBool() == null ? 0 : this.getAddBool().hashCode());
		result = 37 * result
				+ (getWgtBool() == null ? 0 : this.getWgtBool().hashCode());
		result = 37 * result
				+ (getNtId() == null ? 0 : this.getNtId().hashCode());
		return result;
	}
}