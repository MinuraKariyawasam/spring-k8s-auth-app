package com.example.auth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.auth.model.User;
import com.example.auth.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/user")
	public List<User> getUserData() {
		return userService.getUserData();
	}
	
	@PostMapping("/user")
	public String addUserData(@RequestBody User newUser) {
		return userService.addUserData(newUser);
	}
	
}
