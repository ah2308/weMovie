<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String sessionId = (String) session.getAttribute("sessionId");
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="resources/css/style.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Do+Hyeon&family=Source+Sans+Pro&display=swap" rel="stylesheet">
    <script src="resources/js/main.js" defer></script>
    <script src="https://kit.fontawesome.com/3400d00a45.js" crossorigin="anonymous"></script>
</head>
<body>
    <header id="header">
        <nav class="navbar container">
            <div class="navbar_logo">
                <h1>
                    <i class="fa-brands fa-stumbleupon"></i>
                    <a href="index">We : Movie</a>
                </h1>
            </div>
            <ul class="navbar_menu">
                <li><a href="">예  매</a></li>
                <li><a href="">영  화</a></li>
                <li><a href="">영화관</a></li>
                <li><a href="">이벤트</a></li>
                <li><a href="">스토어</a></li>
            </ul>
            <ul class="navbar_icons">
            <c:choose>
					<c:when test="${empty sessionId}">
                <li><i class="fa-sharp fa-solid fa-lock"><a href="<c:url value="login.jsp"/>">로그인</a></i></li>
                <li><i class="fa-sharp fa-solid fa-user-plus"><a href='<c:url value="insertMember.jsp"/>'>회원가입</a></i></li>
                </c:when>
                <c:otherwise>
                <li style="padding-top: 7px; color: white">[<%=sessionId%>님]</li>
                <li><i class="fa-sharp fa-solid fa-lock"><a href="<c:url value="logout.jsp"/>">로그아웃</a></i></li>
                <li><i class="fa-sharp fa-solid fa-user-plus"><a href='<c:url value="insertMember.jsp"/>'>마이페이지</a></i></li>
                </c:otherwise>
				</c:choose>
            </ul>
            <a href="#" class="navbar_toggleBtn">
                <i class="fa-sharp fa-solid fa-bars"></i>
            </a>
        </nav>
    </header>
</body>
</html>