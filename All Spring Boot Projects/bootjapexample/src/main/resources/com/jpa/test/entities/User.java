package com.jpa.test.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String name;
	private String city;
	private String email;

	public User() {
		System.out.println("-- Deflt cons inside class User --");
	}

	public User(long id, String name, String city, String email) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.email = email;
	}

	public User(String name, String city, String email) {
		super();
		System.out.println("-- Param Cons inside class User --");
		this.name = name;
		this.city = city;
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", city=" + city + ", email=" + email + "]";
	}

}
