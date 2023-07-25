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
public class RentBookVO {
	
		private long r_seq;
	
		private String r_bcode;		//	<th>도서코드</th>
		private String b_name;		//	<th>도서명</th>
		private String b_comp;		//	<th>출판사</th>
					
		private String r_mcode;		//	<th>회원코드</th>
		private String m_name;		//	<th>회원이름</th>
		private String m_tel;		//	<th>전화번호</th>
					
		private String r_date;		//	<th>대출일</th>
		private String r_return_date;		//	<th>반납일</th>
		private String r_return_yn;		//	<th>도서반납여부</th>
		private int r_price;		//	<th>대여금액</th>
					
		private int r_point;		//	<th>포인트</th>

}
