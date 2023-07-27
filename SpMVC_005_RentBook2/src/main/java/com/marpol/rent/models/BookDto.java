package com.marpol.rent.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
 * STS Ctrl+Shift+y : 모두 소문자로 만들기
 * STS Ctrl+Shift+x : 모두 대문자로 만들기
 */

@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class BookDto {
	
	private String b_code; //	varchar(6)
	private String b_name; //	varchar(125)
	private String b_auther; // 	varchar(125)
	private String b_comp; //	varchar(125)
	private int b_year; //	int
	private int b_iprice; //	int
	private int b_rprice; //	int

}
