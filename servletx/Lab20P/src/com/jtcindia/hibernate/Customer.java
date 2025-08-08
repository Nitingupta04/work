package com.jtcindia.hibernate;

import java.util.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "customer2")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cid")
	private int cid;

	@Column(name = "cname")
	private String cname;

	@Column(name = "email")
	private String email;

	@Column(name = "phone")
	private long phone;

	@Column(name = "dob")
	private Date dob;

	@OneToOne(mappedBy = "customer2")
	private Set<CreditCard> mycards;

	@OneToOne(mappedBy = "customer2")
	private Set<Order> myoders;

	// Cons

	public Customer() {

	}

	// Param Cons
	public Customer(int cid, String cname, String email, long phone, Date dob, Set<CreditCard> mycards,
			Set<Order> myoders) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.dob = dob;
		this.mycards = mycards;
		this.myoders = myoders;
	}

	// Setter Getter

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Set<CreditCard> getMycards() {
		return mycards;
	}

	public void setMycards(Set<CreditCard> mycards) {
		this.mycards = mycards;
	}

	public Set<Order> getMyoders() {
		return myoders;
	}

	public void setMyoders(Set<Order> myoders) {
		this.myoders = myoders;
	}
	
	//toString

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", email=" + email + ", phone=" + phone + ", dob=" + dob
				+ ", mycards=" + mycards + ", myoders=" + myoders + "]";
	}
	
	

}
