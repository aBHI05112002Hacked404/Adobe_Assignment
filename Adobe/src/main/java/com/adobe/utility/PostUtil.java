package com.adobe.utility;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.adobe.model.Post;

public class PostUtil {

	public static void sortPostsByLikes(List<Post> posts) {
	    Comparator<Post> comparator = new Comparator<Post>() {
	      @Override
	      public int compare(Post p1, Post p2) {
	        int likes1 = p1.getLikedUser().size();
	        int likes2 = p2.getLikedUser().size();
	        return likes2 - likes1;
	      }
	    };
	    Collections.sort(posts, comparator);
	  }
}
