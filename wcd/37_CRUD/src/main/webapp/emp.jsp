<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<head>
<title>Employee</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>

<%@ include file="header.jsp"%>

<body>
	<div class="container col-md-5">
		<div class="card">
			<div class="card-body">
				<c:if test="${! empty emp }">
					<form action="update" method="post">
				</c:if>
				<c:if test="${empty emp}">
					<form action="insert" method="post">
				</c:if>

				<caption>
					<h2>
						<c:if test="${! empty emp}">
                                    Edit Employee
                                </c:if>
						<c:if test="${empty emp}">
                                    Add New Employee
                        </c:if>
					</h2>
				</caption>


				<c:if test="${! empty emp}">
					<input type="hidden" name="id" value="<c:out value='${emp.id}' />" />
				</c:if>

				<fieldset class="form-group">
					<label>Name</label> <input type="text"
						value="<c:out value='${emp.name}' />" class="form-control"
						name="name" required="required">
				</fieldset>

				<fieldset class="form-group">
					<label>Salary</label> <input type="text"
						value="<c:out value='${emp.salary}' />" class="form-control"
						name="salary">
				</fieldset>

				<button type="submit" class="btn btn-success">Save</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>