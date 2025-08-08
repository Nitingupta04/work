package com.jtcindia.springproject;

import java.util.*;

public class Customer {

	// simple Type
	private int cid;
	private String cname;
	private String email;
	private long phone;

	// Collection Type
	private List<String> emails;
	private Set<Integer> phones;
	private Map<String, Integer> refs;	

	// User define
	private Address address;
	private List<Account> accounts;

	// para, cons
	public Customer(int cid, String cname, String email, long phone) {
		System.out.println("-- param cons inside class Customer --");
		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.phone = phone;
	}

	// Setter Getter

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

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

	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

	public Set<Integer> getPhones() {
		return phones;
	}

	public void setPhones(Set<Integer> phones) {
		this.phones = phones;
	}

	public Map<String, Integer> getRefs() {
		return refs;
	}

	public void setRefs(Map<String, Integer> refs) {
		this.refs = refs;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	// toString ()
	@Override
	public String toString() {
		System.out.println("-- toString() inside Customer class --");
		return "Customer [cid=" + cid + ", cname=" + cname + ", email=" + email + ", phone=" + phone + "]";
	}

}
