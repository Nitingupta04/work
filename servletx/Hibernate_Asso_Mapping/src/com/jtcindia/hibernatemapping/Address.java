package com.jtcindia.hibernatemapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "myaddress")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "addid")
	private int addid;
	@Column(name = "city")
	private String city;
	@Column(name = "state")
	private String state;
	@Column(name = "street")
	private String street;

	public Address() {
		System.out.println("-- Default Cons --");
	}

	public Address(String city, String state, String street) {
		super();
		this.city = city;
		this.state = state;
		this.street = street;
	}

	public int getAddid() {
		return addid;
	}

	public void setAddid(int addid) {
		this.addid = addid;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "Address [addid=" + addid + ", city=" + city + ", state=" + state + ", street=" + street + "]";
	}

}
