package com.chat.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chat.app.model.MultiMessage;
import com.chat.app.model.SingleMessage;
import com.chat.app.service.ChatMessageService;

@RestController
@RequestMapping("/chatservice")
public class ChatMessageController {

	@Autowired
	private ChatMessageService chatMessageService;
	
	@PostMapping("/singlesend/{username}")
	public String sendMessage(@PathVariable String userName, @RequestBody SingleMessage chatMessage) {
		return chatMessageService.send(userName, chatMessage);
	}

	@PostMapping("/multisend/{chatroomname}")
	public String sendMultiMessage(@PathVariable String userName, @RequestBody MultiMessage message) {
		return chatMessageService.sendMultiMessage(userName, message);
	}
	
}