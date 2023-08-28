package com.chat.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chat.app.model.MultiMessage;

public interface MultiMessageRepository extends JpaRepository<MultiMessage, Integer>{
	List<MultiMessage> findByChatRoomName(String chatRoomName);
	List<MultiMessage> findBySender(String sender);
}
