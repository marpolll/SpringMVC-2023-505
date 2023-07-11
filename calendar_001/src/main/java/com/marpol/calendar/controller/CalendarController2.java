package com.marpol.calendar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.marpol.calendar.models.CalendarDto;
import com.marpol.calendar.service.CalenService;
import com.marpol.calendar.service.CalendarService;

@Controller
@RequestMapping("calendar.do")
public class CalendarController2 {
//	
//	@Autowired(required = false)
//	private CalenService service;
//
//	@GetMapping(params="method=list")
//	public String list() {
//		return "fullcalendar.jsp";
//	}
//	
//	@GetMapping(params = "method=data")
//	public String data(Model d) {
//		d.addAttribute("list", service.calenList());
//		return "pageJsonReport";
//	
//	
//	
//	
//	
//	
//	
//	protected final CalendarService calendarService;
//
//	public CalendarController(CalendarService calendarService) {
//		this.calendarService = calendarService;
//	}
//	
//
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String home() {
//		return "home2";
//	}
//	
//	
//	@RequestMapping(value = "/list", method = RequestMethod.GET)
//	@ResponseBody
//	public List<CalendarDto> list() {
//		List<CalendarDto> calendarList = calendarService.selectAll();
//		return calendarList;
//	}

}
