<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>우리들의 영화관. WE:MOVIE 로그인 페이지</title>
</head>
<body>
	<%@include file="./header.jsp" %>
    <main>
        <div class="login-box">
            <form action="/login" method="post">
                <div class="input-area">
                    <input type="text" name="username" value="" required placeholder="아이디를 입력해주세요." maxlength="30">
                </div>
                <div class="input-area">
                    <input type="password" name="password" value="" required placeholder="비밀번호를 입력해주세요." maxlength="30">
                </div>
            <input type="submit" value="로그인" class="login-btn">
            <div>
                <span class="id-search"><a href="/find/id">아이디 찾기</a></span>
                <span>|</span>
                <span><a href="/find/password">비밀번호 찾기</a></span>
            </div>
            </form>
        </div>
    </main>
</body>
</html>