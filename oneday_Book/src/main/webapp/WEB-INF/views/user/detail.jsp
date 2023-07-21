<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<article class="detail data">

	<div>
		<strong>회원코드</strong><span>${USER.u_code}</span>
	</div>
	
	<div>
		<strong>회원명</strong><span>${USER.u_name}</span>
	</div>
	
	<div>
		<strong>전화번호</strong><span>${USER.u_tel}</span>
	</div>
	
	<div>
		<strong>주소</strong><span>${USER.u_addr}</span>
	</div>
	
	<div>
		<strong>대여여부</strong><span>${USER.u_rent}</span>
	</div>
	
	<div>
		<strong>탈퇴여부</strong><span>${USER.u_out}</span>
	</div>

</article>

<article class="detail button">

	<div>
		<button class="detail list">리스트로</button>
		<button class="detail update" data-id="${USER.u_code}">수정</button>
		<button class="detail delete" data-id="${USER.u_code}">삭제</button>
	</div>
</article>