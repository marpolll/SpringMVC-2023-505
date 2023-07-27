package com.marpol.rent.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.marpol.rent.models.BookDto;

public interface BookDao {
	
	@Select("SELECT * FROM tbl_books ORDER BY b_code")
	public List<BookDto> selectAll();
	
	@Select("SELECT * FROM tbl_books LIMIT #{limit} OFFSET #{offset} ")
	public List<BookDto> selectPage(@Param("limit") int limit, @Param("offset") int offset);
	
	@Select("SELECT * FROM tbl_books WHERE b_code = #{id}")
	public BookDto findById(String id);
	
	public int insert(BookDto bookDto);
	public int update(BookDto bookDto);

	@Select(" SELECT * FROM tbl_books "
			+ " WHERE b_name LIKE CONCAT('%', #{name}, '%' )"
			+ " ORDER BY b_name ")
	public List<BookDto> findByBName(String name);
	
	@Select(" SELECT * FROM tbl_books "
			+ " WHERE b_comp LIKE CONCAT('%', #{comp}, '%' )"
			+ " ORDER BY b_comp ")
	public List<BookDto> finByBComp(String comp);
	
	@Select(" SELECT * FROM tbl_books "
			+ " WHERE b_auther LIKE CONCAT('%', #{auther}, '%' )"
			+ " ORDER BY b_auther ")
	public List<BookDto> finByBAuther(String auther);
	
	public void create_book_table(String dumy);

	@Select("SELECT COUNT(*) FROM tbl_books")
	public int selectCount();

	
	public int selectSearchCount(List<String> search);

	public List<BookDto> selectSearchPage(
			@Param("limit") int limitCount,
			@Param("offset") int offsetNum,
			@Param("list") List<String> searchs);

}
