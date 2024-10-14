<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Friends</title>
</head>
<body>

<p> Welcome ${user.firstName } ${user.lastName }</p>

<h4>List of friend</h4>
<ul>
  <c:forEach var="friend" items="${friends }">
  	<li>${friend }</li>
  </c:forEach>
</ul>

<form action="addFriend"  method="get">
	<input type="text" name="friend"> <button type="submit">Add friend</button>
</form>

</body>
</html>