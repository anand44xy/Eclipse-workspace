package com.prog;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
// The annotation below specifies the URL mapping for this servlet.
@WebServlet("/servlet1")
public class FirstServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Get the 'name' parameter from the request
        String name = req.getParameter("nem");

        // Set the content type of the response to HTML
        resp.setContentType("text/html");
        // Get the PrintWriter object to write the response
        PrintWriter out = resp.getWriter();
        out.print("<h1>Name: " + name + "</h1>");
        
        // Create or get an existing session
        HttpSession session = req.getSession();
        
        // Store the 'name' parameter as an attribute in the session
        session.setAttribute("username", name);
        
        // Provide a link to another servlet (servlet2)
        out.print("<a href='servlet2'>Servlet 2</a>");
    }
}
