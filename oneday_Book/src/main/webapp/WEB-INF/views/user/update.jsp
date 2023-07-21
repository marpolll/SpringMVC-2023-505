<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<form method="post" class="main update">
	<fieldset>
		<legend>회원정보 변경</legend>
		<div>
			<label>회원코드</label> <input name="u_code" value="${USER.u_code}" readonly="readonly" />
		</div>

		<div>
			<label>회원명</label> <input name="u_name" value="${USER.u_name}" />
		</div>
		
		<div>
			<label>전화번호</label> <input name="u_tel" value="${USER.u_tel}" />
		</div>
		
		<div>
			<label>주소</label> <input name="u_addr" value="${USER.u_addr}" />
		</div>
		
		<div>
			<label>대여여부</label> <input name="u_rent" value="${USER.u_rent}" />
		</div>
		
		<div>
			<label>탈퇴여부</label> <input name="u_out" value="${USER.u_out}" />
		</div>
		
		<div>
			<label></label>
			<button class="button list" type="button">리스트로</button>
			<button class="button input" type="button">수정하기</button>
		</div>
	</fieldset>
</form>
