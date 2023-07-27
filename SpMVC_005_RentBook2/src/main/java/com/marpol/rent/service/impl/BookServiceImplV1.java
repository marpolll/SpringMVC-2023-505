package com.marpol.rent.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.marpol.rent.config.QualifierConfig;
import com.marpol.rent.dao.BookDao;
import com.marpol.rent.models.BookDto;
import com.marpol.rent.models.PageDto;
import com.marpol.rent.service.BookService;

@Service(QualifierConfig.SERVICE.BOOK_V1)
public class BookServiceImplV1 implements BookService {

	protected final BookDao bookDao;

	public BookServiceImplV1(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	@Autowired
	public void create_table() {

		try {
			bookDao.create_book_table(null);
		} catch (Exception e) {
		}
	}

	public List<BookDto> selectAll() {

		return bookDao.selectAll();
	}

	public List<BookDto> selectPage(String page) {

		try {
			int intPageNum = Integer.valueOf(page);
//			intPageNum = (intPageNum -1) * 10;
			intPageNum = --intPageNum * 10;

			int intLimit = 10;
			return bookDao.selectPage(intLimit, intPageNum);

		} catch (Exception e) {
			return null;
		}
	}

	public void selectPage(String page, Model model, String search) {
		// 검색어를 빈칸을 기준으로 분해하기
		String[] searchs = search.split(" ");
		// 배열을 리스트 만들기
		List<String> searchList = Arrays.asList(searchs);
		
		int totalCount = bookDao.selectSearchCount(searchList);
		int intPageNum = Integer.valueOf(page);
		
		PageDto pageDto = PageDto.builder().pageNum(intPageNum).totalCount(totalCount).build();
		
		List<BookDto> books = bookDao.selectSearchPage(pageDto.getLimitCount(),
				pageDto.getOffsetNum(), searchList);

		model.addAttribute("BOOKS", books);
		model.addAttribute("PAGI", pageDto);
		
	}

	public void selectPage(String page, Model model) {

//		List<BookDto> books = bookDao.selectAll();
//		int totalCount = books.size();

		int totalCount = bookDao.selectCount();
		int intPageNum = Integer.valueOf(page);

		PageDto pageDto = PageDto.builder().pageNum(intPageNum).totalCount(totalCount).build();

//		int offsetCount = (intPageNum - 1) * pageDto.getLimitCount();

		List<BookDto> books = bookDao.selectPage(pageDto.getLimitCount(), pageDto.getOffsetNum());

		model.addAttribute("BOOKS", books);
		model.addAttribute("PAGI", pageDto);
	}

	public int insert(BookDto bookDto) {

		return bookDao.insert(bookDto);
	}

	public BookDto findById(String bcode) {

		return bookDao.findById(bcode);
	}

	public int update(BookDto bookDto) {

		return bookDao.update(bookDto);
	}

	public List<BookDto> findByBName(String bname) {

		return bookDao.findByBName(bname.trim());
	}

}
