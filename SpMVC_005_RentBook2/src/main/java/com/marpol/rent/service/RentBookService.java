package com.marpol.rent.service;

import java.util.List;

import com.marpol.rent.models.RentBookVO;

public interface RentBookService {

	public List<RentBookVO> selectAll();


	public int insert(RentBookVO rentBookVO);

	
	
	
}
