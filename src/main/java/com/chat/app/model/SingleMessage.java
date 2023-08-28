package com.chat.app.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "chatmessage")
public class SingleMessage {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private Integer id;
    private String content;
    private String sender;
    private String receiver;
    private Timestamp timestamp;
    private MessageType type;

    public enum MessageType {
        CHAT, LEAVE, JOIN
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

   
    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return sender;
	}

	public void setUserName(String userName) {
		this.sender = userName;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public SingleMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SingleMessage(Integer id, String content, String sender, String receiver, Timestamp timestamp,
			MessageType type) {
		super();
		this.id = id;
		this.content = content;
		this.sender = sender;
		this.receiver = receiver;
		this.timestamp = timestamp;
		this.type = type;
	}
    
}