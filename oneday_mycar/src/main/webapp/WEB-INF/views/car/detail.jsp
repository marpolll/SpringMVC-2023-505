<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<article class="detail data">

	<div>
		<strong>NO</strong><span>${CAR.c_no}</span>
	</div>

	<div>
		<strong>구분</strong><span>${CAR.c_title}</span>
	</div>

	<div>
		<strong>시작거리</strong><span>${CAR.c_ddis}</span>
	</div>

	<div>
		<strong>장소</strong><span>${CAR.c_place}</span>
	</div>

	<div>
		<strong>종료거리</strong><span>${CAR.c_edis}</span>
	</div>

	<div>
		<strong>소모비용</strong> <span>${CAR.c_cost}</span>
	</div>

</article>

<article class="detail button">

	<div>
		<button class="detail list">리스트로</button>
		<button class="detail update" data-id="${CAR.c_no}">수정</button>
		<button class="detail delete" data-id="${CAR.c_no}">삭제</button>
	</div>
</article>