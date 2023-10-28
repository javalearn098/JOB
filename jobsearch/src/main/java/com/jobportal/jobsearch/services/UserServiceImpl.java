package com.jobportal.jobsearch.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobportal.jobsearch.entity.User;
import com.jobportal.jobsearch.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	
	@Autowired
	UserRepository userRepository;
	
	
	@Override
	public String register(User user) {
		
		User save = userRepository.save(user);
		
		if(save !=null) {
			
			return "Registration Successfull ! You can login";
		}
		
		return "Registration Failed!";
	}


	@Override
	public List<User> getUsers() {
		
		List<User> response = userRepository.findAll();
		
		return response;
	}

	
	
}
