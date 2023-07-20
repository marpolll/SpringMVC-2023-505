package com.marpol.car.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marpol.car.model.CarDto;
import com.marpol.car.persistance.CarDao;
import com.marpol.car.service.CarService;

@Service
public class CarServiceImplV1 implements CarService {

	protected final CarDao carDao;
	
	public CarServiceImplV1(CarDao carDao) {
		this.carDao = carDao;
	}

	public CarDto findTachoByCarNum(String carnum) {
		
		return carDao.findTachoByCarNum(carnum);
	}

	public int insert(CarDto cardto) {
		return carDao.insert(cardto);
	}

	public List<CarDto> selectAll() {
		return carDao.selectAll();
	}
	
	/*
	 * 프로젝트가 실행될때
	 * method 에 매개변수를 자동 주입해 달라 라는 요청
	 */
	@Autowired
	public void create_table() {
		carDao.create_carm_table(null);
	}
	
	
	
}
