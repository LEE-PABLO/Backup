<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<div>
			<h1>Coupon Client</h1>
		</div>
		<div>
			<h2>쿠폰 번호는 <%=request.getAttribute("coupon") %>입니다</h2>
		</div>
	</body>
</html>