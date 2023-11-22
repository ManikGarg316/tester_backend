package com.example.RentandDrive_Backend.entities;
import jakarta.validation.constraints.Size;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//import jakarta.persistence.GeneratedValue;

@Entity
@Table(name = "Users")
public class User {
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@Size(min = 2, max=20)
	private String username;
	
	private String password;
	
	private String mobile;
	
	private String name;
	
	private String email;
	
	private String role;
	
	public User(@Size(min = 2, max = 20) String username, String password, String mobile, String name, String email,
			String role) {
		super();
		this.username = username;
		this.password = password;
		this.mobile = mobile;
		this.name = name;
		this.email = email;
		this.role = role;
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", mobile=" + mobile + ", name=" + name
				+ ", email=" + email + ", role=" + role + "]";
	}
	
	
//	@Id
//	@GeneratedValue
//	private long id;
//	private String username;
//	private String password;
//	private String role;
//	public User(long id, String username, String password, String role) {
//		super();
//		this.id = id;
//		this.username = username;
//		this.password = password;
//		this.role = role;
//	}
//	public long getId() {
//		return id;
//	}
//	public void setId(long id) {
//		this.id = id;
//	}
//	public String getUsername() {
//		return username;
//	}
//	public void setUsername(String username) {
//		this.username = username;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	public String getRole() {
//		return role;
//	}
//	public void setRole(String role) {
//		this.role = role;
//	}
	
}
