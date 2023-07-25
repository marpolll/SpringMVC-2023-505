package com.marpol.rent.service;

import java.util.List;

import com.marpol.rent.models.MemberDto;

public interface MemberService {

	public List<MemberDto> selectAll();

	public int insert(MemberDto memberDto) throws Exception;
	
	public String getNewCode();

	public MemberDto findById(String mcode);

	public int update(MemberDto memberDto) throws Exception;
	
}
