package com.example.RentandDrive_Backend.services;

import com.example.RentandDrive_Backend.entities.User;
import com.example.RentandDrive_Backend.repository.UserRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
@Service
public class UserServiceClass implements UserService{
	@Autowired
	private BCryptPasswordEncoder pwdEncoder;
	@Autowired
	private UserRepository repo;
	@Override
	public String addUser(User user) {
		// TODO Auto-generated method stub
		String pwd = user.getPassword();
		String encPwd = pwdEncoder.encode(pwd);
		user.setPassword(encPwd);
		user = repo.save(user);
		return "User created successfully";
	}

	@Override
	public String editUser(User user, String username) {
		// TODO Auto-generated method stub
		Optional<User> userDB = repo.findById(username);
		if(userDB.isPresent()) {
			repo.delete(user);
		}
		repo.save(user);
		return "User edited successfully";
	}

	@Override
	public String deleteUser(String username) {
		// TODO Auto-generated method stub
		repo.deleteById(username);
		return "User deletion successful";
	}

	@Override
	public String loginUser(String username, String password) {
		// TODO Auto-generated method stub
//		String encPwd = pwdEncoder.encode(password);
//		System.out.println(encPwd);
		Optional<User> userDB = repo.findById(username);
		if(userDB.isPresent()) {
			System.out.println(userDB);
			if(pwdEncoder.matches(password, userDB.get().getPassword())) {
				return userDB.get().getUsername();
			}
			return "Wrong password";
		}
		return "Username does not exist";
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Optional<User> getUser(String username) {
		// TODO Auto-generated method stub
		return repo.findById(username);
	}

}
