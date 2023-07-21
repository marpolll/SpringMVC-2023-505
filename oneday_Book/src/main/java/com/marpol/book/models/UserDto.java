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
@Getter
@Setter
public class UserDto {
	
	private String u_code;
	private String u_name;
	private String u_tel;
	private String u_addr;
	private String u_rent;
	private String u_out;

}
