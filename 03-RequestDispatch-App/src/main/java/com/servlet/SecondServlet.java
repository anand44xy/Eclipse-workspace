package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
@WebServlet("/servlet")
public class SecondServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("em");
		// Set the content type to HTML
		resp.setContentType("text/html");
		
		// Create a PrintWriter for response
		PrintWriter out=resp.getWriter();
		out.print(email+"<h1>Welcome to Home Page...");
	}
       
}