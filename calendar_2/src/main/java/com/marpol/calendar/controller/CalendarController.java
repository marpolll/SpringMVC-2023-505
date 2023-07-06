package com.marpol.calendar.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.marpol.calendar.models.CalendarDto;
import com.marpol.calendar.service.CalendarService;

@Controller
public class CalendarController {
	
	protected final CalendarService calendarService;

	public CalendarController(CalendarService calendarService) {
		this.calendarService = calendarService;
	}
	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "home";
	}
	
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public List<CalendarDto> list() {
		List<CalendarDto> calendarList = calendarService.selectAll();
		return calendarList;
	}

}
