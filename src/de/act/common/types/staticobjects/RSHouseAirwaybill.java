package de.act.common.types.staticobjects;

import java.sql.Timestamp;

public final class RSHouseAirwaybill implements java.io.Serializable {
	/**
	 * @author Rofi
	 * @since 30.07.2015
	 */
	private static final long serialVersionUID = 2749121061386247756L;
	private Long hawbId = -1L;
	private String fId;
	private String awbNo;
	private String hawbNo;
	private String dept;
	private String dest;
	private Long comId;
	private Long annId;
	private Integer pcs;
	private Double wgt;
	private Double vol;
	private Double l;
	private Double w;
	private Double h; 
	private String shipper;
	private String consignee;
	private String remark;
	private Timestamp corr;
	
	public Long getHawbId() {
		return hawbId;
	}
	public void setHawbId(Long hawbId) {
		this.hawbId = hawbId;
	}
	public String getfId() {
		return fId;
	}
	public void setfId(String fId) {
		this.fId = fId;
	}
	public String getAwbNo() {
		return awbNo;
	}
	public void setAwbNo(String awbNo) {
		this.awbNo = awbNo;
	}
	public String getHawbNo() {
		return hawbNo;
	}
	public void setHawbNo(String hawbNo) {
		this.hawbNo = hawbNo;
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
	public Long getComId() {
		return comId;
	}
	public void setComId(Long comId) {
		this.comId = comId;
	}
	public Long getAnnId() {
		return annId;
	}
	public void setAnnId(Long annId) {
		this.annId = annId;
	}
	public Integer getPcs() {
		return pcs;
	}
	public void setPcs(Integer pcs) {
		this.pcs = pcs;
	}
	public Double getWgt() {
		return wgt;
	}
	public void setWgt(Double wgt) {
		this.wgt = wgt;
	}
	public Double getVol() {
		return vol;
	}
	public void setVol(Double vol) {
		this.vol = vol;
	}
	public Double getL() {
		return l;
	}
	public void setL(Double l) {
		this.l = l;
	}
	public Double getW() {
		return w;
	}
	public void setW(Double w) {
		this.w = w;
	}
	public Double getH() {
		return h;
	}
	public void setH(Double h) {
		this.h = h;
	}
	public String getShipper() {
		return shipper;
	}
	public void setShipper(String shipper) {
		this.shipper = shipper;
	}
	public String getConsignee() {
		return consignee;
	}
	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Timestamp getCorr() {
		return corr;
	}
	public void setCorr(Timestamp corr) {
		this.corr = corr;
	}
	
}
