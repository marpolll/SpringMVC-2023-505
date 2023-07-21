<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<table class="main list">
	<tr>
		<th>회원코드</th>
		<th>회원명</th>
		<th>전화번호</th>
		<th>주소</th>
		
	</tr>
	<c:forEach begin="0" end="10" var="INDEX">
		<c:set value="${USERS[INDEX]}" var="USER" />
		<%
		%>
		<tr data-id="${USER.u_code}">
			<td>${USER.u_code}</td>
			<td>${USER.u_name}</td>
			<td>${USER.u_tel}</td>
			<td>${USER.u_addr}</td>
			
		</tr>
	</c:forEach>
</table>
<div class="main pagination">
	<ul>
		<c:forEach begin="1" end="10" var="PAGE">
			<li>${PAGE}</li>
		</c:forEach>
	</ul>
</div>
<div class="main button_box">
	<%
		// 주소추가를 클릭하면
		// 서버에 /insert URL 로 GET request 로 보낸다.
		// 		GET /insert HTTP1.0
	%>
	<a href="${rootPath}/user/insert">회원추가</a>
</div>
