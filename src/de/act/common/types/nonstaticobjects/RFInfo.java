/**
 * @author Admin
 * @since 23.03.2006
 */
package de.act.common.types.nonstaticobjects;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import de.act.common.types.staticobjects.RSHai;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class RFInfo implements Serializable {

	private static final long serialVersionUID = 9092884527935234269L;
	private RFStick sticker ;
	private RSHai hai;
	private Integer seq;
	private String remark;
	private String fId;

	public RFInfo() {

	}

	public RFInfo(int seq2, RSHai hai_name,String remark2, RFStick sticker ) {
		this.sticker = sticker;
		this.hai = hai_name;
		this.remark = remark2;
		this.seq = seq2;
	}
	
	public RFInfo(int seq2, RSHai hai_name,String remark2, String fId2, RFStick sticker ) {
		this.sticker = sticker;
		this.hai = hai_name;
		this.remark = remark2;
		this.seq = seq2;
		this.fId = fId2;
	}

	public RSHai getHai() {
		return hai;
	}

	public void setHai(RSHai hai) {
		this.hai = hai;
	}

	public RFStick getSticker() {
		return sticker;
	}

	public void setSticker(RFStick sticker) {
		this.sticker = sticker;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj== this) {
			return true;
		}
		if (obj instanceof RFInfo) {
			RFInfo r = (RFInfo) obj;
			return new EqualsBuilder().append(r.sticker, sticker).append(r.seq, seq).isEquals();
		}
		return false;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(this.sticker).append(this.seq).toHashCode();
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		if (this.hai!=null) return this.hai.toString()+" "+this.remark;
		return "";
	}
	
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getSeq() {
		return seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	public String getfId() {
		return fId;
	}

	public void setfId(String fId) {
		this.fId = fId;
	}

}
