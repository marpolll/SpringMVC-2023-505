package com.marpol.book.models;

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
public class BookDto {
	
	private String b_code;
	private String b_name;
	private String b_auther;
	private String b_comp;
	private int b_year;
	private int	b_iprice;
	private int b_rprice;
	private String b_rent;
	private String b_use;
}
