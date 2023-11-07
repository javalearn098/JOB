package com.jobportal.jobsearch.controllers;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jobportal.jobsearch.entity.JobDetails;
import com.jobportal.jobsearch.entity.User;
import com.jobportal.jobsearch.services.JobService;
import com.jobportal.jobsearch.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	Logger logger = LogManager.getLogger(UserController.class);

	@Autowired
	UserService userService;

	@Autowired
	JobService jobService;

	@PostMapping("/save")
	public String saveUser(@RequestBody User user) {

		logger.info("inside saveUser() method ");
		String result = userService.register(user);

		logger.info("Object for saving into db " + result);
		return result;
	}

	@GetMapping("/login")
	public String login(@RequestParam(name = "username") String username,
			@RequestParam(name = "password") String password) {

		String message = userService.login(username, password);
		return message;
	}

	@GetMapping("/jobList")
	public List<JobDetails> getJobPostList() {
		return jobService.getJobPostsList();
	}

	@PutMapping("/update/{id}")
	public String updateUser(@RequestBody User user, @PathVariable(name = "id") Integer id) {

		String message;
		try {
			message = userService.update(user, id);
		} catch (Exception e) {
			return e.getMessage();
		}
		return message;
	}

	@DeleteMapping("/remove/{id}")
	public String deleteuser(@PathVariable(name = "id") Integer id) {

		String message = userService.delete(id);
		return message;
	}

}
