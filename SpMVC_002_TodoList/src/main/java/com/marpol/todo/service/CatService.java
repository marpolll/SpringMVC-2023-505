package com.marpol.todo.service;

import com.marpol.todo.models.CategoryDto;

public interface CatService extends TodoGeneric<CategoryDto, String> {
	
	public void printCategory();

}
