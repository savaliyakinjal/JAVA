package com.learn.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/signin")
	public String login() {
		return "login.html";
	}
}
