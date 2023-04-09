package com.adobe.utility;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.adobe.model.User;

public class UserUtil {

	public static void sortUserByNumberOfPost(List<User> users) {
	    Comparator<User> comparator = new Comparator<User>() {
	      @Override
	      public int compare(User u1, User u2) {
	        int likes1 = u1.getPosts().size();
	        int likes2 = u2.getPosts().size();
	        return likes2 - likes1;
	      }
	    };
	    Collections.sort(users, comparator);
	}
}
