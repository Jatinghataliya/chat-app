package com.chat.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chat.app.model.MultiMessage;
import com.chat.app.model.SingleMessage;
import com.chat.app.repository.MultiMessageRepository;
import com.chat.app.repository.SingletMessageRepository;

@Service
public class ChatMessageService {

	@Autowired
	private SingletMessageRepository chatMessageRepository;
	
	@Autowired
	private MultiMessageRepository multiMessageRepository;

	public String send(String userName, SingleMessage chatMessage) {
		chatMessageRepository.save(chatMessage);
		return "Message sent to the " + chatMessage.getReceiver();
	}

	public String sendMultiMessage(String userName, MultiMessage message) {
		multiMessageRepository.save(message);
		return "Message sent to the chat room " + message.getChatRoomName();
	}
}
