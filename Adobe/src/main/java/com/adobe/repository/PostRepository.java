package com.adobe.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.adobe.model.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {
	
	@Query("Select p, u.id, u.email, u.name FROM Post p INNER JOIN User u ON p.user = u.id Where p.id = :postId")
    Optional<Post> findPostByPostIdWithUser(@Param("postId") Integer postId);
}
