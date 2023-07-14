package com.marpol.car.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marpol.car.dao.CarDao;
import com.marpol.car.models.CarDto;
import com.marpol.car.service.CarService;

@Service
public class CarServiceImplV1 implements CarService {

	protected final CarDao carDao;

	public CarServiceImplV1(CarDao carDao) {
		this.carDao = carDao;
	}

	public List<CarDto> selectAll() {
		return carDao.selectAll();
	}

	@Transactional
	public CarDto findById(String id) {

		CarDto carDto = carDao.findById(id);
		
		return carDto;
	}

	public int insert(CarDto carDto) {

		int result = carDao.insert(carDto);

		return result;

	}

	public int update(CarDto carDto) {

		int result = carDao.update(carDto);

		return result;
	}

	public int delete(String id) {
		int result = carDao.delete(id);
		return result;

	}

}
