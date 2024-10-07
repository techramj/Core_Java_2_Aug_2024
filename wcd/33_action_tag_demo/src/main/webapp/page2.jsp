<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



<jsp:useBean id="user" class="com.seed.entity.User" scope="session">
	<jsp:setProperty property="username" name="user"  param="username"/>
	<jsp:setProperty property="firstName" name="user" param="firstName" />
	<jsp:setProperty property="lastName" name="user" param="lastName"/>
	<jsp:setProperty property="email" name="user" param="mail"/>
	<jsp:setProperty property="password" name="user" param="password"/>
</jsp:useBean>

<%
	String cPwd = request.getParameter("confirmPassword");
	String msg = user.getPassword() != null && user.getPassword().equals(cPwd)?"Password and confirm password matched"
		:"password and confrim password not matched";
	request.setAttribute("msg", msg);
%>

<jsp:forward page="result2.jsp"></jsp:forward>

</body>
</html>