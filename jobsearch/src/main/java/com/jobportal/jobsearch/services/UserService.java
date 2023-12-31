package com.jobportal.jobsearch.services;

import java.util.List;

import com.jobportal.jobsearch.entity.User;

public interface UserService {

	
	public String register(User user);
	
	public List<User> getUsers();
	
	public String login(String username, String password);

	public String update(User user ,Integer id)  throws Exception;
	
	
	public String delete(Integer id);
	
	public User getUserById(Integer id) throws Exception;
	
}
