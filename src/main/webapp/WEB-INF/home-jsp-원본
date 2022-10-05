<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<title>Home</title>
</head>
<body>
<c:choose>
	<c:when test="${sessionScope.mid == null}">
		<a href="member/login">로그인</a>
		<a href="member/register">회원가입</a>
	</c:when>
	<c:otherwise>
		${sessionScope.mid}님 로그인 상태.
		<a href="member/menu">메뉴로</a>
	</c:otherwise>
</c:choose>
. 
</body>
</html>