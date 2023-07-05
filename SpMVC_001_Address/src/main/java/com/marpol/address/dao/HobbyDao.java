package com.marpol.address.dao;

import java.util.List;

import com.marpol.address.models.HobbyByAidVO;

public interface HobbyDao {
	
	public List<HobbyByAidVO> findHobbyByAID(String aid);

}
