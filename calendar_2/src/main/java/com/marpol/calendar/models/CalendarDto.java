package com.marpol.calendar.models;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
public class CalendarDto {

//	private long seq; 
//	private String title;
//	private String writedate; 		
//	private String startdate; 
//	private String enddate; 
//	private String bgcolor; 
//	private String status;

	private Long seq;
	private String title;
	private Date writedate;
	private Date startdate;
	private Date enddate;
	private String bgcolor;
	private String status;

}
