package com.example.RentandDrive_Backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.RentandDrive_Backend.entities.User;
import com.example.RentandDrive_Backend.services.UserService;
import java.util.Optional;
@CrossOrigin(origins = "http://localhost:3000")
@Controller
public class UserController {
	@Autowired
	private UserService service;
	
	@GetMapping("/users")
	public List<User> fetchAllUsers(){
		return service.getAllUsers();
		
	}
	
	@GetMapping("/users/{username}")
	public String fetchUser(@PathVariable String username){
		Optional<User> userDB = service.getUser(username);
		if(userDB.isPresent()) {
			return userDB.get().getUsername() + "," + userDB.get().getEmail() + "," + userDB.get().getMobile()  + "," + userDB.get().getRole();
		}
		return "User does not exist";
	}
}
