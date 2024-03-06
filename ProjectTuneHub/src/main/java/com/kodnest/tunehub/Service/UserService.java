package com.kodnest.tunehub.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.kodnest.tunehub.entity.User;

@Service
public interface UserService {
	
	public String addUser(@ModelAttribute User user);
	
	public boolean validateUser(String email,String password);
	
	public boolean  emailExists(String email);
	
	public String getRole(String email);
	
	public User getUser(String email);
	public void updateUser(User user);
 
}
