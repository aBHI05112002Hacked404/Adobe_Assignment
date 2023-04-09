package com.adobe.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adobe.exception.ResourceNotFoundException;
import com.adobe.model.User;
import com.adobe.repository.UserRepository;
import com.adobe.utility.UserUtil;


@Service
public class UserServiceImpl implements UserService{

	
	@Autowired
	private UserRepository userRepository;
	
	
	
	
	
	@Override
	public User findUserById(Integer userId) throws ResourceNotFoundException {
		Optional<User> opt=userRepository.findById(userId);
		
		
		
		if(opt.isPresent()) {
			return opt.get();
		}
		throw new ResourceNotFoundException("user not found with id "+userId);
	}

	@Override
	public User updatedUser(Integer userId, User user, String token) throws ResourceNotFoundException {
		
		User oldUser=findUserById(userId);
		
		
		
		if(user.getName()!=null) {
			
			oldUser.setName(user.getName());
			
		}
		if(user.getBio()!=null) {
			oldUser.setBio(user.getBio());
		}
		
		oldUser.setUpdatedAt(LocalDateTime.now());
		return userRepository.save(oldUser);
	}

	@Override
	public void deleteUser(Integer userId) throws ResourceNotFoundException {
		
		User user=findUserById(userId);
		
		userRepository.delete(user);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer totalNumberOfUsers() {
		List<User> users=userRepository.findAll();
		
		return users.size();
	}

	@Override
	public List<User> topActiveUser() {
		List<User> users = userRepository.findAll();
		
		UserUtil.sortUserByNumberOfPost(users);
		
		int numUsers = Math.min(users.size(), 5); 
		List<User> topUsers = users.subList(0, numUsers);
		
		return topUsers;
	}

	@Override
	public User getUserProfile(String jwt) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
	
		
//		System.out.println("email token - "+jwt);
//
//	    String email = jwtTokenProvider.getEmailFromToken(jwt);
//	    
//	    System.out.println("email token - "+email);
//	    
//	    Optional<User> opt = userRepository.findByEmail(email);
//	    
//	    if(opt.isPresent()) {
//
//	    	
//	    	return opt.get();
//	    	
//	    }
//		
//	    throw new ResourceNotFoundException("user not exist with email : "+email);
		return null;

	}

}
