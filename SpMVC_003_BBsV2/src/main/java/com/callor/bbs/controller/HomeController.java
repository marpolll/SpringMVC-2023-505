package com.callor.bbs.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.callor.bbs.config.QualifierConfig;
import com.callor.bbs.dao.BBsDao;
import com.callor.bbs.dao.FileDao;
import com.callor.bbs.models.BBsDto;
import com.callor.bbs.models.FileDto;
import com.callor.bbs.service.FileService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {

	/*
	 * @Qualifier(QualifierConfig.SERVICE.FILE_V2)
	 * 2개의 이상의 Component 들이 
	 * 같은 Service interface 를 상속받아 생성된 경우
	 * 이 Component 를 주입받아 사용하는 곳에서는 어떤 Component 를
	 * 주입받아 사용해야 하는지 알수가 없다.
	 * 
	 * 이때는 @Component("이름") 에 이름을 부여하고
	 * 사용할 곳에서 주입받을때 @Qualifier() 를 통해 명시적으로
	 * 어떤 Component 를 주입 받을지 지정해 주어야 한다.
	 */
	private final FileService fileService;
	private final BBsDao bbsDao;
	private final FileDao fileDao;

	public HomeController(
			@Qualifier(QualifierConfig.SERVICE.FILE_V2) 
			FileService fileService, BBsDao bbsDao, FileDao fileDao) {
		
		this.fileService = fileService;
		this.bbsDao = bbsDao;
		this.fileDao = fileDao;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
//		List<BBsDto> bbsList = bbsDao.selectAll();
		List<BBsDto> bbsList = bbsDao.findUserSelectLimit();
		model.addAttribute("BBS_LIST", bbsList);
		return "home";
	}
	
	/*
	 * @ModelAttribute("BBS")
	 * GET / insert 가 호출될때
	 * 아직 bbsDto 객체는 null 인 상태이다.
	 * bbsDto 가 null 인 경우
	 * 어딘가에 @ModelAttribute("BBS") 라는 이름이 부착된
	 * method 를 찾는다.
	 * 만약 method 가 발견되면 자동으로 해당 method 를 호출하여
	 * 데이터를 준비해 준다. 
	 */
	@RequestMapping(value="/insert",method=RequestMethod.GET)
	public String insert(@ModelAttribute("BBS")BBsDto bbsDto) {
		
//		model.addAttribute("BBS", bbsDto);
			
	return "input";	
		
	}
	
	/*
	 * (@RequestParam(value = "b_username") String username)
	 * Client(Browser)에서 b_username 이라는 변수에 값이 담겨서
	 * 전달되어 오면 username 이라는 변수에 값을 저장하여
	 * method 내부로 전달하라
	 * Client 와 Server 간에 변수 이름이 다를때 사용하는 선택사항
	 */
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	/*
	 * 매개변수 설명
	 * BBsDto bbsDto :
	 * 			input tag에 입력한 게시판 관련 text 를 받는 곳
	 * MultipartFile b_file :
	 * 			input tag 의 type="file" 에서 선택한 파일을 받는 곳
	 */
	public String insert(
			BBsDto bbsDto,
		// 싱글파일 업로드용
		@RequestParam(value = "b_file")MultipartFile b_file,
		// 멀티파일 업로드용
		// @ReqeustParam 부착 금지 400 오류 발생
		MultipartHttpServletRequest b_images,
		Model model) {
		log.debug("사용자이름 : {}", bbsDto.getB_username());
		log.debug(b_file.getOriginalFilename());
		
	String fileName = null;	
	
	try {
		if(!b_file.getOriginalFilename().isEmpty()) {
		fileName = fileService.fileUp(b_file);
		bbsDto.setB_image(fileName);
		}
		int result = bbsDao.insert(bbsDto);
		log.debug("새로생성된 PK {}", bbsDto.getB_seq());
		
		// 멀티파일 업로드가 실행되었을때만 filesUp() 호출
		// getFile().getSize() b_image 를 List 로 변환하고 개수 세기 
		// getFiles().size() 업로드한 파일의 개수가 담긴 변수값 참조
		if(b_images.getFile("b_images").getSize() > 0) {
		List<FileDto> files = fileService.filesUp(b_images);
		fileDao.insert(files, bbsDto.getB_seq());
		}
		return "redirect:/";
		
	} catch (Exception e) {
//		e.printStackTrace();
		log.debug("파일을 업로드 할수 없음 오류 발생 !!");
		return "redirect:/insert?error=FILE_UP_ERROR";
	}	
	
//	model.addAttribute("FILE_NAME", fileName);
//	return "input";
	
	}
	
	@RequestMapping(value="/detail",method=RequestMethod.GET)
	public String detail(String seq,
						Model model,
						BBsDto bbsDto) {
		
		bbsDto = bbsDao.findById(seq);
		List<FileDto> files = fileDao.findByBSeq(bbsDto.getB_seq());
		model.addAttribute("BBS",bbsDto);
		model.addAttribute("FILES",files);
		return "detail";
		
	}
	
	@RequestMapping(value="/image_delete",method=RequestMethod.GET)
	public String image_delete(String seq) {
		
		/*
		 * 파일정보를 SELECT 하고
		 * 물리적 파일을 삭제하고
		 * 파일정보 데이터 삭제
		 */
		long seqNum = Long.valueOf(seq);
		FileDto fileDto = fileDao.findByid(seqNum);
		fileService.delete(fileDto.getI_uploadName());
		int result =  fileDao.delete(seqNum);
		
		return "redirect:/detail?seq=" + fileDto.getI_bseq();
		
	}
	
	
	@ModelAttribute("BBS")
	public BBsDto getBBsDto() {
		BBsDto bbsDto = new BBsDto();
		
		Date date = new Date(System.currentTimeMillis());
		Calendar calendar = Calendar.getInstance();
		
		// 현재날짜와 시간 getter 하기
		LocalDateTime localDateTime = LocalDateTime.now();
		
		// 날짜를 문자열로 변환하기 위한 pattern 생성
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		// 시간을 문자열로 변환하기 위한 pattern 생성
		DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		// 날짜 형식의 데이터를 문자열로 변환
		String strDate = localDateTime.format(dateFormatter);
		// 시간 형식의 데이터를 문자열로 변환
		String strTime = localDateTime.format(timeFormatter);
		
		bbsDto.setB_date(strDate);
		bbsDto.setB_time(strTime);
		bbsDto.setB_username("marpol");
		
		return bbsDto;
	}
	
}