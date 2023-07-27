package com.marpol.calendar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.marpol.calendar.service.CalendarService;

@Controller
@RequestMapping("calendar.do")
public class CalendarController {
	

	@GetMapping(params="method=list")
	public String list() {
//		return "fullcalendar.jsp";
		return "home2";
	}
	
	protected final CalendarService calendarService;

	public CalendarController(CalendarService calendarService) {
		this.calendarService = calendarService;
	}
	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "home2";
	}
}
