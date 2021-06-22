package com.example.auth.service;
import com.example.auth.model.User;
import com.example.auth.repository.UserRepository;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	/*
	 * Get Method 
	 * 0 Params
	 */
	
	public List<User> getUserData() {
		
		List<User> userDetails = new ArrayList<User>();
		
		for (User user : userRepository.findAll()) {
			userDetails.add(user);
		}
		
		return userDetails;
		
	}
	
	/*
	 * POST method
	 * 1 params - newUser: User Object
	 */
	
	public String addUserData(User newUser) {
		userRepository.save(newUser);
		return "user add successfully";
	}
}
