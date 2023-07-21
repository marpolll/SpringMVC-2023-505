package com.marpol.book.service;

import java.util.List;

import com.marpol.book.models.UserDto;

public interface UserService {
	
	public List<UserDto> selectAll();
	public UserDto findById(String id);
	
	public String idCheck(String id);
	
	public List<UserDto> findByName(String name);
	public List<UserDto> findByTel(String tel);
	
	public int insert(UserDto userDto);
	public int update(UserDto userDto);
	public int delete(String id);


}
