package com.marpol.calendar.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.marpol.calendar.models.Calendar;

@Repository
public interface CalenDao {
	
	public ArrayList<Calendar> calenList();

}
