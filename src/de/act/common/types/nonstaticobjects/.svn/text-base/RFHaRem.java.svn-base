package de.act.common.types.nonstaticobjects;

import java.util.Date;

import de.act.common.types.attachment.CAcceptanceAttachment;
import de.act.common.types.formulars.IAttachment;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class RFHaRem  implements java.io.Serializable{

	/**
	 * @author Martin Sachs
	 * @since 19.01.2006
	 */
	private static final long serialVersionUID = -2382015287902617798L;
	public Long id= -1L;
	private IAttachment metadata = new CAcceptanceAttachment();
	public String REM_NAME =null;
	public Integer REM_SEQ	=null;
	public Date CORR  =new Date();

	/*
	 * 10.01.2006
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof RFHaRem) {
			return hashCode() == obj.hashCode();
		}
		else
			return false;
	}
	
	/*
	 * 10.01.2006
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		int re = 17;
		if (id>-1)
			re += 37* this.id.hashCode();
		if (this.CORR!=null)
			re += 37* this.CORR.hashCode();
		return re;
	}
	
	/*
	 * 10.01.2006
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return REM_NAME.toString();
	}

	public Date getCORR() {
		return CORR;
	}

	public void setCORR(Date corr) {
		CORR = corr;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getREM_NAME() {
		return REM_NAME;
	}

	public void setREM_NAME(String rem_name) {
		REM_NAME = rem_name;
	}

	public Integer getREM_SEQ() {
		return REM_SEQ;
	}

	public void setREM_SEQ(Integer rem_seq) {
		REM_SEQ = rem_seq;
	}

	public IAttachment getMetadata() {
		return metadata;
	}

	public void setMetadata(IAttachment metadata) {
		this.metadata = metadata;
	}
}
