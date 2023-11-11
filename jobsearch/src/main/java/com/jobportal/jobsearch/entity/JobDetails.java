package com.jobportal.jobsearch.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "jobdetails")
public class JobDetails {

	@Id
	int id;
	
	@Column(name ="role")
	String role;

	@Column(name ="skills")
	String skills;
	
	@Column(name ="jobdescription")
	String jobDescription;
	
	@Column(name ="orgname")
	String orgName;

	@JsonProperty("companyId")
	@Column(name="company_id" )
	int companyId;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	
	

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	@Override
	public String toString() {
		return "JobDetails [id=" + id + ", role=" + role + ", skills=" + skills + ", jobDescription=" + jobDescription
				+ ", orgName=" + orgName + ", companyId=" + companyId + "]";
	}
	
}
