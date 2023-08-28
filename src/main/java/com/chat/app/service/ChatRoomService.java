package com.chat.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chat.app.model.ChatRoom;
import com.chat.app.model.User;
import com.chat.app.repository.ChatRoomRepository;

@Service
public class ChatRoomService {

	@Autowired
	private ChatRoomRepository chatRoomRepository;
	
	public ChatRoom createChatRoom(ChatRoom chatRoom) {
		return chatRoomRepository.save(chatRoom);
	}

	public boolean joinChatRoom(String chatRoomName, User user) {
		ChatRoom chatRoom = chatRoomRepository.findByChatRoomName(chatRoomName);
		chatRoom.addUser(user);
		chatRoomRepository.save(chatRoom);
		return true;
	}

}
