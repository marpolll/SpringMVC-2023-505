package com.marpol.rent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 * localhost:8080/rent/user/* 로 요청이 들어오면
 * 처리할 시작점
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		
		return "user/login";
	}

}
