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

	<h1>렌탈정보 ${empty RENT.r_seq ? '추가' : '수정'}</h1>

	<f:form modelAttribute="RENT">

		<div>
			<label>대출일<f:input path="r_date" /></label>
		</div>
		
		<div>
			<label>반납예정일<f:input path="r_return_date" /></label>
		</div>
		
		<div>
			<label>도서코드<f:input path="r_bcode" /></label>
		</div>
		
		<div>
			<label>회원코드<f:input path="r_mcode" /></label>
		</div>
		
		<div>
			<label>도서반납여부<f:input path="r_return_yn" /></label>
		</div>
		
		<div>
			<label>포인트<f:input path="r_point" /></label>
		</div>
		
		<div>
			<label>대여금액<f:input path="r_price" /></label>
		</div>

		<div>
			<button type="button">
				<a href="${rootPath}/rent">렌탈리스트로</a>
			</button>
			<button>저장하기</button>
			<button type="reset">새로작성</button>
		</div>
	</f:form>
</body>
</html>