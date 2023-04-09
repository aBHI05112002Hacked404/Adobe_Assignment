package com.adobe.controller;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adobe.exception.ResourceNotFoundException;
import com.adobe.model.User;
import com.adobe.repository.PostRepository;
import com.adobe.repository.UserRepository;
import com.adobe.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping("/users")
	public ResponseEntity<User> rootUserHandler(@PathVariable Integer userId) throws ResourceNotFoundException{
		
		System.out.println("get user by id");
		
		User user=new User();
		user.setEmail("demo@gmai.com");
		
		return new ResponseEntity<User>(user,HttpStatus.OK);
		
		
	}
	
	@GetMapping("/users/{userId}")
	public ResponseEntity<User> findUserByIdHandler(@PathVariable Integer userId) throws ResourceNotFoundException{
		
		System.out.println("get user by id");
		

		
		User user=userService.findUserById(userId);
		
		return new ResponseEntity<User>(user,HttpStatus.OK);
		
		
	}
	
}
