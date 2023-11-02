package com.jobportal.jobsearch.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobportal.jobsearch.entity.Organization;
import com.jobportal.jobsearch.services.OrgService;

@RestController
@RequestMapping(name = "/organization")
public class OrgController {

	@Autowired
	OrgService orgService;

	@PostMapping("/save")
	public String save(@RequestBody Organization org) {

		String message = orgService.registerOrg(org);

		return message;
	}

}
