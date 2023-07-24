package com.marpol.calendar.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.marpol.calendar.models.CalendarDto;
import com.marpol.calendar.service.CalendarService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class CalendarController {

	protected final CalendarService calendarService;

	public CalendarController(CalendarService calendarService) {
		this.calendarService = calendarService;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {

		List<CalendarDto> calendarList = calendarService.selectAll();
		model.addAttribute("CAL", calendarList);
		
		return "home";
	}
	

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public List<CalendarDto> list() {
		List<CalendarDto> calendarList = calendarService.selectAll();

		return calendarList;
	}

	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert(Model model, HttpSession httpSession) {
		
		
		model.addAttribute("BODY", "INPUT");
		return "home";
	}
	
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST, 
			produces = "text/html;charset=UTF-8")
	public String insert(@ModelAttribute CalendarDto calendarDto, 
			Model model, 
			HttpSession httpSession) {
		
		calendarService.insert(calendarDto);

		return "redirect:/";


	}

//	@ModelAttribute("CALE")
//	public CalendarDto calendarDto() {
//
//		CalendarDto calendarDto = CalendarDto.builder().title("조깅하기").writedate("2023-07-01").startdate("2023-07-01")
//				.enddate("2023-07-08").bgcolor("#4286f4").status("use").build();
//		return calendarDto;
//	}
}
