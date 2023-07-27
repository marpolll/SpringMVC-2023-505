package com.marpol.rent.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.marpol.rent.models.MemberDto;

public interface MemberDao {

	@Select(" SELECT MAX(m_code) FROM tbl_members ")
	public String getMaxMCode();
	
	public void create_member_table(String dumy);
	
	@Select(" SELECT * FROM tbl_members ORDER BY m_name ")
	public List<MemberDto> selectAll();

	public int insert(MemberDto memberDto);
	
	public int update(MemberDto memberDto);

	@Select(" SELECT * FROM tbl_members WHERE m_code = #{id}")
	public MemberDto findById(String id);
	
	@Select(" SELECT * FROM tbl_members "
			+ " WHERE m_name LIKE CONCAT('%',#{name},'%' ) "
			+ " ORDER BY m_name ")
	public List<MemberDto> findByMName(String name);
	
	@Select(" SELECT * FROM tbl_members "
			+ " WHERE m_tel LIKE CONCAT('%',#{tel},'%' ) "
			+ " ORDER BY m_tel ")
	public List<MemberDto> findByTel(String tel);

	@Select(" SELECT * FROM tbl_members "
			+ " WHERE m_name = #{name} AND m_tel = #{tel} ")
	public MemberDto findNameAndTel(
			@Param("name") String name, @Param("tel") String tel);
	
}
