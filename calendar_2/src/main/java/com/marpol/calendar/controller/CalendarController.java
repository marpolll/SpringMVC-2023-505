package com.marpol.calendar.controller;

import java.util.List;

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
	public String home(@ModelAttribute("CALE")CalendarDto calendarDto, Model model) {
		
		List<CalendarDto> calendarList = calendarService.selectAll();
		model.addAttribute("CAL", calendarList);
		return "home";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public List<CalendarDto> list() {
		List<CalendarDto> calendarList = calendarService.selectAll();
//		List<CalendarDto> calendarList = new ArrayList<CalendarDto>();
//		CalendarDto semple = new CalendarDto(1, "물", "2023-07-01", "2023-07-12");
//		calendarList.add(semple);
		return calendarList;
	}
	
	@RequestMapping(value = "/input", method = RequestMethod.GET)
	public String insert() {
		return "input";
	}
	
	@ModelAttribute("CALE")
	public CalendarDto calendarDto() {
		
		CalendarDto calendarDto = CalendarDto.builder()
				.title("조깅하기")
				.writedate("2023-07-01")
				.startdate("2023-07-01")
				.enddate("2023-07-08")
				.bgcolor("#4286f4")
				.status("use")
				.build();
return calendarDto;
	}
}
