package com.blog.payloads;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
	private int id;
	
	@Size(min = 4,message="username must be min of 4 characters")
	private String name;
	@Email(message="Email adress is not valid")
	private String email;
	
	@Size(min = 5,max = 10,message = "Password must be min of 3 chars and max of 10 chars")
	private String password;
	@Size(min = 5)
	private String about;
}
