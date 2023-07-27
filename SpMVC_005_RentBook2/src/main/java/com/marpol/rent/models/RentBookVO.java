package com.marpol.rent.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
 * data Class : data Transfer Object(dto), value Object(vo)
 * 
 *  dto : CRUD 을 위한 Data Class 이다. : getter, setter
 *  	  실제 데이터가 저장되는 테이블과 1:1로 칼럼이 매칭
 *  
 *  vo : select 를 위한 data Class 이다. : getter 만 있는 상태
 *  	 한번 저장된 데이터를 변경할수 없다. 읽기 전용
 *  	 join 되는 select 문의 결과를 DB로 부터 가져와서
 *  	 데이터를 저장하는 클래스
 * 
 */


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
