package com.travel.userdataservice.model;

public class User {
	
	String userId;
	String email;

	@Override
	public String toString() {
		return "User [userId=" + userId + ", email=" + email + "]";
	}

	public User(String userId, String email) {
		super();
		this.userId = userId;
		this.email = email;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
