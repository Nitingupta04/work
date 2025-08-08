package com.jtcindia.hibernate;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import java.util.*;

@Entity
@Table(name = "authors")
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "authorid")
	private int authorId;

	@Column(name = "authorname")
	private String authorName;

	@Column(name = "email")
	private String email;

	@Column(name = "phone")
	private long phone;

	@CollectionTable(name = "skills", joinColumns = @JoinColumn(name = "authorid"))
	@Column(name = "skills")
	private Set<String> skills;

	@CollectionTable(name = "qulaifact", joinColumns = @JoinColumn(name = "authorid"))
	@Column(name = "qualification")
	private List<String> qualification;

	@CollectionTable(name = "myexps", joinColumns = @JoinColumn(name = "authorid"))
	@Column(name = "myexps")
	private Map<String, Integer> exps;

	@CollectionTable(name = "mybooks", joinColumns = @JoinColumn(name = "authorid"))
	@Column(name = "mybooks")
	private Set<Book> mybooks;

	// cons

	public Author() {

	}

	// param cons

	public Author(int authorId, String authorName, String email, long phone, Set<String> skills,
			List<String> qualification, Map<String, Integer> exps, Set<Book> mybooks) {
		super();
		this.authorId = authorId;
		this.authorName = authorName;
		this.email = email;
		this.phone = phone;
		this.skills = skills;
		this.qualification = qualification;
		this.exps = exps;
		this.mybooks = mybooks;
	}

	// setter getter

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
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

	public Set<String> getSkills() {
		return skills;
	}

	public void setSkills(Set<String> skills) {
		this.skills = skills;
	}

	public List<String> getQualification() {
		return qualification;
	}

	public void setQualification(List<String> qualification) {
		this.qualification = qualification;
	}

	public Map<String, Integer> getExps() {
		return exps;
	}

	public void setExps(Map<String, Integer> exps) {
		this.exps = exps;
	}

	public Set<Book> getMybooks() {
		return mybooks;
	}

	public void setMybooks(Set<Book> mybooks) {
		this.mybooks = mybooks;
	}

	// toString ()

	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", authorName=" + authorName + ", email=" + email + ", phone=" + phone
				+ ", skills=" + skills + ", qualification=" + qualification + ", exps=" + exps + ", mybooks=" + mybooks
				+ "]";
	}

}
