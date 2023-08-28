package com.chat.app.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "multimessage")
public class MultiMessage {
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private Integer id;
	private String sender;
	private String content;
	private String chatRoomName;
	private Timestamp timestamp;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getChatRoomName() {
		return chatRoomName;
	}
	public void setChatRoomName(String chatRoomName) {
		this.chatRoomName = chatRoomName;
	}
	
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	public MultiMessage() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public MultiMessage(Integer id, String sender, String content, String chatRoomName, Timestamp timestamp) {
		super();
		this.id = id;
		this.sender = sender;
		this.content = content;
		this.chatRoomName = chatRoomName;
		this.timestamp = timestamp;
	}
	
}