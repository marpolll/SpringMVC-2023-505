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
public class RentDto {
	
	private int r_seq;
	private String r_date; 
	private String r_return_date; 	
	private String r_bcode; 	
	private String r_ucode; 	
	private String r_return_yn; 
	private int r_point; 		
}
