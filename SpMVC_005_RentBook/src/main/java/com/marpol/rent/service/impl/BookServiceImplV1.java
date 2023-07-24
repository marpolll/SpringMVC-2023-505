package com.marpol.rent.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marpol.rent.config.QualifierConfig;
import com.marpol.rent.dao.BookDao;
import com.marpol.rent.models.BookDto;
import com.marpol.rent.service.BookService;

@Service(QualifierConfig.SERVICE.BOOK_V1)
public class BookServiceImplV1 implements BookService {

	protected final BookDao bookDao;

	public BookServiceImplV1(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	@Autowired
	public void create_table() {

		try {
			bookDao.create_book_table(null);
		} catch (Exception e) {
		}
	}

	public List<BookDto> selectAll() {
		
		return bookDao.selectAll();
	}

	public int insert(BookDto bookDto) {
		
		return bookDao.insert(bookDto);
	}

	public BookDto findById(String bcode) {
		
		return bookDao.findById(bcode);
	}

	public int update(BookDto bookDto) {
		
		return bookDao.update(bookDto);
	}

}
