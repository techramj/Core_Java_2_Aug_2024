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
<h4 align="center">Result 1</h4>
<%
	User user = (User)session.getAttribute("user");
	String msg = (String)request.getAttribute("msg");
%>

<h3>User Details are </h3>
<p>User Name:  <%= user.getUsername() %></p>
<p>First Name:  <%= user.getFirstName() %></p>
<p>Last Name:  <%= user.getLastName() %></p>
<p>email:  <%= user.getEmail() %></p>
<p>message: <%= msg %></p>

</body>
</html>