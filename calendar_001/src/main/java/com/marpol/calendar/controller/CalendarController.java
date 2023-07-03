package com.marpol.calendar.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class CalendarController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "home";
	}

}
