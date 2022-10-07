<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Login V1</title>
	<c:set var = "path" value = "${pageContext.request.contextPath}" />
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="${path}/resources/images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="${path}/resources/vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="${path}/resources/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="${path}/resources/vendor/animate/animate.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="${path}/resources/vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="${path}/resources/vendor/select2/select2.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="${path}/resources/css/util.css">
	<link rel="stylesheet" type="text/css" href="${path}/resources/css/main.css">
<!--===============================================================================================-->
	<script src="https://kit.fontawesome.com/3400d00a45.js" crossorigin="anonymous"></script>
</head>
<body>
	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100">
				<div class="login100-pic js-tilt" data-tilt style="padding-top: 15%;">
					<img src="${path}/resources/images/img-01.png" alt="IMG">
				</div>

				<form class="login100-form validate-form" action="register.do" method="post" id="regForm">
					<span class="login100-form-title">
						Member Regist
					</span>
					<div class="wrap-input100 validate-input" data-validate = "아이디를 입력해주세요." required oninput = "idChk()">
						<input class="input100" type="text" name="mid" id="mid" placeholder="ID">
						<span class="id_ok" style="color:green; display:none;">사용 가능한 아이디입니다.</span>
						<span class="id_already" style="color:red; display:none;">사용중인 아이디입니다.</span>
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<i class="fa-solid fa-id-badge"></i>
						</span>
					</div>

					<div class="wrap-input100 validate-input" data-validate = "비밀번호를 입력해주세요.">
						<input class="input100" type="password" name="pwd" placeholder="Password">
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<i class="fa fa-lock" aria-hidden="true"></i>
						</span>
					</div>
					<div class="wrap-input100 validate-input" data-validate = "이름을 입력해주세요.">
						<input class="input100" type="text" name="name" placeholder="Your Name">
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<i class="fa-solid fa-user"></i>
						</span>
					</div>
					<div class="wrap-input100 validate-input" data-validate = "이메일의 형식이 유효하지 않습니다: ex@abc.xyz">
						<input class="input100" type="text" name="email" placeholder="Email">
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<i class="fa fa-envelope" aria-hidden="true"></i>
						</span>
					</div>
					<div class="wrap-input100 validate-input" data-validate = "생년월일의 형식이 유효하지 않습니다: YYYYMMDD">
						<input class="input100" type="text" name="birth" placeholder="Birth: YYYYMMDD">
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<i class="fa-solid fa-calendar"></i>
						</span>
					</div>
					
					<div class="container-login100-form-btn">
						<button type="submit" class="login100-form-btn">
							회원가입
						</button>
					</div>

					<div class="text-center p-t-136">
						<a class="txt2" href="/">
							홈으로
							<i class="fa fa-long-arrow-right m-l-5" aria-hidden="true"></i>
						</a>
					</div>
				</form>
			</div>
		</div>
	</div>
	
	

	
<!--===============================================================================================-->	
	<script src="${path}/resources/vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="${path}/resources/vendor/bootstrap/js/popper.js"></script>
	<script src="${path}/resources/vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="${path}/resources/vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="${path}/resources/vendor/tilt/tilt.jquery.min.js"></script>
	<script >
		$('.js-tilt').tilt({
			scale: 1.1
		})
	</script>
<!--===============================================================================================-->
	<script src="${path}/resources/js/main.js"></script>

</body>
</html>