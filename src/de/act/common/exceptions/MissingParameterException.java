package de.act.common.exceptions;

public final class MissingParameterException extends RuntimeException {

	private static final long serialVersionUID = -6382222254580398928L;
	private boolean time    = false;
	private boolean ca      = false;
	private boolean ap      = false;
	private boolean com     = false;
	private boolean uld     = false;
	private boolean charges = false;
	private boolean cur     = false;
	private boolean add     = false;
	private boolean wgt     = false;

	public MissingParameterException(final String msg, final Throwable cause) {
		super(msg, cause);
	}

	public MissingParameterException(final String msg) {
		super(msg);
	}

	public MissingParameterException(final Throwable cause) {
		super(cause);
	}

	public MissingParameterException() {
		super();
	}

	public boolean isAdd() {
		return this.add;
	}

	public void setAdd() {
		this.add = true;
	}

	public boolean isAp() {
		return this.ap;
	}

	public void setAp() {
		this.ap = true;
	}

	public boolean isCa() {
		return this.ca;
	}

	public void setCa() {
		this.ca = true;
	}

	public boolean isCharges() {
		return this.charges;
	}

	public void setCharges() {
		this.charges = true;
	}

	public boolean isCom() {
		return this.com;
	}

	public void setCom() {
		this.com = true;
	}

	public boolean isCur() {
		return this.cur;
	}

	public void setCur() {
		this.cur = true;
	}

	public boolean isTime() {
		return this.time;
	}

	public void setTime() {
		this.time = true;
	}

	public boolean isUld() {
		return this.uld;
	}

	public void setUld() {
		this.uld = true;
	}

	public boolean isWgt() {
		return this.wgt;
	}

	public void setWgt() {
		this.wgt = true;
	}
}