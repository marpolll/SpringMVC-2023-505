package com.marpol.rent.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marpol.rent.config.QualifierConfig;
import com.marpol.rent.dao.MemberDao;
import com.marpol.rent.models.MemberDto;
import com.marpol.rent.service.MemberService;

@Service(QualifierConfig.SERVICE.MEMBER_V1)
public class MemberServiceImplV1 implements MemberService {

	protected final MemberDao memberDao;
	
	public MemberServiceImplV1(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	public List<MemberDto> selectAll() {
		return memberDao.selectAll();
	}

	/*
	 * 회원을 등록할때 새로운 코드를 생성하여 memberDto 에 업데이트하고
	 * 회원정보 insert 하기
	 */
	public int insert(MemberDto memberDto) throws Exception {
		
		// .trim() white space 제거하기
		String tel = memberDto.getM_tel().trim();
		String name = memberDto.getM_name().trim();
		
		// 이름 + 전화번호가 중복되지 않도록 하기
		MemberDto resultDto = memberDao.findNameAndTel(name, tel);
		
		// 이름 + 전화번호가 중복된 경우
		if(resultDto != null) {
			throw new Exception("NAME_TEL");
		}
		
		String mCode = this.getNewCode();
	    memberDto.setM_code(mCode);
		
		return memberDao.insert(memberDto);
	}

	/*
	 * tbl_members 테이블의 데이터를조회하여 새로운 고객코드 생성하기
	 */
	public String getNewCode() {
		
		String mCode = memberDao.getMaxMCode();
		String newCode = "000001";
		if(mCode != null) {
			newCode = String.format("%06d", Integer.valueOf(mCode) + 1);
		}
		
		return newCode;
	}

	public MemberDto findById(String mcode) {
		
		return memberDao.findById(mcode);
	}

	public int update(MemberDto memberDto) throws Exception {
		
		String name = memberDto.getM_name().trim();
		String tel = memberDto.getM_tel().trim();
		
		MemberDto resultDto = memberDao.findNameAndTel(name, tel);
		
		/*
		 * 수정하기 위해서 입력한 이름과 전화번호로 SELECT 를 했는데
		 * 데이터가 있다.
		 * 1. 만약 m_code 가 같다. : 이름과 전화번호를 변경하지 않고
		 * 							 저장하기를 클릭했다.
		 * 2. 만약 m_code 가 다른다. : 이미 등록된 회원의 이름 전화번호로
		 * 							   수정을 시도하였다. ==> 중복데이터 오류
		 */
		if(resultDto != null && 
				!resultDto.getM_code().equals(memberDto.getM_code())) {
			throw new Exception("NAME_TEL");
		}
		
		return memberDao.update(memberDto);
	}
	
	@Autowired
	public void create_tabel() {
		memberDao.create_member_table(null);
	}

	public List<MemberDto> findByMName(String mname) {

		return memberDao.findByMName(mname.trim());
		
	}
}
