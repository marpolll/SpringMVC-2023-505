package com.marpol.rent.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.marpol.rent.models.RentBookDto;
import com.marpol.rent.models.RentBookVO;
import com.marpol.rent.service.RentBookService;

import lombok.extern.slf4j.Slf4j;

/*
 * localhost:8080/rent/rent 또는 localhost:8080/rent/rent/* 로 요청이 들어왔을때
 * 		Browser 에 주소를 입력하거나 nav 항목을 클릭했을때
 * 서비스를 제공할 시작점이다.
 */
@Slf4j
@Controller
@RequestMapping(value = "/rent")
// 지금 부터 별도 지시가 있을때까지 RENT_WORK 객체는 지우지 마라
// 서버의 Session 영역에 영구 보관하라
@SessionAttributes("RENT_WORK")
public class RentController {
	
	protected final RentBookService rentBookService;

	public RentController(RentBookService rentBookService) {
		this.rentBookService = rentBookService;
	}

	/*
	 * GET /context/rent/
	 * GET /context/rent
	 */
	@RequestMapping(value = {"/",""}, method = RequestMethod.GET)
	public String home(Model model) {
		
		List<RentBookDto> rentList = rentBookService.selectAll();
		model.addAttribute("RENTS", rentList);
		
		return "rent/home";
	}
	
//	@RequestMapping(value = "/insert",method = RequestMethod.GET)
//	public String insert(@ModelAttribute("RENT")RentBookDto rentBookDto) {
//		
//		return "rent/input";
//		
//	}
//	
//	@RequestMapping(value = "/insert",method = RequestMethod.POST)
//	public String insert(@ModelAttribute("RENT")RentBookDto rentBookDto, Model model) {
//		
//			int result = rentBookService.insert(rentBookDto);
//		
//		return "redirect:/rent";
//	}
	
	@RequestMapping(value = "/insert",method = RequestMethod.GET)
	public String insert(@ModelAttribute("RENT_WORK") RentBookVO rentBookVO) {
		
		return "rent/work_book";
	}
	
	@RequestMapping(value = "/book",method = RequestMethod.POST)
	public String work_book(@ModelAttribute("RENT_WORK") RentBookVO rentBookVO) {
		
		return "rent/work_member";
	}
	
	@RequestMapping(value = "/member",method = RequestMethod.POST)
	public String work_member(@ModelAttribute("RENT_WORK") RentBookVO rentBookVO) {
		
		return "rent/work_complete";
	}
	
	@RequestMapping(value = "/insert",method = RequestMethod.POST)
	public String work_complete(@ModelAttribute("RENT_WORK") RentBookVO rentBookVO) {
		
		log.debug("전달된 데이터 {}", rentBookVO);
		
		return "redirect:/rent";
	}

	@ModelAttribute("RENT_WORK")
	public RentBookVO newRentBook() {
	 return new RentBookVO();
	}
	
	
	@ModelAttribute("RENT")
	public RentBookDto newRentDto() {
		return RentBookDto.builder().build();
	}
	

}
