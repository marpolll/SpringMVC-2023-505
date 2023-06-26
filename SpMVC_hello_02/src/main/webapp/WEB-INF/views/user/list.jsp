<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<% 
// var rootPath = pageContext.request.contextPath;
// core tag 를 사용하여 현재 page 에서 사용할 변수 선언하기
%>
<c:set value="${pageContext.request.contextPath}" var= "rootPath" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<% 

/*
<style>
table {
	border-collapse: collapse;
	width: 80%;
	margin: 20px auto;
}

td, th {
	text-align: left;
	padding: 12px 16px;
	border: 1px solid white;
}

tr:nth-child(even) {
	background-color: #bbb;
}

tr:nth-child(odd) {
	background-color: #ddd;
}

tr:hover {
	cursor: pointer;
	background: #aaa;
}

header {
	background-color: green;
	padding: 2rem;
	text-align: center;
	text-shadow: 1px 1px 1px black;
	color: yellow;
}
</style>

*/

%>
</head>
<body>

	<h1>User List</h1>
	<%
	/*
		UserController 에서 설정한 USERS Attribute 를
		table 을 사용하여 화면에 Rendering 하기
	*/
	%>

	<table>

		<tr>

			<th>아이디</th>
			<th>이름</th>
			<th>전화번호</th>
			<th>나이</th>
			<th>주소</th>

		</tr>

		<c:forEach items="${USERS}" var="USER">
		<tr>
		<td>${USER.username}</td>
		<td>${USER.name}</td>
		<td>${USER.tel}</td>
		<td>${USER.age}</td>
		<td>${USER.addr}</td>
		</tr>
		</c:forEach>
	</table>
	
	<a href="${rootPath}/user/input" >추가하기</a>
	 
</body>

</html>