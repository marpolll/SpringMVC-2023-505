<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<table class="main list">
	<tr>
		<th>No.</th>
		<th>구분</th>
		<th>출발일자</th>
		<th>출발시간</th>
		<th>출발거리(Km)</th>
		<th>도착일자</th>
		<th>도착시간</th>
		<th>도착거리(Km)</th>
		<th>장소</th>
		<th>소모비용</th>
	</tr>
	<c:forEach begin="0" end="10" var="INDEX">
		<c:set value="${CARS[INDEX]}" var="CAR" />
		<%
		// td를 감싸고 있는 tr 요소에
		// 현재 리스트의 주소정보의 a_id 값을 
		// data-id 속성에 세팅하기
		// data 는 tag 의 속성이고 -변수 형식으로 만든다.
		// id = ${ADDR.a_id} 와 같은 변수를 생성하는 것이 된다.
		%>
		<tr data-id="${CAR.c_no}">
			<td>${CAR.c_no}</td>
			<td>${CAR.c_title}</td>
			<td>${CAR.c_ddate}</td>
			<td>${CAR.c_dtime}</td>
			<td>${CAR.c_ddis}</td>
			<td>${CAR.c_edate}</td>
			<td>${CAR.c_etime}</td>
			<td>${CAR.c_edis}</td>
			<td>${CAR.c_place}</td>
			<td>${CAR.c_cost}</td>
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
	<a href="${rootPath}/insert">운행저장</a>
</div>
