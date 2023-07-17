<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<form method="post" class="main update">
	<fieldset>
		<legend>운행 수정</legend>
		
		<div>
			<label>NO</label> <input name="c_no" value="${CAR.c_no}" readonly="readonly" />
		</div>
		
		<div>
			<label>구분</label> <input name="c_title" value="${CAR.c_title}"/>
		</div>
		<div class="message c_title">
			<label></label><span></span>
		</div>
		
		<div>
			<label>시작거리</label> <input name="c_ddis" value="${CAR.c_ddis}"/>
		</div>
		<div class="message c_ddis">
			<label></label><span></span>
		</div>
		
		<div>
			<label>장소</label> <input name="c_place" value="${CAR.c_place}"/>
		</div>
		<div class="message c_place">
			<label></label><span></span>
		</div>
		
		<div>
			<label>종료일자</label> <input name="c_edate" value="${C.c_edate}" />
		</div>

		<div>
			<label>종료시각</label> <input name="c_etime" value="${C.c_etime}" />
		</div>
		
		<div>
			<label>종료거리</label> <input name="c_edis" value="${CAR.c_edis}"/>
		</div>
		<div class="message c_edis">
			<label></label><span></span>
		</div>
		
		<div>
			<label>소요비용</label> <input name="c_cost" value="${CAR.c_cost}"/>
		</div>
		<div class="message c_cost">
			<label></label><span></span>
		</div>

		<div>
			<label></label>
			<button class="button list" type="button">삭제하기</button>
			<button class="button input" type="button">수정하기</button>
		</div>
	</fieldset>
</form>
