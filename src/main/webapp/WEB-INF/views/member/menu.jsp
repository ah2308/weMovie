<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	${sessionScope.name }
	(${sessionScope.mid })님 환영합니다.
	<hr>
	<form action="/member/logout.do" method="post">
	<button type="submit" id="${message == 'logout'}">로그아웃 </button>
	</form>
</body>
</html>