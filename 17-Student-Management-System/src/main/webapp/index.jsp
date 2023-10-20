<%@page import="com.conn.DBconnection"%>
<%@page import="com.entity.Student"%>
<%@page import="java.util.List"%>
<%@page import="com.dao.StudentDAO"%>
<%@page import="com.conn.DBconnection"%> 
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Students Management System</title>
     <%@include file="allCSS.jsp"%>
</head>
<body class="bg-light">
    <%@include file="navbar.jsp"%>
    
    <%-- Establish a database connection --%>
    <%
    Connection conn = DBconnection.getConnection(); // Corrected the method name
    out.print(conn);
    %>

    <div class="container p-3">
        <div class="container p-3">
            <div class="card">
                <div class="card-body">
                    <p class="text-center fs-1">All Students Details</p>

                    <c:if test="${not empty succMSG }">
                        <p class="text-center text-success">${ succMSG }</p>
                        <c:remove var="succMSG"/>
                    </c:if>
                    
                    <c:if test="${not empty errorMSG }">
                        <p class="text-center text-danger">${ errorMSG }</p> <!-- Corrected the CSS class to text-danger -->
                        <c:remove var="errorMSG"/>
                    </c:if> 
                    
                    <table class="table">
                        <thead>
                            <tr>
                                <th scope="col">Full Name</th>
                                <th scope="col">DOB</th>
                                <th scope="col">Address</th>
                                <th scope="col">Qualification</th>
                                <th scope="col">Email</th>
                                <th scope="col">Action</th>
                            </tr>
                        </thead>
                        <tbody>
                        <%
                            StudentDAO dao = new StudentDAO(conn); // Passed the connection object
                            List<Student> list = dao.getAllStudent(); // Corrected the method name
                            for (Student s : list) {
                        %>   
                            <tr>
                                <th scope="row"><%=s.getFullName() %></th>
                                <td><%=s.getDob() %></td>
                                <td><%=s.getAddress() %></td>
                                <td><%=s.getQualification() %></td>
                                <td><%=s.getEmail() %></td>
                                <td>
                                    <a href="editStudent.jsp?id=<%=s.getId() %>" class="btn btn-sm btn-primary">Edit</a>
                                    <a href="delete?id=<%=s.getId() %>" class="btn btn-sm btn-danger ms-1">Delete</a>
                                </td>
                            </tr>
                        <%
                            }
                        %>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
