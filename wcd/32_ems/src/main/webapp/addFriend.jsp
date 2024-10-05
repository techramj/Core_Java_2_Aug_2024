<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	String usernmae = request.getParameter("username");
	String friend = request.getParameter("friend");
	
	out.println("username=> "+usernmae+"   friend=>"+friend);
%>
</body>
</html>