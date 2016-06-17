package de.act.common.types;

import java.io.Serializable;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class RuleRet implements Serializable, Cloneable {

	private static final long serialVersionUID = -5408916342179372520L;
	private byte    ret     = -1;
	private boolean lock    = false;
	private String  ntCa    = null;
	private String  ntId    = null;
	private String  comId   = null;
	/** Simple implementation is sufficient. */
	@Override
	public Object clone() {
		try {
			return super.clone();
		} 
		catch (final CloneNotSupportedException e) {
			return null;
		}
	}

	/** For debugging purposes. */
	@Override
	public String toString() {
		final StringBuffer buf = new StringBuffer(128);
		if (this.ret >= 0) {
			buf.append(this.ret > 0 ? "GOOD" : "BAD");
		}
		if (this.lock) {
			if (buf.length() > 0) {
				buf.append(", ");
			}
			buf.append("locked");
		}
		if (this.ntId != null) {
			if (buf.length() > 0) {
				buf.append(", ");
			}
			buf.append("note ID: ");
			buf.append(this.ntId);
		}
		return buf.toString();
	}

	public String getNtId() {
		return this.ntId;
	}

	public void setNtId(final String ntId) {
		this.ntId = ntId;
	}

	public String getNtCa() {
		return this.ntCa;
	}

	public void setNtCa(final String ntCa) {
		this.ntCa = ntCa;
	}

	public byte getRet() {
		return this.ret;
	}

	public String getComId() {
		return comId;
	}

	public void setComId(String comId) {
		this.comId = comId;
	}

	/**
	 * Returns <code>true</code> if the parameters pass the rule check and
	 * false if they fail or there is an additional note.
	 */
	public boolean passed() {
		return this.ret > 0;
	}
	
	/**
	 * Returns <code>true</code> if the parameters fail the rule check and
	 * false if they pass or there is an additional note.
	 */
	public boolean failed() {
		return this.ret == 0;
	}

	public void setRet(final byte ret) {
		this.ret = ret;
	}

	public boolean isLock() {
		return this.lock;
	}

	public void setLock() {
		this.lock = true;
	}

} // RuleParams
