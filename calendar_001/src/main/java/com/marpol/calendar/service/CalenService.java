package com.marpol.calendar.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marpol.calendar.dao.CalenDao;
import com.marpol.calendar.models.Calendar;

@Service
public class CalenService {
	
	@Autowired(required = false)
	private CalenDao dao;
	
	public ArrayList<Calendar> calenList(){
		return dao.calenList();
	}

}
