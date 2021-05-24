package com.xworkz.commonmodule.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.GenericGenerators;

import lombok.Data;

@Entity
@Table(name = "Endgame21v02")
@Data
@NamedQueries({
		@NamedQuery(name = "getbyemail", query = "from RegisterEntity as ed where ed.emailid=:emailId") })
public class RegisterEntity {

	@Id
//	@GenericGenerator(name = "anything", strategy = "increment")
//	@GeneratedValue(generator = "anything")
	// or
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(name = "FULL_NAME")
	private String fullname;

	@Column(name = "EMAIL_ID")
	private String emailid;

	@Column(name = "CONTACT")
	private long contact;

	@Column(name = "DOB")
	private String dateofbirth;

	@Column(name = "ADDRESS")
	private String address;

	@Column(name = "GENDER")
	private String gender;

	@Column(name = "PASSWORD")
	private String createpassword;

	@Column(name = "REGISTEREDBY")
	private String registeredBy;

	@Column(name = "REGISTERED_DATE")
	private String registeredDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCreatepassword() {
		return createpassword;
	}

	public void setCreatepassword(String createpassword) {
		this.createpassword = createpassword;
	}

	public String getRegisteredBy() {
		return registeredBy;
	}

	public void setRegisteredBy(String registeredBy) {
		this.registeredBy = registeredBy;
	}

	public String getRegisteredDate() {
		return registeredDate;
	}

	public void setRegisteredDate(String registeredDate) {
		this.registeredDate = registeredDate;
	}
}
