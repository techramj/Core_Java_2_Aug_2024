<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ page  import="java.util.Date"%>
 <%@ page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h3>Jsp Page</h3>
  <p>Welcome <%= request.getParameter("username") %></p>
  
  <%
  	int a = 10;
    out.println("<p>a="+a+"<p>");
  %>
  
  <p>a=<b><%=a %></b></p>
  
  <%
    int b = 100;
 
  %>
  
  <br><%=a %>
  <br><%= "Hello world" %>
  <br><%= a==100 %>
  
  <%! int a = 10000; %>
  <%! void foo(){} %>
  <br>a=<%=a %>;
  
  <br>request= <%= request %>
  <br>reponse=<%= response %>
  <br>config=<%= config %>
  <br>context/application<%= application %>
  
  <h5 align="left"><%=new Date() %></h5>
  
  <hr>
  val=<%=10/0 %>
  
 
  
  
  <!--  This is HTML comment -->
  <%-- This is JSP comment --%>
</body>
</html>