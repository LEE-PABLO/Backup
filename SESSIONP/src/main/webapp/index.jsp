<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/header.jsp" %>

	</head>
	<body>
		<c:set var="userId" value="${sessionScope.userId}"/>
		<div>
			<h1>COOKIE SESSION</h1>
		</div>
		<ul>
			<c:if test="${empty sessionScope.userId}">
				<li><a href="<c:url value="/login"/>">Login</a></li>
			</c:if>	
			<c:if test="${not empty sessionScope.userId}">
				<li>안녕하세요 <c:out value="${userId}"/>님 <a href="<c:url value="/logout"/>">Logout</a></li>
			</c:if>	
		</ul>
		<script>
			const uuid=crypto.randomUUID();
			const exp='Wed, 07 Feb 2026 12:00:00 GMT';
			document.cookie='uuid='+uuid+'; Max-age=60*60*240; Path=/; SameSite=Lax;';
			console.log(document.cookie);
		</script>	
<%@ include file="/WEB-INF/views/include/footer.jsp" %>
