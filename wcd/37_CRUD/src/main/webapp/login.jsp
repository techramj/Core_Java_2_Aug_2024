<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<fieldset>
		<div style="color:red;">
			<b><c:if test="${! empty errorFlag}">
					<p>
						<i>${errorMessage }</i>
				</c:if> </b>
		</div>
		<div>
			<form action="login" method="post">
				<table>
					<tr>
						<td>Username</td>
						<td><input type="text" name="username"></td>
					</tr>
					<tr>
						<td>Password</td>
						<td><input type="password" name="password"></td>
					</tr>
					<tr>
						<td></td>
						<td><input type="submit" value="Login"></td>
					</tr>
				</table>
			</form>
		</div>
	</fieldset>

</body>
</html>