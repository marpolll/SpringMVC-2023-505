package com.marpol.book.service;

import java.util.List;

import com.marpol.book.models.BookDto;


public interface BookService {

	public List<BookDto> selectAll();
	public BookDto findById(String id);
	
	public String idCheck(String id);
	
	public List<BookDto> findByName(String name);
	public List<BookDto> findByAuther(String auther);
	
	public int insert(BookDto bookDto);
	public int update(BookDto bookDto);
	public int delete(String id);
}
