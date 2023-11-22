package com.example.RentandDrive_Backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RentandDrive_Backend.entities.User;

public interface UserRepository extends JpaRepository<User, String>{

	Optional<User> findByUsernameAndPassword(String username, String password);

}
