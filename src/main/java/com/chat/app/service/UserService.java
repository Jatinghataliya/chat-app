package com.chat.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chat.app.model.User;
import com.chat.app.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public User createUser(User user) {
		return repository.save(user);
	}

	public boolean login(User user) {
		User user2 = repository.findByUsername(user.getUserName());
		if (user2 != null) {
			return user2.getUserName().equals(user.getUserName()) && user2.getPassword().equals(user.getPassword());
		}
		return false;
	}

}