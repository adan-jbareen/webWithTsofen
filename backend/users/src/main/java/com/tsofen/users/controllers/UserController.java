package com.tsofen.users.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.tsofen.users.beans.User;
import com.tsofen.users.beans.UserLoginData;
import com.tsofen.users.services.UserService;

@CrossOrigin()
@RestController
@RequestMapping("api/users")
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("getusers")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@GetMapping("getusersby")
	public List<User> getUsersBy(@RequestParam boolean status){
		return userService.getUsersByStatus(status);
	}
	
	@PostMapping("adduser")
	public void addUser(@RequestBody User user) {
		userService.addUser(user);
	}
	
	@PostMapping("login")
	public boolean login(@RequestBody UserLoginData user) {
		return userService.userLogin(user);
	}
	
	@PutMapping("edituser")
	public void editUser(@RequestBody User user) {
		userService.editUser(user);
	}
	
	@PostMapping
	public User getUserById(@RequestBody String socialId) {
		return userService.getUserById(socialId);
	}
}
