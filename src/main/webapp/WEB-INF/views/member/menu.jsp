<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	${sessionScope.name } (${sessionScope.mid })�� ȯ���մϴ�.
	<hr>
	<div class="container">
		<form action="logout.do" method="post">
			<button type="submit" id="logout">�α׾ƿ�</button>
		</form>
	</div>
</body>
</html>