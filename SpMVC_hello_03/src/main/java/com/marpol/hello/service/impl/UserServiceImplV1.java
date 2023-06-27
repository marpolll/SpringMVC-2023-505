package com.marpol.hello.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.marpol.hello.service.UserService;

@Service
public class UserServiceImplV1 implements UserService {

	protected List<String> strList;

	public List<String> selectAll() {

		strList = new ArrayList<>();
		strList.add("홍길동");
		strList.add("성춘향");
		strList.add("이몽룡");

		return strList;

	}

	public String findByName(String name) {

		return null;
	}

}
