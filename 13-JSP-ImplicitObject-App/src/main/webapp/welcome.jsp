<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <%-- <%
    String name=application.getInitParameter("username");
    out.println(name);
  %> --%>
  
  <% String name=(String)session.getAttribute("myname");
     out.print(name);
  %>
  

</body>
</html>