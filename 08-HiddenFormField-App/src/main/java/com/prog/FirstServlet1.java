package com.prog;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/servlet1")
public class FirstServlet1 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Get the 'name' parameter from the request
		String name = req.getParameter("nem");

		// Set the content type of the response to HTML
		resp.setContentType("text/html");

		// Get the PrintWriter object to write the response
		PrintWriter out = resp.getWriter();

		// Create an HTML form with a text input field and a submit button
		out.print("<form action='servlet2'> " + 
				"<input type='hidden' name='user' value='" + name + "'><br>" + "<button type='submit'>Servlet2</button> "
				+ "</form>");
	}
}
