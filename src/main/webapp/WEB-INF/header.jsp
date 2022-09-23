<!DOCTYPE html>
<html lang="kor">
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.1/font/bootstrap-icons.css">
<meta charset="UTF-8">
<title></title>
<style>
@import
	url('https://fonts.googleapis.com/css2?family=Lobster&display=swap');
.cwrts {
	font-family: 'Lobster', cursive;
}
</style>
</head>
<body>
	<div class="jumbotron" style="margin-bottom:0%;">
		<div class="container text-right">
		<a href="#">CC |</a><a href="#"> Login |</a><a href="./signup.jsp"> Sing Up</a>
		</div>
		<h1 class="cwrts text-center" style="margin-top: 15px;"><a style="color: black; text-decoration:none;" href="./main.jsp">CWRTS</a></h1>
		<div class="container">
			<form action="">
				<div class="mx-auto mt-5 search-bar input-group mb-3">
					<input type="text" placeholder="Search"
						class="rounded-pill form-control" style="width: 350px; text-align: center;"> <img
						src="https://s3.ap-northeast-2.amazonaws.com/cdn.wecode.co.kr/icon/search.png"
						style="position: absolute; width: 17px; top: 10px; right: 12px; margin: 0;">
				</div>
			</form>
			<div class="row justify-content-md-left">
				<div class="col-md-auto">
					<nav class="navbar navbar-expand-lg navbar-light">
						<div class="dropdown">
							<button class="btn dropdown-toggle" data-toggle="dropdown">
								<img src="./resource/image/menu.svg">Category
							</button>
							<ul class="dropdown-menu">
								<li><a class="dropdown-item" href="#">A</a>
								<li><a class="dropdown-item" href="#">B</a>
								<li><a class="dropdown-item" href="#">C</a>
								<li><a class="dropdown-item" href="#">D</a>
							</ul>
						</div>
						<div class="collapse navbar-collapse" id="navbarTogglerDemo02">
							<ul class="navbar-nav mr-auto mt-2 mt-lg-0">
								<li class="nav-item"><a class="nav-link" href="#"
									style="margin-left: 70px;">New</a></li>
								<li class="nav-item"><a class="nav-link" href="#">Today's Sale</a></li>
								<li class="nav-item"><a class="nav-link" href="#">Best Item</a></li>
								<li class="nav-item"><a class="nav-link" href="#">Event</a></li>
							</ul>
						</div>
					</nav>
				</div>
			</div>
		</div>
	</div>

</body>
</html>