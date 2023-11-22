package com.example.RentandDrive_Backend.services;

import java.util.List;
import java.util.Optional;

import com.example.RentandDrive_Backend.entities.User;

public interface UserService {
	public String addUser(User user);
	public String editUser(User user, String username);
	public String deleteUser(String username);
	public String loginUser(String username, String password);
	public List<User> getAllUsers();
	public Optional<User> getUser(String username);
}
