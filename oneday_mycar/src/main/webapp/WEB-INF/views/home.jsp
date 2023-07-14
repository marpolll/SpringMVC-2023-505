<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<c:set value="20230714-007" var="version" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>운행기록</title>
<link href="${rootPath}/static/css/car.css?${version}" rel="stylesheet" />
<link href="${rootPath}/static/css/button.css?${version}" rel="stylesheet" />
<link href="${rootPath}/static/css/form.css?${version}" rel="stylesheet" />
<link href="${rootPath}/static/css/list.css?${version}" rel="stylesheet" />
<link href="${rootPath}/static/css/table.css?${version}" rel="stylesheet" />
<link href="${rootPath}/static/css/test.css?${version}" rel="stylesheet" />
<link href="${rootPath}/static/css/detail.css?${version}" rel="stylesheet" />

<script>
	var rootPath = "${rootPath}"
</script>
<script src="${rootPath}/static/js/input.js?${version}"></script>
<script src="${rootPath}/static/js/list.js?${version}"></script>
<script src="${rootPath}/static/js/detail.js?${version}"></script>

</head>
<body>
	<header>
		<h1>MY CAR MANAGER</h1>
	</header>
	
	<section class="main">
		<c:if test="${empty BODY}">
			<%@ include file="/WEB-INF/views/car/list.jsp"%>
		</c:if>

		<c:if test="${BODY == 'INPUT'}">
			<%@ include file="/WEB-INF/views/car/input.jsp"%>
		</c:if>
		
		<c:if test="${BODY == 'DETAIL'}">
			<%@ include file="/WEB-INF/views/car/detail.jsp"%>
		</c:if>
		
		<c:if test="${BODY == 'UPDATE'}">
			<%@ include file="/WEB-INF/views/car/update.jsp"%>
		</c:if>

	</section>

</body>
</html>