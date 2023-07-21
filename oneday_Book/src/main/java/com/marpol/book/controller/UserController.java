package com.marpol.book.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.marpol.book.models.UserDto;
import com.marpol.book.service.UserService;


@Controller
public class UserController {

	protected final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String home(String message, Model model) {

		model.addAttribute("MSG", message);
		List<UserDto> userList = userService.selectAll();
		model.addAttribute("USERS", userList);

		return "userhome";
	}

	@RequestMapping(value = "/user/list", method = RequestMethod.GET)
	@ResponseBody
	public List<UserDto> list() {
		List<UserDto> userList = userService.selectAll();
		return userList;
	}

	@RequestMapping(value = "/user/insert", method = RequestMethod.GET)
	public String insert(Model model, HttpSession httpSession) {
		
		
		model.addAttribute("BODY", "INPUT");
		
		return "userhome";
	}

	@RequestMapping(value = "/user/insert", method = RequestMethod.POST, 
			produces = "text/html;charset=UTF-8")
	public String insert(@ModelAttribute UserDto userDto, 
			Model model, HttpSession httpSession) {

		userService.insert(userDto);

		return "redirect:/";
	}

	@RequestMapping(value = "/user/insert/test", method = RequestMethod.GET)
	public String insert() {
		return "/user/input";
	}

	@RequestMapping(value = "/user/id_check", method = RequestMethod.GET)
	@ResponseBody
	public String idCheck(String id) {

		return userService.idCheck(id);


	}

	@RequestMapping(value = "/user/detail", method = RequestMethod.GET)
	public String detail(String id, Model model) {

		UserDto userDto = userService.findById(id);

		// SELECT 된 주소를 model에 담아서 view 로 전달
		model.addAttribute("USER", userDto);

		// home.jsp 에 include 되어 보여질 화면(변수) 세팅
		model.addAttribute("BODY", "DETAIL");
		return "userhome";
	}

	@RequestMapping(value = "/user/delete", method = RequestMethod.GET)
	public String delete(String id) {

		int result = userService.delete(id);

		if (result > 0) {
			return "redirect:/";
		} else {
			return "redirect:/detail?id=" + id;
		}

	}

	@RequestMapping(value = "/user/update", method = RequestMethod.GET)
	public String update(String id, Model model) {

		// 변경할 주소 데이터 SELETE 하여 model 에 담기
		UserDto userDto = userService.findById(id);
		model.addAttribute("USER", userDto);

		model.addAttribute("BODY", "UPDATE");

		return "userhome";

	}

	@RequestMapping(value = "/user/update", method = RequestMethod.POST, produces = "text/html;charset=UTF-8")
	public String update(@ModelAttribute UserDto userdto) {

		int result = userService.update(userdto);

		String id = userdto.getU_code();
			// update 가 성공하면 detail 화면을 보여서 변경 된것을 확인
		if (result > 0) {
			return "redirect:/user/detail?id=" + id;
			// update 가 실패하면 다시 update 화면으로 보내서 다시 변경하기
		} else {
			return "redirect:/user/update?id=" + id;
		}
	}

}
