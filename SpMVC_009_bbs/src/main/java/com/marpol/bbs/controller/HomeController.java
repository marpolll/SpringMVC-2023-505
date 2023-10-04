package com.marpol.bbs.controller;

import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.marpol.bbs.models.UserDto;
import com.marpol.bbs.repository.UserRepository;

@Controller
public class HomeController {
	
	private final UserRepository userDao;
	
	public HomeController(UserRepository userDao) {
		this.userDao = userDao;
	}
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		List<UserDto> userList = userDao.findAll();
		
		return "home";
	}
	
}
