package de.act.common.types.staticobjects;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import org.apache.log4j.Logger;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class SRateAuto implements Serializable, Cloneable {
	/**
	 * Logger for this class
	 */
	transient private static final Logger log = Logger.getLogger(SRateAuto.class);
	transient private static final long serialVersionUID = -5803055484910030853L;
	private String rateId = null;
	private Double startRate = null;
	private Double lowestRate = null;
	private Double highestRate = null;
	private Integer peakTime = null;
	private Double loadFactor = null;
	private Integer steps = null;
	private String vadId = null;
	private Integer lastMinute = null;
	private char rateClass = '\0';
	private char rateType = '\0';
	private Double rate = null;
	private String conxId = null;
	private String caId = null;
	private String dept = null;
	private String dest = null;
	private String cur3lc = null;
	private Double total = null;
	private Integer rateMode = null;
	private Set<Integer> indices = null;
	private Double chrgWgt = null;
	private Double wgt = null;
	private String itemNo = null;
	private Double pivotRate = null;
	private Double overPivotRate = null;
	private Double rateFactor = null;
	private Integer timeSteps = null;
	private Double capSteps = null;
	private Double rateSteps = null;
	private Date lastMntDate = null;
	private Date bkgFltDate = null;
	private Double availableWgt = null;
	private Date createDate = null;
	private char classType = '\0';
		
	public String getRateId() {
		return rateId;
	}

	public void setRateId(String rateId) {
		this.rateId = rateId;
	}

	public Double getStartRate() {
		return startRate;
	}

	public void setStartRate(Double startRate) {
		this.startRate = startRate;
	}

	public Double getLowestRate() {
		return lowestRate;
	}

	public void setLowestRate(Double lowestRate) {
		this.lowestRate = lowestRate;
	}

	public Double getHighestRate() {
		return highestRate;
	}

	public void setHighestRate(Double highestRate) {
		this.highestRate = highestRate;
	}

	public Integer getPeakTime() {
		return peakTime;
	}

	public void setPeakTime(Integer peakTime) {
		this.peakTime = peakTime;
	}

	public Double getLoadFactor() {
		return loadFactor;
	}

	public void setLoadFactor(Double loadFactor) {
		this.loadFactor = loadFactor;
	}

	public Integer getSteps() {
		return steps;
	}

	public void setSteps(Integer steps) {
		this.steps = steps;
	}

	public String getVadId() {
		return vadId;
	}

	public void setVadId(String vadId) {
		this.vadId = vadId;
	}

	public Integer getLastMinute() {
		return lastMinute;
	}

	public void setLastMinute(Integer lastMinute) {
		this.lastMinute = lastMinute;
	}

	public char getRateClass() {
		return rateClass;
	}

	public void setRateClass(char rateClass) {
		this.rateClass = rateClass;
	}

	public char getRateType() {
		return rateType;
	}

	public void setRateType(char rateType) {
		this.rateType = rateType;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public String getConxId() {
		return conxId;
	}

	public void setConxId(String conxId) {
		this.conxId = conxId;
	}

	public String getCaId() {
		return caId;
	}

	public void setCaId(String caId) {
		this.caId = caId;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public String getCur3lc() {
		return cur3lc;
	}

	public void setCur3lc(String cur3lc) {
		this.cur3lc = cur3lc;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Integer getRateMode() {
		return rateMode;
	}

	public void setRateMode(Integer rateMode) {
		this.rateMode = rateMode;
	}

	public Set<Integer> getIndices() {
		return indices;
	}

	public void setIndices(Set<Integer> indices) {
		this.indices = indices;
	}

	public Double getChrgWgt() {
		return chrgWgt;
	}

	public void setChrgWgt(Double chrgWgt) {
		this.chrgWgt = chrgWgt;
	}

	public Double getWgt() {
		return wgt;
	}

	public void setWgt(Double wgt) {
		this.wgt = wgt;
	}

	public String getItemNo() {
		return itemNo;
	}

	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
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

	public Double getRateFactor() {
		return rateFactor;
	}

	public void setRateFactor(Double rateFactor) {
		this.rateFactor = rateFactor;
	}

	public Integer getTimeSteps() {
		return timeSteps;
	}

	public void setTimeSteps(Integer timeSteps) {
		this.timeSteps = timeSteps;
	}

	public Double getCapSteps() {
		return capSteps;
	}

	public void setCapSteps(Double capSteps) {
		this.capSteps = capSteps;
	}

	public Double getRateSteps() {
		return rateSteps;
	}

	public void setRateSteps(Double rateSteps) {
		this.rateSteps = rateSteps;
	}

	public Date getLastMntDate() {
		return lastMntDate;
	}

	public void setLastMntDate(Date lastMntDate) {
		this.lastMntDate = lastMntDate;
	}

	public Date getBkgFltDate() {
		return bkgFltDate;
	}

	public void setBkgFltDate(Date bkgFltDate) {
		this.bkgFltDate = bkgFltDate;
	}

	public Double getAvailableWgt() {
		return availableWgt;
	}

	public void setAvailableWgt(Double availableWgt) {
		this.availableWgt = availableWgt;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	public char getClassType() {
		return classType;
	}

	public void setClassType(char classType) {
		this.classType = classType;
	}

	@Override
	public String toString() {
		return "rateId: "    + this.rateId +
		",startRate: "       + this.startRate +
		",lowestRate: "      + this.lowestRate +
		",highestRate: "     + this.highestRate +
		",peakTime: "        + this.peakTime +
		",loadFactor: "      + this.loadFactor +
		",steps: "           + this.steps +
		",vadId: "           + this.vadId +
		",lastMinute: "      + this.lastMinute +
		",rateClass: "       + this.rateClass +
		",rateType: "        + this.rateType +
		",rate: "            + this.rate +
		",conxId: "          + this.conxId +
		",caId: "     		 + this.caId +
		",dept: "   		 + this.dept +
		",dest: "     		 + this.dest +
		",cur3lc: "    		 + this.cur3lc +
		",total: "    		 + this.total +
		",rateMode: "    	 + this.rateMode +
		",indices: "    	 + this.indices +
		",chrgWgt: "    	 + this.chrgWgt +
		",wgt: "    	 	 + this.wgt +
		",itemNo: "    	     + this.itemNo +
		",pivotRate: "    	 + this.pivotRate +
		",overPivotRate: "   + this.overPivotRate +
		",rateFactor: "    	 + this.rateFactor +
		",timeSteps: "    	 + this.timeSteps +
		",capSteps: "    	 + this.capSteps +
		",rateSteps: "    	 + this.rateSteps +
		",lastMntDate: "     + this.lastMntDate +
		",bkgFltDate: "    	 + this.bkgFltDate +
		",availableWgt: "    + this.availableWgt +
		",createDate: "    	 + this.createDate +
		",classType: "		 + this.classType;
	}
	
}
