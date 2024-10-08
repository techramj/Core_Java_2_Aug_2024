<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.seed.entity.Address"%>
<%@page import="com.seed.entity.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h5 align="right"><a href="logout.jsp">Logout</a></h5>

<%
  int a = 10;
  //request.setAttribute("a", "value set to request object");
  //session.setAttribute("a", "value set to session object");
  application.setAttribute("a", "value set to application object");
  
  Employee emp = new Employee();
  emp.setId(1);
  //emp.setName("jack");
  emp.setSalary(5000);
  
  Address address = new Address();
  address.setCity("PUne");
  
  //emp.setAddress(address);
  
  List<String> projects = new ArrayList<>();
  projects.add("projec1");
  projects.add("projec2");
  projects.add("projec3");
  
  emp.setProjects(projects);
  
  request.setAttribute("employee", emp);

  
%>

<h3>Emp Details using jsp tag</h3>
<%
Employee e = (Employee)request.getAttribute("employee");
%>
<p>ID = <% out.println(e.getId());%></p>
<p>Name =  <%= e.getName() %></p>
<p>Salary =  <%= e.getSalary() %></p>
<p>City = <%= e.getAddress()!= null ? e.getAddress().getCity():"" %></p>
<h4>Projects</h4>
<ol>
<% for(String s:projects){ %>
	<li><%=s %></li>
<% } %>
</ol>
<hr>

<h3>Emp Details using EL</h3>
<p>Id = ${employee.id }</p>
<p>Name = ${employee.name }</p>
<p>Salary = ${employee.salary }</p>
<p>City = ${employee.address.city }</p>
<h4>Projects</h4>
 <ol>
   <li>${employee.projects[0] }</li>
   <li>${employee.projects[1] }</li>
   <li>${employee.projects[2] }</li>
   <li>${employee.projects[4] }</li>
 </ol>
 


<hr>
<p>1+1 = (1+1)</p>
<p>1+1 = ${1+1 }</p>
<p>a= ${a }</p>
<p>value of a in request object = ${requestScope.a } </p>
<p>value of a in session object = ${sessionScope.a } </p>
<p>value of a in application object = ${applicationScope.a } </p>

<p><%= request.getParameter("w") %></p>
<p>${param.w }</p>


</body>
</html>