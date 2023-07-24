<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="schedule_wrap">
				<div class="schedule_form">
					<table class="tbl th_ver" border="0" cellpadding="0"
						cellspacing="0">
						<caption></caption>
						<colgroup>
							<col width="30%" />
							<col width="70%" />
						</colgroup>
						<tbody>
							<tr>
								<th scope="row">일정명</th>
								<td><input type="text" id="sTitle" /></td>
							</tr>
							<tr>
								<th scope="row">등록일</th>
								<td class="write_date"></td>
							</tr>
							<tr>
								<th scope="row">시작일</th>
								<td><span class="datepicker"> <input type="text"
										id="startDate" style="width: 30%" />
								</span></td>
							</tr>
							<tr>
								<th scope="row">종료일</th>
								<td><span class="datepicker"> <input type="text"
										id="endDate" style="width: 30%" />
								</span></td>
							</tr>
							<tr>
								<th scope="row">색상</th>
								<td><input type="text" id="sBg" /></td>
							</tr>
							<tr>
								<th scope="row">상태</th>
								<td>
									<div class="style_select" style="width: 80%">
										<label> <span></span> <select name="">
												<option value="사용" selected>사용</option>
												<option value="중지">중지</option>
										</select>
										</label>
									</div> <!--// style_select-->
								</td>
							</tr>
						</tbody>
					</table>
				</div>
				<!--// schedule_form-->

				<div class="btn_area center">
					<a href="#" class="btn full_gray cancel">취소</a> <a href="#"
						class="btn full_skyblue regist">저장</a>
						<button id="btn_save" type="button">저장</button>
				</div>
				<!--// btn_area-->
			</div>
			<!--// schedule_wrap-->
		</div>
		<!--// con_box-->
	</div>