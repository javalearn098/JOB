package com.jobportal.jobsearch.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobportal.jobsearch.entity.JobDetails;
import com.jobportal.jobsearch.entity.Organization;
import com.jobportal.jobsearch.repository.OrgRepository;

@Service
public class OrgServiceImpl implements OrgService {

	@Autowired
	OrgRepository orgRepository;

	@Override
	public String registerOrg(Organization org) {

		Organization organizationResponse = orgRepository.save(org);

		if (organizationResponse != null) {

			return "Org details saved successsfully....!";
		}

		return "Failed to save org details...Please verify the details...!";
	}

	@Override
	public String login(String username, String password) {

		Organization findByEmailAndPassword = orgRepository.findByEmailAndPassword(username, password);

		if (findByEmailAndPassword != null) {

			return "Login Success...!";
		}
		return "Login Failed..! Please provide a valid username and password.";
	}

	@Override
	public List<Organization> companyList() {

		List<Organization> orgList = orgRepository.findAll();

		return orgList;
	}

}
