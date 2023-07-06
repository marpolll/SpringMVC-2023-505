package com.marpol.todo.service;

import java.util.List;

public interface TodoGeneric<DTO, PK> {
	
	public List<DTO> selectAll();
	public DTO findById(PK id);
	public int insert(DTO dto);
	public int update(DTO dto);
	public int delete(PK id);

}
