package com.marpol.rent.dao;

import java.util.List;

import com.marpol.rent.models.RentBookVO;

public interface RentBookDao {

	
	public List<RentBookVO> selectAll();
	
	public RentBookVO findById(long id);
	
	public List<RentBookVO> findByBCode(String bcode);
	public List<RentBookVO> findByMCode(String mcode);

	public int update(RentBookVO dto);
	
	public void create_rent_book_table(String dumy);

	public int insert(RentBookVO rentBookVO);
	
}
