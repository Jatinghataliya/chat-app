package com.chat.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chat.app.model.ChatRoom;

public interface ChatRoomRepository extends JpaRepository<ChatRoom, Integer>{
	public ChatRoom findByChatRoomName(String chatRoomName);
}
