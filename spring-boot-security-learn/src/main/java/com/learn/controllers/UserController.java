package com.learn.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.models.User;
import com.learn.services.UserServiece;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserServiece userServiece;

	// all users
	@GetMapping("/")
	public List<User> getAllUsers() {
		return this.userServiece.getallUsers();
	}

	// return single user
//	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/{userName}")
	public User getUser(@PathVariable("userName") String userName) {
		return this.userServiece.getUser(userName);
	}

	// add user
	@PostMapping("/")
	public User addUser(@RequestBody User user) {
		return this.userServiece.addUser(user);
	}
}
