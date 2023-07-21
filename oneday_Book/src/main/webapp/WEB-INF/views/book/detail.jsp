<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<article class="detail data">

	<div>
		<strong>도서코드</strong><span>${BOOK.b_code}</span>
	</div>
	
	<div>
		<strong>도서명</strong><span>${BOOK.b_name}</span>
	</div>
	
	<div>
		<strong>저자</strong><span>${BOOK.b_auther}</span>
	</div>
	
	<div>
		<strong>출판사</strong><span>${BOOK.b_comp}</span>
	</div>
	
	<div>
		<strong>구입연도</strong><span>${BOOK.b_year}</span>
	</div>
	
	<div>
		<strong>구입가격</strong><span>${BOOK.b_iprice}</span>
	</div>
	
	<div>
		<strong>대여가격</strong><span>${BOOK.b_rprice}</span>
	</div>
	
	<div>
		<strong>렌탈여부</strong><span>${BOOK.b_rent}</span>
	</div>
	
	<div>
		<strong>사용여부</strong><span>${BOOK.b_use}</span>
	</div>


</article>

<article class="detail button">

	<div>
		<button class="detail list">리스트로</button>
		<button class="detail update" data-id="${BOOK.b_code}">수정</button>
		<button class="detail delete" data-id="${BOOK.b_code}">삭제</button>
	</div>
</article>