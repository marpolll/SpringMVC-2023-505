<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	document.addEventListener('DOMContentLoaded', function() {
		var calendarEl = document.getElementById('calendar');
		// new FullCalendar.Calendar(대상 DOM객체, {속성:속성값, 속성2:속성값2..})

		var calendar = new FullCalendar.Calendar(calendarEl, {
			headerToolbar : {
				left : 'prev,next today',
				center : 'title',
				right : 'dayGridMonth,timeGridWeek,timeGridDay'
			},
			initialDate : '2021-04-12', // 초기 로딩 날짜.
			navLinks : true, // can click day/week names to navigate views
			selectable : true,
			selectMirror : true,
			// 이벤트명 : function(){} : 각 날짜에 대한 이벤트를 통해 처리할 내용..
			select : function(arg) {
				console.log(arg);

				var title = prompt('입력할 일정:');
				// title 값이 있을때, 화면에 calendar.addEvent() json형식으로 일정을 추가
				if (title) {
					calendar.addEvent({
						title : title,
						start : arg.start,
						end : arg.end,
						allDay : arg.allDay,
						backgroundColor : "yellow",
						textColor : "blue"
					})
				}
				calendar.unselect()
			},
			eventClick : function(arg) {
				// 있는 일정 클릭시,
				console.log("#등록된 일정 클릭#");
				console.log(arg.event);

				if (confirm('Are you sure you want to delete this event?')) {
					arg.event.remove()
				}
			},
			editable : true,
			dayMaxEvents : true, // allow "more" link when too many events
			events : function(info, successCallback, failureCallback) {
				// ajax 처리로 데이터를 로딩 시킨다.
				$.ajax({
					type : "get",
					url : "${path}/calendar.do?method=data",
					dataType : "json"
				});
			}
		});

		calendar.render();
	});
</script>
</head>
<body>
	<div id='calendar'></div>
</body>
</html>