package com.marpol.rent.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marpol.rent.config.QualifierConfig;
import com.marpol.rent.dao.RentBookDao;
import com.marpol.rent.models.RentBookVO;
import com.marpol.rent.service.RentBookService;

@Service(QualifierConfig.SERVICE.RENT_V1)
public class RentBookServiceImplV1 implements RentBookService {

	protected final RentBookDao rentBookDao;

	public RentBookServiceImplV1(RentBookDao rentBookDao) {
		this.rentBookDao = rentBookDao;
	}

	
	@Autowired
	public void create_tabel() {
		rentBookDao.create_rent_book_table(null);
	}

	public List<RentBookVO> selectAll() {
		
		return rentBookDao.selectAll();
	}

	public int insert(RentBookVO rentBookVO) {

		return rentBookDao.insert(rentBookVO);
	}
}
