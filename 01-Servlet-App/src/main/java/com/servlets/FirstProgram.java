package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstProgram implements Servlet {
    
	ServletConfig conf;
	
	//Life cycle method
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("init method call...");
        conf=config;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("service method call...");
        
        // Set the response content type to HTML
        res.setContentType("text/html");
        
        // Get a PrintWriter to write HTML response
        PrintWriter out = res.getWriter();
        System.out.println(getServletInfo());
        System.out.println(getServletConfig());
       
        // Get the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        String dateTimeString = currentDateTime.toString();
        
        // Write the date and time to the servlet's response
        out.println("<html>");
        out.println("<head><title>Welcome to Servlet Page</title></head>");
        out.println("<body>");
        out.println("<h1>Servlet Home Page...</h1>");
        out.println("<p>" + dateTimeString + "</p>");
        System.out.println("</body>");
        System.out.println("</html>");
        
        // Close the PrintWriter
        out.close();
    }

    @Override
    public void destroy() {
        System.out.println("destroy method call...");
    }

    
    //Non Life cycle method
    @Override
    public ServletConfig getServletConfig() {
        return conf; // Provide a ServletConfig object if needed
    }

    @Override
    public String getServletInfo() {
        return "FirstProgram Servlet"; // Provide information about the servlet
    }
}
