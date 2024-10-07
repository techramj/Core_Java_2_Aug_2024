<%@page import="com.seed.entity.User"%>
<%@page import="com.seed.entity.Address"%>
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
<h4 align="center">Result 4</h4>

<jsp:useBean id="user" class="com.seed.entity.User" scope="session">
</jsp:useBean>

<jsp:getProperty property="username" name="user"/>

<h3>User Details are </h3>
<p>User Name:  <jsp:getProperty property="username" name="user"/></p>
<p>First Name:  <jsp:getProperty property="firstName" name="user"/></p>
<p>Last Name:  <jsp:getProperty property="lastName" name="user"/></p>
<p>email:  ${user.email }</p>

<p>Address: ${user.address }</p>

<%--  <p>City: <p>Last Name:  <jsp:getProperty property="address.city" name="user"/></p> --%>
<p>City: ${sessioScope.user.address.city }</p>

<p>message: ${msg} </p>


</body>
</html>