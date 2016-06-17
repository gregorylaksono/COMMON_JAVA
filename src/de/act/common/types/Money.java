package de.act.common.types;

import java.io.Serializable;

@org.jboss.cache.aop.annotation.PojoCacheable
public final class Money implements Serializable {

	private static final long serialVersionUID = 1733485569955694530L;
	private double amount;
	private final String currency;

	public Money(final double amount, final String currency) {
		this.amount   = amount;
		this.currency = currency;
	}

	public String getCurrency() {
		return this.currency;
	}

	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void addAmount(double amount) {
		this.amount += amount;
	}
}
