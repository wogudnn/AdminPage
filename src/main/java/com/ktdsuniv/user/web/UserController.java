package com.ktdsuniv.user.web;

import org.springframework.stereotype.Controller;

import com.ktdsuniv.user.service.UserService;

@Controller
public class UserController {

	
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
}
