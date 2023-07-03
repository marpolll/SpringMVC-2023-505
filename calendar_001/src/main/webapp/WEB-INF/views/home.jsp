<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<c:set value="20230630-009" var="version" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="${rootPath}/static/css/calendar.css?${version}"
	rel="stylesheet" />

<script src="${rootPath}/static/js/calendar.js?${version}"></script>
</head>
<body>
	<div id='calendar'></div>
</body>
</html>