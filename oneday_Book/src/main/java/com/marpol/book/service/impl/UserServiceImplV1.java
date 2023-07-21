package com.marpol.book.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marpol.book.dao.BookDao;
import com.marpol.book.dao.UserDao;
import com.marpol.book.models.UserDto;
import com.marpol.book.service.UserService;

@Service
public class UserServiceImplV1 implements UserService {

	@Autowired
	protected BookDao bookDao;

	
	protected final UserDao userDao;
	
	public UserServiceImplV1(UserDao userDao) {
		this.userDao = userDao;
	}


	public List<UserDto> selectAll() {
		
		return userDao.selectAll();
	}

	@Transactional
	public UserDto findById(String id) {
		
		// id 에 해당하는 주소 조회
		UserDto userDto = userDao.findById(id);
		
		// id 에 해당하는 취미 리스트 조회
//		List<HobbyByAidVO> hobbyList = hobbyDao.findHobbyByAID(id);
		
		// 주소 객체에 취미 리스트 포함
//		bookDto.setHobbyList(hobbyList);
		
		// 주소 객체 return
		return userDto;
	}

	public List<UserDto> findByName(String name) {
		return null;
	}


	public int insert(UserDto userDto) {

		int result = userDao.insert(userDto);
		return result;
	}

	public int update(UserDto userDto) {

		int result = userDao.update(userDto);
		return result;
	}

	public int delete(String id) {

		int result = userDao.delete(id);
		return result;

	}


	@Override
	public String idCheck(String id) {
		// TODO Auto-generated method stub
		return null;
	}


	public List<UserDto> findByTel(String tel) {
		// TODO Auto-generated method stub
		return null;
	}


}
