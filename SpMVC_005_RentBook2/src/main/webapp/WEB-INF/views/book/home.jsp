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
	<h1>도서정보 관리</h1>

	<table class="book">
		<tr>
			<th>도서코드</th>
			<th>도서명</th>
			<th>저자</th>
			<th>출판사</th>
			<th>대여가격</th>
		</tr>
		<c:choose>
			<c:when test="${not empty BOOKS}">
				<c:forEach items="${BOOKS}" var="BOOK">
					<tr>
						<td>${BOOK.b_code}</td>
						<td><a href="${rootPath}/book/${BOOK.b_code}/detail">
								${BOOK.b_name} </a></td>
						<td>${BOOK.b_auther}</td>
						<td>${BOOK.b_comp}</td>
						<td>${BOOK.b_rprice}</td>
					</tr>
				</c:forEach>
			</c:when>
			<c:otherwise>
				<tr>
					<td colspan="5">도서정보 없음</td>
				</tr>
			</c:otherwise>
		</c:choose>
	</table>
	<div class="list pagination">
		<ul>
			
			<c:if test="${PAGI.firstPageNum > 1}">
				
				<li>
				<a href="${rootPath}/book?page=1">&#124;&lt;</a>
				</li>

				<li>
				<a href="${rootPath}/book?page=${PAGI.pageNum -1} "> &lt;</a>
				</li>

			</c:if>
			
			<c:forEach begin="${PAGI.firstPageNum}" end="${PAGI.lastPageNum}"
				var="PAGE">
				
				<li class="${PAGI.pageNum == PAGE ? 'active' : ''}">
				<a href="${rootPath}/book?page=${PAGE}&search=${SEARCH}">${PAGE}</a></li>
			
			</c:forEach>
			
				<li>
				<a href="${rootPath}/book?page=${PAGI.pageNum + 1}"> &gt;</a> 
				</li>
				
			
			<c:if test="${PAGI.lastPageNum < PAGI.finalPageNum}">
				
				
				<li>
				<a href="${rootPath}/book?page=${PAGI.finalPageNum}">&#124;&gt;</a>
				</li>
			
			</c:if>
		</ul>
	</div>
	
	<div class="list book search">
		<form>
			<input name="page" hidden="hidden" value="${PAGI.pageNum}" />
			<input name="search" placeholder="검색어 입력 후 Enter" />
			<button>검색</button>
		</form>
	</div>
	
	<div class="list book button">
		<a href="${rootPath}/">처음으로</a> <a href="${rootPath}/book/insert">도서정보추가</a>
	</div>

</body>
</html>