<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<table class="main list">
	<tr>
		<th>도서코드</th>
		<th>도서명</th>
		<th>저자</th>
		<th>출판사</th>
		
	</tr>
	<c:forEach begin="0" end="10" var="INDEX">
		<c:set value="${BOOKS[INDEX]}" var="BOOK" />
		<tr data-id="${BOOK.b_code}">
			<td>${BOOK.b_code}</td>
			<td>${BOOK.b_name}</td>
			<td>${BOOK.b_auther}</td>
			<td>${BOOK.b_comp}</td>
			
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
	<a href="${rootPath}/serch">도서 검색</a>
	<a href="${rootPath}/insert">도서 추가</a>
</div>
