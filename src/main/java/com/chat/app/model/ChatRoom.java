package com.chat.app.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "chatroom")
public class ChatRoom {
	@Column(unique = true)
	private String chatRoomName;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "chatroom")
	@JsonIgnore
	private Set<User> users;
	
	
	public String getChatRoomName() {
		return chatRoomName;
	}
	public void setChatRoomName(String chatRoomName) {
		this.chatRoomName = chatRoomName;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	
	public ChatRoom() {
		super();
	}
	
	public void addUser(User user) {
		this.users.add(user);
		user.getChatRooms().add(this);
	}
	
	public ChatRoom(String chatRoomName, Integer id, Set<User> users) {
		super();
		this.chatRoomName = chatRoomName;
		this.id = id;
		this.users = users;
	}
		
}