<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>메뉴</title>
</head>
<body>
	${sessionScope.name } (${sessionScope.mid })님 환영합니다.
	<hr>
	<div class="container">
		<form action="logout.do" method="post">
			<button type="submit" id="logout">로그아웃</button>
		</form>
	</div>
</body>
</html>