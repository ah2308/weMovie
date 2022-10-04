<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Main</title>
</head>
 
<body>
 
<div class="container">
  <h3>회원가입</h3>
  <input type="hidden" name="act" value="login">
			<div class="form-group">
				<label for="exampleInputEmail1">user id</label> <input type="text"
					class="form-control" id="exampleInputEmail1"
					aria-describedby="emailHelp" name="mid">
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Password</label> <input
					type="password" class="form-control" id="exampleInputPassword1"
					name="pwd">
			</div>
			<div class="form-group form-check">
				<input type="checkbox" class="form-check-input" id="exampleCheck1"
					name="idsave" value="checked"> <label
					class="form-check-label" for="exampleCheck1">Check me out</label>
			</div>
  <a href="/signup/signup.do" class="btn btn-primary">회원가입</a>
</div>
 
</body>
</html>
