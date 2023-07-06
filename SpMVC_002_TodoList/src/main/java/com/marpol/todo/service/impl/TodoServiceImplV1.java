package com.marpol.todo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.marpol.todo.dao.TodoDao;
import com.marpol.todo.models.TodoDto;
import com.marpol.todo.service.TodoService;

@Service
public class TodoServiceImplV1 implements TodoService{
	
	protected final TodoDao todoDao;
	
	public TodoServiceImplV1(TodoDao todoDao) {
		super();
		this.todoDao = todoDao;
	}

	public List<TodoDto> selectAll() {
		return todoDao.selectAll();
	}

	@Override
	public TodoDto findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int insert(TodoDto dto) {
		return todoDao.insert(dto);
	}

	@Override
	public int update(TodoDto dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
