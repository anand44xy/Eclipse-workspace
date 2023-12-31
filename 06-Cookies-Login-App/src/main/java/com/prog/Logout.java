package com.prog;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/logout") // Defines the servlet mapping
public class Logout extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Retrieve the cookies from the request
		Cookie[] ck = req.getCookies();

		// Set the maximum age of each cookie to 0, effectively deleting them
		ck[0].setMaxAge(0);
		ck[1].setMaxAge(0);

		// Add the updated cookie to the response to notify the browser to remove it
		resp.addCookie(ck[0]);
		resp.addCookie(ck[1]);

		// Redirect the user to the index.html page after logging out
		resp.sendRedirect("index.html");

	}

}
