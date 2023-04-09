package com.adobe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.adobe.exception.PostException;
import com.adobe.model.Post;
import com.adobe.model.User;
import com.adobe.request.PostRequest;
import com.adobe.service.PostService;
import com.adobe.service.UserService;

@RestController
public class PostController {

	@Autowired
	private UserService userService;
	@Autowired
	private PostService postService;

	
	
	
	

}
