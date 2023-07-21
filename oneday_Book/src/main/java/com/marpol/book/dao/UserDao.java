package com.marpol.book.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.marpol.book.models.UserDto;

public interface UserDao {
	
	@Select("SELECT * FROM tbl_users ORDER BY u_name")
	public List<UserDto> selectAll();
	
	@Select(" SELECT * FROM tbl_users WHERE u_code = #{id} ")
	public UserDto findById(String id);
	
	public UserDto findByTel(String tel);
	
	public int insert(UserDto userdto);
	public int update(UserDto userdto);
	public int delete(String id);

}
