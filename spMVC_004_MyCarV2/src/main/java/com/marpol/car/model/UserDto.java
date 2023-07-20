package com.marpol.car.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class UserDto {
	
	private String username; //	varchar(15)
	private String password; //	varchar(255)
	private String u_name; //	varchar(20)
	private String u_nickname; //	varchar(20)
	private String u_tel; //	varchar(15)
	private String u_role; //	varchar(15)

}
