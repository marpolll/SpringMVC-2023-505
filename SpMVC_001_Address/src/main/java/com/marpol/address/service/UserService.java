package com.marpol.address.service;

import com.marpol.address.models.UserDto;

public interface UserService {
	
	public UserDto findById(String id);
	
	public String userLogin(UserDto userDto);
	public int userJoin(UserDto userDto);


}
