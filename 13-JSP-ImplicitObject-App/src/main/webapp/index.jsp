<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Implicit Object Demo</title>
</head>
<body>
<%--  <% 
   out.print("Hello World!");
 %> --%>
 
 <% session.setAttribute("mynam","anandsaini.official"); %>
 
 <form action="welcome">
    <input type="text" name="username">
    <button type="submit">Ok</button>
 </form>

</body>
</html>