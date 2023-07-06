package com.marpol.todo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import com.marpol.todo.models.TodoDto;
import com.marpol.todo.service.TodoGeneric;

public interface TodoDao extends TodoGeneric<TodoDto, Long>{
	
	@Select("SELECT * FROM tbl_todolist")
	public List<TodoDto> selectAll();
	
	@Select("SELECT * FROM tbl_todolist WHERE to_seq = #{id}")
	public TodoDto findById(long id);
	
//	public int insert(TodoDto dto);
//	public int update(TodoDto dto);
	
	@Delete("DELETE FROM tbl_todolist WHERE to_seq = #{id}")
	public int delete(long id);

}
