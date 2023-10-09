package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/register")
public class RegisterForm extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Get requested data from user
		String name = req.getParameter("userName"); 
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String course = req.getParameter("course");

		// Set the content type to HTML
		resp.setContentType("text/html");

		// Create a PrintWriter for the response
		PrintWriter out = resp.getWriter();

		// Generate an HTML response
		out.println("<html>");
		out.println("<head><title>Registration Details</title></head>");
		out.println("<body>");
		out.println("<h1>Name: " + name + "</h1>");
		out.println("<h1>Email: " + email + "</h1>");
		out.println("<h1>Password: " + password + "</h1>");
		out.println("<h1>Course: " + course + "</h1>");
		out.println("</body>");
		out.println("</html>");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// This method can be left empty if you don't need to handle GET requests.
	}
}
