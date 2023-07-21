<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<form method="post" class="main input">
	<fieldset>
	<legend>회원 추가</legend>
	
	<div>
		<label>회원코드</label> <input name="u_code" />
	</div>
	
	<div>
		<label>회원명</label> <input name="u_name" />
	</div>
	
	<div>
		<label>전화번호</label> <input name="u_tel" />
	</div>
	
	<div>
		<label>주소</label> <input name="u_addr" />
	</div>
	
	<div>
		<label></label>
		<button class="button list" type="button">리스트로</button>
		<button class="button input" type="button">추가하기</button>
	</div>
	</fieldset>
</form>
