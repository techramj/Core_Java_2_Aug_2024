package com.seed.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class LogTimeFilter
 */
@WebFilter("/*")
public class LogTimeFilter extends HttpFilter implements Filter {
       



	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		long l1 = System.currentTimeMillis();
		chain.doFilter(request, response);
		long l2 = System.currentTimeMillis();
		System.out.println("time take by "+((HttpServletRequest)request).getRequestURI()+"  is "+(l2-l1)+" ms");
	}

	
}
