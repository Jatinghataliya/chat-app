package com.chat.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chat.app.model.SingleMessage;

public interface SingletMessageRepository extends JpaRepository<SingleMessage, Integer>{
	List<SingleMessage> findByReceiver(String receiver);
	List<SingleMessage> findBySender(String sender);
}