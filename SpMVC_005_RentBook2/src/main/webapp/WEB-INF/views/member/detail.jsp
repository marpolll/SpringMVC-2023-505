<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원정보 상세보기</h1>
<div><strong>회원코드 : </strong> ${MEMBER.m_code}</div>
<div><strong>회원이름 : </strong> ${MEMBER.m_name}</div>
<div><strong>전화번호 : </strong> ${MEMBER.m_tel}</div>
<div><strong>회원주소 : </strong> ${MEMBER.m_addr}</div>
<div>
<a href="${rootPath}/member">회원리스트로</a>
<a href="${rootPath}/member/${MEMBER.m_code}/update">수정하기</a>
<a href="${rootPath}/member/${MEMBER.m_code}/expire">사용중지</a>
<a href="${rootPath}/rent">도서대여리스트로</a>
</div>
</body>
</html>