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
		<c:if test="${!empty errorFlag}">
			<p><i>${errorMessage }</i>
		</c:if>
		<form action="resetPassword" method="post">
			<table>
				<tr>
					<td>Current Password</td>
					<td><input type="text" name="currentPassword"></td>
				</tr>
				<tr>
					<td>New Password</td>
					<td><input type="password" name="newPassword"></td>
				</tr>
				<tr>
					<td><input type="hidden" name="username" value="${username }"></td>
					<td><input type="submit" value="Reset"></td>
				</tr>
			</table>
		</form>
	</fieldset>

</body>
</html>