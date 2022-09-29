<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="header.jsp" %>
<form action="member.do?choice=logout" method="post">
<input type="button" onclick="location.href='/index.jsp'" value="logout">
</form>

</body>
</html>