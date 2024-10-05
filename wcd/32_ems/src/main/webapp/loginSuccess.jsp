<%@page import="java.util.List"%>
<%@page import="com.seed.entity.User"%>
<%@page import="com.seed.service.LoginService"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.seed.util.ConnectionUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%!LoginService service;%>

	<%
	String driverName = application.getInitParameter("db.driverName");
	String url = application.getInitParameter("db.url");
	String dbusername = application.getInitParameter("db.username");
	String dbpassword = application.getInitParameter("db.password");

	Connection connection = ConnectionUtil.getConnection(driverName, url, dbusername, dbpassword);
	System.out.println("connection: "+connection);
	application.setAttribute("connection", connection);
	service = new LoginService(connection);
	
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	
	User user = service.getUser(username, password);
	
	%>
	
	<%if(user != null){
		List<String> friends = service.getFriends(username);
	%>
		<p>Welcome <%= user.getFirstName() %> <%= user.getLastName() %></p>
		
		<h4>Friends are:</h4>
		<ul>
		<%for(String friend: friends){ %>
			<li><%=friend %></li>
		<%} %>
		</ul>
		

			<form action="">
				<input type="text" name="friend" >
				<button type="submit">Add Friend</button>
			</form>
		
		
	<%} else{%>
	    <p>Invalid username and Password </p>
		<jsp:include page="login.jsp"></jsp:include>
	<% } %>

</body>
</html>