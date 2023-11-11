package com.jobportal.jobsearch.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
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
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "company_id" , referencedColumnName = "id")
	List<JobDetails> jobDetails;

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
	
		public List<JobDetails> getJobDetails() {
		return jobDetails;
	}

	public void setJobDetails(List<JobDetails> jobDetails) {
		this.jobDetails = jobDetails;
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
