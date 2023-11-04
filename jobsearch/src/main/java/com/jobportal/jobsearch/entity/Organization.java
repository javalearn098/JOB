package com.jobportal.jobsearch.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "company")
public class Organization {

	@Id
	int id;

	@Column(name = "company")
	String orgName;

	@Column(name = "address")
	String address;

	@Column(name = "contact")
	String contact;

	@Column(name = "email")
	String email;
	
	@Column(name = "password")
	String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Organization [id=" + id + ", orgName=" + orgName + ", address=" + address + ", contact=" + contact
				+ ", email=" + email + ", password=" + password + "]";
	}

}
