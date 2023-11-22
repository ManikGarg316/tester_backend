package com.example.RentandDrive_Backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.RentandDrive_Backend.entities.LoginUser;
import com.example.RentandDrive_Backend.entities.User;
import com.example.RentandDrive_Backend.services.UserService;

@CrossOrigin(origins = "http://localhost:3000")
@Controller
public class LoginController {
	@Autowired
	private UserService service;
	
	@PostMapping("/login")
//	@RequestBody
	public ResponseEntity<String> loginHandler(@RequestBody LoginUser userData)
	{
//		System.out.println(userData.);
		String msg = service.loginUser(userData.getUsername(), userData.getPassword());
		System.out.println(msg);
//		
//		if(id!=null) {
//			String text = "User : "+ user.getName() +" , created with roles:"+user.getRoles();
//			boolean sent = emailUtil.send(user.getEmail(), "WELCOME TO USER!", text);
//			if(sent)
//				msg+=", Email also sent :)";
//			else 
//				msg+=", Email sending Failed :(";
//		}
//		
		ResponseEntity<String> resp=new ResponseEntity<String>(msg,HttpStatus.OK);
		return resp;
	}
}
