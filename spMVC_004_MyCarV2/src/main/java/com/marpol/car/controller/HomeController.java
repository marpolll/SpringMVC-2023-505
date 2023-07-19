package com.marpol.car.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.marpol.car.model.CarDto;
import com.marpol.car.service.CarService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {
	
	protected final CarService carService;
	
	public HomeController(CarService carService) {
		this.carService = carService;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(@ModelAttribute("CAR")CarDto carDto, Model model) {
		
		// src/main/resource 폴더에서 logback-test.xml 
		// 부분에서 level 부분 바꾸어서 console 에 보일수도 아닐수도 
		// log.debug("나는 홈 컨트롤러 입니다.");
		// log.error("나는 홈 컨트롤러 입니다.");
		
		List<CarDto> carList = carService.selectAll();
		model.addAttribute("CAR_LIST", carList);
		return "car/input";
	}
	
	@RequestMapping(value = "/input", method = RequestMethod.POST)
	public String input(@ModelAttribute("CAR")CarDto cardto) {
		
		int result = carService.insert(cardto);
		
		return "redirect:/";
		
	}
	
	/*
	 *	문자열을 return 하여 views 폴더의 JSP 와 Rendering 하는 절차를
	 *	생략하고
	 *	데이터를 있는 그대로 Client 에게 보내라      json list
	 *	CarDto 객체에 담긴 데이터를 JSON 객체로 변환하여
	 *	Client 로 전송하라
	 *	pom.xml 에 jackson-bind 를 설치해 주어야 한다.
	 */
	@ResponseBody
	@RequestMapping(value = "/car_check", method = RequestMethod.GET)
	public CarDto findTachoByCarNum(String carnum) {
		
		log.debug("차량번호 : {}", carnum);
		
		CarDto carDto = carService.findTachoByCarNum(carnum);
		
		if(carDto == null) {
			carDto = CarDto.builder().c_carnum("NOT").build();
		}
		
		log.debug("차량정보 : {}", carDto);
		
		return carDto;
	}
	
	@ModelAttribute("CAR")
	public CarDto carDto() {

		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
		
		String strDate = dateFormat.format(date);
		String strTime = timeFormat.format(date);
		
		CarDto carDto = CarDto.builder()
						.c_sdate(strDate)
						.c_stime(strTime)
						.c_username("marpol")
						.c_qty("시작")
						.c_carnum("111가1234")
						.build();
		
		return carDto;
		
	}
	
	
//	@ModelAttribute("CAREN")
//	public CarDto calendarDto() {
//
//		Date date = new Date(System.currentTimeMillis());
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
//		
//		String strDate = dateFormat.format(date);
//		String strTime = timeFormat.format(date);
//		
//		CalendarDto calendarDto = CalendarDto.builder()
//						.c_title("물마시기")
//						.c_start(strDate)
//						.c_end("marpol")
//						.c_col("시작")
//						.build();
//		
//		return carDto;
//		
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
