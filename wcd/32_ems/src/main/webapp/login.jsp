<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ include file="assest/css/bootstrap_css.jsp"%>
<title>Insert title here</title>
</head>
<body>

	<div>
		<form action="loginSuccess.jsp">
			<div class="form-group">
				<label for="Username">username</label> <input type="text"
					class="form-control" name="username" placeholder="Enter username">
			</div>
			<div class="form-group">
				<label for="Password">Password</label> <input type="password"
					class="form-control" name="password"
					placeholder="Password">
			</div>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>


	<%@ include file="assest/css/bootstrap_jquery.jsp"%>
</body>
</html>