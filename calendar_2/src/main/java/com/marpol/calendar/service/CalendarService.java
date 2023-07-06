package com.marpol.calendar.service;

import java.util.List;

import com.marpol.calendar.models.CalendarDto;

public interface CalendarService {
	
	
	public List<CalendarDto> selectAll();
	
	public int insert(CalendarDto calendarDto);

}
