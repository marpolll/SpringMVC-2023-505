package com.marpol.rent.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.marpol.rent.models.RentBookDto;

public interface RentBookDao {

	@Select(" SELECT * FROM tbl_rent_book ORDER BY r_return_date")
	public List<RentBookDto> selectAll();
	
	public RentBookDto findById(long id);
	
	public List<RentBookDto> findByBCode(String bcode);
	public List<RentBookDto> findByMCode(String mcode);

	public int insert(RentBookDto dto);
	public int update(RentBookDto dto);
	
	public void create_rent_book_table(String dumy);
	
}
