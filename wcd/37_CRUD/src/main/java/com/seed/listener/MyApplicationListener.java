package com.seed.listener;

import java.sql.Connection;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.seed.util.ConnectionUtil;

/**
 * Application Lifecycle Listener implementation class MyApplicationListener
 *
 */
@WebListener
public class MyApplicationListener implements ServletContextListener , ServletContextAttributeListener{

 
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }


    public void contextInitialized(ServletContextEvent sce)  { 
        System.out.println("context created");
        ServletContext context = sce.getServletContext();
        String driverName = context.getInitParameter("db.driverName");
 		String url = context.getInitParameter("db.url");
 		String username = context.getInitParameter("db.username");
 		String password = context.getInitParameter("db.password");
 		
 		Connection connection = ConnectionUtil.getConnection(driverName, url, username, password);
 		context.setAttribute("connection", connection); 
    }
    
    @Override
    public void attributeAdded(ServletContextAttributeEvent scae) {
    
    	System.out.println("attrubute added= > "+scae.getName());
    }
    
    @Override
    public void attributeRemoved(ServletContextAttributeEvent scae) {
    	// TODO Auto-generated method stub
    	ServletContextAttributeListener.super.attributeRemoved(scae);
    }
    
    @Override
    public void attributeReplaced(ServletContextAttributeEvent scae) {
    	// TODO Auto-generated method stub
    	ServletContextAttributeListener.super.attributeReplaced(scae);
    }
	
}
