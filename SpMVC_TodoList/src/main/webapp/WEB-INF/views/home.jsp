<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<c:set value="20230705-005" var="version" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="${rootPath}/static/css/list.css?${version}" rel="stylesheet" />
</head>
<body>
	<header>
		<h1>TO DO LIST 2023</h1>
	</header>
<form action="">
	<div>
  <input placeholder="작성일자" value="date" />
   </div>
   
   <div>
  <input placeholder="작성시각"  />
   </div>
   
   <div>
   <input class="todo" placeholder="할일"  />
   </div>
</form>
	<table class="table1">
		<tr>
			<th>No.</th>
			<th>할일</th>
			<th>완료여부</th>
		</tr>
    <tr>
        <td>1</td>
        <td></td>
        <td></td>
      </tr>
      <tr>
        <td>2</td>
        <td></td>
        <td></td>
      </tr>
      <tr>
        <td>3</td>
        <td></td>
        <td></td>
      </tr>
	</table>
</body>
</html>