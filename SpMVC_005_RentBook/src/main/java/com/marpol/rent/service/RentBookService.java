package com.marpol.rent.service;

import java.util.List;

import com.marpol.rent.models.RentBookDto;

public interface RentBookService {

	public List<RentBookDto> selectAll();

	public int insert(RentBookDto rentBookDto);

	
	
	
}
