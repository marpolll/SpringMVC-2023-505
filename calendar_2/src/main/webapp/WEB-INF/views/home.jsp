<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<c:set value="20230630-009" var="version" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link href="${rootPath}/static/css/fullcalendar.css" rel="stylesheet" />
<link href="${rootPath}/static/css/spectrum.css" rel="stylesheet" />
<link href="${rootPath}/static/css/style_full.css" rel="stylesheet" />
<link href="${rootPath}/static/css/style.css" rel="stylesheet" />

<script>
	var rootPath = "${rootPath}"
</script>

<script src="${rootPath}/static/js/front.js"></script>
<script src="${rootPath}/static/js/spectrum.js"></script>


<script src="https://code.jquery.com/jquery-2.2.4.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/gsap/1.20.2/TweenMax.min.js"></script>

</head>
<body>
	<div class="wrap">
		<div class="con_box">
			<div class="calendar_wrap" id="calendar">
				<div class="calendar_top">
					<button class="btn_dir prev"></button>
					<h4></h4>
					<button class="btn_dir next"></button>
					<button class="today">TODAY</button>
				</div>
				<!--// calendar_top-->

				<div class="calendar_con">
					<table border="0" cellspacing="0" cellpadding="0">
						<caption></caption>
						<thead>
							<!-- 요일 설정 -->
							<tr></tr>
						</thead>
						<tbody></tbody>
					</table>
				</div>
				<!--// calendar_con-->
			</div>
			<!--// calendar_wrap-->

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
				</div>
				<!--// btn_area-->
			</div>
			<!--// schedule_wrap-->
		</div>
		<!--// con_box-->
	</div>

	<script type="text/javascript" src="js/spectrum.js"></script>
	<script type="text/javascript" src="js/front.js"></script>
	<script type="text/javascript">
      $(() => {
        var calendar = calendarMake({
          ele: "#calendar", // 달력 그리는 영역
          scheEle: ".schedule_wrap", // 일정등록 레이어 영역
          day: ["SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"],
          today: {
            // 오늘 날짜 서버시간 체크해서 넣어주세요
            year: 2023,
            month: 7,
            date: 12,
          },
          registArea: ".schedule_wrap",
        });

        $.ajax({
            type: "GET",
            url: "schedule.json",
            dataType: "json",
            success: function (res) {
              sDataParsing.init(res.schedule); // 날짜 데이터 파싱
              calendar.drawMonthData(7); // 출력하고 싶은 월 파라미터로 넣기
            },
            fail: function (xhr, status, error) {
              console.log(error);
            },
          });
      });
    </script>
</body>
</html>
