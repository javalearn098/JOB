package com.jobportal.jobsearch.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jobportal.jobsearch.services.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	AdminService adminService;
	
	
	
	@GetMapping("/login")
	public String login(@RequestParam(name = "user") String username , @RequestParam(name = "pass") String password) {
	
		
		String message = adminService.login(username, password);
	
		return message;
	}
	
	
}
