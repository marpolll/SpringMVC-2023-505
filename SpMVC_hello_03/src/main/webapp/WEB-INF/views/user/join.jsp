<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>회원가입</h1>

	<form method="POST">
		<div>
			<input name="username" placeholder="USERNAME" />
		</div>
		<div>
			<input name="password" placeholder="PASSWORD" type="password" />
		</div>
		<div>
			<input name="re_password" placeholder="PASSWORD 확인" type="password" />
		</div>
		<div>
			<input name="name" placeholder="이름" />
		</div>
		<div>
			<input name="tel" placeholder="전화번호" />
		</div>

		<div>
			<button>추가하기</button>
		</div>
	</form>
</body>
</html>