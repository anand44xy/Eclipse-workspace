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
public class Servlet2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Get the value of the "nem" parameter from the request
		String username = req.getParameter("nem");

		// Set the response content type to HTML
		resp.setContentType("text/html");
		// Get a PrintWriter object to send HTML response back to the client
		PrintWriter out = resp.getWriter();

		// Display the username in an HTML heading
		out.print("<h1>Name: " + username + "</h1>");
	}
}
