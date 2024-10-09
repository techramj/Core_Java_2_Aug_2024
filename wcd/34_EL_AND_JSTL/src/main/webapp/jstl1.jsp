<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:set var="a" value="${101 }" scope="request" />
<p>a= <%=request.getAttribute("a") %></p>

<c:if  test="${a%2 == 0 }">
	<p><c:out value="${a }"/> is even</p>
</c:if>


<c:set var="color" value="${'blue' }" scope="request" />
<c:choose>
	<c:when test="${color == 'red' }"><p>Stop</p></c:when>
	<c:when test="${color == 'green' }"><p>GO</p></c:when>
	<c:otherwise>
	    <p><c:out value="${color }" /> is invalid signal color</p>
	</c:otherwise>
</c:choose>


<%
  List<Integer> list = List.of(1,2,10,20,40,50,33);
  session.setAttribute("numList", list);
%>

<h4>Iterate 1 to 10</h4>
<c:forEach var="i" begin="1"  end="10">
  <p><c:out value="${i }" /></p>
</c:forEach>

	<table>
	   <c:forEach var="i" begin="1"  end="10">
		<tr>
			<td>2 X <c:out value="${i }" /></td>
			<td>=</td>
			<td><c:out value="${2*i }" /></td>
		</tr>
		</c:forEach>
	</table>


<h4>Iterate the list</h4>
<c:forEach  var="num" items="${numList }">
	<p><c:out value="${num }" /> </p>
</c:forEach>

<hr>

<c:set var="c" value="apple,mango,guava,pineapple,kiwi,litchi" scope="session"/>

<c:forTokens items="${c }" delims="," var="fruit">
	<p><c:out value="${fruit }" />
</c:forTokens>

<c:url value="page2.jsp" var="mainUrl">
	<c:param name="fruits" value="${c }" />
</c:url>
<hr>
<p>${mainUrl }</p>
<a href="${mainUrl }"> click here</a>

Redirect to: <c:redirect url="${mainUrl }"></c:redirect>







</body>
</html>