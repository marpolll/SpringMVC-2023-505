package com.marpol.car.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import com.marpol.car.models.CarDto;

public interface CarDao {
	
//	@Select(" SELECT * "
//			+ " FROM tbl_car "
//			+ "  WHERE b_username = username AND b_seq = #{seq}")
//	public CarDto findById(String seq);
	
	public List<CarDto> findUserSelectLimit();
	
	@Select("SELECT * FROM tbl_car ORDER BY c_no")
	public List<CarDto> selectAll();
	
	@Select("SELECT * FROM tbl_car WHERE c_no = #{id}")
	public CarDto findById(String id);

	
//	public List<CarDto> findByName(String name);

	public int insert(CarDto carDto);

	public int update(CarDto carDto);

	@Delete("DELETE FROM tbl_car WHERE c_no = #{id}")
	public int delete(String id);
	
}
