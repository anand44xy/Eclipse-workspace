package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
public class ThirdProgram extends HttpServlet{


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet method executed...");	
		// Set the response content type to HTML
				resp.setContentType("text/html");

				// Get a PrintWriter to write HTML response
				PrintWriter out = resp.getWriter();

				// Get the current date and time
				LocalDateTime currentDateTime = LocalDateTime.now();
				String dateTimeString = currentDateTime.toString();

				// Write the date and time to the servlet's response
				out.println("<html>");
				out.println("<head><title>Welcome to doGet Method</title></head>");
				out.println("<body>");
				out.println("<h1>doGet Method Home Page...</h1>");
				out.println("<p>" + dateTimeString + "</p>");
				System.out.println("</body>");
				System.out.println("</html>");

				// Close the PrintWriter
				out.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    System.out.println("doPost method executed...");
	 // Set the response content type to HTML
		resp.setContentType("text/html");

		// Get a PrintWriter to write HTML response
		PrintWriter out = resp.getWriter();

		// Get the current date and time
		LocalDateTime currentDateTime = LocalDateTime.now();
		String dateTimeString = currentDateTime.toString();

		// Write the date and time to the servlet's response
		out.println("<html>");
		out.println("<head><title>Welcome to doPost Method</title></head>");
		out.println("<body>");
		out.println("<h1>doPost Method Home Page...</h1>");
		out.println("<p>" + dateTimeString + "</p>");
		System.out.println("</body>");
		System.out.println("</html>");

		// Close the PrintWriter
		out.close();
	}
	
	
        
}
