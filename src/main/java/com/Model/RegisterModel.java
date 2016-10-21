package com.Model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Entity
@Component("register")
public class RegisterModel {
	@Id
	@Column
	private String username;
	
	@Column
	@Size(min=5 ,max=20)
	private String password;

	@Column
	private String firstname,lastname,address;

	@Column
	private String emailid;

	@Column
	@Size(min=10, max=10)
	private String mobilenumber;
	
	@Column
	private String  role="ROLE_USER";

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getRole() {
		return role;
	}
	
	
	
	
}
