<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Basics</title>
</head>
<body>

	<%-- <h1>1.Declaration Tag</h1>
	<%! int count=0;
      
       void incrementCount(){
    	   count++;
       }
   %>



	<h1>2.Expression Tag</h1>
	<%= 
      "Hello World!"
    %>



	<h1>3.Scrptlet Tag</h1>
	<%
	String message = "Java code directly to JSP page.";
	int x = 5;
	%> --%>
	
	
	<%@ include file="header.jsp" %>
	
	<h1>Hello world</h1>
	
	<h1>Time: <%= new java.util.Date().toString() %></h1>





</body>
</html>