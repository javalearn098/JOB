package com.jobportal.jobsearch.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobportal.jobsearch.entity.Organization;
import com.jobportal.jobsearch.repository.OrgRepository;

@Service
public class OrgServiceImpl implements OrgService{

	
	@Autowired
	OrgRepository orgRepository;
	
	@Override
	public String registerOrg(Organization org) {
	
		Organization organizationResponse = orgRepository.save(org);
		
		if(organizationResponse!=null) {
			
			return "Org details saved successsfully....!";
		}
		
		return "Failed to save org details...Please verify the details...!";
	}

}
