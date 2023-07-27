package com.marpol.rent.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
public class MemberDto {
	
	private String m_code;
	private String m_name;
	private String m_tel;
	private String m_addr;

}
