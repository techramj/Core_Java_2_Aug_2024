package com.seed.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.seed.entity.Employee;
import com.seed.service.EmployeeService;

/**
 * Servlet implementation class EmpActionServlet
 */
@WebServlet("/emp/*")
public class EmpActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private EmployeeService empService = new EmployeeService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getPathInfo();
		String id = request.getParameter("id");
		System.out.println("action= "+action);
		
		List<Employee> empList = null;
		String page = "";

		if (action.contains("delete")) {
			empService.deleteEmployee(id);
			empList = empService.getEmployees();
			request.setAttribute("empList", empList);
			page = "/empDetails.jsp";
		}else if(action.contains("edit")) {
			Employee emp = empService.getEmployeeById(id);
			request.setAttribute("emp", emp);
			request.setAttribute("action", "update");
			page ="/emp.jsp";
		}else if(action.contains("new")) {
			request.setAttribute("action", "insert");
			page ="/emp.jsp";
		}

	
		RequestDispatcher rd = request.getRequestDispatcher(page);
		rd.forward(request, response);

	}
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getPathInfo();
		String page ="/empDetails.jsp";
		List<Employee> empList = null;
		
		if(action.contains("update")) {
			String id = request.getParameter("id");
			String name = request.getParameter("name");
			String Salary = request.getParameter("salary");
			empService.updateEmployee(id, name, Salary);	
		}else if(action.contains("insert")) {
			String name = request.getParameter("name");
			String salary = request.getParameter("salary");
			empService.addEmployee(name,salary);
		}
		
		empList = empService.getEmployees();
		HttpSession session= request.getSession();
		session.setAttribute("empList", empList);
		
		//response.sendRedirect(page);
		RequestDispatcher rd = request.getRequestDispatcher(page);
		rd.forward(request, response);

	}

}
