package com.marpol.car.service;

import java.util.List;

import com.marpol.car.model.CarDto;

public interface CarService {

	public CarDto findTachoByCarNum(String carnum);


	public int insert(CarDto cardto);


	public List<CarDto> selectAll();
	
	

}
