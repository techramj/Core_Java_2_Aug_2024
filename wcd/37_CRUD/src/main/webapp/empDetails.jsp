<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Management System</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<%@include file="header.jsp"%>
	<br>
	<div class="row">
		<div class="container">
			<h3 class="text-center">Employees Details</h3>
			<hr>
			<div class="container text-left">
				<a href="<%=request.getContextPath()%>/emp/new" class="btn btn-success">Add employee</a>
			</div>
			<br>
			<div>
				<br>
				<table class="table table-bordered">
					<tr>
						<th>ID</th>
						<th>Name</th>
						<th>Salary</th>
						<th>Action</th>
					</tr>
					<c:forEach items="${empList }" var="emp">
						<tr>
							<td>${emp.id }</td>
							<td>${emp.name }</td>
							<td>${emp.salary }</td>
							<td><a href="emp/edit?id=<c:out value='${emp.id}' />">Edit</a>
								&nbsp;&nbsp;&nbsp;&nbsp; <a
								href="emp/delete?id=<c:out value='${emp.id}' />">Delete</a></td>
						</tr>
					</c:forEach>
				</table>
			</div>>
		</div>
	</div>
</body>
</html>