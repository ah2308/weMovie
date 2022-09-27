<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>우리들의 영화관. WE:MOVIE 회원가입</title>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script src="resources/js/script.js"></script>
</head>
<body>
	<%@include file="./header.jsp" %>
	<main>
		<form action="/regist" method="post">
			<div>
				<label> 이 름 </label>
				<input type="text" name="name" value="" required placeholder="이 름" maxlength="30">
			</div>
			<div>
				<label>아 이 디</label>
				<input type="text" name="id" value="" required placeholder="아 이 디" maxlength="30">
			</div>
			<div>
				<label>비밀번호</label>
				<input type="text" name="password" value="" required placeholder="비 밀 번 호" maxlength="30">
			</div>
			<div>
				<label>이메일</label>
				<input type="text" name="email" value="" required placeholder="ex) abc@naver.com" maxlength="30">
			</div>
			<div>
				<label>생일</label>
				<select name="yy" id="year"></select>년
				<select name="mm" id="month"></select>월
				<select name="dd" id="day"></select>일
			</div>
		</form>
	</main>
</body>
</html>