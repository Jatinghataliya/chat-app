package com.chat.app.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private Integer userId;
	@Column(unique = true)
	private String userName;
	private String firstName;
	private String lastName;
	private String password;
	@ManyToMany(fetch =  FetchType.LAZY)
	@JoinTable(name = "user_chat_room", joinColumns = {@JoinColumn(name="username")}, inverseJoinColumns = {@JoinColumn(name="chat_room_id")})
	private Set<ChatRoom> chatRooms;
	
	
	public User() {
		super();
	}
	
	public User(Integer userId, String userName, String firstName, String lastName, String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public Set<ChatRoom> getChatRooms() {
		return chatRooms;
	}

	public void setChatRooms(Set<ChatRoom> chatRooms) {
		this.chatRooms = chatRooms;
	}
	
	
}