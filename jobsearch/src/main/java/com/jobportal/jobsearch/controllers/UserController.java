package com.jobportal.jobsearch.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobportal.jobsearch.entity.User;
import com.jobportal.jobsearch.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/save")
	public String saveUser(@RequestBody User user) {
		
		String result = userService.register(user);
		
		return result;
	}

}
