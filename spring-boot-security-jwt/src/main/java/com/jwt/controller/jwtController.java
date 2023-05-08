package com.jwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.helper.jwtUtil;
import com.jwt.model.JwtRequest;
import com.jwt.model.jwtResponse;
import com.jwt.services.CustomUserDetailService;

@RestController
public class jwtController {

	@Autowired 
	private CustomUserDetailService customUserDetailService;
	
	@Autowired
	private jwtUtil jwtUtil;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@PostMapping("/token")
	public ResponseEntity<?> generateToken(@RequestBody JwtRequest jwtRequest) throws Exception{

		System.out.println(jwtRequest);
		
		try {
			
			this.authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(jwtRequest.getUsername(), jwtRequest.getPassword()));
			
		} catch (Exception e) {
			System.out.println("Error :" +e);
			throw new Exception("Bad Credentials");
		}
		
		//fine area
		
		UserDetails userDetails = this.customUserDetailService.loadUserByUsername(jwtRequest.getUsername());
		String token=this.jwtUtil.generateToken(userDetails);
		System.out.println("JWT "+token);
		
		return ResponseEntity.ok(new jwtResponse(token));
	}
}
