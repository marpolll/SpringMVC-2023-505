package com.marpol.calendar.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
public class CalendarDto {
	
	
	private String content;
	private String start_date;
	private String end_date;

}
