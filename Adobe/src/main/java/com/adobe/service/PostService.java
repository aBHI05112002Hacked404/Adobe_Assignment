package com.adobe.service;

import java.util.List;

import com.adobe.exception.PostException;
import com.adobe.exception.ResourceNotFoundException;
import com.adobe.model.Post;
import com.adobe.request.PostRequest;

public interface PostService {

	    
    public Post createPost(PostRequest postRequest) throws ResourceNotFoundException;
	
	public Post findPostById(Integer postId) throws PostException;
	
	public String updatePostById(Integer postId,Post post, Integer userId) throws PostException;
	
	public String deletePostById(Integer postId,Integer userId) throws PostException, ResourceNotFoundException;
	
	public Post likePost(Integer postId ,Integer userId) throws ResourceNotFoundException, PostException;
	
	public Post unLikePost(Integer postId ,Integer userId) throws ResourceNotFoundException, PostException;
	
	public Integer totalNumberOfPost();
	
	public List<Post> topLikedPost();
}
