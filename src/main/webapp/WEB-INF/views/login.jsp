<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>우리들의 영화관. WE:MOVIE 로그인 페이지</title>
<script>
	$(function() {
		$("#btnLogin").click(function() {
			userid = $("#userid").val();
			var userpw = $("#userpw").val();
			if (userid == "") {
				alert("아이디를 입력하세요");
				$("#userid").focus(); //입력포커스 이동
				return; //함수 종료
			}
			if (userpw == "") {
				alert("비밀번호를 입력하세요");
				$("#userpw").focus();
				return;
			}
			//폼 내부의 데이터를 전송할 주소
			document.form1.action = "${path}/login_check.do";
			document.form1.submit(); //제출
		});
	});
</script>
</head>
<body>
	<%@include file="./header.jsp"%>
	<main>
		<div class="login-box">
			<form name="form1" method="post">
				<div class="input-area">
					<input type="text" name="userid" value="" 
					required placeholder="아이디를 입력해주세요." maxlength="30">
				</div>
				<div class="input-area">
					<input type="password" name="userpw" value="" 
					required placeholder="비밀번호를 입력해주세요." maxlength="30">
				</div>
				<input type="submit" value="로그인" class="login-btn">
				<div>
					<span class="id-search"><a href="/find/id">아이디 찾기</a></span> <span>|</span>
					<span><a href="/find/password">비밀번호 찾기</a></span>
				</div>
			</form>
		</div>
	</main>
</body>
</html>