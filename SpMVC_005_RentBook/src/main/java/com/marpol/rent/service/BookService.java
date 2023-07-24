package com.marpol.rent.service;

import java.util.List;

import com.marpol.rent.models.BookDto;

public interface BookService {

	public List<BookDto> selectAll();

	public int insert(BookDto bookDto);

	public BookDto findById(String bcode);

	public int update(BookDto bookDto);
	
	

}
