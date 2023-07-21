<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<form method="post" class="main input">
	<fieldset>
	<legend>도서 검색</legend>
	
	<div>
		<label>제목</label> <input name="b_code" />
	</div>
	
	<div>
		<label>저자</label> <input name="b_name" />
	</div>
	
	<div>
		<label></label>
		<button class="button list" type="button">리스트로</button>
		<button class="button serch" type="button">검색하기</button>
	</div>
	</fieldset>
</form>