package com.learn;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.models.User;

public interface UserRepository extends JpaRepository<User, String> {

	public User findByUserName(String userName);
}
