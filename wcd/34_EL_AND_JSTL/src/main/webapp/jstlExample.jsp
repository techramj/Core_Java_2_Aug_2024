<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<p><%="Hello world" %></p>

<p><c:out value="${'Hello world' }"></c:out></p>

<%
	session.setAttribute("a", "apple");
%>

<c:set var="b" scope="session" value="${'ball' }"></c:set>

<%-- c:if --%>
<c:if  test="${b == 'ball }">
	<p>You have selected ${b }</p>
</c:if>


<hr>
<p>a=${a }</p>
<p>b=${b }</p>


</body>
</html>