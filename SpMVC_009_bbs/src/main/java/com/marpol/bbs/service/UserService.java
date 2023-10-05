package com.marpol.bbs.service;

import com.marpol.bbs.models.UserDto;

public interface UserService {
	
	// 회원가입을 실행할 method
	public UserDto join(UserDto userDto);
	
	public UserDto findById(String username);

}
