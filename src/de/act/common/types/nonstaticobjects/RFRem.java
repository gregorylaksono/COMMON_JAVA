/**
 * @author Admin
 * @since 23.03.2006
 */
package de.act.common.types.nonstaticobjects;

import java.io.Serializable;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class RFRem implements Serializable {

	private static final long serialVersionUID = -8095227363181708068L;
	private Long id= -1L ;
	private Integer seq =0;
	private String name;
	private RFStick sticker ;

	public RFRem() {
		
	}

	public RFRem(String text, RFStick stick) {
		this.name = text;
		this.sticker = stick;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSeq() {
		return seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	public RFStick getSticker() {
		return sticker;
	}

	public void setSticker(RFStick sticker) {
		this.sticker = sticker;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj== this) {
			return true;
		}
		if (obj instanceof RFRem) {
			RFRem r = (RFRem) obj;
			if (r.id>-1 && this.id>-1) {
				return r.id.equals(this.id) && r.seq.equals(this.seq);
			}
		}
		return false;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		if (this.id>-1) {
			return  this.id.hashCode() + this.seq.hashCode()*37 +17;
		}
		return super.hashCode();
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		if (this.name!=null) return this.name;
		return "no remark";
	}
}
