<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<fieldset>
       <h3 align="center">Registration Page</h3>
		<form action="page3.jsp" method=post>
			<table>
				<tr>
					<td>Username</td>
					<td><input type="text" name="username"></td>
				</tr>
				<tr>
					<td>First Name</td>
					<td><input type="text" name="firstName"></td>
				</tr>
				
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="lastName"></td>
				</tr>
				
				<tr>
					<td>Email</td>
					<td><input type="email" name="mail"></td>
				</tr>
				
				<tr>
					<td>Password</td>
					<td><input type="text" name="password"></td>
				</tr>
				
				<tr>
					<td>Confirm Password</td>
					<td><input type="text" name="confirmPassword"></td>
				</tr>
				<tr>
					<td></td>
					<td><button type="submit">Login</button></td>
				</tr>
			</table>

		</form>
	</fieldset>

</body>
</html>