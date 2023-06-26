package com.marpol.hello.service;

import java.util.List;

import com.marpol.hello.models.UserDto;

public interface UserService {
	
	public List<UserDto> selectAll();
	public UserDto findbyId(String id);
	public int input(UserDto dto);
	

}
