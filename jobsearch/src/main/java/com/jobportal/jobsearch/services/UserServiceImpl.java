package com.jobportal.jobsearch.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobportal.jobsearch.entity.User;
import com.jobportal.jobsearch.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public String register(User user) {

		User save = userRepository.save(user);

		if (save != null) {

			return "Registration Successfull ! You can login";
		}

		return "Registration Failed!";
	}

	@Override
	public List<User> getUsers() {

		List<User> response = userRepository.findAll();

		return response;
	}

	@Override
	public String login(String username, String password) {

		User user = userRepository.findByNameAndPassword(username, password);

		if (user != null) {

			return "Login Success.....";
		}

		return "Login Failed ! Please provide valid creds......!";
	}

	@Override
	public String update(User user, Integer id) throws Exception {

		Optional<User> findById = userRepository.findById(id);

		if (findById.isPresent()) {

			User userObject = findById.get();

			userObject.setEmail(user.getEmail());
			userObject.setMobile(user.getMobile());

			User save = userRepository.save(userObject);

			if (save != null) {

				return "Profile data is updated...";

			}
		} else {

			throw new Exception("UserId " + id + " is not found in the DB");
		}

		return "Data is not updated Please check the process.";
	}

	@Override
	public String delete(Integer id) {

		Optional<User> findById = userRepository.findById(id);

		if (findById.isPresent()) {
			userRepository.deleteById(id);
			return "User  " + id + " is Deleted..";

		} else {
			return "User  " + id + " is not found in the db";
		}
	}

}
