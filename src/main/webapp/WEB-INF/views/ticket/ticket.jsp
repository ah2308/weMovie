<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<c:set var="path" value="${pageContext.request.contextPath}" />
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>Clean Blog - Start Bootstrap Theme</title>
<link rel="icon" type="image/x-icon"
	href="${path}/resources/assets/favicon.ico" />
<!-- Font Awesome icons (free version)-->
<script src="https://use.fontawesome.com/releases/v6.1.0/js/all.js"
	crossorigin="anonymous"></script>
<!-- Google fonts-->
<link
	href="https://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic"
	rel="stylesheet" type="text/css" />
<link
	href="https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800"
	rel="stylesheet" type="text/css" />
<!-- Core theme CSS (includes Bootstrap)-->
<link href="${path}/resources/css/styles.css" rel="stylesheet" />
<script src="https://kit.fontawesome.com/3400d00a45.js"
	crossorigin="anonymous"></script>
</head>
<body>
	<!-- Navigation-->
	<nav class="navbar navbar-expand-lg navbar-light" id="mainNav">
		<div class="container px-4 px-lg-5">
			<a class="navbar-brand" href="index">WE:MOVIE</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarResponsive"
				aria-controls="navbarResponsive" aria-expanded="false"
				aria-label="Toggle navigation">
				Menu <i class="fas fa-bars"></i>
			</button>
			<div class="collapse navbar-collapse" id="navbarResponsive">
				<c:choose>
					<c:when test="${sessionScope.mid == null}">
						<ul class="navbar-nav ms-auto py-4 py-lg-0">
							<li class="nav-item"><a
								class="nav-link px-lg-3 py-3 py-lg-4" href="login.do">로그인</a></li>
							<li class="nav-item"><a
								class="nav-link px-lg-3 py-3 py-lg-4" href="registForm">회원가입</a></li>
						</ul>
					</c:when>
					<c:otherwise>
						<ul>
							<li class="nav-item"><a
								class="nav-link px-lg-3 py-3 py-lg-4" href="ticket.do">예매하기</a></li>
							<li class="nav-item"><a
								class="nav-link px-lg-3 py-3 py-lg-4" href="logout.do">로그아웃</a></li>
							<li class="nav-item"><a
								class="nav-link px-lg-3 py-3 py-lg-4" href="#">마이 페이지</a></li>
						</ul>
					</c:otherwise>
				</c:choose>
			</div>
		</div>
	</nav>
	<!-- Page Header-->

<div class="container">
        <div class="row align-items-center">
          <div class="col-md">
            <h2 class="heading mb-2 display-4 font-light probootstrap-animate fadeInUp probootstrap-animated">Explore The World With Ease</h2>
            <p class="lead mb-5 probootstrap-animate fadeInUp probootstrap-animated">
              

            </p>
              <a href="onepage.html" role="button" class="btn btn-primary p-3 mr-3 pl-5 pr-5 text-uppercase d-lg-inline d-md-inline d-sm-block d-block mb-3">See OnePage Verion</a> 
            <p></p>
          </div> 
          <div class="col-md probootstrap-animate fadeInUp probootstrap-animated">
            <form action="#" class="probootstrap-form">
              <div class="form-group" data-select2-id="6">
                <div class="row mb-3">
                  <div class="col-md">
                    <div class="form-group">
                      <label for="id_label_single">From</label>

                      <label for="id_label_single" style="width: 100%;">
                        <select class="js-example-basic-single js-states form-control select2-hidden-accessible" id="id_label_single" style="width: 100%;" data-select2-id="id_label_single" tabindex="-1" aria-hidden="true">
                          <option value="Australia" data-select2-id="2">Australia</option>
                          <option value="Japan" data-select2-id="9">Japan</option>
                          <option value="United States" data-select2-id="10">United States</option>
                          <option value="Brazil" data-select2-id="11">Brazil</option>
                          <option value="China" data-select2-id="12">China</option>
                          <option value="Israel" data-select2-id="13">Israel</option>
                          <option value="Philippines" data-select2-id="14">Philippines</option>
                          <option value="Malaysia" data-select2-id="15">Malaysia</option>
                          <option value="Canada" data-select2-id="16">Canada</option>
                          <option value="Chile" data-select2-id="17">Chile</option>
                          <option value="Chile" data-select2-id="18">Zimbabwe</option>
                        </select><span class="select2 select2-container select2-container--default select2-container--below" dir="ltr" data-select2-id="1" style="width: 100%;"><span class="selection"><span class="select2-selection select2-selection--single" role="combobox" aria-haspopup="true" aria-expanded="false" tabindex="0" aria-labelledby="select2-id_label_single-container"><span class="select2-selection__rendered" id="select2-id_label_single-container" role="textbox" aria-readonly="true" title="Australia">Australia</span><span class="select2-selection__arrow" role="presentation"><b role="presentation"></b></span></span></span><span class="dropdown-wrapper" aria-hidden="true"></span></span>
                      </label>


                    </div>
                  </div>
                  <div class="col-md">
                    <div class="form-group">
                      <label for="id_label_single2">To</label>
                      <div class="probootstrap_select-wrap">
                        <label for="id_label_single2" style="width: 100%;">
                        <select class="js-example-basic-single js-states form-control select2-hidden-accessible" id="id_label_single2" style="width: 100%;" data-select2-id="id_label_single2" tabindex="-1" aria-hidden="true">
                          <option value="Australia" data-select2-id="4">Australia</option>
                          <option value="Japan" data-select2-id="20">Japan</option>
                          <option value="United States" data-select2-id="21">United States</option>
                          <option value="Brazil" data-select2-id="22">Brazil</option>
                          <option value="China" data-select2-id="23">China</option>
                          <option value="Israel" data-select2-id="24">Israel</option>
                          <option value="Philippines" data-select2-id="25">Philippines</option>
                          <option value="Malaysia" data-select2-id="26">Malaysia</option>
                          <option value="Canada" data-select2-id="27">Canada</option>
                          <option value="Chile" data-select2-id="28">Chile</option>
                          <option value="Chile" data-select2-id="29">Zimbabwe</option>
                        </select><span class="select2 select2-container select2-container--default select2-container--below" dir="ltr" data-select2-id="3" style="width: 100%;"><span class="selection"><span class="select2-selection select2-selection--single" role="combobox" aria-haspopup="true" aria-expanded="false" tabindex="0" aria-labelledby="select2-id_label_single2-container"><span class="select2-selection__rendered" id="select2-id_label_single2-container" role="textbox" aria-readonly="true" title="Australia">Australia</span><span class="select2-selection__arrow" role="presentation"><b role="presentation"></b></span></span></span><span class="dropdown-wrapper" aria-hidden="true"></span></span>
                      </label>
                      </div>
                    </div>
                  </div>
                </div>
                <!-- END row -->
                <div class="row mb-5">
                  <div class="col-md">
                    <div class="form-group">
                      <label for="probootstrap-date-departure">Departure</label>
                      <div class="probootstrap-date-wrap">
                        <span class="icon ion-calendar"></span> 
                        <input type="text" id="probootstrap-date-departure" class="form-control" placeholder="">
                      </div>
                    </div>
                  </div>
                  <div class="col-md">
                    <div class="form-group">
                      <label for="probootstrap-date-arrival">Arrival</label>
                      <div class="probootstrap-date-wrap">
                        <span class="icon ion-calendar"></span> 
                        <input type="text" id="probootstrap-date-arrival" class="form-control" placeholder="">
                      </div>
                    </div>
                  </div>
                </div>
                <!-- END row -->
                <div class="row">
                  <div class="col-md">
                    <label for="round" class="mr-5"><input type="radio" id="round" name="direction">  Round</label>
                    <label for="oneway"><input type="radio" id="oneway" name="direction">  Oneway</label>
                  </div>
                  <div class="col-md">
                    <input type="submit" value="Submit" class="btn btn-primary btn-block">
                  </div>
                </div>
              </div>
            </form>
          </div>
        </div>
      </div>

	<!-- Footer-->
	<footer class="border-top">
		<div class="container px-4 px-lg-5">
			<div class="row gx-4 gx-lg-5 justify-content-center">
				<div class="col-md-10 col-lg-8 col-xl-7">
					<div class="small text-center text-muted fst-italic">Copyright
						&copy; Your Website 2022</div>
				</div>
			</div>
		</div>
	</footer>
	<!-- Bootstrap core JS-->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<!-- Core theme JS-->
	<script src="${path}/resources/js/scripts.js"></script>
</body>
</html>
