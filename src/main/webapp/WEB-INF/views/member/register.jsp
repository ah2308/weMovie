<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원가입</title>
</head>
<body>
	<h2>회원가입</h2>
	<div class="container">
		<form action="/member/register.do" method="post">
			<input type="hidden" name="act" value="mid">
			<div class="form-group">
				<label for="id">id</label> 
				<input type="text" name="mid">
			</div>
			<div class="form-group">
				<label for="pw">Password</label> 
				<input type="password"name="pwd">
			</div>
			<div class="form-group">
				<label for="name">name</label> 
				<input type="text" name="name">
			</div>
			<div class="form-group">
				<label for="email">email</label> 
				<input type="text" name="email">
			</div>
			<div class="form-group">
				<label for="birth">birth</label> 
				<input type="date" name="birth">
			</div>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>
</body>
</html>