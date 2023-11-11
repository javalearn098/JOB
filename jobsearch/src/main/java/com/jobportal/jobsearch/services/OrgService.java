package com.jobportal.jobsearch.services;

import java.util.List;

import com.jobportal.jobsearch.entity.JobDetails;
import com.jobportal.jobsearch.entity.Organization;

public interface OrgService {

	
	public String registerOrg(Organization org);
	
	public String login(String username , String password);
	
	public List<Organization> companyList(); 
	
	
}
