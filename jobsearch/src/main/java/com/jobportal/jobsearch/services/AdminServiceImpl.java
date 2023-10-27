package com.jobportal.jobsearch.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobportal.jobsearch.entity.AdminEntity;
import com.jobportal.jobsearch.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminRepository adminRepository;

	@Override
	public String login(String username, String password) {

		
		AdminEntity findByUsernameAndPassword = adminRepository.findByUsernameAndPassword(username, password);
		
		if(findByUsernameAndPassword !=null) {
			
			return "Login Success";
		}
		return "Login Failed ! Please provide valid credentails.";
	}

}
