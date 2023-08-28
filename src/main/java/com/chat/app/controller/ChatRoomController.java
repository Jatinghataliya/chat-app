package com.chat.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chat.app.model.ChatRoom;
import com.chat.app.model.User;
import com.chat.app.service.ChatRoomService;

@RestController
@RequestMapping("/chatroomservice")
public class ChatRoomController {

	@Autowired
	private ChatRoomService chatRoomService;
	
	@PostMapping("/create")
	public ChatRoom createChatRoom(@RequestBody ChatRoom chatRoom) {
		return chatRoomService.createChatRoom(chatRoom);
	}
	
	@PutMapping("/join/{chatRoomName}")
	public boolean joinChatRoom(@PathVariable String chatRoomName, @RequestBody User user) {
		return chatRoomService.joinChatRoom(chatRoomName, user);
	}
}
