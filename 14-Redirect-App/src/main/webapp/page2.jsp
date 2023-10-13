<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to Page1</h1>
	<% 
     response.sendRedirect("page3.jsp"); //here we give any http link that we want insted of page3
    %>
</body>
</html>