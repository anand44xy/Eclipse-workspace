package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

@SuppressWarnings("serial")
public class SecondProgram extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Generic Servlet");
		// Set the response content type to HTML
		res.setContentType("text/html");

		// Get a PrintWriter to write HTML response
		PrintWriter out = res.getWriter();

		// Get the current date and time
		LocalDateTime currentDateTime = LocalDateTime.now();
		String dateTimeString = currentDateTime.toString();

		// Write the date and time to the servlet's response
		out.println("<html>");
		out.println("<head><title>Welcome to GenericServlet Page</title></head>");
		out.println("<body>");
		out.println("<h1>Generic Servlet Home Page...</h1>");
		out.println("<p>" + dateTimeString + "</p>");
		System.out.println("</body>");
		System.out.println("</html>");

		// Close the PrintWriter
		out.close();
	}

}
