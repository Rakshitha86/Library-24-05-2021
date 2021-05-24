package com.xworkz.commonmodule.dto;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;

@Data
public class RegisterDTO {

	private String fullname;
	private String emailid;
	private long contact;
	private String dateofbirth;
	private String address;
	private String gender;
	private String createpassword;

	public String getFullname() {
		return fullname;
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

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

}
