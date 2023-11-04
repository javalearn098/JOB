package com.jobportal.jobsearch.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jobportal.jobsearch.entity.JobDetails;
import com.jobportal.jobsearch.entity.Organization;
import com.jobportal.jobsearch.services.JobService;
import com.jobportal.jobsearch.services.OrgService;

@RestController
@RequestMapping("/company")
public class OrgganizationController {

	@Autowired
	OrgService orgService;

	@Autowired
	JobService jobService;

	@PostMapping("/save")
	public String save(@RequestBody Organization org) {

		String message = orgService.registerOrg(org);

		return message;
	}

	@GetMapping("/login")
	public String login(@RequestParam(name = "email") String email, @RequestParam(name = "password") String password) {

		String message = orgService.login(email, password);

		return message;
	}

	@PostMapping("/postJobDetails")
	public String postJobDetails(@RequestBody JobDetails jobDetails) {

		return jobService.postJobDetails(jobDetails);

	}

}
