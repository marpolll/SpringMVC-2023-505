package com.marpol.hello;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.marpol.hello.models.AddressDto;

@Controller
public class HomeController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {

		model.addAttribute("name", "홍길동");
		model.addAttribute("age", 33);
		model.addAttribute("tel", "010-1111-1111");
		return "home";
	}

	
	@RequestMapping(value = "/hello")
	public String hello(Model model) {
		
		AddressDto addrDto = new AddressDto();
		addrDto.setName("성춘향");
		addrDto.setTel("010-1111-1111");
		addrDto.setAge(33);
		addrDto.setAddress("남원시");
		
		model.addAttribute("ADDR", addrDto);
		
		// WEB-INF/views/hello.jsp 를 찾아서 rendering 해달라
		return "hello";
	}
	
	@RequestMapping(value = "/user")
	public String user(Model model) {
		
		List<AddressDto> addrList = new ArrayList<AddressDto>();
		
		AddressDto addrDto = new AddressDto();
		addrDto.setName("이산");
		addrDto.setTel("010-2222-2222");
		addrDto.setAge(20);
		addrDto.setAddress("전북");
		addrList.add(addrDto);
		
		addrDto = new AddressDto();
		addrDto.setName("김산");
		addrDto.setTel("010-3333-3333");
		addrDto.setAge(21);
		addrDto.setAddress("전남");
		addrList.add(addrDto);
		
		addrDto = new AddressDto();
		addrDto.setName("박산");
		addrDto.setTel("010-4444-4444");
		addrDto.setAge(22);
		addrDto.setAddress("경남");
		addrList.add(addrDto);
		
		for(AddressDto dto : addrList) {
			System.out.println(dto.toString());
		}
		
		model.addAttribute("ADDRS", addrList);
		
		return "user2";
		
	}
	
}
