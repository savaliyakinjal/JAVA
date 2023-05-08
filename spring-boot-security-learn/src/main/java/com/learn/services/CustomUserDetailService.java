package com.learn.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.learn.UserRepository;
import com.learn.models.CustomUserDetails;
import com.learn.models.User;

@Service
public class CustomUserDetailService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user=this.userRepository.findByUserName(username);
		if (user==null) {
			throw new UsernameNotFoundException(" No User");
		}
		
		return new CustomUserDetails(user);
	}

}
