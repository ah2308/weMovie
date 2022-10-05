<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>로그인</h2>
	<div class="container">
		<form action="/member/login_check.do" method="post">
			<input type="hidden" name="act" value="login">
			<div class="form-group">
				<label for="exampleInputEmail1">user id</label> 
				<input type="text" class="form-control" id="exampleInputEmail1"
					aria-describedby="emailHelp" name="mid">
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Password</label> 
				<input type="password" class="form-control" id="exampleInputPassword1"
					name="pwd">
			</div>
			<div class="form-group form-check">
				<input type="checkbox" class="form-check-input" id="exampleCheck1"
					name="idsave" value="checked"> 
					<label class="form-check-label" 
					for="exampleCheck1">Check me out</label>
			</div>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>
</body>
</html>