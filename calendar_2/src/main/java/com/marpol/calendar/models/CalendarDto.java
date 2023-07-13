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
	
	private int c_id;
	private String title;
	private String start;
	private String end;

}


