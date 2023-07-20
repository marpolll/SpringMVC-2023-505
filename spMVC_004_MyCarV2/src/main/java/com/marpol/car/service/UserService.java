package com.marpol.car.service;

import com.marpol.car.model.UserDto;

public interface UserService {

	public int join(UserDto userDto);

	public UserDto login(UserDto userDto) throws Exception;

}
