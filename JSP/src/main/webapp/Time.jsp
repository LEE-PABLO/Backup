<%@page import="java.time.format.DateTimeFormatter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.time.*" %>
<% LocalDateTime now=LocalDateTime.now();
   DateTimeFormatter fmt=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
   String result=now.format(fmt);
  %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="refresh" content="1">
		<title>Insert title here</title>
	</head>
	<body>
		<div>
			<h1>Hello Time</h1>
		</div>
		<div>
			<h2>현재 시각은 <%=result %>입니다</h2>
		</div>
	</body>
</html>