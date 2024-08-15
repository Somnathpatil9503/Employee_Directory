package com.luv2code.springboot.thymeleafdemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

	// define fields

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	@Column(name="first_name")
	private String firstName;

	@Column(name="last_name")
	private String lastName;

	@Column(name="email")
	private String email;

	@Column(name="mobile_no")
	private String mobileNo;

	@Column(name="gender")
	private String gender;

	@Column(name="aadhar_number")
	private String aadharNumber;

	@Column(name="address")
	private String address;

	@Column(name="previous_school_name")
	private String previousSchoolName;

	@Column(name="mother_name")
	private String motherName;

	// define constructors

	public Employee() {

	}

	public Employee(String firstName, String lastName, String email, String mobileNo, String gender,
					String aadharNumber, String address, String previousSchoolName, String motherName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNo = mobileNo;
		this.gender = gender;
		this.aadharNumber = aadharNumber;
		this.address = address;
		this.previousSchoolName = previousSchoolName;
		this.motherName = motherName;
	}

	// define getter/setter methods

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPreviousSchoolName() {
		return previousSchoolName;
	}

	public void setPreviousSchoolName(String previousSchoolName) {
		this.previousSchoolName = previousSchoolName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	// define tostring method

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName +
				", email=" + email + ", mobileNo=" + mobileNo + ", gender=" + gender +
				", aadharNumber=" + aadharNumber + ", address=" + address +
				", previousSchoolName=" + previousSchoolName + ", motherName=" + motherName + "]";
	}

}
