package com.jobportal.jobsearch.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobportal.jobsearch.entity.AdminEntity;
import com.jobportal.jobsearch.repository.AdminRepository;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	AdminRepository adminRepository;
	
	
	@GetMapping("/details")
	public List<AdminEntity> getAdminDetails() {
		
		List<AdminEntity> findAll = adminRepository.findAll();
		
		return findAll;
	}
	
}
