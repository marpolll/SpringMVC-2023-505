<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<c:set value="20230721-003" var="version" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원</title>
<link href="${rootPath}/static/css/main.css?${version}" rel="stylesheet" />
<link href="${rootPath}/static/css/nav.css?${version}" rel="stylesheet" />
<link href="${rootPath}/static/css/table.css?${version}"
	rel="stylesheet" />
<link href="${rootPath}/static/css/button.css?${version}"
	rel="stylesheet" />
<link href="${rootPath}/static/css/form.css?${version}" rel="stylesheet" />
<link href="${rootPath}/static/css/list.css?${version}" rel="stylesheet" />
<link href="${rootPath}/static/css/detail.css?${version}"
	rel="stylesheet" />
<link href="${rootPath}/static/css/user/login.css?${version}"
	rel="stylesheet" />

<script>
	// JSP 에서 사용하는 rootPath 변수를
	// JS 코드에서 사용하기 위한 rootPath 변수로 재 설정
	var rootPath = "${rootPath}"
</script>
<script src="${rootPath}/static/js/main_nav.js?${version}"></script>
<script src="${rootPath}/static/js/input2.js?${version}"></script>
<script src="${rootPath}/static/js/list2.js?${version}"></script>
<script src="${rootPath}/static/js/detail2.js?${version}"></script>
</head>

<body>
	<header>

		<h1>빛고을 책방 시스템</h1>
		<p>Book Rent Management 2023</p>
	</header>
	<%@ include file="/WEB-INF/views/nav.jsp"%>
	<section class="main">
		<c:if test="${empty BODY}">
			<%@ include file="/WEB-INF/views/user/list.jsp"%>
		</c:if>

		<c:if test="${BODY == 'INPUT'}">
			<%@ include file="/WEB-INF/views/user/input.jsp"%>
		</c:if>

		<c:if test="${BODY == 'DETAIL'}">
			<%@ include file="/WEB-INF/views/user/detail.jsp"%>
		</c:if>

		<c:if test="${BODY == 'UPDATE'}">
			<%@ include file="/WEB-INF/views/user/update.jsp"%>
		</c:if>
	</section>
	<footer>
		<address>CopyRight &copy; marpol.marpol.com</address>
	</footer>

</body>
</html>