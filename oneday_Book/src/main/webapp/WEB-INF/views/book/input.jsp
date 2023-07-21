<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<form method="post" class="main input">
	<fieldset>
	<legend>도서 추가</legend>
	
	<div>
		<label>도서코드</label> <input name="b_code" />
	</div>
	
	<div>
		<label>도서명</label> <input name="b_name" />
	</div>
	
	<div>
		<label>저자</label> <input name="b_auther" />
	</div>
	
	<div>
		<label>출판사</label> <input name="b_comp" />
	</div>
	
	<div>
		<label>구입연도</label> <input name="b_year" />
	</div>
	
	<div>
		<label>구입가격</label> <input name="b_iprice" />
	</div>
	
	<div>
		<label>대여가격</label> <input name="b_rprice" />
	</div>
	
	<div>
		<label></label>
		<button class="button list" type="button">리스트로</button>
		<button class="button input" type="button">추가하기</button>
	</div>
	</fieldset>
</form>
