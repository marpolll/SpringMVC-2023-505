package com.marpol.book.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import com.marpol.book.models.BookDto;

public interface BookDao {
	
	@Select("SELECT * FROM tbl_books ORDER BY b_name")
	public List<BookDto> selectAll();
	
	@Select("SELECT * FROM tbl_books WHERE b_code = #{id}")
	public BookDto findById(String id);

	
	public List<BookDto> findByAuther(String auther);

	public int insert(BookDto bookDto);

	public int update(BookDto bookDto);

	@Delete("DELETE FROM tbl_books WHERE b_code = #{id}")
	public int delete(String id);
	
}
