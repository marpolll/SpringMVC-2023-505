<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<form method="post" class="main update">
	<fieldset>
		<legend>도서정보 변경</legend>
		<div>
			<label>도서코드</label> <input name="b_code" value="${BOOK.b_code}" readonly="readonly" />
		</div>

		<div class="message b_code">
			<label></label><span></span>
		</div>

		<div>
			<label>도서명</label> <input name="b_name" value="${BOOK.b_name}" />
		</div>
		<div class="message b_name">
			<label></label><span></span>
		</div>
		
		<div>
			<label>저자</label> <input name="b_auther" value="${BOOK.b_auther}" />
		</div>
		<div class="message b_auther">
			<label></label><span></span>
		</div>
		
		<div>
			<label>출판사</label> <input name="b_comp" value="${BOOK.b_comp}" />
		</div>
		<div class="message b_comp">
			<label></label><span></span>
		</div>
		
		<div>
			<label>구입연도</label> <input name="b_year" value="${BOOK.b_year}" />
		</div>
		<div class="message b_year">
			<label></label><span></span>
		</div>
		
		<div>
			<label>구입가격</label> <input name="b_iprice" value="${BOOK.b_iprice}" />
		</div>
		<div class="message b_iprice">
			<label></label><span></span>
		</div>
		
		<div>
			<label>대여가격</label> <input name="b_rprice" value="${BOOK.b_rprice}" />
		</div>
		<div class="message b_rprice">
			<label></label><span></span>
		</div>
		
		<div>
			<label>렌탈여부</label> <input name="b_rent" value="${BOOK.b_rent}" />
		</div>
		<div class="message b_rprice">
			<label></label><span></span>
		</div>
		
		<div>
			<label>사용여부</label> <input name="b_use" value="${BOOK.b_use}" />
		</div>
		<div class="message b_rprice">
			<label></label><span></span>
		</div>
		
		<div>
			<label></label>
			<button class="button list" type="button">리스트로</button>
			<button class="button input" type="button">수정하기</button>
		</div>
	</fieldset>
</form>
