package com.learn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import com.learn.models.CustomUserDetails;
import com.learn.services.CustomUserDetailService;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.beans.factory.annotation.Autowired;

@Configuration
//@EnableGlobalMethodSecurity(prePostEnabled = true)
public class MySecurityConfig {

	//.requestMatchers("/public/**").permitAll()
	
	@Autowired
	private CustomUserDetailService customUserDetailService;
	@Bean
	protected SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http
			.csrf().disable()
			.authorizeHttpRequests()
			.requestMatchers("/public/**").hasRole("USER")
			.requestMatchers("/users/**").hasRole("ADMIN")
			.anyRequest()
			.authenticated()
			.and()
//			.formLogin(withDefaults())
			.formLogin(form -> form
					.loginPage("/signin")
					.loginProcessingUrl("/dologin")
					.defaultSuccessUrl("/users/")
					.permitAll())
			.httpBasic(withDefaults());
		return http.build();
	}

//	@Bean
//	protected InMemoryUserDetailsManager userDetailsService() {
////		PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
//		return new InMemoryUserDetailsManager(
//
//				
////				User.withUsername("kinjal").password(this.passwordEncoder().encode("1234")).roles("USER").build(),
////				User.withUsername("smruti").password(this.passwordEncoder().encode("1234")).roles("ADMIN").build()
//
//		);
//	}
	
	protected SecurityFilterChain filterChain(AuthenticationManagerBuilder auth) throws Exception{
		return (SecurityFilterChain) auth.userDetailsService(customUserDetailService).passwordEncoder(passwordEncoder());
	}
	

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	
}
