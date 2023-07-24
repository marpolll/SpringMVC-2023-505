package com.marpol.rent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 * localhost:8080/rent/member/* 로 요청이 들어오면
 * 처리할 시작점
 */
@Controller
@RequestMapping(value = "/member")
public class MemberController {
	
	@RequestMapping(value = {"/",""}, method = RequestMethod.GET)
	public String home() {
		
		return "member/home";
	}

}
