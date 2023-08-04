<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<c:set value="20230720-001" var="version" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link href="/hello/static/css/fullcalendar.css" rel="stylesheet" />
<link href="/hello/static/css/spectrum.css" rel="stylesheet" />
<link href="/hello/static/css/style_full.css" rel="stylesheet" />
<link href="/hello/static/css/style.css" rel="stylesheet" />

<script src="https://code.jquery.com/jquery-2.2.4.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/gsap/1.20.2/TweenMax.min.js"></script>
<script src="/hello/static/js/spectrum.js"></script>
<script src="/hello/static/js/front.js"></script>
<script src="/hello/static/js/input.js"></script>

<script>
	var rootPath = "${rootPath}"
</script>

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

			<c:if test="${BODY == 'INPUT'}">
			<%@ include file="/WEB-INF/views/input.jsp"%>
		</c:if>

	<script type="text/javascript" src="/hello/static/js/spectrum.js"></script>
	<script type="text/javascript" src="/hello/static/js/front.js"></script>
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
            date: 20,
          },
          registArea: ".schedule_wrap",

        });
        $.ajax({
            type: "GET",
            url: "/hello/list",
            dataType: "json",
            success: function (res) {
            	console.log(res)
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
