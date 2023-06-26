package com.marpol.hello.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// field 생성자
@AllArgsConstructor

// Super 생성자
@NoArgsConstructor

@ToString
@Setter
@Getter
public class UserDto {
	
	private String username;
	private String password;
	private String name;
	private String tel;
	private String addr;
	private int age;

}
