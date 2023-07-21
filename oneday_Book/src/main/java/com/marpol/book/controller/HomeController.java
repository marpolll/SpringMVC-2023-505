package com.marpol.book.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.marpol.book.models.BookDto;
import com.marpol.book.service.BookService;


@Controller
public class HomeController {

	protected final BookService bookService;

	public HomeController(BookService bookService) {
		this.bookService = bookService;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(@ModelAttribute("BOK")BookDto bookDto, String message, Model model) {

		model.addAttribute("MSG", message);
		List<BookDto> bookList = bookService.selectAll();
		model.addAttribute("BOOKS", bookList);

		return "home";
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public List<BookDto> list() {
		List<BookDto> bookList = bookService.selectAll();
		return bookList;
	}

	@RequestMapping(value = "/serch", method = RequestMethod.GET)
	public String serch(Model model, HttpSession httpSession) {
		
		
		model.addAttribute("BODY", "SERCH");
		
		return "home";
	}
	
	
	
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert(Model model, HttpSession httpSession) {
		
		
		model.addAttribute("BODY", "INPUT");
		
		return "home";
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST, 
			produces = "text/html;charset=UTF-8")
	public String insert(@ModelAttribute BookDto bookDto, 
			Model model, 
			HttpSession httpSession) {
		
		bookService.insert(bookDto);

		return "redirect:/";


	}

	@RequestMapping(value = "/insert/test", method = RequestMethod.GET)
	public String insert() {
		return "/book/input";
	}

	@RequestMapping(value = "/id_check", method = RequestMethod.GET)
	@ResponseBody
	public String idCheck(String id) {

		return bookService.idCheck(id);


	}

	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public String detail(String id, Model model) {

		BookDto bookDto = bookService.findById(id);

		// SELECT 된 주소를 model에 담아서 view 로 전달
		model.addAttribute("BOOK", bookDto);

		// home.jsp 에 include 되어 보여질 화면(변수) 세팅
		model.addAttribute("BODY", "DETAIL");
		return "home";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(String id) {

		int result = bookService.delete(id);

		if (result > 0) {
			return "redirect:/";
		} else {
			return "redirect:/detail?id=" + id;
		}

	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String update(String id, Model model) {

		// 변경할 주소 데이터 SELETE 하여 model 에 담기
		BookDto bookDto = bookService.findById(id);
		model.addAttribute("BOOK", bookDto);

		model.addAttribute("BODY", "UPDATE");

		return "home";

	}

	@RequestMapping(value = "/update", method = RequestMethod.POST, produces = "text/html;charset=UTF-8")
	public String update(@ModelAttribute BookDto bookdto) {

		int result = bookService.update(bookdto);

		String id = bookdto.getB_code();
			// update 가 성공하면 detail 화면을 보여서 변경 된것을 확인
		if (result > 0) {
			return "redirect:/detail?id=" + id;
			// update 가 실패하면 다시 update 화면으로 보내서 다시 변경하기
		} else {
			return "redirect:/update?id=" + id;
		}
	}
	
	@ModelAttribute("BOK")
	public BookDto bookDto() {

		BookDto bookDto = BookDto.builder()
						.b_code("")
						.b_name("")
						.b_auther("")
						.b_comp("")
						.b_year(0)
						.b_iprice(0)
						.b_rprice(0)
						.build();
		
		return bookDto;
		
	}

}
