package com.learn.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.learn.models.User;

@Service
public class UserServiece {

	List<User> list = new ArrayList<>();

	public UserServiece() {
		list.add(new User("abc", "abc", "abc@gmail.com",""));
		list.add(new User("xyz", "xyz", "xyz@gmail.com",""));
	}

	// get all users
	public List<User> getallUsers() {
		return this.list;
	}

	// get single user
	public User getUser(String userName) {
		return this.list.stream().filter((user) -> user.getUserName().equals(userName)).findAny().orElse(null);
	}

	// add new user
	public User addUser(User user) {
		this.list.add(user);
		return user;
	}

}
