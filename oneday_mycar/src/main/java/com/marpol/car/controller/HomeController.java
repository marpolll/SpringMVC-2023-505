package com.marpol.car.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.marpol.car.models.CarDto;
import com.marpol.car.service.CarService;

@Controller
public class HomeController {

	protected final CarService carService;

	public HomeController(CarService carService) {
		super();
		this.carService = carService;
	}

//	@ModelAttribute
//	public CarDto carDto() {
//		CarDto carDto = new CarDto();
//		Date date = new Date(System.currentTimeMillis());
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
//
//		carDto.setC_ddate(dateFormat.format(date));
//		carDto.setC_dtime(timeFormat.format(date));
//
//		carDto.setC_edate(dateFormat.format(date));
//		carDto.setC_etime(timeFormat.format(date));
//		
//		return carDto;
//		
//	}
	
		@RequestMapping(value = "/", method = RequestMethod.GET)
		public String home(Model model) {

			List<CarDto> carList = carService.selectAll();
			model.addAttribute("CARS", carList);

			return "home";
		}

		@RequestMapping(value = "/insert", method = RequestMethod.GET)
		public String insert(Model model, HttpSession httpSession) {
			
			model.addAttribute("BODY", "INPUT");
			return "home";
		}

		@RequestMapping(value = "/insert", method = RequestMethod.POST, produces = "text/html;charset=UTF-8")
		@ResponseBody
		public String insert(@ModelAttribute CarDto carDto, Model model, HttpSession httpSession) {

			carService.insert(carDto);

			return "home";
		}
	

//		@RequestMapping(value = "/id_check", method = RequestMethod.GET)
//		@ResponseBody
//		public String idCheck(String id) {
//
//			return carService.idCheck(id);
//		}

		@RequestMapping(value = "/detail", method = RequestMethod.GET)
		public String detail(String id, Model model) {

			CarDto carDto = carService.findById(id);

			model.addAttribute("CAR", carDto);

			// home.jsp 에 include 되어 보여질 화면(변수) 세팅
			model.addAttribute("BODY", "DETAIL");
			return "home";
		}

//		@RequestMapping(value = "/delete", method = RequestMethod.GET)
//		public String delete(String id) {
//
//			int result = carService.delete(id);
//			if (result > 0) {
//				return "redirect:/";
//			} else {
//				// 삭제를 실패했을 경우
//				// 현재 id 의 detail 화면으로 되돌아 가라(redirect)
//				return "redirect:/detail?id=" + id;
//			}
//		}

		@RequestMapping(value = "/update", method = RequestMethod.GET)
		public String update(String id, Model model) {

			// 변경할 주소 데이터 SELETE 하여 model 에 담기
			CarDto carDto = carService.findById(id);
			
			model.addAttribute("CAR", carDto);

			model.addAttribute("BODY", "UPDATE");

			return "home";

		}

		@RequestMapping(value = "/update", method = RequestMethod.POST, produces = "text/html;charset=UTF-8")
		public String update(@ModelAttribute CarDto cardto) {

			int result = carService.update(cardto);

	
			return "home";
			
		}

	}

	


