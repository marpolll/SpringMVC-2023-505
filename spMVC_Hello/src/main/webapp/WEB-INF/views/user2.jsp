<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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

</head>
<body>
	<header>
		<h1>나의친구</h1>
		<p>2023년 나의 절친</p>
	</header>
	<table>
		<tr>
			<th>이름</th>
			<th>나이</th>
			<th>전화번호</th>
			<th>주소</th>
		</tr>

		<tr>
			<td>${ADDRS[0].name}</td>
			<td>${ADDRS[0].age}</td>
			<td>${ADDRS[0].tel}</td>
			<td>${ADDRS[0].address}</td>
		</tr>

		<c:forEach items="${ADDRS}" var="ADDR">
			<tr>
				<td>${ADDR.name}</td>
				<td>${ADDR.age}</td>
				<td>${ADDR.tel}</td>
				<td>${ADDR.address}</td>
			</tr>
		</c:forEach>

	</table>

</body>
</html>