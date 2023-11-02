package com.jobportal.jobsearch.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "organization")
public class Organization {

	@Id
	int id;

	@Column(name = "orgName")
	String orgName;

	@Column(name = "address")
	String addess;

	@Column(name = "contact")
	String contact;

	@Column(name = "email")
	String email;

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

	public String getAddess() {
		return addess;
	}

	public void setAddess(String addess) {
		this.addess = addess;
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

	@Override
	public String toString() {
		return "Organization [id=" + id + ", orgName=" + orgName + ", addess=" + addess + ", contact=" + contact
				+ ", email=" + email + "]";
	}

}
