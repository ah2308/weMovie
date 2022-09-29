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
	<%@include file="header.jsp" %>
	<main>
		<form action="resultMember.jsp" method="post">
			<div>
				<label>아 이 디</label>
				<input type="text" name="id" value="" required placeholder="아 이 디" maxlength="30">
			</div>
			<div>
				<label>비밀번호</label>
				<input type="text" name="password" value="" required placeholder="비 밀 번 호" maxlength="30">
			</div>
			<div>
				<label> 이 름 </label>
				<input type="text" name="name" value="" required placeholder="이 름" maxlength="30">
			</div>
			<div>
				<label> 나 이 </label>
				<input type="text" name="age" value="" required placeholder="나 이" maxlength="30">
			</div>
			<div>
				<label>전화번호</label>
				<input type="text" name="phone" value="" required placeholder="ex) ***-****-****" maxlength="30">
			</div>
			<input type="submit" value="회원가입"/>
		</form>
	</main>
</body>
</html>