<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Students</title>
<%@include file="allCSS.jsp"%>
</head>
<body class="bg-light">

	<%@include file="navbar.jsp"%>
	<div class="container p-4">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-body">
						<p class="fs-3 text-center">Add Student</p>
						
						<c:if test="${not empty succMSG }">
						  <p class="text-center text-success">${ succMSG }</p>
						  <c:remove var="succMSG"/>
						</c:if>
						
						<c:if test="${not empty errorMSG }">
						  <p class="text-center text-success">${ errorMSG }</p>
						  <c:remove var="errorMSG"/>
						</c:if>

						<form action="register" method="post">

							<div class="mb-3">
								<label class="form-label">Full Name</label><input type="text"
									name="name" class="form-control">
							</div>

							<div class="mb-3">
								<label class="form-label">DOB</label> <input type="date"
									name="dob" class="form-control">
							</div>

							<div class="mb-3">
								<label class="form-label">Address</label> <input type="text"
									name=address class="form-control">
							</div>

							<div class="mb-3">
								<label class="form-label">Qualification</label> <input
									type="date" name="qualificaton" class="form-control">
							</div>

							<div class="mb-3">
								<label class="form-label">Email</label> <input
									type="email" class="form-control">
							</div>


							<button type="submit" class="btn btn-primary">Update</button>
						</form>

					</div>
				</div>
			</div>
		</div>
	</div>


</body>
</html>