package com.marpol.calendar.models;

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
	
	private long seq; //	bigint		PRIMARY KEY	AUTO_INCREMENT,
	private String title; // varchar(15)	,		
	private String writedate; // varchar(10)	,		
	private String startdate; // 	varchar(20)	,		
	private String enddate; //	varchar(10)	,		
	private String bgcolor; //	varchar(10)	,		
	private String status; //	varchar(30)	

}


