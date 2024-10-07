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
	<jsp:setProperty property="*" name="user"  />
</jsp:useBean>

<%
	String cPwd = request.getParameter("confirmPassword");
	String msg = user.getPassword() != null && user.getPassword().equals(cPwd)?"Password and confirm password matched"
		:"password and confrim password not matched";
	request.setAttribute("msg", msg);
%>

<jsp:forward page="result4.jsp"></jsp:forward>

</body>
</html>