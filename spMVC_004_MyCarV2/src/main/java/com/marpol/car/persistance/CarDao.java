package com.marpol.car.persistance;

import com.marpol.car.model.CarDto;

public interface CarDao {
	
	public int insert(CarDto carDto);
	
	public CarDto findTachoByCarNum(String carnum);

}
