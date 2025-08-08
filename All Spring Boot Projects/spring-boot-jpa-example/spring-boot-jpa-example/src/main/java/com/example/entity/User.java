package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table( name = "Userstable")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;

	public User() {
		System.out.println("-- Deflt cons inside user class --");
	}

	public User(String name, String email) {
		super();
		System.out.println("-- Param cons inside user class without id --");
		this.name = name;
		this.email = email;
	}

	public User(Long id, String name, String email) {
		super();
		System.out.println("-- Param cons inside user class with id --");
		this.id = id;
		this.name = name;
		this.email = email;
	}

	// Getters and Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
