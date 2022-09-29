<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.weMovies.dto.MemberVO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>우리들의 영화관. WE:MOVIE</title>
<link rel="stylesheet" href="resources/css/style.css">
<link rel="stylesheet" href="resource/css/bootstrap.css">
</head>
<body>
	<%@include file="header.jsp"%>
	<%
	MemberVO vo = (MemberVO) request.getAttribute("vo");
	out.print(vo.getName() + "님 회원가입을 환영합니다^^" + "<br><br>");
	out.print(vo.getId() + "<br>" + vo.getPwd() + "<br>" + vo.getName() + "<br>" + vo.getAge() + "<br>" + vo.getPhone());
	%>
	<div class=""></div>
</body>
</html>