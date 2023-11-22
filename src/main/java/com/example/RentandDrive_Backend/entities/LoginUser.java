package com.example.RentandDrive_Backend.entities;

public class LoginUser {
	public LoginUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginUser(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	private String username;
	private String password;
	@Override
	public String toString() {
		return "LoginUser [username=" + username + ", password=" + password + "]";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
