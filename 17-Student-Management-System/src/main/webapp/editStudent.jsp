<%@page import="com.entity.Student"%>
<%@page import="com.conn.DBconnection"%>
<%@page import="com.dao.StudentDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Student</title>
<%@include file="allCSS.jsp"%>
</head>
<body class="bg-light">

	<%@include file="navbar.jsp"%>
	<div class="container p-4">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-body">
						<p class="fs-3 text-center">Edit Student</p>

						<%
                    // Get the student ID from the request parameter
                    int id = Integer.parseInt(request.getParameter("id"));
                    
                    // Create a StudentDAO instance to interact with the database
                    StudentDAO dao = new StudentDAO(DBconnection.getConnection()); 
                    
                    // Retrieve the student's information by ID
                    Student s = dao.getStudentById(id);
                    %>

						<form action="update" method="post">

							<div class="mb-3">
								<label class="form-label">Full Name</label><input type="text"
									name="name" class="form-control" value="<%=s.getFullName()%>">
							</div>

							<div class="mb-3">
								<label class="form-label">DOB</label> <input type="date"
									name="dob" class="form-control" value="<%=s.getDob()%>">
							</div>

							<div class="mb-3">
								<label class="form-label">Address</label> <input type="text"
									name="address" class="form-control" value="<%=s.getAddress()%>">
							</div>

							<div class="mb-3">
								<label class="form-label">Qualification</label> <input
									type="text" name="qualification" class="form-control"
									value="<%=s.getQualification()%>">
							</div>

							<div class="mb-3">
								<label class="form-label">Email address</label> <input
									type="email" name="email" class="form-control"
									value="<%=s.getEmail()%>">
							</div>

							<input type="hidden" name="id" value="<%=s.getId()%>">

							<button type="submit" class="btn btn-primary col ms-12">Update</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>
