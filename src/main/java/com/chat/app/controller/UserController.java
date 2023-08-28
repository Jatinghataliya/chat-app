package com.chat.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chat.app.model.User;
import com.chat.app.service.UserService;

@RestController
@RequestMapping("/userservice")
public class UserController {

	@Autowired
	private UserService userService;
	
	
	@PostMapping("/registration")
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}

	@PostMapping("/login")
	public boolean login(@RequestBody User user) {
		return userService.login(user);
	}
	
}
