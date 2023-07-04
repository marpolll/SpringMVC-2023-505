package com.marpol.calendar.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.marpol.calendar.models.CalendarDto;

public interface CalendarDao {
	
	@Select("SELECT * FROM calendar ORDER BY start_date")
	public List<CalendarDto> selectAll();
	
	public int insert(CalendarDto calendarDto);

}