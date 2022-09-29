<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.weMovies.dto.MemberVO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	MemberVO vo = (MemberVO) session.getAttribute("vo");

	if (vo != null) {

	} else {
		out.print("로그아웃 성공!.^^" + "<br><br>");
	}
	%>
</body>
</html>