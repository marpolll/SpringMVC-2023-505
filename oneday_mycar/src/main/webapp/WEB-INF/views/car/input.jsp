<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<form method="post" class="main input">
	<fieldset>
	<legend>운행등록</legend>
	<div>
		<label>구분</label> <input name="c_title" />
	</div>
	<div class="message c_title">
	<label></label><span></span></div>

	<div>
		<label>시작거리</label> <input name="c_ddis" />
	</div>
	<div class="message c_ddis">
	<label></label><span></span></div>

	<div>
		<label>장소</label> <input name="c_place" />
	</div>
	<div class="message c_place">
	<label></label><span></span></div>

	<div>
		<label>종료거리</label> <input name="c_edis" />
	</div>
	<div class="message c_edis">
    <label></label><span></span></div>
	
	<div>
		<label>소모비용</label> <input name="c_cost" />
	</div>
	<div class="message c_cost">
	<label></label><span></span></div>

	<div>
		<label></label>
		<button class="button input" type="button">추가하기</button>
	</div>
	</fieldset>
</form>
