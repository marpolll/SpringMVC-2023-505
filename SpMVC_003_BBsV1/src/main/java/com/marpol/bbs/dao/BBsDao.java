package com.marpol.bbs.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.marpol.bbs.models.BBsDto;

public interface BBsDao {
	
	@Select("SELECT * FROM tbl_bbs ORDER BY b_date DESC, b_time DESC")
	public List<BBsDto> selectAll();

	@Select(" SELECT * "
			+ " FROM tbl_bbs,tbl_user "
			+ "  WHERE b_username = username AND b_seq = #{seq}")
	public BBsDto findById(String seq);
	
	
	public List<BBsDto> findUserSelectLimit();
}
