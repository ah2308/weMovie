<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<style>
.carousel-inner>.carousel-item>img {
	width: 640px;
	height: 350px;
}
</style>
</head>
<body>
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
	<script>
		$('.carousel').carousel({
			interval : 3000
		//기본 5초
		})
	</script>
	<div id="demo" class="carousel slide carousel-fade" data-ride="carousel">
		<div class="carousel-inner">
			<!-- 슬라이드 쇼 -->
			<div class="carousel-item active">
				<!--가로-->
				<img class="d-block w-100"
					src="https://product-image.kurly.com/cdn-cgi/image/format=auto/banner/main/pc/img/18c44233-92b0-4f4c-920c-170bf0fbb329.jpg"
					alt="First slide">
				<div class="carousel-caption d-none d-md-block"></div>
			</div>
			<div class="carousel-item">
				<img class="d-block w-100"
					src="https://img-cf.kurly.com/cdn-cgi/image/format=auto/banner/main/pc/img/cd9436a1-edc6-48e0-ab22-06fe6d0aab87"
					alt="Second slide">
			</div>
			<div class="carousel-item">
				<img class="d-block w-100"
					src="https://product-image.kurly.com/cdn-cgi/image/format=auto/banner/main/pc/img/04afca63-0daf-4877-8a37-6aeaa67c6a68.jpg"
					alt="Third slide">
			</div>
			<div class="carousel-item">
				<img class="d-block w-100"
					src="https://product-image.kurly.com/cdn-cgi/image/format=auto/banner/main/pc/img/6a4b04a4-f58f-4479-96bf-0f7b40775186.png"
					alt="Third slide">
			</div>
			<!-- / 슬라이드 쇼 끝 -->

			<!-- 왼쪽 오른쪽 화살표 버튼 -->
			<a class="carousel-control-prev" href="#demo" data-slide="prev">
				<span class="carousel-control-prev-icon" aria-hidden="true"></span>
				<!-- <span>Previous</span> -->
			</a> <a class="carousel-control-next" href="#demo" data-slide="next">
				<span class="carousel-control-next-icon" aria-hidden="true"></span>
				<!-- <span>Next</span> -->
			</a>
			<!-- / 화살표 버튼 끝 -->

			<!-- 인디케이터 -->
			<ul class="carousel-indicators">
				<li data-target="#demo" data-slide-to="0" class="active"></li>
				<!--0번부터시작-->
				<li data-target="#demo" data-slide-to="1"></li>
				<li data-target="#demo" data-slide-to="2"></li>
				<li data-target="#demo" data-slide-to="3"></li>
			</ul>
			<!-- 인디케이터 끝 -->
		</div>
</body>
</html>