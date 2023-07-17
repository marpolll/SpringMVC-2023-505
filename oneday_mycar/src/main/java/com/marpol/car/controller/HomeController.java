package com.marpol.car.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.marpol.car.dao.CarDao;
import com.marpol.car.models.CarDto;
import com.marpol.car.service.CarService;

@Controller
public class HomeController {

	protected final CarService carService;
	protected final CarDao carDao;

	public HomeController(CarService carService, CarDao carDao) {
		super();
		this.carService = carService;
		this.carDao = carDao;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {

		List<CarDto> carList = carService.selectAll();
		model.addAttribute("CARS", carList);

		return "home";
	}

	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert(@ModelAttribute("CA")CarDto carDto, Model model, HttpSession httpSession) {

		model.addAttribute("BODY", "INPUT");
		return "home";
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST, produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String insert(@ModelAttribute CarDto carDto, Model model) {

		carService.insert(carDto);

		return "redirect:/";
	}

	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public String detail(long c_no, Model model) {

		CarDto carDto = carService.findById(c_no);

		model.addAttribute("CAR", carDto);

		// home.jsp 에 include 되어 보여질 화면(변수) 세팅
		model.addAttribute("BODY", "DETAIL");
		return "home";
	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String update(@ModelAttribute("CA")CarDto carDto, long c_no, Model model) {

		carDto = carService.findById(c_no);

		model.addAttribute("CAR", carDto);

		model.addAttribute("BODY", "UPDATE");

		return "home";

	}

	@RequestMapping(value = "/update", method = RequestMethod.POST, produces = "text/html;charset=UTF-8")
	public String update(@ModelAttribute CarDto cardto) {

		int result = carService.update(cardto);

		long id = cardto.getC_no();
		if (result > 0) {
			return "redirect:/detail?c_no=" + id;
		} else {
			return "redirect:/update?c_no=" + id;
		}
	}
	
	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public String delete(long c_no) {
		
		
		CarDto carDto = carDao.findById(c_no);
		carService.delete(carDto.getC_no());
		int result =  carDao.delete(c_no);
		
		return "redirect:/";
		
	}
	
	
	@ModelAttribute("CA")
	public CarDto getCarDto() {
		CarDto carDto = new CarDto();
		
		Date date = new Date(System.currentTimeMillis());
		Calendar calendar = Calendar.getInstance();
		
		LocalDateTime localDateTime = LocalDateTime.now();
		
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		String strDate = localDateTime.format(dateFormatter);
		String strTime = localDateTime.format(timeFormatter);
		
		carDto.setC_ddate(strDate);
		carDto.setC_dtime(strTime);
		
		return carDto;
	}
	
}
