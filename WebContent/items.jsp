<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ page import="redirect.ItemRepository" %>
	<ul>
		<c:forEach items="${ItemRepository.getAll()}" var="item">
			<li><c:out value="${item}" /></li>
		</c:forEach>
	</ul>
	
	<a href="/redirect/">Go back</a>
</body>
</html>