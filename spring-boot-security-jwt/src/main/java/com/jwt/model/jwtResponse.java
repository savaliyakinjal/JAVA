package com.jwt.model;

public class jwtResponse {

	String token;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public jwtResponse(String token) {
		super();
		this.token = token;
	}

	public jwtResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "jwtResponse [token=" + token + "]";
	}
	
}
