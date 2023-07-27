<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>도서정보 ${STATE == 'UPDATE' ? '수정' : '추가' }</h1>

	<%
	/*

	Spring form taglib
	html 코딩에서 만들 여러가지 속성을 자동으로 구성해주는
	String 확장 form tag
	Controller 에서 생성한 ModelAttribute 와 연계되고
	각 input box path 속성과 연계되어 상당히 많은 코드를
	자동으로 생성해 준다.
	이 tag 는 form 의 method 의 기본값을 POST 로 지정한다.

	*/
	%>
	<f:form modelAttribute="BOOK">

		<c:if test="${STATE != 'UPDATE' }">

			<div>
				<label>도서코드<f:input path="b_code" /></label>
			</div>
		</c:if>
		<div>
			<label>도서명<f:input path="b_name" /></label>
		</div>

		<div>
			<label>저자<f:input path="b_auther" /></label>
		</div>

		<div>
			<label>출판사<f:input path="b_comp" /></label>
		</div>

		<div>
			<label>구입연도<f:input path="b_year" /></label>
		</div>

		<div>
			<label>구입가격<f:input path="b_iprice" /></label>
		</div>

		<div>
			<label>대여가격<f:input path="b_rprice" /></label>
		</div>

		<div>
			<button type="button">리스트로</button>
			<button>저장하기</button>
			<button type="reset">새로작성</button>
		</div>

	</f:form>
</body>
</html>