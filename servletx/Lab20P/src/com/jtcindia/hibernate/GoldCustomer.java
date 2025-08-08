package com.jtcindia.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "gcustomer")
@PrimaryKeyJoinColumn(name = "mycid")
public class GoldCustomer extends Customer {

	@Column(name = "supportPhone")
	private long supportPhone;

	@Column(name = "rpoints")
	private int rpoints;

	@Column(name = "cashback")
	private double cashback;

	@Column(name = "earlyAcess")
	private boolean earlyAcess;

	public GoldCustomer() {

	}

	public GoldCustomer(long supportPhone, int rpoints, double cashback, boolean earlyAcess) {
		super();
		this.supportPhone = supportPhone;
		this.rpoints = rpoints;
		this.cashback = cashback;
		this.earlyAcess = earlyAcess;
	}

	public long getSupportPhone() {
		return supportPhone;
	}

	public void setSupportPhone(long supportPhone) {
		this.supportPhone = supportPhone;
	}

	public int getRpoints() {
		return rpoints;
	}

	public void setRpoints(int rpoints) {
		this.rpoints = rpoints;
	}

	public double getCashback() {
		return cashback;
	}

	public void setCashback(double cashback) {
		this.cashback = cashback;
	}

	public boolean isEarlyAcess() {
		return earlyAcess;
	}

	public void setEarlyAcess(boolean earlyAcess) {
		this.earlyAcess = earlyAcess;
	}

	@Override
	public String toString() {
		return "GoldCustomer [supportPhone=" + supportPhone + ", rpoints=" + rpoints + ", cashback=" + cashback
				+ ", earlyAcess=" + earlyAcess + "]";
	}

}
