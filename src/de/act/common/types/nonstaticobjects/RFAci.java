/*
 * Created on 02.09.2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package de.act.common.types.nonstaticobjects;

import de.act.common.types.attachment.CAciAttachment;
import de.act.common.types.formulars.IAttachment;
import de.act.common.types.staticobjects.RSAci;


@org.jboss.cache.aop.annotation.PojoCacheable
public final class RFAci implements java.io.Serializable{

	/**
	 * @author Martin Sachs
	 * @since 19.01.2006
	 */
	private static final long serialVersionUID = 1859745595039687594L;
	public Long id= -1L;
	private IAttachment metadata = new CAciAttachment();
	private RSAci aci = null;
	private Integer seq	= 0;
	private String remark;

	public RFAci() {
		
	}
	
	public RFAci(int seq) {
		this.seq = seq;
	}

	public RFAci(int rowIndex, RSAci aci) {
		this.aci = aci;
		this.seq = rowIndex;
	}

	public RFAci(int i, String string) {
		this.seq = i;
		this.remark = string;
	}
	
	public RFAci(int i,  RSAci aci,String string) {
		this.seq = i;
		this.aci = aci;
		this.remark = string;
	}
	/*
	 * 10.01.2006
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof RFAci) {
			RFAci aci = (RFAci)obj;
			if (metadata!=null && seq!=null  && aci.metadata!=null && aci.seq!=null) {
				return metadata.equals(aci.metadata) &&
				seq.equals(aci.seq);
			}
		}
		return false;
	}
	
	/*
	 * 10.01.2006
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		int re = 17;
		if (metadata!=null && seq!=null) {
			re += 37* this.metadata.hashCode();
			re += 37* this.seq.hashCode();
		}
		if (re == 17) {
			return super.hashCode();
		}
		return re;
	}
	
	/*
	 * 10.01.2006
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		if (this.seq!=null && this.aci!=null) {
			return this.seq.toString()+ this.aci.toString();
		}
		return "";
	}

	public void add(RSAci aci) {
		this.aci = aci;
		this.seq = 0;
	}

	public RSAci getAci() {
		return aci;
	}

	public void setAci(RSAci aci) {
		this.aci = aci;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public IAttachment getMetadata() {
		return metadata;
	}

	public void setMetadata(IAttachment metadata) {
		this.metadata = metadata;
	}
}
