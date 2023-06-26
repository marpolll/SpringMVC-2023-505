package com.marpol.hello.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.marpol.hello.models.UserDto;
import com.marpol.hello.service.UserService;

@Service(value = "userService")
public class UserServiceImplV1 implements UserService {

	/*
	 * List<UserDto> userList 객체를 생성하고 임의로 3명의 User 정보를 add 하기 UserList 리스트를 return
	 * 하기
	 */
	public List<UserDto> selectAll() {

		List<UserDto> userList = new ArrayList<UserDto>();
		
		// setter 를 사용하여 데이터 추가하기
		UserDto userDto = new UserDto();
		userDto.setUsername("lee");
		userDto.setPassword("1234");
		userDto.setName("이산");
		userDto.setTel("010-2222-2222");
		userDto.setAddr("전북");
		userDto.setAge(20);
		userList.add(userDto);

		userDto = new UserDto();
		userDto.setUsername("kim");
		userDto.setPassword("1234");
		userDto.setName("김산");
		userDto.setTel("010-1111-1111");
		userDto.setAddr("전남");
		userDto.setAge(22);
		userList.add(userDto);
		
		userDto = new UserDto();
		userDto.setUsername("back");
		userDto.setPassword("1234");
		userDto.setName("백산");
		userDto.setTel("010-3333-3333");
		userDto.setAddr("경남");
		userDto.setAge(25);
		userList.add(userDto);
		
		// field 생성자를 사용하여 데이터 추가하기
		// field 생성자를 사용하는 경우 원하는 변수에 값이
		// 정확히 저장되는지 확인하기 어렵다.
		userDto = new UserDto("aaa", "1234", "임꺽정", "010-444-4444", "함경도", 20);
		userList.add(userDto);

		return userList;
	}

	public UserDto findbyId(String id) {

		return null;
	}

	public int input(UserDto dto) {

		return 0;
	}

}
