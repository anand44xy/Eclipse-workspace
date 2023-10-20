package com.entity;

public class Student {
	private int id;
	private String fullName;
	private String address;
	private String email;
	private String dob;
	private String qualification;

	// Default constructor
	public Student() {
		super();
	}

	// Constructor for creating a new Student object
	public Student(String fullName, String address, String email, String dob, String qualification) {
		super();
		this.fullName = fullName;
		this.address = address;
		this.email = email;
		this.dob = dob;
		this.qualification = qualification;
	}

	// Constructor for creating a Student object with an ID
	public Student(int id, String fullName, String address, String email, String dob, String qualification) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.address = address;
		this.email = email;
		this.dob = dob;
		this.qualification = qualification;
	}

	// Getter for ID
	public int getId() {
		return id;
	}

	// Setter for ID
	public void setId(int id) {
		this.id = id;
	}

	// Getter for fullName
	public String getFullName() {
		return fullName;
	}

	// Setter for fullName
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	// Getter for address
	public String getAddress() {
		return address;
	}

	// Setter for address
	public void setAddress(String address) {
		this.address = address;
	}

	// Getter for email
	public String getEmail() {
		return email;
	}

	// Setter for email
	public void setEmail(String email) {
		this.email = email;
	}

	// Getter for dob
	public String getDob() {
		return dob;
	}

	// Setter for dob
	public void setDob(String dob) {
		this.dob = dob;
	}

	// Getter for qualification
	public String getQualification() {
		return qualification;
	}

	// Setter for qualification
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
}
