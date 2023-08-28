package com.chat.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chat.app.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	public User findByUsername(String userName);
}