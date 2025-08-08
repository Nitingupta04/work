package com.jtcindia.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "scustomer")
@PrimaryKeyJoinColumn(name = "mycid")
public class SilverCustomer extends Customer{
	
	@Column(name = "supportEmail")
	private String supportEmail;
	
	@Column(name = "discount")
	private double discount;
	
	@Column(name = "supportFee")
	private double supportFee;
	
	@Column(name = "handlingCharges")
	private double handlingCharges;
	
	public SilverCustomer() {
		
	}

	public SilverCustomer(String supportEmail, double discount, double supportFee, double handlingCharges) {
		super();
		this.supportEmail = supportEmail;
		this.discount = discount;
		this.supportFee = supportFee;
		this.handlingCharges = handlingCharges;
	}

	public String getSupportEmail() {
		return supportEmail;
	}

	public void setSupportEmail(String supportEmail) {
		this.supportEmail = supportEmail;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getSupportFee() {
		return supportFee;
	}

	public void setSupportFee(double supportFee) {
		this.supportFee = supportFee;
	}

	public double getHandlingCharges() {
		return handlingCharges;
	}

	public void setHandlingCharges(double handlingCharges) {
		this.handlingCharges = handlingCharges;
	}

}
