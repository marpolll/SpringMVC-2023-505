package com.marpol.calendar.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.marpol.calendar.dao.CalendarDao;
import com.marpol.calendar.models.CalendarDto;
import com.marpol.calendar.service.CalendarService;

@Service
public class CalendarServiceImplV1 implements CalendarService {

	protected final CalendarDao calendarDao;

	public CalendarServiceImplV1(CalendarDao calendarDao) {
		this.calendarDao = calendarDao;
	
	}
	
	public int insert(CalendarDto calendarDto) {
		
		int result = calendarDao.insert(calendarDto);
		return result;

	}

	public List<CalendarDto> selectAll() {
		return calendarDao.selectAll();
	}

}
