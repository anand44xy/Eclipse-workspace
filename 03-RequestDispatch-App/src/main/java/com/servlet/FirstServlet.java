package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
@WebServlet("/login")
public class FirstServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("em");
		String password= req.getParameter("pwd");
		// set the content type to HTML
		resp.setContentType("text/html");

		// Create a PrintWriter for response
		PrintWriter out = resp.getWriter();
		
		RequestDispatcher rd;
		
		if ("demo@gmail.com".equals(email) && "demo".equals(password)) {
			//Home page redirect
			/*
			 * rd=req.getRequestDispatcher("/servlet2"); rd.forward(req, resp);//1.forward
			 * method
			 */		
			resp.sendRedirect("servlet2");
			
		} else {
			// redirect to login page
			out.print("<h4>Invalid email or password...</h4>");
			rd=req.getRequestDispatcher("/index.html");
			rd.include(req, resp);//2.include method
		}

	}

}