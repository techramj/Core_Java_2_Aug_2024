package com.seed.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletResponse;


//@WebFilter("/ValidationFilter")
public class ValidationFilter extends HttpFilter implements Filter {

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("ValidationFilter init method ");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		//request forwarding to the servelt
		System.out.println("filter called before chain.doFilter");
		String password = request.getParameter("password");
		
		if(!"123".equals(password)) {
			System.out.println("validation failed");
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}else {
			chain.doFilter(request, response);
		}
		
		//System.out.println("filter called after chain.doFilter");
	}

	public void destroy() {
		// TODO Auto-generated method stub
	}

}
