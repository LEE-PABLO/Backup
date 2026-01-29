<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	String method=request.getMethod();
	String name=request.getParameter("name");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
	<body>
		<div>
			<h1> Hello JSP</h1>
		</div>
		<div>
			<h3><%=method%>:<%=name%></h3>
			<ul>
			<% for(int i=1;i<100;i++){ %>
				<li>No.<%=i %></li>
			<%}%>	
			</ul>
		</div>
	</body>
</html>