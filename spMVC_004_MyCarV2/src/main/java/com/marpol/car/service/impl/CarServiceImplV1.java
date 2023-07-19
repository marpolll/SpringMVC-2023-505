package com.marpol.car.service.impl;

import java.util.List;

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
}
