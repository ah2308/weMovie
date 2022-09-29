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
	<%@include file="./header.jsp"%>
	<main>
		<form action="login" method="post">
			<input type="text" name="id" id="id" required placeholder="아이디를 입력해주세요." maxlength="30"> 
			<input type="password" name="password" id="password" required placeholder="비밀번호를 입력해주세요." maxlength="30"><br> 
			<input type="submit" value="로그인"> 
			<span class="id-search"><a href="/find/id">아이디 찾기</a></span> <span>|</span>
			<span><a href="/find/password">비밀번호 찾기</a></span>
		</form>
	</main>
</body>
</html>