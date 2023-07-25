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
	<h1>도서대여 처리</h1>
	<table class="member">
		<tr>
			<th>도서코드</th>
			<th>도서명</th>
			<th>출판사</th>
			
			<th>회원코드</th>
			<th>회원이름</th>
			<th>전화번호</th>
			
			<th>대출일</th>
			<th>반납일</th>
			<th>도서반납여부</th>
			<th>대여금액</th>
			
			<th>포인트</th>
		</tr>
		<c:choose>
			<c:when test="${not empty RENTS}">
				<c:forEach items="${RENTS}" var="RENT">
					<tr>
						<td>${RENT.r_date}</td>
						<td>${RENT.r_return_date}</td>
						<td><a href="${rootPath}/book/${RENT.r_bcode}/detail">
								${RENT.r_bcode} </a></td>
						<td><a href="${rootPath}/member/${RENT.r_mcode}/detail">
								${RENT.r_mcode} </a></td>
						<td>${RENT.r_return_yn}</td>
						<td>${RENT.r_point}</td>
						<td>${RENT.r_price}</td>
					</tr>
				</c:forEach>
			</c:when>
			<c:otherwise>
				<tr>
					<td colspan="5">렌탈정보 없음</td>
				</tr>
			</c:otherwise>
		</c:choose>
	</table>

	<div class="member button">
		<button>
			<a href="${rootPath}/">처음으로</a>
		</button>
		<button>
			<a href="${rootPath}/rent/insert">도서대여</a>
		</button>
		<button>
			<a href="${rootPath}/rent/return">도서반납</a>
		</button>
	</div>

</body>
</html>
</body>
</html>