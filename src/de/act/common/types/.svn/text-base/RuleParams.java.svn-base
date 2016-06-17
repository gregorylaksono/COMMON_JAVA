package de.act.common.types;

import java.io.Serializable;

/**
 */
@org.jboss.cache.aop.annotation.PojoCacheable
public final class RuleParams implements Serializable, Cloneable {

	private static final long serialVersionUID = -8174442203179655649L;
	private byte    ret     = -1;
	private boolean lock    = false;
	private boolean params  = false;
	private boolean time    = false; // dep arr time
	private boolean ca      = false; // carrier
	private boolean ap      = false;
	private boolean com     = false; //
	private boolean uld     = false;
	private boolean charges = false; // if true call other charges
	private boolean cur     = false; // only for one currency ?
	private boolean add     = false; // consignee add, addtype
	private boolean wgt     = false;
	private String  ntId    = null;


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
		if (this.params) {
			if (buf.length() > 0) {
				buf.append(", ");
			}
			buf.append("parameters needed");
		}
		if (this.time) {
			if (buf.length() > 0) {
				buf.append(", ");
			}
			buf.append("times needed");
		}
		if (this.ca) {
			if (buf.length() > 0) {
				buf.append(", ");
			}
			buf.append("carrier needed");
		}
		if (this.ap) {
			if (buf.length() > 0) {
				buf.append(", ");
			}
			buf.append("airports needed");
		}
		if (this.com) {
			if (buf.length() > 0) {
				buf.append(", ");
			}
			buf.append("commodoties needed");
		}
		if (this.uld) {
			if (buf.length() > 0) {
				buf.append(", ");
			}
			buf.append("ULD data needed");
		}
		if (this.charges) {
			if (buf.length() > 0) {
				buf.append(", ");
			}
			buf.append("charges types needed");
		}
		if (this.cur) {
			if (buf.length() > 0) {
				buf.append(", ");
			}
			buf.append("currency needed");
		}
		if (this.add) {
			if (buf.length() > 0) {
				buf.append(", ");
			}
			buf.append("consignee address needed");
		}
		if (this.wgt) {
			if (buf.length() > 0) {
				buf.append(", ");
			}
			buf.append("weight needed");
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

	public boolean isAdd() {
		return this.add;
	}

	public void setAdd() {
		this.params = true;
		this.add    = true;
	}

	public boolean isAp() {
		return this.ap;
	}

	public void setAp() {
		this.params = true;
		this.ap     = true;
	}

	public boolean isCa() {
		return this.ca;
	}

	public void setCa() {
		this.params = true;
		this.ca     = true;
	}

	public boolean isCharges() {
		return this.charges;
	}

	public void setCharges() {
		this.params  = true;
		this.charges = true;
	}

	public boolean isCom() {
		return this.com;
	}

	public void setCom() {
		this.params = true;
		this.com    = true;
	}

	public boolean isCur() {
		return this.cur;
	}

	public void setCur() {
		this.params = true;
		this.cur    = true;
	}

	public boolean isTime() {
		return this.time;
	}

	public void setTime() {
		this.params = true;
		this.time   = true;
	}

	public boolean isUld() {
		return this.uld;
	}

	public void setUld() {
		this.params = true;
		this.uld    = true;
	}

	public boolean isWgt() {
		return this.wgt;
	}

	public void setWgt() {
		this.params = true;
		this.wgt    = true;
	}

	public boolean isParams() {
		return this.params;
	}

	public String getNtId() {
		return this.ntId;
	}

	public void setNtId(final String ntId) {
		this.ntId = ntId;
	}

	public byte getRet() {
		return this.ret;
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
