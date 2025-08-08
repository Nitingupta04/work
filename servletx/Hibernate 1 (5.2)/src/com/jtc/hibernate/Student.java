package com.jtc.hibernate;
import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "student_table")

// POJO class

public class Student {

	// All the data types
	@Id

	private int sid;
	@Column
	private String sname;
	private String email;
	private long phone_no;
	private String[] course;
	private List<String> skills;
	private List<Integer> marks;
	private Set<String> interview;
	private Map<String, Integer> refs;

	// All Getter and setters

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}

	public String[] getCourse() {
		return course;
	}

	public void setCourse(String[] course) {
		this.course = course;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	public List<Integer> getMarks() {
		return marks;
	}

	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}

	public Set<String> getInterview() {
		return interview;
	}

	public void setInterview(Set<String> interview) {
		this.interview = interview;
	}

	public Map<String, Integer> getRefs() {
		return refs;
	}

	public void setRefs(Map<String, Integer> refs) {
		this.refs = refs;
	}

}
