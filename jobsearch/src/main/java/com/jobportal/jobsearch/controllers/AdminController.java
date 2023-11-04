package com.jobportal.jobsearch.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jobportal.jobsearch.entity.JobDetails;
import com.jobportal.jobsearch.entity.Organization;
import com.jobportal.jobsearch.entity.User;
import com.jobportal.jobsearch.services.AdminService;
import com.jobportal.jobsearch.services.JobService;
import com.jobportal.jobsearch.services.OrgService;
import com.jobportal.jobsearch.services.UserService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	AdminService adminService;

	@Autowired
	UserService userService;

	@Autowired
	OrgService orgService;
	
	@Autowired
	JobService jobService;

	@GetMapping("/login")
	public String login(@RequestParam(name = "user") String username, @RequestParam(name = "pass") String password) {

		String message = adminService.login(username, password);

		return message;
	}

	@GetMapping("/userlist")
	public List<User> getUsers() {

		List<User> users = userService.getUsers();

		return users;
	}

	@GetMapping("/orglist")
	public List<Organization> orgList() {

		List<Organization> companyList = orgService.companyList();

		return companyList;
	}
	
	@GetMapping("/jobList")
	public List<JobDetails> getJobPostList(){
		return jobService.getJobPostsList();
	}

}
