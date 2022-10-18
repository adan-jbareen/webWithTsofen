package com.tsofen.users.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsofen.users.beans.User;
import com.tsofen.users.beans.UserLoginData;
import com.tsofen.users.repos.UserRepo;

@Service
public class UserService {
	@Autowired
	private UserRepo userRepo;
	
	public List<User> getAllUsers(){
		return userRepo.findAll();
	}
	
	public void addUser(User user) {
		Optional<User> exists = userRepo.findByEmail(user.getEmail());
		if(exists.isPresent() && !exists.isEmpty())
			throw new IllegalStateException("User #" + exists.get().getId() + "-" + 
					   exists.get().getFname() + " " + exists.get().getLname() +" Already Exists!");
		else
			userRepo.save(user);
	}
	
	public boolean userLogin(UserLoginData userLoginData) {
		Optional<User> user = userRepo.findByEmail(userLoginData.getEmail());
		if(!user.isPresent() || user.isEmpty())
			return false;
		else
			if(userLoginData.getPassword().equals(user.get().getPassword()))
				return true;
			else
				return false;
	}

	@Transactional
	public void editUser(User user) {
		Optional<User> user2change = userRepo.findByEmail(user.getEmail());
		user.setId(user2change.get().getId());
		userRepo.save(user);
	}

	public List<User> getUsersByStatus(boolean status) {
		return userRepo.findAllByStatus(status);
	}
	
	
	public User getUserById(String socialId) {
		Optional<User> user = userRepo.findBySocialId(socialId);
		if(!user.isPresent() || user.isEmpty())
			throw new IllegalStateException("User with ID: " + socialId + " Doesn't Exist!");
		else
			return user.get();
		}
}
