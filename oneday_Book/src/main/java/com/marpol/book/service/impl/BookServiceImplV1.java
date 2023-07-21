package com.marpol.book.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marpol.book.dao.BookDao;
import com.marpol.book.dao.UserDao;
import com.marpol.book.models.BookDto;
import com.marpol.book.service.BookService;

@Service
public class BookServiceImplV1 implements BookService {

	
	@Autowired
	protected UserDao userDao;

	
	protected final BookDao bookDao;
	
	public BookServiceImplV1(BookDao bookDao) {
		this.bookDao = bookDao;
	}


	public List<BookDto> selectAll() {
		return bookDao.selectAll();
	}

	@Transactional
	public BookDto findById(String id) {
		
		// id 에 해당하는 주소 조회
		BookDto bookDto = bookDao.findById(id);
		
		// id 에 해당하는 취미 리스트 조회
//		List<HobbyByAidVO> hobbyList = hobbyDao.findHobbyByAID(id);
		
		// 주소 객체에 취미 리스트 포함
//		bookDto.setHobbyList(hobbyList);
		
		// 주소 객체 return
		return bookDto;
	}

	public String idCheck(String id) {

		BookDto dto = bookDao.findById(id);
		if (dto == null)
			return "OK";
		else
			return "FAIL";
	}

	public List<BookDto> findByName(String name) {
		return null;
	}

	public List<BookDto> findByAuther(String auther) {
		return null;
	}

	public int insert(BookDto bookDto) {
		
		int result = bookDao.insert(bookDto);
		return result;
	}

	public int update(BookDto bookDto) {

		int result = bookDao.update(bookDto);
		return result;
	}

	public int delete(String id) {

		int result = bookDao.delete(id);
		return result;

	}

}
