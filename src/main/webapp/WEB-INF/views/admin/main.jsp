<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>타이틀</th>
				<th>포스터 주소</th>
				<th>개봉일</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<select class="">
					<c:forEach items="${list}" var="list">
						<option value="${list.title}">${list.title}</option>
					</c:forEach>
				</select>
			</tr>
		</tbody>
	</table>
</body>
</html>