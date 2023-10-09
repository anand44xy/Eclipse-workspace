package com.prog;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/servlet2")
public class SecondServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Get the 'user' parameter from the request
		String name = req.getParameter("user");
		// Set the content type of the response to HTML
		resp.setContentType("text/html");

		// Get the PrintWriter object to write the response
		PrintWriter out = resp.getWriter();

		// Output the name to the response
		out.println("Name: " + name);
	}
}
