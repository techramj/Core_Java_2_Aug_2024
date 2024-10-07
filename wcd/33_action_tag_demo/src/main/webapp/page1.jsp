<%@page import="com.seed.entity.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h5 align="right"><a href="logout.jsp">logout</a></h5>
<%

	String username = request.getParameter("username");
	String fname = request.getParameter("firstName");
	String lname = request.getParameter("lastName");
	String email = request.getParameter("mail");
	String pwd = request.getParameter("password");
	String cPwd = request.getParameter("confirmPassword");
	
	System.out.println("page1.jsp");
	
	User user = new User();
	user.setUsername(username);
	user.setFirstName(fname);
	user.setLastName(lname);
	user.setEmail(email);
	
	String msg = pwd != null && pwd.equals(cPwd)?"Password and confirm password matched"
			:"password and confrim password not matched";
	
	session.setAttribute("user", user);
	request.setAttribute("msg", msg);
	
	RequestDispatcher rd = request.getRequestDispatcher("result1.jsp");
	rd.forward(request, response);
	
%>

</body>
</html>