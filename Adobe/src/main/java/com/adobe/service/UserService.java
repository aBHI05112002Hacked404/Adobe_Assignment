package com.adobe.service;

import java.util.List;

import com.adobe.exception.ResourceNotFoundException;
import com.adobe.model.User;

public interface UserService {

public User findUserById(Integer userId) throws ResourceNotFoundException;
	
	public User updatedUser(Integer userId, User user, String token) throws ResourceNotFoundException;
	
	public void deleteUser(Integer userId) throws ResourceNotFoundException;
	
	public Integer totalNumberOfUsers();
	
	public List<User> topActiveUser();
	
	public User getUserProfile(String jwt) throws ResourceNotFoundException;
}
